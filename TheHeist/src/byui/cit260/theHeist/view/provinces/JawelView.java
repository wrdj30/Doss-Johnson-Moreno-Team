/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view.provinces;

import byui.cit260.theHeist.model.ClueTypeScene;
import byui.cit260.theHeist.model.Location;
import byui.cit260.theHeist.view.ClueTypeView;
import byui.cit260.theHeist.view.ErrorView;
import byui.cit260.theHeist.view.HelpMenuView;
import byui.cit260.theHeist.view.View;
import theheist.TheHeist;

/**
 *
 * @author wr
 */
public class JawelView extends View{
    
    private String menu;
    
    public JawelView() { 
           super( "\n"
                + "\n---------------------------"
                + "\n |   Welcome to Jawel     |"
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
                ErrorView.display("JawelView", "*** Invalid selection*** Try again");
                break;
        }
        
        return false;
    }

    private void goToCrimeScene() {
        Location[][] locations = TheHeist.getCurrentGame().getLocations();
        ClueTypeScene clueTypeScene = locations[3][3].getScene();
        ClueTypeView clueTypeView = new ClueTypeView(clueTypeScene);
        clueTypeView.display();  
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        
            helpMenuView.display();
    }
        
    private void quit() {
        this.console.println("*** quit function called ***");
    }
    
}
