package cinema;

import java.text.DecimalFormat;

public class Theater {

    private int numberOfRows;
    private int numberOfColumns;
    private int totalNumberOfSeats;
    private boolean largeTheater;
    private char[][] seats;
    private int[][] seatPrices;

    private int basePrice = 10;
    private int discountPrice = 8;
    private int numberOfTicketsSold;
    private int currentTotalProfit;
    private int maxProfitIfSoldOut;

    public Theater(int numberOfRows, int numberOfColumns) {

        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
        this.totalNumberOfSeats = numberOfRows * numberOfColumns;
        this.largeTheater = this.totalNumberOfSeats > 60;
        this.seats = new char[numberOfRows][numberOfColumns];
        this.seatPrices = new int[numberOfRows][numberOfColumns];

        this.numberOfTicketsSold = 0;
        this.currentTotalProfit = 0;
        this.maxProfitIfSoldOut = getProfitTotalIfSoldOut();

        initializeSeats();
        initializePrices();
    }

    public int getCurrentTotalProfit() {
        int totalProfit = 0;

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                if (seats[i][j] == 'B') {
                    totalProfit += getPriceOfSeat(i + 1, j + 1);
                }
            }
        }
        return totalProfit;
    }

    public int getProfitTotalIfSoldOut() {
        int totalProfit = 0;

        for (int i = 0; i < seatPrices.length; i++) {
            for (int j = 0; j < seatPrices[0].length; j++) {
                totalProfit += seatPrices[i][j];
            }
        }
        return totalProfit;
    }

    public int getPriceOfSeat(int row, int col) {
        return this.seatPrices[row - 1][col - 1];
    }

    public void printSeatPrices() {
        for (int i = 0; i < seatPrices.length; i++) {
            for (int j = 0; j < seatPrices[0].length; j++) {
                System.out.print(seatPrices[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public boolean reserveSeat(int row, int col) {
        if (row <= 0 || row > seats.length || col < 0 || col > seats[0].length) {
            System.out.println("Wrong input!");
            return false;
        }
        if (seatIsAvailable(row, col)) {
            this.numberOfTicketsSold++;
            this.seats[row - 1][col - 1] = 'B';

            System.out.println("Ticket price: $" + getPriceOfSeat(row, col));
            return true;
        } else {
            System.out.println("That ticket has already been purchased!");
            return false;
        }
    }

    public boolean seatIsAvailable(int row, int col) {
        return this.seats[row - 1][col - 1] == 'S';
    }

    public void printTheater() {

        System.out.println("Cinema:");
        StringBuilder topRow = new StringBuilder();
        topRow.append("  ");
        for (int i = 1; i <= numberOfColumns; i++) {
            if (i < 9) {
                topRow.append(i + " ");
            } else {
                topRow.append(i);
            }
        }
        System.out.println(topRow);

        for (int i = 1; i <= numberOfRows; i++) {
            System.out.print(i + " ");
            System.out.print(returnSeatsInRow(i - 1) + "\n");
        }

    }

    public void printStatistics() {
        System.out.println();
        DecimalFormat df2 = new DecimalFormat("#.00");
        System.out.println("Number of purchased tickets: " + numberOfTicketsSold);
        if (getSalesAsPercentage() == 0) {
            System.out.println("Percentage: 0.00%");
        } else {
            System.out.println("Percentage: " + df2.format(getSalesAsPercentage()) +  "%");
        }
        System.out.println("Current income: $" + getCurrentTotalProfit());
        System.out.println("Total income: $" + getProfitTotalIfSoldOut());
        System.out.println();
    }

    private void initializeSeats() {
        for (int i = 0; i < this.seats.length; i++) {
            for (int j = 0; j < this.seats[0].length; j++) {
                seats[i][j] = 'S';
            }
        }
    }

    private void initializePrices() {

        if (this.largeTheater) {
            initializeLargeTheaterPrices();
        } else {
            initializeStandardTheaterPrices();
        }
    }

    private void initializeStandardTheaterPrices() {
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                this.seatPrices[i][j] = basePrice;
            }
        }
    }

    private void initializeLargeTheaterPrices() {
        int splitRow = this.numberOfRows / 2;

        for (int i = 0; i < splitRow; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                this.seatPrices[i][j] = basePrice;
            }
        }

        for (int i = splitRow; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                this.seatPrices[i][j] = discountPrice;
            }
        }
    }

    private double getSalesAsPercentage() {
        return  (1.0 * numberOfTicketsSold / totalNumberOfSeats) * 100;
    }

    private String returnSeatsInRow(int row) {
        if (row < 0 || row >= this.seats.length) return "";

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < this.numberOfColumns; i++) {
            res.append(this.seats[row][i]);
            res.append(" ");
        }
        return res.toString();
    }
}
