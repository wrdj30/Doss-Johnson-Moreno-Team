/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import byui.cit260.theHeist.model.Player;
import java.util.Scanner;
import theheist.control.GameControl;

/**
 *
 * @author luceromoreno
 */
public class StartProgramView extends View{

    private String promptMessage;

    public StartProgramView() {
        super("\nPlease enter your name: ");

        this.displayBanner();

    }

    public void displayBanner() {
        System.out.println(
                "\n************************************************************************************"
                + "\n* Welcome to the Heist! It’s your chance to help us solve the great mystery.       *"
                + "\n* Someone has stolen diamonds from the Queen of Ingland and we cannot solve        *"
                + "\n* the mystery without you. Help Max Zepher our number one detective by solving     *"
                + "\n* some puzzles and riddles which help him get closer to the thief. Once you find   *"
                + "\n* the thief’s name you will have accomplished the goal. Thank you for your help,   *"
                + "\n* mate!                                                                            *"
                + "\n***********************************************************************************"
        );

    }

    
    
    @Override 
    public boolean doAction(String playerName) {

        if (playerName.length() < 2) {
            System.out.println("Invalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        Player player = GameControl.createPlayer(playerName);
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        this.displayNextView(player);
        return true;

    }
 
    

    private void displayNextView(Player player) {
        System.out.println("\n================================="
                           + "\n Welcome to the game " + player.getName()
                           + "\n Good luck detective!"         
                           + "\n ==============================");
            MainMenuView mainMenuView = new MainMenuView();
    
            mainMenuView.display();
    }

}
