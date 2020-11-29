

public class Main {

    public static void main(String[] args) {
        
        ProductWarehouseWithHistory pwh = new ProductWarehouseWithHistory("coffee",10,5);
        System.out.println(pwh.howMuchSpaceLeft());
        System.out.println(pwh.takeFromWarehouse(7));

        
    }
}
