package com.elitech.service;

import org.springframework.stereotype.Service;

import com.elitech.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BookService {
    private List<Book> books = new ArrayList<>();

    // Récupérer tous les livres
    public List<Book> getBooks() {
        return books;
    }

    // Ajouter un livre
    public Book addBook(String title, String author) {
        String id = UUID.randomUUID().toString();
        Book book = new Book(id, title, author);
        books.add(book);
        return book;
    }
}
