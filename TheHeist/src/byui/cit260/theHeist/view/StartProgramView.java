/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import java.util.Scanner;

/**
 *
 * @author luceromoreno
 */
public class StartProgramView {
    private String promptMessage;

    public StartProgramView(){
        this.promptMessage = "\nPlease enter yout name: ";
        
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

    public void displayStartProgramView() {
        
        boolean done = false;
        do {
            String playerName = this.getPlayerName();
            if (playerName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playerName);
           
        } while (!done);
    }

    private String getPlayerName() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;
        }
        return value;
   
    }

    private boolean doAction(String playerName) {
    System.out.println("\n*** doAction() called***");
    return true;
    }
    
}

