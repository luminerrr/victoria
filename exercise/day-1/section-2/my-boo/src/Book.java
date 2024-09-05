public class Book extends LibraryItem {
  private String author;
  private Integer pages;

  public Book(String title, String itemId, String author, Integer pages) {
    super(title, itemId);
    this.author = author;
    this.pages = pages;
  }

  @Override
  void checkOut() {
    if (isCheckedOut) {
      System.out.println("Item already checked out");
      return;
    }
    isCheckedOut = true;
  }

  @Override
  void returnItem() {
    if (!isCheckedOut) {
      System.out.println("Item has not been checked out");
      return;
    }
    isCheckedOut = false;
  }

  @Override
  void printDetails() {
    System.out.println("Book Details");
    System.out.println("id: " + itemId);
    System.out.println("title: " + title);
    System.out.println("isCheckedOut: " + isCheckedOut);
    System.out.println("Author: " + author);
    System.out.println("Pages: " + pages);
  }
}
