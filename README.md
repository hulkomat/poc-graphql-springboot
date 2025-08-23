# Proof of concept - GraphQL with Spring Boot

This is a simple application demonstrating the use of GraphQL with Spring Boot. It provides a basic setup for building a GraphQL API using Spring Boot and related technologies.

## Getting Started

To get started with this project, you will need to have the following prerequisites installed:

- Java 21 or higher
- Just (a command runner)

Once you have the prerequisites in place, you can clone this repository and run the application.

```bash
git clone https://github.com/hulkomat/poc-graphql-springboot.git
cd poc-graphql-springboot
just start
```

The application will be available at `http://localhost:8080/graphql`.

You can run an example query using Hoppscotch.

```graphql
query {
  books {
    id
    title
  }
}
```
