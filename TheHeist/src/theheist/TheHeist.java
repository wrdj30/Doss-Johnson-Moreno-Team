/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist;

import byui.cit260.theHeist.model.Game;
import byui.cit260.theHeist.model.Player;
import byui.cit260.theHeist.view.ErrorView;
import byui.cit260.theHeist.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author luceromoreno, wrdossjohnson
 */
public class TheHeist {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {   
    
    try { 
        TheHeist.inFile = new BufferedReader (new InputStreamReader(System.in));
        TheHeist.outFile = new PrintWriter(System.out, true);
        
        String filePath = "log.txt";
        TheHeist.logFile = new PrintWriter(filePath);
        
        StartProgramView startProgramView = new StartProgramView();        
        startProgramView.display();
    }
    catch (Throwable te) {
        System.out.println(te.getMessage());
        te.printStackTrace();
        /*TheHeist.startProgramView.display();*/
    }
    
   
            /*TheHeist.startProgramView.display();*/
        finally {
            try {
                if (TheHeist.inFile != null) 
                    TheHeist.inFile.close();
                
                if (TheHeist.outFile != null) 
                    TheHeist.outFile.close();
                
                if (TheHeist.logFile !=null)
                    TheHeist.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }

        }

    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        TheHeist.logFile = logFile;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TheHeist.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TheHeist.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TheHeist.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TheHeist.inFile = inFile;
    }

}
