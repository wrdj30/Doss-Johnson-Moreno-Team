/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import byui.cit260.theHeist.model.Game;
import byui.cit260.theHeist.model.InventoryItem;
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
                this.console.println("\n*** Invalid selection*** Try again");
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
        System.out.println("*** useHandcuffs function called ***");
    }
    private void useFlashlight() {
        System.out.println("*** useFlashlight function called ***");
    }
    private void seeInventoryCost() {
        ClueControl clueControl = new ClueControl();
        clueControl.costOfItems(Game.getInventory());
    }
    private void quit() {
        System.out.println("*** quit function called ***");
    }
    
}
