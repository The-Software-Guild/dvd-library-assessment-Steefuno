/*
 * @author Steven Nguyen
 * @email: steven.686295@gmail.com
 * @date: 29 Jul 2021
 */
package com.mthree.dvdlibrary.ui;

import com.mthree.dvdlibrary.dto.Dvd;
import com.mthree.dvdlibrary.ui.UI;

/**
 * 
 * @author Steven
 */
public class View {
    final private UI ui;
    
    /**
     * Constructs a new View given a UI
     * @param ui    the object that handles giving and getting data from the user
     */
    public View(UI ui) {
        this.ui = ui;
    }
    
    /**
     * Displays a message to the user
     * @param message   the message to send to the user
     */
    public void say(String message) {
        
    }
    
    /**
     * Requests a string from the user
     * @param message the message to ask the user
     * @return the string inputted by the user
     */
    public String promptString(String message) {
        
    }
    
    /**
     * Requests a double from the user
     * @param message the message to ask the user
     * @return the double inputted by the user
     */
    public double promptDouble(String message) {
        
    }
    
    /**
     * Displays the fields and values of a DVD
     * @param dvd the DVD to show the information of
     */
    public void displayDvdInformation(Dvd dvd) {
        
    }
    
    /**
     * Displays the names of an array of DVDs
     * @param dvdNames an array of DVD names
     */
    public void listDvds(String[] dvdNames) {
        
    }
}
