/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist.control;

import byui.cit260.theHeist.model.Game;
import byui.cit260.theHeist.model.InventoryType;
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
        
        InventoryType inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsTostartingLocation(map);
    }

        public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        
        return player;
    }
    
    
}
