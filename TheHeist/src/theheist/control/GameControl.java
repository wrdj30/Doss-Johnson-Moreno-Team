/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist.control;

import byui.cit260.theHeist.model.Player;

/**
 *
 * @author wr
 */
public class GameControl {

        public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        MaxZepher.setPlayer(player);
        
        return player;
    }
    
    
}
