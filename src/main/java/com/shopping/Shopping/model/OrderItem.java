package com.shopping.Shopping.model;

import jakarta.persistence.*;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int quantity;
    private double price;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Order order;

    // Getters and Setters
}
