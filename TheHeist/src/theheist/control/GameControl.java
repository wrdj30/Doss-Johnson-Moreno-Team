/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist.control;

import byui.cit260.theHeist.model.Game;
import byui.cit260.theHeist.model.InventoryItem;
import byui.cit260.theHeist.model.InventoryType.Item;
import byui.cit260.theHeist.model.Map;
import byui.cit260.theHeist.model.Player;
import theheist.TheHeist;

/**
 *
 * @author wr
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
        
        Game game = new Game();
        TheHeist.setCurrentGame(game);
        game.setPlayer(player);
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
    }

        public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        
        return player;
    }
    
    public static InventoryItem[] createInventoryList() {
        InventoryItem[] inventory = new InventoryItem[7];
        
        InventoryItem magnifyingGlass = new InventoryItem();
        magnifyingGlass.setDescription("Magnifying Glass");
        magnifyingGlass.setQuantityInStock(1);
        magnifyingGlass.setRequiredAmount(1);
        inventory[Item.magnifyingGlass.ordinal()] = magnifyingGlass;
        
        InventoryItem gloves = new InventoryItem();
        gloves.setDescription("Gloves");
        gloves.setQuantityInStock(1);
        gloves.setRequiredAmount(1);
        inventory[Item.gloves.ordinal()] = gloves;
        
        InventoryItem cellPhone = new InventoryItem();
        cellPhone.setDescription("Cellphone");
        cellPhone.setQuantityInStock(1);
        cellPhone.setRequiredAmount(1);
        inventory[Item.cellphone.ordinal()] = cellPhone;
        
        InventoryItem handcuffs = new InventoryItem();
        handcuffs.setDescription("Handcuffs");
        handcuffs.setQuantityInStock(1);
        handcuffs.setRequiredAmount(1);
        inventory[Item.handcuffs.ordinal()] = handcuffs;
        
        InventoryItem flashlight = new InventoryItem();
        flashlight.setDescription("Flashlight");
        flashlight.setQuantityInStock(1);
        flashlight.setRequiredAmount(1);
        inventory[Item.flashlight.ordinal()] = flashlight;
        
        InventoryItem gun = new InventoryItem();
        gun.setDescription("gun");
        gun.setQuantityInStock(1);
        gun.setRequiredAmount(1);
        inventory[Item.gun.ordinal()] = gun;
        
        InventoryItem knife = new InventoryItem();
        knife.setDescription("Knife");
        knife.setQuantityInStock(1);
        knife.setRequiredAmount(1);
        inventory[Item.knife.ordinal()] = knife;
        
        return inventory;
                   
    }    
    
    public static InventoryItem[] getSortedInventoryList() {
        System.out.println("\n*** getSortedInventoryList stub function called" ***);
                return null;
    }
    
}
