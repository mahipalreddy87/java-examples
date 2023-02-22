package com.designpattern.facadedesignpattern;

public class FoodItems {
    public static FoodItems getPastaItems(){
        return new FoodItems();
    }
    public static FoodItems getBiryani(){
        return new FoodItems();
    }
}
