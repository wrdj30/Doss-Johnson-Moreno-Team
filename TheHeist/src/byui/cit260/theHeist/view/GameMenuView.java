/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

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
                + "\n A - Accessory List        "
                + "\n T - Transportation        "
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
                this.console.println("\n*** Invalid selection*** Try again");
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
        
            transportationView.display();
    }

    private void weaponList() {
        WeaponListView weaponListView = new WeaponListView();
        
            weaponListView.display();
    }

    private void mapMenu() {
        MapMenuView mapMenuView = new MapMenuView();
            mapMenuView.display();
    }
    private void quit() {
        this.console.println("*** quit function called ***");
    }
        
}


