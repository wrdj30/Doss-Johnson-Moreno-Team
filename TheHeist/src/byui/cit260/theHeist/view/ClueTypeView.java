/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import byui.cit260.theHeist.exceptions.ClueControlException;
import byui.cit260.theHeist.model.ClueTypeScene;
import byui.cit260.theHeist.model.Location;
import java.util.logging.Level;
import java.util.logging.Logger;
import theheist.control.ClueControl;

/**
 *
 * @author wr
 */
public class ClueTypeView extends View{
    
    private ClueTypeScene clueScene;

    public ClueTypeView() {
    }

    public ClueTypeView(ClueTypeScene clueScene) {
        this.clueScene = clueScene;
        this.displayMessage = clueScene.getQuestion();
    }
    
    
    

    @Override
    public boolean doAction(String answer) {
        try {
            //is this the correct answer
            Location nextLocation = ClueControl.clockRiddle(this.clueScene, answer);
            
            //when correct answer is chosen
            if (nextLocation != null) {
                this.console.println("Congratulations you got the correct answer");
                ClueTypeScene nextClueScene = nextLocation.getScene();
                ClueTypeView nextView = new ClueTypeView(nextClueScene);
                nextView.display();
                return true;
            }
            else {
                this.console.println("Sorry wrong answer try again");
                return false;
            }
            
            //unlock the next view
            
            //Display congratulations message
            
            
            //display the new location
            
            //When not correct
        
            //display wrong answer try again
            
            //return false
            
            
        } catch (ClueControlException ex) {
            Logger.getLogger(ClueTypeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            ClueControl.
        }
    }
    
}
