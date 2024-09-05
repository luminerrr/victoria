public class Book extends LibraryItem{
    private String author;
    private Integer pages;

    public Book(String title, String itemId, String author, Integer pages) {
        super(title, itemId);
        this.author = author;
        this.pages = pages;
    }

    @Override
    void checkOut() {
        isCheckedOut = true;
    }

    @Override
    void returnItem() {
        isCheckedOut = false;
    }

    @Override
    void printDetails() {
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);

    }
}
