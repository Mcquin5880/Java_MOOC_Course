import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CoffeeMaker coffeeMaker = new CoffeeMaker(400, 540, 120, 9, 550);

        boolean quit = false;
        while (!quit) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String input = scanner.nextLine();
            System.out.println();
            switch(input) {
                case "buy":
                    purchaseBeverage(scanner, coffeeMaker);
                    break;
                case "fill":
                    fillCoffeeMaker(scanner, coffeeMaker);
                    break;
                case "take":
                    takeRegisterContents(coffeeMaker);
                    break;
                case "remaining":
                    coffeeMaker.printCoffeeMakerStatus();
                    break;
                case "exit":
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    private static void purchaseBeverage(Scanner scanner, CoffeeMaker coffeeMaker) {

        Beverage espresso = new Beverage(250,0, 16, 4);
        Beverage latte = new Beverage(350,75, 20, 7);
        Beverage cappuccino = new Beverage(200,100, 12, 6);

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                coffeeMaker.purchaseBeverage(espresso.getAmountOfWaterRequired(), espresso.getAmountOfMilkRequired(), espresso.getAmountOfBeansRequired(), espresso.getPrice());
                break;
            case "2":
                coffeeMaker.purchaseBeverage(latte.getAmountOfWaterRequired(), latte.getAmountOfMilkRequired(), latte.getAmountOfBeansRequired(), latte.getPrice());
                break;
            case "3":
                coffeeMaker.purchaseBeverage(cappuccino.getAmountOfWaterRequired(), cappuccino.getAmountOfMilkRequired(), cappuccino.getAmountOfBeansRequired(), cappuccino.getPrice());
                break;
            case "back":
                System.out.println();
                return;
            default:
                System.out.println("Invalid input.");
                System.out.println();
        }
        System.out.println();
    }

    private static void fillCoffeeMaker(Scanner scanner, CoffeeMaker coffeeMaker) {
        System.out.println("Write how many ml of water do you want to add: ");
        int waterAmt = Integer.valueOf(scanner.nextLine());
        System.out.println("Write how many ml of milk do you want to add: ");
        int milkAmt = Integer.valueOf(scanner.nextLine());
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int beansAmt = Integer.valueOf(scanner.nextLine());
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int cupsAmt = Integer.valueOf(scanner.nextLine());
        coffeeMaker.updateCoffeeMakerContents(waterAmt, milkAmt, beansAmt, cupsAmt);
        System.out.println();
    }

    private static void takeRegisterContents(CoffeeMaker coffeeMaker) {
        System.out.println("I gave you $" + coffeeMaker.withdrawAllFunds());
        System.out.println();
    }
}
