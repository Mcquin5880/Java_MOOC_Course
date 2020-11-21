/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Michael Quinter
 */
public class StandardSensor implements Sensor {
    
    private int value;
    
    public StandardSensor(int value) {
        this.value = value;
    }
    
    public void setOn() {
        // no effect
    }
    
    public void setOff() {
        // no effect
    }
    
    public boolean isOn() {
        return true;
    }
    
    public int read() {
        return this.value;
    }
    
}
