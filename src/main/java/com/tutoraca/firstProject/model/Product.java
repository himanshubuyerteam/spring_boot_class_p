package com.tutoraca.firstProject.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Increment
    private Long id;
    private String title;
    private String description;
    private String imageURL;
    private double price;
    @ManyToOne
    private Category category;
}
