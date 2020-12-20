public class CoffeeMaker {

    private int amountOfWater;
    private int amountOfMilk;
    private int amountOfCoffeeBeans;
    private int amountOfCups;
    private int moneyInRegister;

    public CoffeeMaker(int amountOfWater, int amountOfMilk, int amountOfCoffeeBeans, int amountOfCups, int moneyInRegister) {
        this.amountOfWater = amountOfWater;
        this.amountOfMilk = amountOfMilk;
        this.amountOfCoffeeBeans = amountOfCoffeeBeans;
        this.amountOfCups = amountOfCups;
        this.moneyInRegister = moneyInRegister;
    }

    public void updateCoffeeMakerContents(int water, int milk, int beans, int cups) {
        if (water < 0 || milk < 0 || beans < 0 || cups < 0) {
            return;
        }
        this.amountOfWater += water;
        this.amountOfMilk += milk;
        this.amountOfCoffeeBeans += beans;
        this.amountOfCups += cups;
    }

    public void purchaseBeverage(int water, int milk, int beans, int price) {

        if (this.amountOfWater < water) {
            System.out.println("Sorry, not enough water!");
        } else if (this.amountOfMilk < milk) {
            System.out.println("Sorry, not enough milk!");
        } else if (this.amountOfCoffeeBeans < beans) {
            System.out.println("Sorry, not enough beans!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            this.amountOfWater -= water;
            this.amountOfMilk -= milk;
            this.amountOfCoffeeBeans -= beans;
            this.amountOfCups--;
            this.moneyInRegister += price;
        }
    }

    public int withdrawAllFunds() {
        int total = this.moneyInRegister;
        this.moneyInRegister = 0;
        return total;
    }

    public void printCoffeeMakerStatus() {
        System.out.println("The coffee machine has: ");
        System.out.println(this.amountOfWater + " of water");
        System.out.println(this.amountOfMilk + " of milk");
        System.out.println(this.amountOfCoffeeBeans + " of coffee beans");
        System.out.println(this.amountOfCups + " of disposable cups");
        System.out.println("$" + this.moneyInRegister + " of money");
        System.out.println();
    }

}
