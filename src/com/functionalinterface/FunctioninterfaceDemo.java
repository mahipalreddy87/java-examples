package com.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctioninterfaceDemo {
    public static void main(String[] args) {
        // functinal interfcae 4 types single abstract method
        // predicate ---- boolean result
        Predicate<String> s =str->str.length()>5;
        System.out.println(s.test("India"));// if length more than 5 return true else false.

        //consumer -- modify the data , no output
        Person p = new Person();
        Consumer<Person> name = t->t.setName("raju");
        name.accept(p);
        System.out.println(p.getName());

        //Function both input and output
        Function<Integer,String> getInt = t->t*10+"data multiplied by 10";
        System.out.println( getInt.apply(5));

        // supplier - no input return output
        Supplier<Double> retrunDouble = ()->Math.random();
        System.out.println(retrunDouble.get());

        Supplier<List<Person>> listSupplier =()->List.of(new Person("mahipal"),new Person("reddy"));


    }
}
class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Person(){

    }
    public Person(String name){
        this.name =name;
    }
}