package com.designpattern.factorydesinpattern;

public class MainApp {
    public static void main(String[] args) {
        OrderFactory orderFactory = new OrderFactory();
        type t = orderFactory.getInstance("NEW");
        t.createOrder();
    }
}
