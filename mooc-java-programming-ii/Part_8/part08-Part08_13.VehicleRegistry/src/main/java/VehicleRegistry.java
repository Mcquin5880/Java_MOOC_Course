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
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) return false;
        registry.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return registry.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (!registry.containsKey(licensePlate)) return false;
        registry.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for (LicensePlate lp : registry.keySet()) {
            System.out.println(lp);
        }
    }
    
    public void printOwners() {
        List<String> owners = new ArrayList<>();
        for (String owner : registry.values()) {
            if (owners.contains(owner)) continue;
            owners.add(owner);
            System.out.println(owner);
        }
    }
}
