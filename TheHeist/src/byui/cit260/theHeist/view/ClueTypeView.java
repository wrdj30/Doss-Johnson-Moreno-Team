/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import byui.cit260.theHeist.model.ClueTypeScene;
import byui.cit260.theHeist.model.Location;
import java.awt.Point;
import theheist.TheHeist;

/**
 *
 * @author wr
 */
public class ClueTypeView extends View {

    private ClueTypeScene clueScene;

    public ClueTypeView() {
    }

    public ClueTypeView(ClueTypeScene clueScene) {
        this.clueScene = clueScene;
        this.displayMessage = "Answer the riddle:\n" + clueScene.getQuestion()
                + "\nPlease enter your answer.";
    }

    /*@Override
    public void display() {

        boolean done = false;
        do {
            //get the users answer
            String value = this.getInput();
            done = this.doAction(value);
        } while (!done);
    }*/

    @Override
    public boolean doAction(String answer) {
        //compare users answer with the clues correct answer
        if (answer.toUpperCase().equals(this.clueScene.getAnswer().toUpperCase())) {
            //the answer is correct move to the next scene
            this.console.println("Congratulations you got the correct answer");            
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            Point nextPoint = this.clueScene.getNextLocation();
            Location nextLocation = locations[nextPoint.x][nextPoint.y];
            ClueTypeScene nextClueScene = nextLocation.getScene();
            ClueTypeView nextView = new ClueTypeView(nextClueScene);
            nextView.display();
            return true;
        } 
        else {
            return false;
        }
                                               
    } 
               
}
