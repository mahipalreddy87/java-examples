package com.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCountInString {
    public static void main(String[] args) {
        String str = "abc abc abc abc def def";
        System.out.println(Arrays.asList(str.split(" ")).stream().
                collect(Collectors.groupingBy(s -> s, Collectors.counting())));
    }

    public <T> List<T> findL(Stream<T> stream, Predicate<T> testfun) {
        return stream.filter(f -> testfun.test(f)).collect(Collectors.toList());
    }
    public <T> List<T> findM(Stream<T> stream, Predicate<T> testfun) {
        return stream.filter(f -> testfun.test(f)).collect(Collectors.toList());
    }
}