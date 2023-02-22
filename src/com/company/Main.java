package com.company;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream() .map( i -> i) .distinct()
                .collect(Collectors.toList());
        System.out.println(distinct);


       // Read more: https://javarevisited.blogspot.com/2016/03/difference-between-map-and-flatmap-in-java8.html#ixzz7THWNZOMd
    }
}

// Driver code
