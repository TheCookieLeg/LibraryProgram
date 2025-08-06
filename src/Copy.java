public class Copy {
    private Book copyOf;
    public static int currentID;
    private final int ID;
    private boolean isBorrowable;

    public Copy(Book copyOf) {
        this.ID = ++currentID;
        this.copyOf = copyOf;
        isBorrowable = true;
    }
    public boolean isBorrowable() {return isBorrowable;}
    public int getID() {return ID;}

    public void borrow () {isBorrowable = false;}
    public void returnToLibrary() {isBorrowable = true;}

    public String toString() {
        return "B" + copyOf.getBookID() + ". " + copyOf.getTitle() + " written by " + copyOf.getAuthor();
    }
}
