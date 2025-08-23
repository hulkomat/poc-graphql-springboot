package de.selmaier.graphqlspringboot.components.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import de.selmaier.graphqlspringboot.entities.Book;

@Component
public class BookRepository {
    
    private final List<Book> books = new ArrayList<>();

    public List<Book> findAll() {
        return books;
    }
}
