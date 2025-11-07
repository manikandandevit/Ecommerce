package com.shopping.Shopping.service;

import com.shopping.Shopping.model.Order;
import com.shopping.Shopping.model.OrderItem;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class InvoiceService {

    public String generateInvoice(Order order) {
        StringBuilder invoice = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#.00");

        invoice.append("Invoice for Order ID: ").append(order.getId()).append("\n");
        invoice.append("Customer: ").append(order.getCustomer().getName()).append("\n");
        invoice.append("Date: ").append(order.getOrderDate()).append("\n\n");

        double total = 0;
        for (OrderItem item : order.getItems()) {
            double itemTotal = item.getQuantity() * item.getPrice();
            total += itemTotal;
            invoice.append(item.getProduct().getName())
                    .append(" - Qty: ").append(item.getQuantity())
                    .append(" - Price: ₹").append(df.format(item.getPrice()))
                    .append(" - Total: ₹").append(df.format(itemTotal)).append("\n");
        }

        invoice.append("\nGrand Total: ₹").append(df.format(total));
        return invoice.toString();
    }
}
