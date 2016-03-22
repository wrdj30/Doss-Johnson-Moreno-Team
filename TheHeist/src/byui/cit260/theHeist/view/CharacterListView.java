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
public class CharacterListView extends View {
    
    private String menu;

    
    public CharacterListView() { 
           super( "\n"
                + "\n---------------------------"
                + "\n | Character List         |"
                + "\n---------------------------"
                + "\n M - Detective Max         "
                + "\n P - Police                "
                + "\n K - Queen                 "              
                + "\n Q - Quit                  "
                + "\n---------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
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
        System.out.println("*** detectiveMax function called ***");
    }

    private void police() {
        System.out.println("*** police function called ***");
    }

    private void queen() {
        System.out.println("*** queen function called ***");
    }
    
    private void quit() {
        System.out.println("*** quit function called ***");
    }

}
    

