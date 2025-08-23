package de.selmaier.graphqlspringboot.entities;

import java.util.List;

public record Author(Long id, String name, List<Book> books) {
}
