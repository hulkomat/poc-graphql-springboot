package de.selmaier.graphqlspringboot.components.repositories;

import java.util.ArrayList;
import java.util.List;

import de.selmaier.graphqlspringboot.entities.Library;

public class LibraryRepository {

    private final List<Library> libraries = new ArrayList<>();

    public List<Library> findAll() {
        return libraries;
    }
}
