package com.example.springresrfulprcatice.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Order {
    private int seq;
    private int totalPrice;
    private String waiter;
    private List<Meal> mealList;

    public Order(int seq, String waiter,List<Meal> mealList) {
        this.seq = seq;
        this.waiter = waiter;
        this.mealList = mealList;
    }


    //計算每筆 order 的總金額
    public int getTotalPrice(){
        int totalPrice = 0;
        for (Meal meal : this.getMealList()){
            totalPrice += meal.getPrice();
        }
        return totalPrice;
    }



}
