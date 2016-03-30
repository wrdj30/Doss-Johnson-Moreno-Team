/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import byui.cit260.theHeist.model.InventoryItem;
import java.io.IOException;
import java.io.PrintWriter;

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
            out.printf("%n%-20s%10s", "Description", "Quantity");
            out.printf("%n%-20s%10s", "-----------", "--------");
            
            for (InventoryItem inventoryItem : item){
                out.printf("%n%-20s%7d", inventoryItem.getDescription()
                                        , inventoryItem.getQuantityInStock());
            }
            
        } catch (IOException ex) {
            ErrorView.display("InventoryItemReport", "I/O Error: " + ex.getMessage());
        }
    }
}
