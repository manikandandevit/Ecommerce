package com.shopping.Shopping.controller;

import com.shopping.Shopping.model.Order;
import com.shopping.Shopping.repository.OrderRepository;
import com.shopping.Shopping.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private InvoiceService invoiceService;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        return orderRepo.save(order);
    }

    @GetMapping("/{id}/invoice")
    public String getInvoice(@PathVariable int id) {
        Order order = orderRepo.findById(id).orElseThrow();
        return invoiceService.generateInvoice(order);
    }

    @DeleteMapping("/{id}")
    public void cancelOrder(@PathVariable int id) {
        orderRepo.deleteById(id);
    }
}
