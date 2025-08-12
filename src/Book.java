import java.util.ArrayList;

public class Book {
    private final int BookID;
    private static int currentID;
    private String title;
    private String author;
    private ArrayList<Copy> copies = new ArrayList<Copy>();

    public Book (String title, String author, int numberOfCopies) {
        this.BookID = ++currentID;
        this.title = title;
        this.author = author;

        for (int i = 0; i < numberOfCopies; i++) {
            copies.add(new Copy(this));
        }
    }

    private int copiesAvailable() {
        int numberOfCopiesAvailable = 0;
        for (Copy copy : copies) {
            if (copy.isBorrowable())
                numberOfCopiesAvailable++;
        }
        return numberOfCopiesAvailable;
    }

    public boolean availableCopy() {
        for (Copy copy : copies) {
            if (copy.isBorrowable()) {
                return true;
            }
        }
        return false;
    }

    public Copy borrowCopy() {
        for(int i = 0; i < copies.size(); i++) {
            if (copies.get(i).isBorrowable()) {
                copies.get(i).borrow();
                return copies.get(i);
            }
        }
        return null;
    }

    public int getBookID() {return this.BookID;}
    public String getTitle() {return this.title;}
    public String getAuthor() {return this.author;}

    @Override
    public String toString() {
        return "B" + this.BookID + ". " + this.title + " written by " + this.author + ". We have " + copies.size() + " copies of this book. Currently, " + copiesAvailable() + " copies are available";
    }
}
