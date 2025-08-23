package de.selmaier.graphqlspringboot.entities;

public record Book(Long id, String title, int pages, Author author) {
}
