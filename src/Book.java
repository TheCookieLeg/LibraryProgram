public class Book {
    private String title;
    private String author;
    private boolean isBorrowable;

    public boolean isBorrowable() {return isBorrowable;}

    public void copyBorrowed(Copy c) {isBorrowable = false;}
    public void copyReturned(Copy c) {isBorrowable = true;}
}
