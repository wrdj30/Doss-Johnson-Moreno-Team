/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import byui.cit260.theHeist.model.Player;
import java.util.Scanner;
import theheist.TheHeist;
import theheist.control.GameControl;

/**
 *
 * @author luceromoreno
 */
public class MainMenuView extends View{
    
    public MainMenuView() { 
            super("\n"
                + "\n---------------------------"
                + "\n | Main Menu              |"
                + "\n---------------------------"
                + "\n G - Start game            "
                + "\n H - Help                  "
                + "\n L - Load game             "
                + "\n Q - Quit                  "
                + "\n---------------------------");
    }
 
    @Override
    public boolean doAction(String choice) {
    
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G":
                this.startNewGame();
                break;
            case "H":
                this.getHelp();
                break;
            case "L":
                this.loadGame();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
        }
    return false;
    }

        private void startNewGame() {
            GameControl.createNewGame(TheHeist.getPlayer());

            GameMenuView gameMenuView = new GameMenuView();
            
            gameMenuView.display();
            System.out.println("*** startNewGame function called ***");
        }

        private void getHelp() {
            HelpMenuView helpMenuView = new HelpMenuView();
        
            helpMenuView.display();
        }

        private void loadGame() {
            System.out.println("*** loadGame function called ***");
        }

        private void saveGame() {
            System.out.println("*** saveGame function called ***");
        }
}
    

