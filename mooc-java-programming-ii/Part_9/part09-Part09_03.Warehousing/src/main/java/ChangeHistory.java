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
public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    public double maxValue() {
        double maxVal = Double.MIN_VALUE;
        for (double i : history) {
            if (i > maxVal) {
                maxVal = i;
            }
        }
        return maxVal;
    }
    
    public double minValue() {
        double minVal = Double.MAX_VALUE;
        for (double i : history) {
            if (i < minVal) {
                minVal = i;
            }
        }
        return minVal;
    }
    
    public double average() {
        if (this.history.size() == 0) return 0;
        double total = 0;
        for (double i : history) {
            total += i;
        }
        return total / history.size();
    }
    
    public String toString() {
        return history.toString();
    }
}
