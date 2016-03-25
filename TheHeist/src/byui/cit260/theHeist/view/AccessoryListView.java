/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import byui.cit260.theHeist.model.Game;
import byui.cit260.theHeist.model.InventoryItem;
import java.util.ArrayList;
import theheist.control.ClueControl;
import theheist.control.GameControl;

/**
 *
 * @author wr
 */
public class AccessoryListView extends View {
    
    private String menu;

    
    public AccessoryListView() { 
           super( "\n"
                + "\n---------------------------"
                + "\n | Accessory List         |"
                + "\n---------------------------"               
                + "\n M - Magnifying Glass      "
                + "\n L - Gloves                "              
                + "\n C - Cellphone             "               
                + "\n H - Handcuffs             "
                + "\n F - Flashlight            "
                + "\n Q - Quit                  "
                + "\n---------------------------");
    }
    
    private void viewInventory() {
        
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        this.console.println("\nList of Accessories");
        this.console.println("Description" + "\t" 
                           + "Required" + "\t" + 
                           "In Stock");
     
        for (InventoryItem inventoryItem : inventory) {
            this.console.println(inventoryItem.getDescription() + "\t    " + 
                               inventoryItem.getRequiredAmount() + "\t   " +
                               inventoryItem.getQuantityInStock());
        }
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {            
            case "M":
                this.useMagnifyingGlass();
                break;
            case "L":
                this.useGloves();
                break;
            case "C":
                this.useCellphone();
                break;
            case "H":
                this.useHandcuffs();
                break;
            case "F":
                this.useFlashlight();
                break;
            case "I":
                this.seeInventoryCost();
                break;
            case "Q":
                this.quit();
                break;
            default:
                ErrorView.display("AccessoryListView", "***Invalid selection*** Try again");
                break;
        }
        
        return false;
    }

    private void useMagnifyingGlass() {
        this.console.println("*** useMagnifyingGlass function called ***");
    }
    private void useGloves() {
        this.console.println("*** useGloves function called ***");
    }    
    private void useCellphone() {
        this.console.println("*** useCellphone function called ***");
    }
    private void useHandcuffs() {
        this.console.println("*** useHandcuffs function called ***");
    }
    private void useFlashlight() {
        this.console.println("*** useFlashlight function called ***");
    }
    private void seeInventoryCost() {
        ClueControl clueControl = new ClueControl();
        ArrayList<InventoryItem> costList = clueControl.costOfItems(Game.getInventory());
        this.console.println("The least expensive item " + costList.get(0).getDescription()
                + ",costs: $" + costList.get(0).getCost());
        this.console.println("The most expensive item " + costList.get(1).getDescription()
                + ",costs: $" + costList.get(1).getCost());
    }
    private void quit() {
        this.console.println("*** quit function called ***");
    }
    
}
