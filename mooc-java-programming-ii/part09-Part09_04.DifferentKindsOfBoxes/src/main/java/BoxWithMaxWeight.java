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
public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Item item) {
        if (this.weightOfItems() + item.getWeight() > capacity) {
            return;
        }
        this.items.add(item);
    }
    
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
    private int weightOfItems() {
        int sum = 0;
        for (Item item : this.items) {
            sum += item.getWeight();
        }
        return sum;
    }
}
