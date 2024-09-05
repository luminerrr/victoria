public class DVD extends LibraryItem{
    private String director;
    private Integer duration;

    public DVD(String title, String itemId, String director, Integer duration) {
        super(title, itemId);
        this.director = director;
        this.duration = duration;
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
        System.out.println(director);
        System.out.println(duration);
    }
}
