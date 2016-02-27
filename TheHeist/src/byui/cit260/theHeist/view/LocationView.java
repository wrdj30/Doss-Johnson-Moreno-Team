/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import java.util.Scanner;
import theheist.control.ClueControl;

/**
 *
 * @author wr
 */
public class LocationView {
    
    double addressNumber;
    
    public void displayBanner() {
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
        
        addressNumber = this.doAction(dClueA, dClueB, dClueC);
           
    }
    
    public double doAction(double dClueA, double dClueB, double dClueC) {
        
        double addressNumber = ClueControl.addressClue(dClueA, dClueB, dClueC);
        
        return addressNumber;
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

    
    
}

