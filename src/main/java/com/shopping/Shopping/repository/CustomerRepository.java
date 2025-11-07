package com.shopping.Shopping.repository;


import com.shopping.Shopping.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // Example custom query:
    // Customer findByEmail(String email);
}
