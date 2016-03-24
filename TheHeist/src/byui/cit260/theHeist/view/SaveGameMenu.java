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
public class SaveGameMenu extends View {

    private String menu;
    
    public SaveGameMenu() { 
           super( "\n"
                + "\n---------------------------"
                + "\n | Menu                   |"
                + "\n---------------------------"
                + "\n G - Game Menu             "
                + "\n S - Save Game             "
                + "\n M - Map Menu              "
                + "\n Q - Quit                  "
                + "\n---------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "T":
                this.gameMenu();
                break;
            case "W":
                this.saveGame();
                break;
            case "M":
                this.mapMenu();
                break;
            case "Q":
                this.quit();
                break;
            default:
                ErrorView.display("SaveGameView", "*** Invalid selection*** Try again");
                break;
        }
        
        return false;
    }

    private void gameMenu() {
        this.console.println("*** gameMenu function called ***");
    }

    private void saveGame() {
        this.console.println("*** saveGame function called ***");
    }

    private void mapMenu() {
        this.console.println("*** mapMenu function called ***");
    }

    private void quit() {
        this.console.println("*** quit function called ***");
    }
}
