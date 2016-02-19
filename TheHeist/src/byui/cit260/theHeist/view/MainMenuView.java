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
    private String menu;
    
    public MainMenuView() 
    {this.menu = "\n"
                + "\n---------------------------"
                + "\n | Main Menu              |"
                + "\n---------------------------"
                + "\n G - Start game            "
                + "\n H - Help                  "
                + "\n L - Load game             "
                + "\n E - Exit                  "
                + "\n---------------------------";
    }
    void displayMainMenuView() {
        System.out.println("\n displayMenu() function called ***");
    }
     }
    

