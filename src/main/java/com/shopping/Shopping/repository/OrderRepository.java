package com.shopping.Shopping.repository;


import com.shopping.Shopping.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    // Custom queries can go here, e.g.:
    // List<Order> findByCustomerId(int customerId);
}
