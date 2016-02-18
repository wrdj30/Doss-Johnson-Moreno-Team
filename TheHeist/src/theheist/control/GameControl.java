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

    public static Player createPlaye(String playerName) {
        System.out.println("\n createPlayer() function called ***");
        return new Player();
    }
    
}
