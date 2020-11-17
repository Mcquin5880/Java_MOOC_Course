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
public class StorageFacility {
    
    HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        if (!storage.containsKey(unit)) {
            ArrayList<String> newList = new ArrayList<>();
            newList.add(item);
            storage.put(unit, newList);
        } else {
            storage.get(unit).add(item);
        }
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return storage.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item) {
        if (storage.containsKey(storageUnit)) {
            storage.get(storageUnit).remove(item);
            if (storage.get(storageUnit).size() == 0) {
                storage.remove(storageUnit);
            }
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> result = new ArrayList<>();
        for (String storageUnit : storage.keySet()) {
            if (storage.get(storageUnit).size() > 0) {
                result.add(storageUnit);
            }
        }
        return result;
    }   
}
