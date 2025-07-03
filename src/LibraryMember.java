import java.util.ArrayList;

public class LibraryMember {
    private String name;
    private int age;
    private int numberOfLoans;

    private ArrayList<Copy> borrowedCopies = new ArrayList<Copy>();

    public LibraryMember (String name, int age) {
        this.name = name;
        this.age = age;
        this.numberOfLoans = 0;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public int getNumItemsOnLoan() {return numberOfLoans;}
    public void borrowCopy(Copy c) {
        if (c.isBorrowable()) {
            c.borrow();
            borrowedCopies.add(c);
        }
    }
    public void returnCopy(Copy c) {
        if (borrowedCopies.contains(c)) {
            c.returnToLibrary();
            borrowedCopies.remove(c);
        }
    }

    public String toString() {
        return "Member name: " + this.name + ". Age: " + this.age + ". This user currently has " + this.numberOfLoans + " itmes on loan";
    }
}
