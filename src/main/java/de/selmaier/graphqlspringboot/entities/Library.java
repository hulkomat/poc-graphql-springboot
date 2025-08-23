package de.selmaier.graphqlspringboot.entities;

import java.util.List;

public record Library(Long id, String title, List<Book> books) {
}
