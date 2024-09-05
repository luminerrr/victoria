public interface LibraryInterface {
  void addItem(LibraryItem item);
  void removeItem(String id);
  void listAllItems();
  void checkOutItem(String id);
  void returnItem(String id);
  LibraryItem searchByTitle(String title);
}
