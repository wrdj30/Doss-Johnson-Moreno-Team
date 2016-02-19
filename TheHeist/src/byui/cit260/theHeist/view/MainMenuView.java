/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import java.util.Scanner;

/**
 *
 * @author luceromoreno
 */
public class MainMenuView
{
    private final String menu;
    private String promptMessage;
    
    public MainMenuView() 
    {this.menu = "\n"
                + "\n---------------------------"
                + "\n | Main Menu              |"
                + "\n---------------------------"
                + "\n G - Start game            "
                + "\n H - Help                  "
                + "\n L - Load game             "
                + "\n Q - Quit                  "
                + "\n---------------------------";
    }
    void displayMainMenuView() {
        boolean done = false;
        do {
            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage);

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

    public boolean doAction(String choice) {
    
        choice = choice.toUpperCase();
        
        switch (choice) {
        case "G":
        this.startNewGame();
        break;
        case "H":
            this.getHelp();
            break;
        case "L":
            this.loadGame();
            break;
        case "S":
            this.saveGame();
            break;
        default:
            System.out.println("\n*** Invalid selection*** Try again");
            break;
        }
    return false;
    }

    private void startNewGame() {
        System.out.println("*** startNewGame function called ***");
    }

    private void getHelp() {
        System.out.println("*** getHelp function called ***");
    }

    private void loadGame() {
        System.out.println("*** loadGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
     }
    

