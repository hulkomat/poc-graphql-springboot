package de.selmaier.graphqlspringboot.components.repositories;

import java.util.ArrayList;
import java.util.List;

import de.selmaier.graphqlspringboot.entities.Author;

public class AuthorRepository {

    private final List<Author> authors = new ArrayList<>();

    public List<Author> findAll() {
        return authors;
    }
}
