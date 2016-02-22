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
public class HelpMenuView {
    private String menu;
    
    public HelpMenuView() { 
        this.menu = "\n"
                + "\n---------------------------"
                + "\n | Help Menu              |"
                + "\n---------------------------"
                + "\n I - Instructions          "
                + "\n M - Move Through The Map  "
                + "\n A - Access Lists          "
                + "\n S - Save Game             "
                + "\n Q - Quit                  "
                + "\n---------------------------";
    }

    public void displayHelpMenuView() {
        boolean done = false; 
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return; 
            
            done = this.doAction(menuOption);
            
        }while (!done);
    }
    
    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() function called ***");
        return "N";
    }
    
    private boolean doAction(String choice) {
        System.out.println("\n*** doAction() function called ***");
        
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
        }
        
        return false;
    }

    private void getInstructions() {
        System.out.println("*** getInstructions function called ***");
    }

    private void moveThroughMap() {
        System.out.println("*** moveThroughMap function called ***");
    }

    private void accessLists() {
        System.out.println("*** accessLists function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void quit() {
        System.out.println("*** quit function called ***");
    }
}
