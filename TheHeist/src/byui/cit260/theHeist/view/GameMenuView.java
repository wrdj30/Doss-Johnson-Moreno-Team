/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import byui.cit260.theHeist.model.Player;
import java.util.Scanner;

/**
 *
 * @author wr
 */
public class GameMenuView extends View {

    


    

    private String menu;
    
    public GameMenuView() { 
           super( "\n"
                + "\n---------------------------"
                + "\n | Game Menu              |"
                + "\n---------------------------"
                + "\n C - Character List        "
                + "\n A - Accessory             "
                + "\n T - transportation        "
                + "\n W - Weapon List           "
                + "\n M _ Map Menu              "
                + "\n Q - Quit                  "
                + "\n---------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "C":
                this.characterList();
                break;
            case "A":
                this.accessoryList();
                break;
            case "T":
                this.transportation();
                break;
            case "W":
                this.weaponList();
                break;
            case "M":
                this.mapMenu();
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

    private void characterList() {
        CharacterListView characterListView = new CharacterListView();
        
            characterListView.display();
    }

    private void accessoryList() {
        AccessoryListView accessoryListView = new AccessoryListView();
        
            accessoryListView.display();
    }

    private void transportation() {
        TransportationView transportationView = new TransportationView();
        
            transportationView.displayTransportationView();
    }

    private void weaponList() {
        WeaponListView weaponListView = new WeaponListView();
        
            weaponListView.displayWeaponListView();
    }

    private void mapMenu() {
        MapMenuView mapMenuView = new MapMenuView();
            mapMenuView.displayMapMenuView();
    }
    private void quit() {
        System.out.println("*** quit function called ***");
    }

        
}


