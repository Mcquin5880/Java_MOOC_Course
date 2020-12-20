import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pubYear, pages));
        }
        
        System.out.print("\nWhat information will be printed? ");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        if (input.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (input.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getName());
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
