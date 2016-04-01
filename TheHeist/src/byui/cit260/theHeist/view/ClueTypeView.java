/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import byui.cit260.theHeist.model.ClueTypeScene;

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

    @Override
    public void display() {

        boolean done = false;
        do {
            String value = this.getInput();
            done = this.doAction(value);
        } while (!done);
    }

    @Override
    public boolean doAction(String answer) {
        //is this the correct answer

        if (clueScene.getAnswer().toUpperCase().equals(answer.toUpperCase())) {
            this.console.println("Congratulations you got the correct answer");
            return true;
        } else {
            this.console.println("Sorry wrong answer try again");
            return false;
        }

        //when correct answer is chosen
        //unlock the next view
        //Display congratulations message
        //display the new location
        //When not correct
        //display wrong answer try again
        //return false
    }
}
