package com.len.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @ClassName StreamTest
 * @Description StreamTest
 * @Author liyong
 * @Date 2020/8/14 11:12
 * @Version 1.0
 */
public class StreamTest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        List<Integer> collect = numbers.stream().map(num -> (int) Math.pow((double) num, 2d)).distinct().collect(Collectors.toList());
//        System.out.println(stats.getMax());
        List<Integer> collect1 = new Random().ints(20, 50).limit(10).boxed().collect(Collectors.toList());
//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
//        List<String> collect = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//        String collect = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
        System.out.println(collect1);
    }
}
