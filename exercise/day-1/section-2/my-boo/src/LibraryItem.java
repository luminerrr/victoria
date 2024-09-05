abstract class LibraryItem {
    private String title;
    private String itemId;
    protected Boolean isCheckedOut;

    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isCheckedOut = false;
    }

    abstract void checkOut();
    abstract void returnItem();
    abstract void printDetails();
}