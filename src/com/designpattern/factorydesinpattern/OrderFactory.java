package com.designpattern.factorydesinpattern;

public class OrderFactory {

    public type getInstance(String type) {
        if (type.equals("NEW")) return new NewOrderType();
        else if (type.equals("UPDATE")) return new updateOrderType();
        else if (type.equals("DELETE")) return new deleteOrderType();
        return null;
    }
}
