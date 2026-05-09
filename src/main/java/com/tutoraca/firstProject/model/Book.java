package com.tutoraca.firstProject.model;

public class Book {

    private Integer id;
    private String title;
    private Double price;
    private Author author;

    public Book() {
    }

    public Book(Integer id, String title, Double price, Author author) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
