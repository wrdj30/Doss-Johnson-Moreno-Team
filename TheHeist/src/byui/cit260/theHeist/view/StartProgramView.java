/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

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

    public void displayStartProgramVIew() {
    System.out.println("\n displayProgramView function called ***");
    }
    
}

