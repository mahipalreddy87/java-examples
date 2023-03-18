package com.StremAPI;

import java.util.*;
import java.util.List.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        // sort based on order
        //Stream.of(1, 3, 2, 4, 5, 6, 3, 49, 10).sorted().forEach(System.out::println);

        // sort based on reverse order
        // Stream.of(1, 3, 2, 4, 5, 6, 3, 49, 10).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //skip the initial element
        Stream.of(1, 3, 2, 4, 5, 6, 3, 49, 10).skip(1).forEach(System.out::println);

        // comparing objects

        List<User> userList = new ArrayList<>(Arrays.asList(
                new User("John", 33),
                new User("Robert", 26),
                new User("Mark", 26),
                new User("Brandon", 42)));

        // compare by name
        List<User> l1 = userList.stream().sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());
        l1.stream().forEach(System.out::println);

        //compare by sort by age, if age is same then sort by name
        List<User> sortedList = userList.stream().sorted((o1, o2) -> {
            if (o1.getAge() == o2.getAge())
                return o1.getName().compareTo(o2.getName());
            else if (o1.getAge() > o2.getAge())
                return 1;
            return -1;
        }).collect(Collectors.toList());
        sortedList.forEach(System.out::println);

    }
}

class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
// Constructor, getters, setters and toString()
}

