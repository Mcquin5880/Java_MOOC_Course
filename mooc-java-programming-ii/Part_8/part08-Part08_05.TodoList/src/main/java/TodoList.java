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
public class TodoList {
    
    private List<String> todoList;
    
    public TodoList() {
        this.todoList = new ArrayList<>();
    }
    
    public void add(String task) {
        todoList.add(task);
    }
    
    public void print() {
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + 1 + ": " + todoList.get(i));
        }
    }
    
    public void remove(int number) {
        if (number < 0 || number > todoList.size()) return;
        todoList.remove(number - 1);
    }
    
}
