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
public class Pipe <T> {
    
    ArrayList<T> pipe;
    
    public Pipe() {
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.pipe.add(0, value);
    }
    
    public T takeFromPipe() {
        if (isInPipe()) {
            return pipe.remove(pipe.size() - 1);
        } else {
            return null;
        }
    }
    
    public boolean isInPipe() {
        return this.pipe.size() > 0;
    }
    
}
