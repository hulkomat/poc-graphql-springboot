package de.selmaier.graphqlspringboot.components.resolvers;

import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import de.selmaier.graphqlspringboot.components.repositories.BookRepository;
import de.selmaier.graphqlspringboot.entities.Book;

@GraphQlTest(controllers = BookController.class)
class BookQueryTest {

  @Autowired GraphQlTester graphQlTester;

  @MockitoBean BookRepository bookRepo;

  @Test
  void books_returns_titles() {
    when(bookRepo.findAll()).thenReturn(List.of(
      new Book(1L, "Clean Code", 464, null),
      new Book(2L, "Effective Java", 416, null)
    ));

    graphQlTester.document("""
      query {
        books { id title }
      }
    """)
    .execute()
    .path("books[*].title")
    .entityList(String.class)
    .contains("Clean Code", "Effective Java");
  }

  @Test
  void addBookHasValue() {
    graphQlTester.documentName("addBook")
      .variable("input", Map.of("title","DDD","pages",560,"authorId",1))
      .execute()
      .path("addBook.id").hasValue();
  }
}