/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist.control;

import byui.cit260.theHeist.exceptions.mapControlException;
import byui.cit260.theHeist.model.Actor;
import byui.cit260.theHeist.model.ClueTypeScene;
import byui.cit260.theHeist.model.Game;
import byui.cit260.theHeist.model.InventoryItem;
import byui.cit260.theHeist.model.InventoryType.Item;
import byui.cit260.theHeist.model.Location;
import byui.cit260.theHeist.model.Map;
import byui.cit260.theHeist.model.Player;
import byui.cit260.theHeist.model.SceneType;
import java.awt.Point;
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

        /*moveActorsToStartingLocation(map);*/
    }
    
    public static void moveActorsToStartingLocation(Map map) throws mapControlException {    
        Actor[] actors = Actor.values();
        
        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            try {
                MapControl.moveActorToLocation(actor, coordinates);
            }
            catch (mapControlException me) {
                System.out.println(me.getMessage());
                throw me;
            }
        }

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

        //InventoryItem(double quantityInStock, double requiredAmount, String description, double cost)
        //InventoryItem magnifyingGlass = new InventoryItem(1, 1, "Magnifying Glass", 100);
        InventoryItem magnifyingGlass = new InventoryItem();
        magnifyingGlass.setDescription("Magnifying Glass");
        magnifyingGlass.setQuantityInStock(1);
        magnifyingGlass.setRequiredAmount(1);
        magnifyingGlass.setCost(10);
        inventory[Item.magnifyingGlass.ordinal()] = magnifyingGlass;

        InventoryItem gloves = new InventoryItem();
        gloves.setDescription("Gloves");
        gloves.setQuantityInStock(1);
        gloves.setRequiredAmount(1);
        gloves.setCost(18);
        inventory[Item.gloves.ordinal()] = gloves;

        InventoryItem cellPhone = new InventoryItem();
        cellPhone.setDescription("Cellphone");
        cellPhone.setQuantityInStock(1);
        cellPhone.setRequiredAmount(1);
        cellPhone.setCost(350);
        inventory[Item.cellphone.ordinal()] = cellPhone;

        InventoryItem handcuffs = new InventoryItem();
        handcuffs.setDescription("Handcuffs");
        handcuffs.setQuantityInStock(1);
        handcuffs.setRequiredAmount(1);
        handcuffs.setCost(60);
        inventory[Item.handcuffs.ordinal()] = handcuffs;

        InventoryItem flashlight = new InventoryItem();
        flashlight.setDescription("Flashlight");
        flashlight.setQuantityInStock(1);
        flashlight.setRequiredAmount(1);
        flashlight.setCost(25);
        inventory[Item.flashlight.ordinal()] = flashlight;

        InventoryItem gun = new InventoryItem();
        gun.setDescription("gun");
        gun.setQuantityInStock(1);
        gun.setRequiredAmount(1);
        gun.setCost(270);
        inventory[Item.gun.ordinal()] = gun;

        InventoryItem knife = new InventoryItem();
        knife.setDescription("Knife");
        knife.setQuantityInStock(1);
        knife.setRequiredAmount(1);
        knife.setCost(160);
        inventory[Item.knife.ordinal()] = knife;

        return inventory;

    }

    public static InventoryItem[] getSortedInventoryList() {

        System.out.println("\n*** getSortedInventoryList stub function called ***");
        return null;
    }

    static void assignScenesToLocations(Map map, ClueTypeScene[] scenes) {
        Location[][] locations = map.getLocations();
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.boury.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.celnig.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.duvin.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.estrip.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.fargin.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.goverie.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.howerty.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.inlin.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.jawel.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.kinte.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.lerly.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.murtan.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.nolafe.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.opstera.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.parquin.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.ryster.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.swerlin.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.terwalt.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.urtlin.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.verlu.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.webel.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.xina.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.yaster.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.finish.ordinal()]);

    }

}
