import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<LibraryMember> libraryMembers = new ArrayList<LibraryMember>();
    private static ArrayList<Book> booksList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {

        UserCreator.createUsers();
        BookCreator.createBooks();

        start();



    }

    public static void start() {
        System.out.println("Hello, welcome to the interactive library system.");
        giveOptions();
    }

    public static void giveOptions() {
        System.out.println("What would you like to do?");
        System.out.println("1. View users");
        System.out.println("2. View all books");
        System.out.println("3. Log in as user");
        System.out.println("4. Log in as staff");


        int choice = sc.nextInt();

        if (choice == 1) {viewUsers();}
        else if (choice == 2) {viewBooks();}
        else if (choice == 3) {System.out.println("Choice 3 has been chosen");}
        else {
            System.out.println("Please choose a valid number");
            giveOptions();
        }
    }

    public static void viewUsers() {
        System.out.println("All users can be seen below");
        System.out.println();
        for (LibraryMember libraryMember : libraryMembers) System.out.println(libraryMember.toString());
        System.out.println();
        System.out.println("1. Go back");

        int choice = sc.nextInt();
        if (choice == 1) {giveOptions();}
        else {
            System.out.println("Please choose a valid number");
            viewUsers();
        }
    }

    public static void viewBooks() {
        System.out.println("All books can be seen below");
        System.out.println("");
        for (Book book : booksList) {System.out.println(booksList.toString());}
    }

    public static ArrayList<LibraryMember> getLibraryMembers() {
        return libraryMembers;
    }
    public static ArrayList<Book> getBooksList() {return booksList;}
}
