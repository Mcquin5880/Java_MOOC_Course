/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.*;

/**
 *
 * @author Michael Quinter
 */
public class TemperatureSensor implements Sensor {
    
    private boolean isTurnedOn;
    
    public TemperatureSensor() {
        this.isTurnedOn = false;
    }
    
    public void setOn() {
        this.isTurnedOn = true;
    }
    
    public void setOff() {
        this.isTurnedOn = false;
    }
    
    public boolean isOn() {
        return this.isTurnedOn;
    }
    
    public int read() {
        
        if (isOn()) {
            int randomVal = new Random().nextInt(61) - 30;
            return randomVal;
        } else {
            throw new IllegalStateException();
        }       
    }
    
}
