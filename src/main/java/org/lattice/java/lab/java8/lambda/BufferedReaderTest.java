package org.lattice.java.lab.java8.lambda;

import org.lattice.java.lab.java8.function.BufferedReaderProcessor;
import org.lattice.java.lab.java8.util.StreamUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * @description: Read file to do some output
 * @author: Lattice
 * @date 2022/1/13 14:13
 */
public class BufferedReaderTest {

    public static String processFile(BufferedReaderProcessor processor) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("xxx.txt"))) {
            return processor.processor(bufferedReader);
        }
    }

    /*public static void main(String[] args) throws IOException {
        //processFile(BufferedReader::readLine);
        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println(StreamUtil.filter(list, e -> e > 1));
        StreamUtil.forEach(list, System.out::println);
        List<String> strList = Arrays.asList("test", "lattice", "nice-killing");
        List<Integer> lengthList = StreamUtil.map(strList, String::length);
        StreamUtil.forEach(lengthList, System.out::println);


        IntPredicate intPredicate = (int i) -> (i % 2 == 0);
        intPredicate.test(100);
        intPredicate.test(1001);


        BiPredicate<Integer, Integer> biPredicate = Integer::equals;

        Predicate<Integer> predicate = (Integer a) -> a > 0;
    }*/
}
