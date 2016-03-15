/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import byui.cit260.theHeist.model.Location;
import java.util.Scanner;
import theheist.TheHeist;
import theheist.control.GameControl;

/**
 *
 * @author luceromoreno
 */
public class MapMenuView extends View{
    private String menu;
    private String promptMessage;
    
    public MapMenuView() { 
           super( "\n"
                + "\n---------------------------"
                + "\n | Main Menu              |"
                + "\n---------------------------"
                + "\n A - Artlin                "
                + "\n B - Boury                 "
                + "\n C - Celnig                "
                + "\n D - Duvin                 "
                + "\n E - Estrip                "
                + "\n F - Fargin                "
                + "\n G - Goverie               "
                + "\n H - Howerty               "
                + "\n I - Inlin                 "
                + "\n J - Jawel                 "
                + "\n K - Kinte                 "
                + "\n L - Lerly                 "
                + "\n M - Murtan                "
                + "\n N - Nolafe                "
                + "\n O - Opstera               "
                + "\n P - Parquin               "
                + "\n R - Ryster                "
                + "\n S - Swerlin               "
                + "\n T - Terwalt               "
                + "\n U - Urtlin                "
                + "\n V - Verlu                 "
                + "\n W - Webel                 "
                + "\n X - Xina                  "
                + "\n Y - Yaster                "
                + "\n Z - Zinta                 "
                + "\n Q - Quit                  "
                + "\n---------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
    
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "A":
                this.goArtlin();
                break;
            case "B":
                this.goBoury();
                break;
            case "C":
                this.goCelnig();
                break;
            case "D":
                this.goDuvin();
                break;
            case "E":
                this.goEstrip();
                break;
            case "F":
                this.goFargin();
                break;
            case "G":
                this.goGoverie();
                break;
            case "H":
                this.goHowerty();
                break;
            case "I":
                this.goInlin();
                break;
            case "J":
                this.goJawel();
                break;
            case "K":
                this.goKinte();
                break;
            case "L":
                this.goLerly();
                break;
            case "M":
                this.goMurtan();
                break;
            case "N":
                this.goNolafe();
                break;
            case "O":
                this.goOpstera();
                break;
            case "P":
                this.goParquin();
                break;
            case "R":
                this.goRyster();
                break;
            case "S":
                this.goSwerlin();
                break;
            case "T":
                this.goTerwalt();
                break;
            case "U":
                this.goUrtlin();
                break;
            case "V":
                this.goVerlu();
                break;
            case "W":
                this.goWebel();
                break;
            case "X":
                this.goXina();
                break;
            case "Y":
                this.goYaster();
                break;
            case "Z":
                this.goZinta();
                break;
            default:
                System.out.println("\n*** Invalid selection*** Try again");
                break;
        }
    return false;
    }


    private void goArtlin() {
            System.out.println("*** loadGame function called ***");
    }

    private void goBoury() {
            System.out.println("*** loadGame function called ***");
                    
    }

    private void goCelnig() {
            System.out.println("*** loadGame function called ***");
    }

    private void goDuvin() {
            System.out.println("*** loadGame function called ***");
    }

    private void goEstrip() {
            System.out.println("*** loadGame function called ***");
    }

    private void goFargin() {
            System.out.println("*** loadGame function called ***");
    }

    private void goGoverie() {
            System.out.println("*** loadGame function called ***");
    }

    private void goHowerty() {
            System.out.println("*** loadGame function called ***");
    }

    private void goInlin() {
            System.out.println("*** loadGame function called ***");
    }

    private void goJawel() {
            System.out.println("*** loadGame function called ***");
    }

    private void goKinte() {
            System.out.println("*** loadGame function called ***");
    }

    private void goLerly() {
            System.out.println("*** loadGame function called ***");
    }

    private void goMurtan() {
            System.out.println("*** loadGame function called ***");
    }

    private void goNolafe() {
            System.out.println("*** loadGame function called ***");
    }

    private void goOpstera() {
            System.out.println("*** loadGame function called ***");
    }

    private void goParquin() {
            System.out.println("*** loadGame function called ***");
            LocationView locationView = new LocationView();
            locationView.displayLocationView();
    }

    private void goRyster() {
            System.out.println("*** loadGame function called ***");
    }

    private void goSwerlin() {
            System.out.println("*** loadGame function called ***");
    }

    private void goTerwalt() {
            System.out.println("*** loadGame function called ***");
    }

    private void goUrtlin() {
            System.out.println("*** loadGame function called ***");
    }

    private void goVerlu() {
            System.out.println("*** loadGame function called ***");
    }

    private void goWebel() {
            System.out.println("*** loadGame function called ***");
    }

    private void goXina() {
            System.out.println("*** loadGame function called ***");
    }

    private void goYaster() {
            System.out.println("*** loadGame function called ***");
    }

    private void goZinta() {
            System.out.println("*** loadGame function called ***");
    }
    
    private void displayMap() {
        
        Location[] location = GameControl.getLocation();
        
        System.out.println("\nList of Accessories");
        System.out.println("Description" + "\t" 
                           + "Required" + "\t" + 
                           "In Stock");
     
        for (InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem.getDescription() + "\t    " + 
                               inventoryItem.getRequiredAmount() + "\t   " +
                               inventoryItem.getQuantityInStock());
        }
    
}
