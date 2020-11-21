import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Quinter
 */
public class UserInterface {
    
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = new TodoList();
        this.scanner = scanner;
    }
    
    public void start() {
        processUserInput();      
    }
    
    private void processUserInput() {
        
        while (true) {
            
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                addItem();
            } else if (command.equals("list")) {
                listAllItems();
            } else if (command.equals("remove")) {
                removeItem();
            } else {
                System.out.println("Invalid input.");
            }
        }      
    }
    
    private void addItem() {
        System.out.print("To add: ");
        todoList.add(scanner.nextLine());
    }
    
    private void listAllItems() {
        todoList.print();
    }
    
    private void removeItem() {
        System.out.print("Which one is removed? ");
        todoList.remove(Integer.valueOf(scanner.nextLine()));
    }
}
