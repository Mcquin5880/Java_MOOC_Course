public class Beverage {

    private int amountOfWaterRequired;
    private int amountOfMilkRequired;
    private int amountOfBeansRequired;
    private int price;

    public Beverage(int amountOfWaterRequired, int amountOfMilkRequired, int amountOfBeansRequired, int price) {
        this.amountOfWaterRequired = amountOfWaterRequired;
        this.amountOfMilkRequired = amountOfMilkRequired;
        this.amountOfBeansRequired = amountOfBeansRequired;
        this.price = price;
    }

    public int getAmountOfWaterRequired() {

        return amountOfWaterRequired;
    }

    public int getAmountOfMilkRequired() {

        return amountOfMilkRequired;
    }

    public int getAmountOfBeansRequired() {

        return amountOfBeansRequired;
    }

    public int getPrice() {

        return price;
    }

}
