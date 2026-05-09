package com.tutoraca.firstProject.controller;

import com.tutoraca.firstProject.model.Author;
import com.tutoraca.firstProject.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class BookController {

    private final Map<Integer, Book> books = new HashMap<>();

    public BookController() {
        books.put(1, new Book(1, "Spring Boot Basics", 299.0, new Author("Rahul", "rahul@test.com")));
        books.put(2, new Book(2, "Java for Beginners", 199.0, new Author("Priya", "priya@test.com")));
    }

    @GetMapping("/books")
    public Collection<Book> getAllBooks() {
        return books.values();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable Integer id) {
        return books.get(id);
    }

    @PostMapping("/books")
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBook(@RequestBody Book book) {
        books.put(book.getId(), book);
        return book;
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable Integer id, @RequestBody Book book) {
        book.setId(id);
        books.put(id, book);
        return book;
    }

    @PatchMapping("/books/{id}")
    public Book patchBook(@PathVariable Integer id, @RequestBody Book book) {
        Book existingBook = books.get(id);

        if (existingBook == null) {
            return null;
        }

        if (book.getTitle() != null) {
            existingBook.setTitle(book.getTitle());
        }

        if (book.getPrice() != null) {
            existingBook.setPrice(book.getPrice());
        }

        if (book.getAuthor() != null) {
            if (existingBook.getAuthor() == null) {
                existingBook.setAuthor(new Author());
            }

            if (book.getAuthor().getName() != null) {
                existingBook.getAuthor().setName(book.getAuthor().getName());
            }

            if (book.getAuthor().getEmail() != null) {
                existingBook.getAuthor().setEmail(book.getAuthor().getEmail());
            }
        }

        return existingBook;
    }

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable Integer id) {
        books.remove(id);
        return "Book deleted with id: " + id;
    }
}
