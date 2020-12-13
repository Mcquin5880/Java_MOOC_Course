package cinema;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row: ");
        int numSeats = scanner.nextInt();
        Theater theater = new Theater(numRows, numSeats);

        UserInterface ui = new UserInterface(scanner, theater);
        ui.start();

    }
}
