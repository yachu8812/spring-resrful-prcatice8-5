package com.example.springresrfulprcatice.controller;

import com.example.springresrfulprcatice.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springresrfulprcatice.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
//http://localhost:8080/order

public class OrderController {

    @Autowired
    private OrderService OrderService;

    @GetMapping()
    public List<Order> getAllOrders() {

        List<Order> orderList = this.OrderService.getAllOrders();
        return orderList;
    }

    @GetMapping("/{seq}")
    public Order getOrderBySeq(@PathVariable int seq) {

        Order order = this.OrderService.getOrderBySeq(seq);
        return order;
    }

    @PostMapping()
    public Order createOrder(@RequestBody Order order) {

        Order createOrder = this.OrderService.createOrder(order);
        return createOrder;
    }

    @PutMapping("/{seq}")
    public Order updateOrder(@PathVariable int seq, @RequestBody Order order) {

        Order updateOrder = this.OrderService.updateOrder(seq, order);
        return updateOrder;
    }

    @DeleteMapping("/{seq}")
    public Order deleteOrder(@PathVariable int seq) {

        Order order = this.OrderService.deleteOrder(seq);
        return order;
    }


}
