
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Give a string: ");
        String strInput = scanner.nextLine();
        System.out.println("Give an integer: ");
        int numberInt = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double: ");
        double numberDouble = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean: ");
        boolean boolValue = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + strInput);
        System.out.println("You gave the integer " + numberInt);
        System.out.println("You gave the double " + numberDouble);
        System.out.println("You gave the boolean " + boolValue);
        
        
    }
}
