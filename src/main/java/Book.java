import java.util.Scanner;
import java.util.ArrayList;

public class Book {
    private String title;
    private int numPages;
    private int publicationYear;

    public Book (String title, int numPages, int publicationYear) {
        this.title = title;
        this.numPages = numPages;
        this.publicationYear = publicationYear;
    }
    public String getTitle() {
        return title;
    }
    public int getNumPages() {
        return numPages;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    @Override
    public String toString() {
        return getTitle() + ", " + getNumPages() + " pages, " + getPublicationYear();
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Enter the title of the book (or press enter to finish): ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Enter the number of pages: ");
            int numberOfPages = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter the publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title, numberOfPages, publicationYear);
            books.add(book);
        }

        System.out.println ("What information do you want to print? (everything/name) ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (choice.equalsIgnoreCase("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        } else {
            System.out.println("Invalid choice");
        }
    }
}
