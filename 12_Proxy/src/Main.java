import Library.Access.AccessControlService;
import Library.Document.*;
import Library.Library;
import Library.User.User;

import java.time.LocalDate;


public class Main {
    public static void main() {
        AccessControlService acs = AccessControlService.getInstance();

        Library library = new Library();

        library.addNewUser("User1");
        library.addNewUser("User2");

        library.addNewDocument(1, LocalDate.of(2026, 3, 28), "This is the first doc", false);
        library.addNewDocument(2, LocalDate.of(2026, 3, 28), "This is the second doc", true);

        acs.displayAccesses();

        try {
            System.out.println(library.accessDocument("User1",1));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(library.accessDocument("User1",2));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(library.accessDocument("User2",1));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(library.accessDocument("User2",2));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(library.accessDocument("User3", 1));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        library.grantAccess("User1", 2);

        try {
            System.out.println(library.accessDocument("User1",2));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
