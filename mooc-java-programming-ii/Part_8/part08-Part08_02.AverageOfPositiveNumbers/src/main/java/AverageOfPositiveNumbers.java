
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);      
        int totalSum = 0;
        int count = 0;
        
        while (true) {
                  
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            
            if (input > 0) {
                totalSum += input;
                count++;
            }
        }
        
        if (count != 0) {
            System.out.println((1.0 * totalSum) / count);
        } else {
            System.out.println("Cannot calculate the average.");
        }
    }
}
