package com.elitech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.elitech.model.Book;
import com.elitech.service.BookService;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    // Résoudre la requête 'books'
    @QueryMapping
    public List<Book> books() {
        return bookService.getBooks();
    }

    // Résoudre la mutation 'addBook'
    @MutationMapping
    public Book addBook(@Argument String title, @Argument String author) {
        return bookService.addBook(title, author);
    }
}

