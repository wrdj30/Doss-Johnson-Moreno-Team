/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist.control;

import byui.cit260.theHeist.model.Game;
import byui.cit260.theHeist.model.Player;

/**
 *
 * @author luceromoreno
 */
class MaxZepher {

    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        MaxZepher.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MaxZepher.player = player;
    }
    private static Player player = null;
    
    public static void main(String[] args){
    }
    
}
