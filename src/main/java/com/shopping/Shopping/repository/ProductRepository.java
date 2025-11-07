package com.shopping.Shopping.repository;
import com.shopping.Shopping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // You can add custom query methods here, e.g.:
    // List<Product> findByCategory(String category);
}
