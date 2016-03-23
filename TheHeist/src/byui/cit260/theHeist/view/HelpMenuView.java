/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

/**
 *
 * @author wr
 */
public class HelpMenuView extends View{
    private String menu;
    
    public HelpMenuView() { 
           super( "\n"
                + "\n---------------------------"
                + "\n | Help Menu              |"
                + "\n---------------------------"
                + "\n I - Instructions          "
                + "\n M - Move Through The Map  "
                + "\n A - Access Lists          "
                + "\n S - Save Game             "
                + "\n Q - Quit                  "
                + "\n---------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "I":
                this.getInstructions();
                break;
            case "M":
                this.moveThroughMap();
                break;
            case "A":
                this.accessLists();
                break;
            case "S":
                this.saveGame();
                break;
            case "Q":
                this.quit();
                break;
            default:
                this.console.println("\n*** Invalid selection*** Try again");
                break;
        }
        
        return false;
    }

    private void getInstructions() {
        this.console.println("*** getInstructions function called ***");
    }

    private void moveThroughMap() {
        this.console.println("*** moveThroughMap function called ***");
    }

    private void accessLists() {
        this.console.println("*** accessLists function called ***");
    }

    private void saveGame() {
        this.console.println("*** saveGame function called ***");
    }

    private void quit() {
        this.console.println("*** quit function called ***");
    }
}
