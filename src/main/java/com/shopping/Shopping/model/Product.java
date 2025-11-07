package com.shopping.Shopping.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String name;

    @NotNull
    private Double price;

    @NotNull
    private Integer stock;

    private String category;
    private String imageUrl;

    @Lob
    private String description;

}
