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
public class WeaponListView extends View{
    
     private String menu;

    
    public WeaponListView() { 
           super( "\n"
                + "\n---------------------------"
                + "\n | Weapon List         |"
                + "\n---------------------------"
                + "\n G - Gun                   "
                + "\n K - Knife                 "              
                + "\n Q - Quit                  "
                + "\n---------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G":
                this.useGun();
                break;
            case "M":
                this.useKnife();
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

    private void useGun() {
        System.out.println("*** useGun function called ***");
    }

    private void useKnife() {
        System.out.println("*** useKnife function called ***");
    }
        
    private void quit() {
        System.out.println("*** quit function called ***");
    }

    
}
