public class LibraryMember {
    private String name;
    private int age;
    private int numberOfLoans;

    public LibraryMember (String name, int age) {
        this.name = name;
        this.age = age;
        this.numberOfLoans = 0;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public int getNumItemsOnLoan() {return numberOfLoans;}
    public void borrowCopy(Copy c) {

    }
    public void returnCopy(Copy c) {

    }

    public String toString() {
        return "Member name: " + this.name + ". Age: " + this.age + ". This user currently has " + this.numberOfLoans + " itmes on loan";
    }
}
