/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Quinter
 */
public class Book {
    
    private String name;
    private int totalPages;
    private int yearPublished;
    
    public Book (String name, int totalPages, int yearPublished) {
        this.name = name;
        this.totalPages = totalPages;
        this.yearPublished = yearPublished;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + ", " + this.totalPages + " pages, " + this.yearPublished;
    }
    
}
