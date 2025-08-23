#!/usr/bin/env just --justfile

# default recipe to display help information
default:
  @just --list

# Start the application and make it available at http://localhost:8080/graphql
[group('run')]
start:
    ./gradlew bootRun
