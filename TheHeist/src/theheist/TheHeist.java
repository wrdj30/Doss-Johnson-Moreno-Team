/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist;

import byui.cit260.theHeist.model.Game;
import byui.cit260.theHeist.model.Player;
import byui.cit260.theHeist.view.StartProgramView;

/**
 *
 * @author luceromoreno, wrdossjohnson
 */
public class TheHeist {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
                
        StartProgramView startProgramView = new StartProgramView();
    try {    
        startProgramView.display();
    }
    catch (Throwable te) {
        System.out.println(te.getMessage());
        te.printStackTrace();
        startProgramView.display();
    }
    
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TheHeist.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TheHeist.player = player;
    }
       
}
    

