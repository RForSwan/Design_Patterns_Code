//package BookRecommendationsSystem;
//
//public class CLI {
//    /// CLI stands for Command Line Interface
//    private static CLI instance = new CLI();
//
//    public static CLI getInstance() {
//        return instance;
//    }
//
//    public void start() {
//        boolean quit = false;
//        while (!quit) {
//
//            switch (homeInterface()) {
//                case 1 :
//                    break;
//                case 2 :
//                    break;
//                case 3:
//                    break;
//            }
//            return;
//        }
//    }
//
//    private int homeInterface(){
//        String strInterface =
//                """
//                Welcome to the library
//
//                Please choose what you want to do :
//                1> View current recommendations
//                2> Clone a recommendation
//                3> Modify a recommendation
//                """;
//
//        System.out.println(strInterface);
//    }
//
//}


package BookRecommendationsSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CLI {
    /// CLI stands for Command Line Interface
    private static CLI instance = new CLI();
    private List<Recommendation> recommendations = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static CLI getInstance() {
        return instance;
    }

    public void start() {
        boolean quit = false;
        while (!quit) {
            switch (homeInterface()) {
                case 1:
                    viewRecommendations();
                    break;
                case 2:
                    cloneRecommendation();
                    break;
                case 3:
                    modifyRecommendation();
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        System.out.println("Goodbye!");
        scanner.close();
    }

    private int homeInterface() {
        String strInterface =
                """
                Welcome to the library
                
                Please choose what you want to do :
                1> View current recommendations
                2> Clone a recommendation
                3> Modify a recommendation
                4> Quit
                """;

        System.out.println(strInterface);
        return readInt("Your choice : ");
    }

    // ── View ────────────────────────────────────────────────────────────────

    private void viewRecommendations() {
        System.out.println("\n── Current Recommendations ──");
        if (recommendations.isEmpty()) {
            System.out.println("No recommendations saved yet.");
        } else {
            for (int i = 0; i < recommendations.size(); i++) {
                System.out.println((i + 1) + "> " + recommendations.get(i));
            }
        }
        System.out.println();
    }

    // ── Clone ────────────────────────────────────────────────────────────────

    private void cloneRecommendation() {
        System.out.println("\n── Clone a Recommendation ──");
        Recommendation source = pickRecommendation();
        if (source == null) return;

        Recommendation clone = source.clone();
        recommendations.add(clone);
        System.out.println("Recommendation cloned successfully : " + clone);
        System.out.println();
    }

    // ── Modify ───────────────────────────────────────────────────────────────

    private void modifyRecommendation() {
        System.out.println("\n── Modify a Recommendation ──");

        String strInterface =
                """
                What would you like to do ?
                1> Create a new recommendation
                2> Edit an existing recommendation
                """;

        System.out.println(strInterface);
        switch (readInt("Your choice : ")) {
            case 1 -> createRecommendation();
            case 2 -> editRecommendation();
            default -> System.out.println("Invalid option.");
        }
    }

    private void createRecommendation() {
        System.out.println("\n── Create a Recommendation ──");
        String audience = readString("Target audience : ");
        Recommendation recommendation = new Recommendation(audience);
        addBooksToRecommendation(recommendation);
        recommendations.add(recommendation);
        System.out.println("Recommendation saved : " + recommendation);
        System.out.println();
    }

    private void editRecommendation() {
        System.out.println("\n── Edit a Recommendation ──");
        Recommendation recommendation = pickRecommendation();
        if (recommendation == null) return;

        String strInterface =
                """
                What would you like to edit ?
                1> Change target audience
                2> Add a book
                3> Remove a book
                """;

        System.out.println(strInterface);
        switch (readInt("Your choice : ")) {
            case 1 -> changeTargetAudience(recommendation);
            case 2 -> addBooksToRecommendation(recommendation);
            case 3 -> removeBookFromRecommendation(recommendation);
            default -> System.out.println("Invalid option.");
        }
    }

    private void changeTargetAudience(Recommendation recommendation) {
        String newAudience = readString("New target audience : ");
        recommendation.setTargetAudience(newAudience);
        System.out.println("Target audience updated : " + recommendation);
        System.out.println();
    }

    private void addBooksToRecommendation(Recommendation recommendation) {
        boolean addMore = true;
        while (addMore) {
            String author = readString("Book author : ");
            String title = readString("Book title  : ");
            recommendation.addBook(new Book(author, title));
            System.out.println("Book added.");
            addMore = readYesNo("Add another book? (y/n) : ");
        }
        System.out.println();
    }

    private void removeBookFromRecommendation(Recommendation recommendation) {
        List<Book> books = recommendation.getBooks();
        if (books.isEmpty()) {
            System.out.println("This recommendation has no books to remove.");
            System.out.println();
            return;
        }

        System.out.println("Books in this recommendation :");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + "> " + books.get(i));
        }

        int index = readInt("Which book do you want to remove? : ") - 1;
        if (index < 0 || index >= books.size()) {
            System.out.println("Invalid selection.");
        } else {
            Book removed = books.remove(index);
            System.out.println("Removed : " + removed);
        }
        System.out.println();
    }

    // ── Helpers ───────────────────────────────────────────────────────────────

    private Recommendation pickRecommendation() {
        if (recommendations.isEmpty()) {
            System.out.println("No recommendations available.");
            System.out.println();
            return null;
        }

        System.out.println("Available recommendations :");
        for (int i = 0; i < recommendations.size(); i++) {
            System.out.println((i + 1) + "> " + recommendations.get(i));
        }

        int index = readInt("Select a recommendation : ") - 1;
        if (index < 0 || index >= recommendations.size()) {
            System.out.println("Invalid selection.");
            System.out.println();
            return null;
        }
        return recommendations.get(index);
    }

    private int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private boolean readYesNo(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim().equalsIgnoreCase("y");
    }
}