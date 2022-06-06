package org.lattice.java.lab.java8.java8_in_action.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @description: 自定义收集器
 * @author: Lattice
 * @date 2022/3/4 11:25
 */
public class MyCollectors {

    public static <T> Collector<T, ?, List<T>> toList(){
        //return new MyCollectorImpl((Supplier<List<T>>) ArrayList::new, List::add,(left, right) -> left.add)
        
        return null;
    }



   static class MyCollectorImpl<T, A, R> implements Collector<T, A, R>{

       private final Supplier<A> supplier;

       private final BiConsumer<A, T> consumer;

       private final  BinaryOperator<A> combiner;

       private final Function<A, R> finsher;

       private final Set<Characteristics> characteristics;

       public MyCollectorImpl(Supplier<A> supplier,
                              BiConsumer<A, T> consumer,
                              BinaryOperator<A> combiner,
                              Function<A, R> finsher,
                              Set<Characteristics> characteristics) {
           this.supplier = supplier;
           this.consumer = consumer;
           this.combiner = combiner;
           this.finsher = finsher;
           this.characteristics = characteristics;
       }

       MyCollectorImpl(Supplier<A> supplier,
                     BiConsumer<A, T> accumulator,
                     BinaryOperator<A> combiner,
                     Set<Characteristics> characteristics) {
           this(supplier, accumulator, combiner, castingIdentity(), characteristics);
       }

       private static <I, R> Function<I, R> castingIdentity() {
           return i -> (R) i;
       }

       @Override
       public Supplier<A> supplier() {
           return supplier;
       }

       @Override
       public BiConsumer<A, T> accumulator() {
           return consumer;
       }

       @Override
       public BinaryOperator<A> combiner() {
           return combiner;
       }

       @Override
       public Function<A, R> finisher() {
           return finsher;
       }

       @Override
       public Set<Characteristics> characteristics() {
           return characteristics;
       }
   }
}
