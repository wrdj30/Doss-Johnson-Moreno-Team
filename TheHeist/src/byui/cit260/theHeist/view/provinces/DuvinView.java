/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view.provinces;

import byui.cit260.theHeist.view.HelpMenuView;
import byui.cit260.theHeist.view.View;

/**
 *
 * @author wr
 */
public class DuvinView extends View{
    
    private String menu;
    
    public DuvinView() { 
           super( "\n"
                + "\n---------------------------"
                + "\n |   Welcome to Duvin     |"
                + "\n---------------------------"
                + "\n C - Go To Crime scene     "
                + "\n H - Help Menu             "              
                + "\n Q - Quit                  "
                + "\n---------------------------");
           
    }
    
    
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "C":
                this.goToCrimeScene();
                break;
            case "H":
                this.getHelp();
                break;            
            case "Q":
                this.quit();
                break;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
        }
        
        return false;
    }

    private void goToCrimeScene() {
        System.out.println("*** goToCrimeScene function called ***");
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        
            helpMenuView.display();
    }
        
    private void quit() {
        System.out.println("*** quit function called ***");
    }
    
}
