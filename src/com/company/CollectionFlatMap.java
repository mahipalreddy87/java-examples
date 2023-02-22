package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionFlatMap {
         public static void main(String[] args) {

            List listOfIntegers = Stream.of("1", "2", "3", "4") .map(i->i) .collect(Collectors.toList());
            System.out.println(listOfIntegers);
            List<List> listOfListOfNumber = new ArrayList<>();
            listOfListOfNumber.add(Arrays.asList(2, 4));
            listOfListOfNumber.add(Arrays.asList(3, 9));
            listOfListOfNumber.add(Arrays.asList(4, 16));
            System.out.println("list of list : " + listOfListOfNumber);
            System.out.println(listOfListOfNumber.stream().flatMap(i->i.stream()).collect(Collectors.toList()));


            // Read more: https://javarevisited.blogspot.com/2016/03/difference-between-map-and-flatmap-in-java8.html#ixzz7THWNZOMd
        }
    }

// Driver code

