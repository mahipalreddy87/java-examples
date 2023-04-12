package com.StremAPI.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOfStringCharacterCount {
    public static void main(String[] args) {
        String str = "Hello world";
        Map<Character, Long> charFrequency  =Arrays.asList(str).stream().flatMap(t->t.chars().mapToObj(cc->(char)cc)).collect(Collectors.groupingBy(i->i,Collectors.counting()));
        System.out.println(charFrequency);
       /* Map<Character, Long> charFrequency = Arrays.asList(str).stream() //Stream<String>
                .flatMap(a -> a.chars().mapToObj(c -> (char) c)) // Stream<Character>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));*/
        IntStream.range(1,10).forEach(System.out::println);
       // System.out.println(charFrequency);
    }
}
