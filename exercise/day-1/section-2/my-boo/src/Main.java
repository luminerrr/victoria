public class Main {
    public static void main(String[] args) {
      LibraryItem myDvd = new DVD("Markus", "1", "myself", 200);
      LibraryItem myDvd2 = new DVD("MARKICOB", "2", "sepe", 300);
      LibraryItem myBook = new Book("Buku", "3", "karta", 20);
      LibraryItem myBook2 = new Book("Baka", "4", "topik", 50);

      Library myLibrary = new Library();
      myLibrary.addItem(myDvd);
      myLibrary.addItem(myDvd2);
      myLibrary.addItem(myBook);
      myLibrary.addItem(myBook2);
      myLibrary.listAllItems();
      myLibrary.checkOutItem("1");
      myLibrary.listAllItems();
      myLibrary.returnItem("1");
      myLibrary.removeItem("1");
      myLibrary.listAllItems();
    }
}