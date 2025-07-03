import java.util.ArrayList;

public class Main {

    private static ArrayList<LibraryMember> libraryMembers = new ArrayList<LibraryMember>();

    public static void main (String[] args) {
        libraryMembers.add(new LibraryMember("John", 32));
        System.out.println(libraryMembers.get(0).toString());
    }
}
