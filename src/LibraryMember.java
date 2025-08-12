import java.util.ArrayList;

public class LibraryMember {
    private static int currentID;
    private final int ID;
    private String name;
    private int age;
    private int numberOfLoans;

    private ArrayList<Copy> borrowedCopies = new ArrayList<Copy>();

    public LibraryMember (String name, int age) {
        this.ID = ++currentID;
        this.name = name;
        this.age = age;
        this.numberOfLoans = 0;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public int getNumItemsOnLoan() {return borrowedCopies.size();}
    public Copy borrowCopy(Book b) {
        Copy c = b.borrowCopy();
        if (c != null) {return c;}
        else {return null;}
    }
    public void returnCopy(Copy c) {
        
    }

    public ArrayList<Copy> getBorrowedCopies() {return borrowedCopies;}

    public String toString() {
        return "U" + ID + ". Name: " + this.name + ". Age: " + this.age + ". This user currently has " + getNumItemsOnLoan() + " items on loan";
    }
}
