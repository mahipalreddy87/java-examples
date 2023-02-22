package com.designpattern.facadedesignpattern;

public class Customer {
    public static void main(String[] args) {
        Food food =Waiter.orderFood(FoodType.BIRYANI.name());
    }
}
