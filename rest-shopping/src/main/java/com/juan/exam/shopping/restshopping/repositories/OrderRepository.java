package com.juan.exam.shopping.restshopping.repositories;

import com.juan.exam.shopping.restshopping.models.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
