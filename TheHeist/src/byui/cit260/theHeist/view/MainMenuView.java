/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

/**
 *
 * @author luceromoreno
 */
public class MainMenuView
{
    private final String menu;
    
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
    System.out.println("\n");   
    return "G";
    }

    private boolean doAction(String menuOption) {
    System.out.println("\n");
    return true;
    }
     }
    

