/*
 * @author Steven Nguyen
 * @email: steven.686295@gmail.com
 * @date: 29 Jul 2021
 */
package com.mthree.dvdlibrary.controller;

import com.mthree.dvdlibrary.dto.Dvd;
import com.mthree.dvdlibrary.ui.View;
import com.mthree.dvdlibrary.dao.Dao;

/**
 * 
 * @author Steven
 */
public class Controller {
    final private View view;
    final private Dao dao;
    private Dvd dvd;
    /**
     * Constructs a new Controller given a view and dao to use
     * @param view  the object that handles interactions with the user
     * @param dao   the object that handles loading, saving, and accessing DVDs from the library
     */
    public Controller(View view, Dao dao) {
        this.view = view;
        this.dao = dao;
        this.dvd = null;
    }
    
    /**
     * Iteratively requests a command from the user and handles the command onto the Dvd library
     */
    public void run() {
        
    }
    
    /**
     * Gets a DVD from the user and adds it to the library
     */
    private void addDvd() {
        
    }
    
    /**
     * Gets a DVD name from the user and removes it from the library
     */
    private void removeDvd() {
        
    }
    
    /**
     * Gets what field to edit in the select DVD and what value to set, then sets it
     * Updates the DVDs key in the library if the title has changed
     */
    private void editDvd() {
        
    }
    
    /**
     * Displays the titles of all DVDs in the library
     */
    private void listDvds() {
        
    }
    
    /**
     * Displays the fields and values in the select DVD
     */
    private void displayDvd() {
        
    }
    
    /**
     * Selects a DVD
     */
    private void selectDvd() {
        
    }
    
    /**
     * Loads the library information
     */
    private void load() {
        
    }
    
    /**
     * Saves and displays a goodbye message
     */
    private void exit() {
        
    }
}
