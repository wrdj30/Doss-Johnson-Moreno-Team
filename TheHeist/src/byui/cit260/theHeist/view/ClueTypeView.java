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
        
        //unlock the next view           
            //Display congratulations message                        
            //display the new location            
            //When not correct        
            //display wrong answer try again            
            //return false
        
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
                                               
        } 
        catch (ClueControlException ex) {
            Logger.getLogger(ClueTypeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
        Location nextLocation = ClueControl.matchRiddle(this.clueScene, answer);
            
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
        } 
        catch (ClueControlException ex) {
            Logger.getLogger(ClueTypeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
        Location nextLocation = ClueControl.pawnsRiddle(this.clueScene, answer);
            
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
        }
        catch (ClueControlException ex) {
            Logger.getLogger(ClueTypeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
        Location nextLocation = ClueControl.mushroomRiddle(this.clueScene, answer);
            
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
        } catch (ClueControlException ex) {
            Logger.getLogger(ClueTypeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
        Location nextLocation = ClueControl.nameRiddle(this.clueScene, answer);
            
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
        } catch (ClueControlException ex) {
            Logger.getLogger(ClueTypeView.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
        Location nextLocation = ClueControl.brainRiddle(this.clueScene, answer);
            
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
        } catch (ClueControlException ex) {
            Logger.getLogger(ClueTypeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
        Location nextLocation = ClueControl.brainRiddle(this.clueScene, answer);
            
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
        } catch (ClueControlException ex) {
            Logger.getLogger(ClueTypeView.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        try {
        Location nextLocation = ClueControl.russiansRiddle(this.clueScene, answer);
            
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
        } catch (ClueControlException ex) {
            Logger.getLogger(ClueTypeView.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        try {
        Location nextLocation = ClueControl.eggRiddle(this.clueScene, answer);
            
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
        } catch (ClueControlException ex) {
            Logger.getLogger(ClueTypeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
        Location nextLocation = ClueControl.glovesRiddle(this.clueScene, answer);
            
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
        } catch (ClueControlException ex) {
            Logger.getLogger(ClueTypeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
        Location nextLocation = ClueControl.terrapinsRiddle(this.clueScene, answer);
            
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
        } catch (ClueControlException ex) {
            Logger.getLogger(ClueTypeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
        Location nextLocation = ClueControl.twoRiddle(this.clueScene, answer);
            
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
        } catch (ClueControlException ex) {
            Logger.getLogger(ClueTypeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
