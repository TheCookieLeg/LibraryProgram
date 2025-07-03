import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<LibraryMember> libraryMembers = new ArrayList<LibraryMember>();

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        BookCreator.createBooks();

        for (int i = 0; i < libraryMembers.size(); i++)
            System.out.println(libraryMembers.get(i).toString());
    }

    public static ArrayList<LibraryMember> getLibraryMembers() {
        return libraryMembers;
    }
}
