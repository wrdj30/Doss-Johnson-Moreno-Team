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
public class InventoryItem implements Serializable{
    
    /*MagnifyingGlass("Used to closely inspect clues"),
    Gloves("Used to Handle clues"),
    Cellphone("Used to phone the Police or the Queen"),    
    Handcuffs("Used to secure the theif"),
    Flashlight("Used to see in the dark"),
    Gun("Used for protection and catching the theif"),
    Knife("Used for protection and for cutting");*/
    
    private double quantityInStock;
    private double requiredAmount;    
    private String description;
    private double cost;
    

    public InventoryItem(double quantityInStock, double requiredAmount, String description, double cost) {
        this.quantityInStock = quantityInStock;
        this.requiredAmount = requiredAmount;
        this.description = description;
        this.cost = cost;
    }

    public InventoryItem() {
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
   
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setQuantityInStock(double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public String getDescription() {
        return description;
    }
           
}
