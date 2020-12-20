public class Product {

    private String name;
    private int quantity;

    public Product(String name) {
        this.name = name;
        this.quantity = 1;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int n) {
        if (n < 1) {
            this.quantity = 1;
        } else {
            this.quantity = n;
        }
    }
}
