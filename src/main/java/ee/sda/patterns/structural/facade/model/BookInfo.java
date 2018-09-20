package ee.sda.patterns.structural.facade.model;

public class BookInfo {

  private Book book;
  private Author author;

  public BookInfo(Book book, Author author) {
    this.book = book;
    this.author = author;
  }

  public Book getBook() {
    return book;
  }

  public Author getAuthor() {
    return author;
  }
}
