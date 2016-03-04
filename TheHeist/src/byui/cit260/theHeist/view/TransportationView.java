/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import java.util.Scanner;

/**
 *
 * @author wr
 */
public class TransportationView extends View{
    
    private String menu;

    
    public TransportationView() { 
           super( "\n"
                + "\n---------------------------"
                + "\n | Transportation         |"
                + "\n---------------------------"
                + "\n P - Plane                 "
                + "\n C - Car                   " 
                + "\n W - Walk                 "
                + "\n Q - Quit                  "
                + "\n---------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "P":
                this.flyPlane();
                break;
            case "C":
                this.driveCar();
                break;
            case "W":
                this.walk();
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

    private void flyPlane() {
        System.out.println("*** flyPlane function called ***");
    }

    private void driveCar() {
        System.out.println("*** driveCar function called ***");
    }
    
    private void walk() {
        System.out.println("*** walk function called ***");
    }
        
    private void quit() {
        System.out.println("*** quit function called ***");
    }
    
}
