import java.util.ArrayList;

public class Library {
  private ArrayList<LibraryItem> items;

  public Library() {
    items = new ArrayList<LibraryItem>();
  }

  void addItem(LibraryItem item) {
    // Add the item to the array
    items.add(item);
    System.out.println("add one item");
  }

  void removeItem(String id) {
    for (LibraryItem item : items) {
      if(id == item.itemId) {
        items.remove(item);
        System.out.println("Item has been removed");
        return;
      }
    }

    System.out.println("Item with id " + id + " doesnt exist");
  }

  void listAllItems() {
    for (LibraryItem item : items) {
      item.printDetails();
    }
  }

  void checkOutItem(String id) {
    for (LibraryItem item : items) {
      if(id == item.itemId) {
        item.checkOut();
        System.out.println("Item has been checked out");
      }
    }

    System.out.println("Item with id " + " id doesnt exist");
  }

  void returnItem(String id) {
    for (LibraryItem item : items) {
      if(id == item.itemId) {
        item.returnItem();
        System.out.println("Item has been returned");
      }
    }

    System.out.println("Item with id " + " id doesnt exist");
  }

  LibraryItem searchByTitle(String title) {
    for (LibraryItem item : items) {
      if(item.title == title) {
        return item;
      }
    }

    System.out.println("No item with that title");
    return null;
  }
}
