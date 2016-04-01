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
                + "\n C - Character Report      "              
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
            //not needed should be deleted    
            /*case "C":
                this.characterReport();
                break;*/
            case "Q":
                this.quit();
                break;
            default:
                ErrorView.display("CharacterListView", "*** Invalid selection*** Try again");
                break;
        }
        return false;
    }

    private void detectiveMax() {
        this.console.println("*** detectiveMax function called ***");
    }

    private void police() {
        this.console.println("*** police function called ***");
    }

    private void queen() {
        this.console.println("*** queen function called ***");
    }
    
    private void quit() {
        this.console.println("*** quit function called ***");
    }

    
    //This isn't needed should be deleted
    /*private void characterReport() {
        this.console.println("    LIST OF ACTORS    "
                    + "NAME         LOCATION"
                    + "Police          4, 4 "
                    + "Queen           0, 0 "
                    + "Max Zepher      0, 0 "
                    + "                1, 3 "
                    + "                2, 2 "
                    + "                0, 4 "
                    + "                3, 1 "
                    + "                4, 0 "
                    + "                0, 3 "
                    + "                1, 2 "
                    + "                2, 0 "
                    + "                3, 3 "
                    + "                1, 4 "
                    + "                4, 2 "
                    + "                1, 1 "
                    + "                0, 1 "
                    + "                1, 0 "
                    + "                2, 3 "
                    + "                4, 3 "
                    + "                2, 1 "
                    + "                3, 2 "
                    + "                2, 4 "
                    + "                3, 0 "
                    + "                0, 2 "
                    + "                3, 4 "
                    + "                4, 1 "
                    + "                4, 4 ");

    }*/
}
    

