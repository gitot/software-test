package com.example.softwaretest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class OrderService {
    private UserService userService;

    public Order getOrder(String orderId) {
        Order order = new Order();
        String userName = userService.getUserName("");
        order.setUserName(userName);
        order.setOrderId(orderId);
        return order;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Order {
        private String orderId;
        private String userId;
        private String userName;
    }
}
