package org.lattice.java.lab.java8.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @description: StreamAPI Util
 * @author: Lattice
 * @date 2022/1/13 14:25
 */
public class StreamUtil {

    /**
     *  对传入的集合，进行predicate操作，判断是否满足条件
     * @param: [list, predicate]
     * @author: Vayne.Luo
     * @date: 2022/1/13 15:47
     */
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> results = new ArrayList<>();
        for (T t : list){
            if (predicate.test(t)) {
                results.add(t);
            }
        }
        return results;
    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(function.apply(t));
        }
        return result;
    }
}
