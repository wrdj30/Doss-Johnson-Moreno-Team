/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import byui.cit260.theHeist.model.InventoryItem;
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
        
        System.out.println("\nList of Accessories");
        System.out.println("Description" + "\t" 
                           + "Required" + "\t" + 
                           "In Stock");
     
        for (InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem.getDescription() + "\t    " + 
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
            case "Q":
                this.quit();
                break;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
        }
        
        return false;
    }

    private void useMagnifyingGlass() {
        System.out.println("*** useMagnifyingGlass function called ***");
    }
    private void useGloves() {
        System.out.println("*** useGloves function called ***");
    }    
    private void useCellphone() {
        System.out.println("*** useCellphone function called ***");
    }
    private void useHandcuffs() {
        System.out.println("*** useHandcuffs function called ***");
    }
    private void useFlashlight() {
        System.out.println("*** useFlashlight function called ***");
    }
    private void quit() {
        System.out.println("*** quit function called ***");
    }
    
}
