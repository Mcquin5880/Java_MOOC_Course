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
public class AverageSensor implements Sensor {
    
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    //private boolean isTurnedOn = false;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }
    
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }
    
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }
    
    public boolean isOn() {
        boolean allSensorsOn = true;
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                allSensorsOn = false;
            }
        }
        return allSensorsOn;
    }
    
    public int read() {
        
        if (!isOn() || this.sensors.size() == 0) {
            throw new IllegalStateException();
        }
        
        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }
        int reading = sum / sensors.size();
        readings.add(reading);
        return reading;
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
    
}
