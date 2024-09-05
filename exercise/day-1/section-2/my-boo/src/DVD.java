public class DVD extends LibraryItem {
  private String director;
  private Integer duration;

  public DVD(String title, String itemId, String director, Integer duration) {
    super(title, itemId);
    this.director = director;
    this.duration = duration;
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
    if(!isCheckedOut) {
      System.out.println("Item has not been checked out");
      return;
    }
    isCheckedOut = false;
  }

  @Override
  void printDetails() {
    System.out.println("DVD Details");
    System.out.println("id: " + itemId);
    System.out.println("title: " + title);
    System.out.println("isCheckedOut: " + isCheckedOut);
    System.out.println("Director: " + director);
    System.out.println("Duration: " + duration);
  }
}
