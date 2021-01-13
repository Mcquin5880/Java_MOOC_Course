package cinema;

import java.util.*;

public class TheaterRoom {

    private int rows;
    private int seats;
    private char[][] seatsArray;

    public TheaterRoom(int rows, int seats) {
        this.rows = rows;
        this.seats = seats;
        this.seatsArray = new char[rows][seats];
        initializeSeats(seatsArray);
    }

    public int getSeatPrice(int row) {
        return rows * seats <= 60 ? 10 : row <= rows / 2 ? 10 : 8;
    }

    public void printSeatPrice(int row) {
        System.out.println("Ticket price: $" + getSeatPrice(row));
    }

    public boolean purchaseTicket(int row, int seat) {

        if (row <= 0 || row > seatsArray.length || seat < 0 || seat > seatsArray[0].length) {
            System.out.println("Wrong input!");
            return false;
        } else if (seatsArray[row - 1][seat - 1] == 'B') {
            System.out.println("That ticket has already been purchased!");
            return false;
        } else {
            seatsArray[row - 1][seat - 1] = 'B';
            printSeatPrice(row);
            return true;
        }
    }

    public void printTheater() {

        System.out.println("Cinema:");
        StringBuilder topRow = new StringBuilder();
        topRow.append("  ");
        for (int i = 1; i <= seats; i++) {
            if (i < 9) {
                topRow.append(i + " ");
            } else {
                topRow.append(i);
            }
        }
        System.out.println(topRow);

        for (int i = 1; i <= rows; i++) {
            System.out.print(i + " ");
            System.out.print(returnSeatsInRow(i - 1) + "\n");
        }
    }

    public void printStatistics() {

        int purchasedTickets = 0;
        int currentIncome = 0;
        int totalIncome = 0;

        for (int r = 1; r <= rows; r++) {
            for (int s = 1; s <= seats; s++) {
                totalIncome += getSeatPrice(r);
                if (seatsArray[r - 1][s - 1] == 'B') {
                    purchasedTickets++;
                    currentIncome += getSeatPrice(r);
                }
            }
        }
        float percentage = (float) purchasedTickets / (rows * seats) * 100;
        System.out.printf("Number of purchased tickets:%d\n" +
                        "Percentage: %.2f%%\n" +
                        "Current income: $%d\n" +
                        "Total income: $%d\n\n",
                purchasedTickets, percentage, currentIncome, totalIncome);
    }

    private String returnSeatsInRow(int row) {

        if (row < 0 || row >= seatsArray.length) return "";

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < seats; i++) {
            res.append(seatsArray[row][i]);
            res.append(" ");
        }
        return res.toString();
    }

    private void initializeSeats(char[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = 'S';
            }
        }

    }
}

