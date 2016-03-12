/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.model;

import java.io.Serializable;
/**
 *
 * @author luceromoreno
 */
public enum InventoryType implements Serializable{
    
    MagnifyingGlass("Used to closely inspect clues"),
    Gloves("Used to Handle clues"),
    Cellphone("Used to phone the Police or the Queen"),
    Handcuffs("Used to secure the theif"),
    Flashlight("Used to see in the dark"),
    Gun("Used for protection and catching the theif"),
    Knife("Used for protection and for cutting");
    
    private double quantityInStock;
    private double requiredAmount;

    InventoryType(String description) {
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }
       
}
