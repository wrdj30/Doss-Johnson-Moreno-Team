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
public class GameMenuView {

    private String menu;

    
    public GameMenuView() { 
        this.menu = "\n"
                + "\n---------------------------"
                + "\n | Game Menu              |"
                + "\n---------------------------"
                + "\n C - Character List        "
                + "\n A - Accessory             "
                + "\n T - transportation        "
                + "\n W - Weapon List           "
                + "\n M _ Map Menu              "
                + "\n Q - Quit                  "
                + "\n---------------------------";
    }

    public void displayGameMenuView() {
        boolean done = false; 
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return; 
            
            done = this.doAction(menuOption);
            
        }while (!done);
    }
    
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.menu);

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
    
    private boolean doAction(String choice) {
        
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
        
            characterListView.displayCharacterListView();
    }

    private void accessoryList() {
        AccessoryListView accessoryListView = new AccessoryListView();
        
            accessoryListView.displayAccessoryListView();
    }

    private void transportation() {
        System.out.println("*** transportation function called ***");
    }

    private void weaponList() {
        System.out.println("*** weaponList function called ***");
    }

    private void mapMenu() {
        System.out.println("*** mapMenu function called ***");
    }
    private void quit() {
        System.out.println("*** quit function called ***");
    }

    void displayMenu() {
        
    }
}

