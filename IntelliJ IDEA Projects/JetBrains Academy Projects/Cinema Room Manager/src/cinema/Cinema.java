package cinema;

import java.util.*;

public class Cinema {

    public static void main(String[] args) {

        TheaterRoom tRoom = new TheaterRoom(UserInterface.inputRows(), UserInterface.inputSeats());
        while (true) {
            switch (UserInterface.menuOptionsInteraction()) {
                case 1:
                    tRoom.printTheater();
                    break;
                case 2:
                    while (!tRoom.purchaseTicket(UserInterface.selectRow(), UserInterface.selectSeatInRow()));
                    break;
                case 3:
                    tRoom.printStatistics();
                    break;
                case 0:
                    return;
            }
        }
    }
}
