package org.lattice.java.lab.java8.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @description: Stream API
 * @author: Lattice
 * @date 2022/1/13 14:25
 */
public class StreamUtil {


    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> results = new ArrayList<>();
        for (T t : list){
            if (predicate.test(t)) {
                results.add(t);
            }
        }
        return results;
    }
}
