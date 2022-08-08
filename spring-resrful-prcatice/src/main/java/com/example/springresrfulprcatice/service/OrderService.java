package com.example.springresrfulprcatice.service;

import com.example.springresrfulprcatice.model.*;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class OrderService {

    private List<Order> orderList;
    private List<Meal> mealList1;
    private List<Meal> mealList2;

    public OrderService(){
        this.mealList1 = new ArrayList<>();
        this.mealList1.add(new Meal("Popcorn",50,"Delicious!"));
        this.mealList1.add(new Meal("Cola",45,"very tasty!"));

        this.mealList2 = new ArrayList<>();
        this.mealList2.add(new Meal("fried chicken",70,"tasty!"));
        this.mealList2.add(new Meal("Cola",45,"very tasty!"));

        this.orderList = new ArrayList<>();
        this.orderList.add(new Order(1,"sherry",mealList1));
        this.orderList.add(new Order(2,"sherry",mealList2));
    }

    //全部 Order
    public List<Order> getAllOrders() {
        return this.orderList;
    }

    //用 seq 找特定 Order
    public Order getOrderBySeq(int seq) {
        for (Order order:orderList) {
            if(seq == order.getSeq()){
                return order;
            }
        }
        return null;
    }

    //新增一筆 Order
    public Order createOrder(Order newOrder) {
        this.orderList.add(newOrder);
        return newOrder;
    }

    //用 seq 找到需要更新的 Order
    public Order updateOrder(int seq,Order order) {
        for (Order updateOrder:orderList) {
            if(seq == updateOrder.getSeq()){
                updateOrder.setMealList(order.getMealList());
                updateOrder.setWaiter(order.getWaiter());

                return updateOrder;
            }
        }
        return null;
    }

    //用 seq 找到要刪除的 Order
    public Order deleteOrder(int seq) {
        for (Order order:orderList) {
            if(seq == order.getSeq()){
                orderList.remove(order);
                return order;
            }
        }
        return null;
    }


}
