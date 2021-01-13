package cinema;

import java.util.Scanner;

public interface UserInterface {

    Scanner scanner = new Scanner(System.in);

    static int inputRows() {
        System.out.println("Enter the number of rows:");
        return scanner.nextInt();
    }

    static int inputSeats() {
        System.out.println("Enter the number of seats in each row:");
        return scanner.nextInt();
    }

    static int selectRow() {
        System.out.println("Enter a row number:");
        return scanner.nextInt();
    }

    static int selectSeatInRow() {
        System.out.println("Enter a seat number in that row:");
        return scanner.nextInt();
    }

    static int menuOptionsInteraction() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        return scanner.nextInt();
    }

}
