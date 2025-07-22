import java.util.ArrayList;

public class Book {
    private final int BookID;
    private static int currentID;
    private String title;
    private String author;
    private ArrayList<Copy> copies = new ArrayList<Copy>();

    public Book (String title, String author) {
        this.BookID = ++currentID;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "B" + this.BookID + ". " + this.title + " written by " + this.author;
    }
}
