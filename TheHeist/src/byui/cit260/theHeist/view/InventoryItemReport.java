/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import byui.cit260.theHeist.model.InventoryItem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import theheist.control.GameControl;

/**
 *
 * @author wr
 */
public abstract class InventoryItemReport extends View{
    
    
    public double printItemReport(InventoryItem[] items) throws IOException {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        
        double totalCount = 0;
        
    try {    
        inputStream = new  BufferedReader(new FileReader("inputItemfile.txt"));
        outputStream = new PrintWriter (new FileWriter("ItemReport.txt"));
        
        this.console.println("Inventory Report");
        this.console.println("Item" + "\t     " + "Item Amount");
        
        for(InventoryItem item : items) {                
            totalCount = item.getQuantityInStock() + totalCount;
        }        
        return totalCount;
        this.console.println(inventoryItem.getDescription() + "\t     " + 
                             inventoryItem.getQuantityInStock());
    }            
    finally {
        if (inputStream != null){
            inputStream.close();           
        }
        if (outputStream != null){
            outputStream.close();
        }    
    }        
}
