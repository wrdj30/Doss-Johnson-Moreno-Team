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
public class CharacterListView {
    
    private String menu;

    
    public CharacterListView() { 
        this.menu = "\n"
                + "\n---------------------------"
                + "\n | Character List         |"
                + "\n---------------------------"
                + "\n M - Detective Max         "
                + "\n P - Police                "
                + "\n K - Queen                 "              
                + "\n Q - Quit                  "
                + "\n---------------------------";
    }

    public void displayCharacterListView() {
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
            case "M":
                this.detectiveMax();
                break;
            case "P":
                this.police();
                break;
            case "K":
                this.queen();
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

    private void detectiveMax() {
        System.out.println("*** characterList function called ***");
    }

    private void police() {
        System.out.println("*** accessoryList function called ***");
    }

    private void queen() {
        System.out.println("*** transportation function called ***");
    }
    
    private void quit() {
        System.out.println("*** quit function called ***");
    }

}
    

