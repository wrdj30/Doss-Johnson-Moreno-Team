/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import theheist.TheHeist;

/**
 *
 * @author wr
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = TheHeist.getInFile();
    protected final PrintWriter console = TheHeist.getOutFile();
    
    public View() {        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {        
            
    boolean done = false;
        do {
            
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                return;
            done = this.doAction(value);
        } while (!done);
    }
    
    @Override
    public String getInput() {

        
        String value = "";
        boolean valid = false;

        while (!valid) {
            this.console.println("\n" + this.displayMessage);

            try {
                value = this.keyboard.readLine();
                value = keyboard.readLine();

            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim();

            if (value.length() < 1) {
                ErrorView.display("View", "Invalid value: value can not be blank");
                continue;
            }
            break;
        }
        return value;    
    }
}

