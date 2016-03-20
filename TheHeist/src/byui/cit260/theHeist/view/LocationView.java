/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import static java.lang.Integer.parseInt;
import java.util.Scanner;
import theheist.control.ClueControl;

/**
 *
 * @author luceromoreno
 */
public class LocationView {

    private final String showMessage;
    private final int answer1;
    private final int answer2;
    private final int answer3;
    private boolean correctAnswer1 = false;
    private boolean correctAnswer2 = false;
    private boolean correctAnswer3 = false;

    public LocationView() {
        this.showMessage = "\nYou have entered ";
        answer1 = 7;
        answer2 = 5;
        answer3 = 3;
    }

    public LocationView(int answer1, int answer2, int answer3) {
        this.showMessage = "\nYou have entered ";
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
    }

    public void displayLocationView() {
        displayBanner();
        displayFirstNumView();
        displaySecondNumView();
        displayThirdNumView();
        if (correctAnswer1 == true && correctAnswer2 == true && correctAnswer3 == true) {
            doAction();
        }
    }

    public void displayBanner() {
        System.out.println(
                "On this level you will use the two numbers you"
                + "\n were asked to remember back in the two "
                + "\n other locations. Please insert the two "
                + "\n numbers you already know, then insert "
                + "\n a number from 1-10 for the third number."
                + "\n Enter the first number:"
        );
    }

    public void displayFirstNumView() {
        boolean done = false;
        //do {

        String menuOption = this.getNum(answer1);
        if (menuOption.toUpperCase().equals("Q")) {
            return;
        }
        correctAnswer1 = true;
        //done = this.doAction();
        //} while (!done);
    }

    public void displaySecondNumView() {
        boolean done = false;
        // do {

        String menuOption = this.getNum(answer2);
        if (menuOption.toUpperCase().equals("Q")) {
            return;
        }
        correctAnswer2 = true;
        //done = this.doAction();
        // } while (!done);
    }

    public void displayThirdNumView() {
        boolean done = false;
       // do {

            String menuOption = this.getNum(answer3);
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }
            correctAnswer3 = true;
            //done = this.doAction();
        //} while (!done);
    }

    private String getNum(int answer) {
        Scanner keyboard = new Scanner(System.in);
        String value1 = "";
        boolean valid = false;

        while (!valid) {

            value1 = keyboard.nextLine();
            value1 = value1.trim();

            if (value1.toUpperCase().equals("Q")) {
                return value1;
            }

            System.out.println("\n" + this.showMessage + value1);
            if (parseInt(value1) == answer) {
                System.out.println("\nYou got the number right!");
                valid = true;
            } else {
                System.out.println("Please quess again");
            }
        }
        return value1;
    }

    private boolean doAction() {
        int worth = ((answer1 * 2) + (answer2 * 3) + (answer3 * 2)) - (answer3 * 2);

        System.out.println("Remember this answer: " + worth);

        return true;
    }




/**
 *
 * @author wr
 */

    
    double addressNumber;
    
    public void displayAddressClueBanner() {
        System.out.println(
                "\n************************************************************************************"
                + "\n* Write dialogue for this end user story       *"
                + "\n*                          *"
                + "\n*                       *"
                + "\n*                       *"
                + "\n*                      *"
                + "\n*                                                                             *"
                + "\n***********************************************************************************"
        );
    
    }    

    public void displayAddressClueScene() {
         
        String clueA = this.getInput("Enter the first address clue.");
               
        String clueB = this.getInput("Enter the second address clue.");
                
        String clueC = this.getInput("Enter the third address clue.");
        
        double dClueA = Double.parseDouble(clueA);
        double dClueB = Double.parseDouble(clueB);
        double dClueC = Double.parseDouble(clueC);
        
        try {
            dClueA = Double.parseDouble(clueA);
        }
        catch (NumberFormatException nf) {
            System.out.println("\nInvalid number please enter a new one");
        }
        
        try {
            dClueB = Double.parseDouble(clueB);
        }
        catch (NumberFormatException nf) {
            System.out.println("\nInvalid number please enter a new one");
        }
        
        try {
            dClueC = Double.parseDouble(clueC);
        }
        catch (NumberFormatException nf) {
            System.out.println("\nInvalid number please enter a new one");
        }
        
        addressNumber = this.doAction(dClueA, dClueB, dClueC);
           
    }
    
    private String getInput(String promptMessage) {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + promptMessage);

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;
        }
        return value;
    
    }
    
    public double doAction(double dClueA, double dClueB, double dClueC) {
        
        double addressNumber = ClueControl.addressClue(dClueA, dClueB, dClueC);
        
        return addressNumber;
    }
    
}

