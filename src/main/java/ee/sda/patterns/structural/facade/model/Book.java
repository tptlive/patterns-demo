package ee.sda.patterns.structural.facade.model;

public class Book {

  private String name;
  private String isbn;
  private String authorName;

  public Book(String name, String isbn, String authorName) {
    this.name = name;
    this.isbn = isbn;
    this.authorName = authorName;
  }

  public String getName() {
    return name;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getAuthorName() {
    return authorName;
  }

  @Override
  public String toString() {
    return "Book{" +
        "name='" + name + '\'' +
        ", isbn='" + isbn + '\'' +
        ", authorName='" + authorName + '\'' +
        '}';
  }

}
