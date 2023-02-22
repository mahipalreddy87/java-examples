package com.designpattern.facadedesignpattern;

public class Waiter {
    public static Food orderFood(String type) {
        if (FoodType.PASTA.name().equals(type)) {
            Pasta p = new Pasta();
            p.prepareFood(FoodItems.getPastaItems());
            return p.deliveryFood();
        }
        if (FoodType.BIRYANI.name().equals(type)) {
            Biryani p = new Biryani();
            p.prepareFood(FoodItems.getPastaItems());
            return p.deliveryFood();
        }

        return null;
    }
}
