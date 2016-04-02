/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import byui.cit260.theHeist.model.ClueTypeScene;
import byui.cit260.theHeist.model.Location;
import theheist.TheHeist;

/**
 *
 * @author luceromoreno
 */
public class MapMenuView extends View{
    private String menu;
    private String promptMessage;
    private int rowCount;
    private int columnCount;
    
    public MapMenuView() { 
           super( "\n"
                + "\n---------------------------"
                + "\n | Map Menu              |"
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
                ErrorView.display("MapMenuView", "*** Invalid selection*** Try again");
                break;
        }
    return false;
    }


    private void goArlin() {
        /*CharacterListView characterListView = new CharacterListView();
        
            characterListView.display();*/
        ArlinScene clueTypeScene = new ClueTypeScene();
        
            clueTypeScene.display();
            this.console.println("*** loadGame function called ***");
    }

    private void goBoury() {
            this.console.println("*** loadGame function called ***");
                    
    }

    private void goCelnig() {
            this.console.println("*** loadGame function called ***");
    }

    private void goDuvin() {
            this.console.println("*** loadGame function called ***");
    }

    private void goEstrip() {
            this.console.println("*** loadGame function called ***");
    }

    private void goFargin() {
            this.console.println("*** loadGame function called ***");
    }

    private void goGoverie() {
            this.console.println("*** loadGame function called ***");
    }

    private void goHowerty() {
            this.console.println("*** loadGame function called ***");
    }

    private void goInlin() {
            this.console.println("*** loadGame function called ***");
    }

    private void goJawel() {
            this.console.println("*** loadGame function called ***");
    }

    private void goKinte() {
            this.console.println("*** loadGame function called ***");
    }

    private void goLerly() {
            this.console.println("*** loadGame function called ***");
    }

    private void goMurtan() {
            this.console.println("*** loadGame function called ***");
    }

    private void goNolafe() {
            this.console.println("*** loadGame function called ***");
    }

    private void goOpstera() {
            this.console.println("*** loadGame function called ***");
    }

    private void goParquin() {
            this.console.println("*** loadGame function called ***");
            LocationView locationView = new LocationView();
            locationView.displayLocationView();
    }

    private void goRyster() {
            this.console.println("*** loadGame function called ***");
    }

    private void goSwerlin() {
            this.console.println("*** loadGame function called ***");
    }

    private void goTerwalt() {
            this.console.println("*** loadGame function called ***");
    }

    private void goUrtlin() {
            this.console.println("*** loadGame function called ***");
    }

    private void goVerlu() {
            this.console.println("*** loadGame function called ***");
    }

    private void goWebel() {
            this.console.println("*** loadGame function called ***");
    }

    private void goXina() {
            this.console.println("*** loadGame function called ***");
    }

    private void goYaster() {
            this.console.println("*** loadGame function called ***");
    }

    private void goZinta() {
            this.console.println("*** loadGame function called ***");
    }
    
    private void displayMap() {
        
        Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
        
        int rowCount = TheHeist.getCurrentGame().getMap().getNoOfRows();
        int columnCount = TheHeist.getCurrentGame().getMap().getNoOfColumns();
        
        this.console.println("\nTitle");
             
        for (int row = 0; row < rowCount; row++) {
           this.console.println("-");
           this.console.println(row);
           
           for (int column = 0; column < columnCount; column++) {
               this.console.println("|");
               this.console.println(column);
                             
               
               if (locations [row][column].getVisited())
                this.console.println("mapSymbol");
               
               else 
                this.console.println("??"); 
               
               this.console.println("|");               
            }
           this.console.println("-");
        }
        
    }       
    
}
