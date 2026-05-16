package com.tutoraca.firstProject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Lombok will create getters, setters, constructors and toString().
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {

    private Integer id;
    private String title;
    private String author;
    private Double price;
}
