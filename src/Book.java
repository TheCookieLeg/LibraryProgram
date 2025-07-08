public class Book {
    private final int BookID;
    private int currentID;
    private String title;
    private String author;

    public Book (String title, String author) {
        BookID = ++currentID;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "B" + this.BookID + ". " + this.title + " written by " + this.author;
    }
}
