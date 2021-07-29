/*
 * @author Steven Nguyen
 * @email: steven.686295@gmail.com
 * @date: 29 Jul 2021
 */
package com.mthree.dvdlibrary.dao;

import com.mthree.dvdlibrary.dto.Dvd;

/**
 * 
 * @author Steven
 */
public interface Dao {
    /**
     * Adds a DVD to the library
     * @param dvd the DVD object to add
     */
    public void addDvd(Dvd dvd);
    
    /**
     * Removes a DVD from the library
     * @param name the title of the DVD to find and remove
     */
    public void removeDvd(String name);
    
    /**
     * Gets a DVD given the name
     * @param name the title of the DVD to find
     * @return the DVD
     */
    public Dvd getDvd(String name);
    
    /**
     * Loads the library of DVDs
     */
    public void load();
    
    /**
     * Saves the library of DVDs
     */
    public void save();
}
