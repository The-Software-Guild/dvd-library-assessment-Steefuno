/*
 * @author Steven Nguyen
 * @email: steven.686295@gmail.com
 * @date: 29 Jul 2021
 */
package com.mthree.dvdlibrary.dvdlibrary;

import com.mthree.dvdlibrary.controller.Controller;
import com.mthree.dvdlibrary.ui.View;
import com.mthree.dvdlibrary.ui.UI;
import com.mthree.dvdlibrary.ui.UIConsoleImpl;
import com.mthree.dvdlibrary.dao.Dao;
import com.mthree.dvdlibrary.dao.DaoFileImpl;

/**
 * 
 * @author Steven
 */
public class App {
    final static String PATH = "./Library";
    
    public static void main(String[] args) {
        Controller controller;
        View view;
        UI ui;
        Dao dao;
        
        dao = (Dao) new DaoFileImpl(PATH);
        ui = (UI) new UIConsoleImpl();
        view = (View) new View(ui);
        controller = new Controller(view, dao);
        
        controller.run();
    }
}
