/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import byui.cit260.theHeist.model.InventoryItem;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import theheist.control.GameControl;

/**
 *
 * @author wr
 */
public abstract class InventoryItemReport extends View{
    
    
    
    public void printItemReport(InventoryItem[] item, String outputLocation) {
        
        //Create BufferedReader object for input file
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            
            //Print title and column headings
            out.println("\n\n           Item Report           ");
            out.println("%n%-20s%10s", "Description", "Quantity");
            out.println("%n%-20s%10s", "-----------", "--------");
            
            for (InventoryItem inventoryItem : item){
                out.println("%n%-20s%7d", inventoryItem.getDescription()
                                        , inventoryItem.getQuantityInStock());
            }
            
        } catch (IOException ex) {
            ErrorView.dispay("I/O Error: " + ex.getMessage());
        }
    }
}
