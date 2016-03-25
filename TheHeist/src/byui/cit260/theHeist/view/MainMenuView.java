/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import byui.cit260.theHeist.exceptions.mapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import theheist.TheHeist;
import theheist.control.GameControl;

/**
 *
 * @author luceromoreno
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n---------------------------"
                + "\n | Main Menu              |"
                + "\n---------------------------"
                + "\n G - Start game            "
                + "\n H - Help                  "
                + "\n L - Load game             "
                + "\n L - Save game             "
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
            case "Q":
                this.quit();
                break;
            default:
                ErrorView.display("MainMenuView", "*** Invalid selection*** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        try {
            GameControl.createNewGame(TheHeist.getPlayer());
        } catch (mapControlException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }

        GameMenuView gameMenuView = new GameMenuView();

        gameMenuView.display();
        this.console.println("*** startNewGame function called ***");
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();

        helpMenuView.display();
    }

    private void loadGame() {
        //call jewelCost from the ClueControl
        //call the function once user enters the letter L
    }

    private void saveGame() {
        GameControl saveGame = new GameControl();
    }

    private void quit() {
        this.console.println("*** quit function called ***");
    }

}
