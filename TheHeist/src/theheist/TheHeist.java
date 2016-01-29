/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist;

import byui.cit260.theHeist.model.Player;

/**
 *
 * @author luceromoreno, wrdossjohnson
 */
public class TheHeist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Brad Moore");
        playerOne.setHighScore(8.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo); 
    }
    
}
