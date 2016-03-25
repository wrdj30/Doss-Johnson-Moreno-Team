/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.view;

import java.io.PrintWriter;
import theheist.TheHeist;

/**
 *
 * @author wr
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = TheHeist.getOutFile();
    private static final PrintWriter logFile = TheHeist.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println("----------------------------------------------"
                         +"\n- ERROR - " + errorMessage
                         +"\n--------------------------------------------");
        logFile.println(className + " - " + errorMessage);
    }

    
}
