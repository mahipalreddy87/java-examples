package com.common;

public class Test {
    public static void main(String[] args) {
       /* Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(i -> i % 2 == 0).skip(2).forEach(System.out::println);

        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);
        int i3 = 128;
        int i4 = 128;
        System.out.println(i3 == i4);*/
        Parent p = new Parent();
       System.out.println(p.m1());

    }
}
class Parent{
    static int a =10;
    public Parent(){
        System.out.println("parent constructor");
    }
   public boolean m1(){
       System.out.println(a);
       return false;
   }

}
class Child extends Parent{
    static int a =20;
    public Child(){
        System.out.println("child constructor");
    }
    public boolean m1(){
        System.out.println(a);
        return false;
    }
}