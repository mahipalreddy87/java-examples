package com.company;

public class Test1 {

    int cal(int a, int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Test1 t = new Test1();
        Test1 t2 = new Test1();
        System.out.println(t.cal(10,20));
        System.out.println(t.cal(10,30));

        System.out.println(t2.cal(10,20));
        System.out.println(t2.cal(10,30));
        }
}
