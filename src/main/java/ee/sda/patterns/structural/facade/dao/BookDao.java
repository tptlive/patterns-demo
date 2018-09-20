package ee.sda.patterns.structural.facade.dao;

import ee.sda.patterns.structural.facade.model.Author;
import ee.sda.patterns.structural.facade.model.Book;

import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

public class BookDao {

  private List<Book> books = asList(
      new Book("Clean Code", "12423452", "Robert C. Martin"),
      new Book("TDD by Example", "9846323265", "Kent Beck"),
      new Book("C Programming Language","874364532","Dennis Ritchie")
  );

  public Optional<Book> findByName(String bookName) {
    return books.stream()
        .filter(author -> author.getName().equalsIgnoreCase(bookName))
        .findFirst();
  }

}
