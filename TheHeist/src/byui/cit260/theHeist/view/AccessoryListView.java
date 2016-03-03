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
public class AccessoryListView extends View {
    
    private String menu;

    
    public AccessoryListView() { 
           super( "\n"
                + "\n---------------------------"
                + "\n | Accessory List         |"
                + "\n---------------------------"
                + "\n G - Glasses               "
                + "\n M - Magnifying Glass      "
                + "\n L - Gloves                "              
                + "\n C - Cellphone             "
                + "\n B - Bag                   "
                + "\n H - Handcuffs             "
                + "\n F - Flashlight            "
                + "\n Q - Quit                  "
                + "\n---------------------------");
    }
       
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G":
                this.useGlasses();
                break;
            case "M":
                this.useMagnifyingGlass();
                break;
            case "L":
                this.useGloves();
                break;
            case "C":
                this.useCellphone();
                break;
            case "B":
                this.useBag();
                break;
            case "H":
                this.useHandcuffs();
                break;
            case "F":
                this.useFlashlight();
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

    private void useGlasses() {
        System.out.println("*** useGlasses function called ***");
    }

    private void useMagnifyingGlass() {
        System.out.println("*** useMagnifyingGlass function called ***");
    }

    private void useGloves() {
        System.out.println("*** useGloves function called ***");
    }
    
    private void useCellphone() {
        System.out.println("*** useCellphone function called ***");
    }
    private void useBag() {
        System.out.println("*** useBag function called ***");
    }
    private void useHandcuffs() {
        System.out.println("*** useHandcuffs function called ***");
    }
    private void useFlashlight() {
        System.out.println("*** useFlashlight function called ***");
    }
    private void quit() {
        System.out.println("*** quit function called ***");
    }
    
}
