
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        
        
        
        
        Scanner scan = new Scanner(System.in);
        Container c1 = new Container();
        Container c2 = new Container();

        while (true) {
            
            System.out.println("First: " + c1);
            System.out.println("Second: " + c2);
            
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            if (parts.length != 2) {
                continue;
            }
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                c1.add(amount);
            } else if (command.equals("remove")) {
                c2.remove(amount);
            } else if (command.equals("move")) {
                if (amount > c1.contains()) {
                    amount = c1.contains();
                }
                c1.remove(amount);
                c2.add(amount);
            }
            System.out.println("");
        }
        
    }

}
