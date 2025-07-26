import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<LibraryMember> libraryMembers = new ArrayList<LibraryMember>();
    private static ArrayList<Book> booksList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    private static LibraryMember currentUser;

    public static void main (String[] args) {

        UserCreator.createUsers();
        BookCreator.createBooks();

        start();



    }

    private static void start() {
        System.out.println("Hello, welcome to the interactive library system.");
        guestOptions();
    }

    private static void guestOptions() {
        System.out.println("What would you like to do?");
        System.out.println("1. View users");
        System.out.println("2. View all books");
        System.out.println("3. Log in as user");
        System.out.println("4. Log in as staff");


        int choice = sc.nextInt();

        if (choice == 1) {viewUsers();}
        else if (choice == 2) {viewBooks();}
        else if (choice == 3) {userLogIn();}
        else {
            System.out.println("Please choose a valid number");
            guestOptions();
        }
    }

    private static void viewUsers() {
        System.out.println("All users can be seen below");
        System.out.println();
        for (LibraryMember libraryMember : libraryMembers) System.out.println(libraryMember.toString());
        System.out.println();
        System.out.println("1. Go back");

        int choice = sc.nextInt();
        if (choice == 1) {
            guestOptions();}
        else {
            System.out.println("Please choose a valid number.");
            viewUsers();
        }
    }

    private static void viewBooks() {
        System.out.println("All books can be seen below");
        System.out.println();
        for (Book book : booksList) {System.out.println(book.toString());}
        System.out.println();
        System.out.println("1. Go back");

        int choice = sc.nextInt();
        if (choice == 1) {
            guestOptions();}
        else {
            System.out.println("Please choose a valid number.");
            viewBooks();
        }
    }

    private static void userLogIn() {
        System.out.println("Please choose a user you want to log in as. Use the number from the ID");
        System.out.println();
        for (LibraryMember libraryMember : libraryMembers) System.out.println(libraryMember.toString());
        System.out.println();

        int choice = sc.nextInt();
        if (choice <= libraryMembers.size()) {
            currentUser = libraryMembers.get(choice - 1);
            userOptionsScreen();
        } else {
            System.out.println("Please choose a valid ID.");
            System.out.println();
            userLogIn();
        }
    }

    private static void userOptionsScreen() {
        System.out.println("Hello, " + currentUser.getName() + ". What would you like to do?");
        System.out.println();
        System.out.println("1. Borrow a book");
        System.out.println("2. Return a book");
        System.out.println("3. Log out");

        int choice = sc.nextInt();

        if (choice == 1) {userBorrowBook();}
        else if (choice == 2) {System.out.println("2. Has been chosen");}
        else if (choice == 3) {logOutUser();}
        else {System.out.println("Please choose a valid number.");}

    }

    private static void userBorrowBook() {
        System.out.println("Which book would you like to borrow?");
        System.out.println();
        for (Book book : booksList) System.out.println(book.toString());

        int choice = sc.nextInt();

        if (choice <= booksList.size()) {
            System.out.println("Book chosen");
            if (booksList.get(choice - 1).availableCopy()) {

            }
        }
        else {
            System.out.println("Please choose a valid ID");
            userBorrowBook();
        }
    }


    private static void logOutUser() {
        if (currentUser != null) {
            currentUser = null;
            System.out.println("You have been logged out. Returning to guest screen...");
            guestOptions();
        }
    }

    public static ArrayList<LibraryMember> getLibraryMembers() {
        return libraryMembers;
    }
    public static ArrayList<Book> getBooksList() {return booksList;}
}
