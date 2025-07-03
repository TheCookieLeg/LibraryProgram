public class Copy {
    private Book copyOf;
    public static int currentID;
    private final int ID;
    private boolean isBorrowable = true;

    public Copy(Book copyOf) {
        this.ID = ++currentID;
        this.copyOf = copyOf;
    }
    public boolean isBorrowable() {return isBorrowable;}
    public int getID() {return ID;}

    public void borrow () {isBorrowable = false;}
    public void returnToLibrary() {isBorrowable = true;}
}
