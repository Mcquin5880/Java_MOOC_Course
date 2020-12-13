package cinema;

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Theater theater;

    public UserInterface(Scanner scanner, Theater theater) {
        this.scanner = scanner;
        this.theater = theater;
    }

    public void start() {

        boolean quit = false;
        while (!quit) {
            showMenuOptions();
            int input = scanner.nextInt();
            switch(input) {
                case 1:
                    theater.printTheater();
                    break;
                case 2:
                    ticketPurchase();
                    break;
                case 3:
                    theater.printStatistics();
                    break;
                case 0:
                    quit = true;
                    break;
            }
        }
    }

    private void showMenuOptions() {
        System.out.println();
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        System.out.println();
    }

    private void ticketPurchase() {
        boolean success = false;
        while (!success) {

            System.out.println("Enter a row number:");
            int row = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            int col = scanner.nextInt();
            success = theater.reserveSeat(row, col);
            System.out.println();

        }
    }

}
