/*
 * @author Steven Nguyen
 * @email: steven.686295@gmail.com
 * @date: 29 Jul 2021
 */
package com.mthree.dvdlibrary.dao;

import com.mthree.dvdlibrary.dto.Dvd;
import java.util.HashMap;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;

/**
 * Assumes duplicate titles don't exist
 * @author Steven
 */
public class DaoFileImpl implements Dao {
    final private HashMap<String, Dvd> library;
    private String path;
    
    public DaoFileImpl(String path) {
        this.path = path;
        this.library = new HashMap();
    }
    
    /**
     * Adds a DVD to the library
     * @param dvd the DVD object to add
     */
    @Override
    public void addDvd(Dvd dvd) {
        String title;
        
        title = dvd.getTitle();
        
        library.put(title, dvd);
    }
    
    /**
     * Removes a DVD from the library
     * @param name the title of the DVD to find and remove
     */
    @Override
    public void removeDvd(String name) {
        library.remove(name);
    }
    
    /**
     * Gets a DVD given the name
     * @param name the title of the DVD to find
     * @return the DVD
     */
    @Override
    public Dvd getDvd(String name) {
        return library.get(name);
    }
    
    /**
     * Loads the library of DVDs
     */
    @Override
    public void load() {
        Scanner scanner;
        library.clear();
        
        // Attempt to open the file
        try {
            scanner = new Scanner(
                new BufferedReader(
                    new FileReader(path)
                )
            );
        } catch (Exception ex) {
            System.out.println("Failed to open file");
            System.exit(-1);
            return;
        }
        
        // Iterates line by line in the file to unmarshal and map the DVD
        while (scanner.hasNextLine()) {
            String data;
            Dvd dvd;
            
            data = scanner.nextLine();
            dvd = unmarshal(data);
            
            library.put(dvd.getTitle(), dvd);
        }
    }
    
    /**
     * Saves the library of DVDs
     */
    @Override
    public void save() {
        Collection dvds;
        PrintWriter writer;
        
        // Attempt to open the file
        try {
            writer = new PrintWriter(
                new FileWriter(path)
            );
        } catch (Exception ex) {
            System.out.println("Failed to write to file");
            System.exit(-1);
            return;
        }
        
        // Adds DVDs line by line into the file after marshaling
        dvds = library.values();
        for (Object value: dvds) {
            Dvd dvd;
            String data;
            
            dvd = (Dvd) value;
            data = marshal(dvd);
            
            writer.println(data);
        }
    }
    
    /**
     * Changes the filepath to load and save
     * @param newPath the new path
     */
    public void setPath(String newPath) {
        path = newPath;
    }
    
    /**
     * Gets the filepath for the library
     * @return the file path
     */
    public String getPath() {
        return path;
    }
    
    /**
     * Unpacks a DVD from the library file
     * @param data the String data of the DVD
     * @return the Dvd object of the DVD
     */
    private Dvd unmarshal(String data) {
        String[] values;
        Dvd dvd;
        
        values = data.split("::");
        try {
            dvd = new Dvd(
                values[0],
                values[1],
                Float.parseFloat(values[2]),
                values[3],
                values[4],
                values[5]
            );
        } catch (Exception ex) {
            System.out.println("Failed to unmarchal data: " + data);
            System.exit(-1);
            return null;
        }
        
        return dvd;
    }
    
    /**
     * Packs a Dvd object into a String
     * @param dvd the Dvd object
     * @return the String of the DVD
     */
    private String marshal(Dvd dvd) {
        String data;
        
        data = String.format("%s::%s::%f::%s::%s::%s",
            dvd.getTitle(),
            dvd.getRelease(),
            (float) dvd.getRating(),
            dvd.getDirector(),
            dvd.getStudio(),
            dvd.getNote()
        );
        
        return data;
    }
}
