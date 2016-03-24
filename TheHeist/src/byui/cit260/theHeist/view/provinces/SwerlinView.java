/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view.provinces;

import byui.cit260.theHeist.view.ErrorView;
import byui.cit260.theHeist.view.HelpMenuView;
import byui.cit260.theHeist.view.View;

/**
 *
 * @author wr
 */
public class SwerlinView extends View{
    
    private String menu;
    
    public SwerlinView() { 
           super( "\n"
                + "\n---------------------------"
                + "\n |   Welcome to Swerlin   |"
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
                ErrorView.display("SwerlinView", "*** Invalid selection*** Try again");
                break;
        }
        
        return false;
    }

    private void goToCrimeScene() {
        this.console.println("*** goToCrimeScene function called ***");
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        
            helpMenuView.display();
    }
        
    private void quit() {
        this.console.println("*** quit function called ***");
    }
    
}
