/*
 * @author Steven Nguyen
 * @email: steven.686295@gmail.com
 * @date: 29 Jul 2021
 */
package com.mthree.dvdlibrary.ui;

/**
 * 
 * @author Steven
 */
public interface UI {
    /**
     * Displays a message to the user
     * @param message the message to send to the user
     */
    public void say(String message);
    
    /**
     * Reads a String from the user
     * @return the String
     */
    public String readString();
    
    /**
     * Reads a double from the user
     * @return the double
     */
    public double readDouble();
}
