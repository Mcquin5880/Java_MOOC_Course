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
public class IOU {
    
    private HashMap<String, Double> map;
    
    public IOU() {
        map = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        map.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String whom) {
        return map.getOrDefault(whom, 0.0);
    }
    
}
