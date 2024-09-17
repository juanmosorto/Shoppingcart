package com.juan.exam.shopping.restshopping.services;

import com.juan.exam.shopping.restshopping.models.entities.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();

    Order getOrderById(Long id);

    Order addOrder(Order product);

    Order updateOrder(Long id, Order product);

    void deleteOrder(Long id);
}
