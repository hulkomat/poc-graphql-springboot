package de.selmaier.graphqlspringboot.components.resolvers;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import de.selmaier.graphqlspringboot.components.repositories.BookRepository;
import de.selmaier.graphqlspringboot.entities.Book;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @QueryMapping
    public List<Book> books() {
        return bookRepository.findAll();
    }
    
}
