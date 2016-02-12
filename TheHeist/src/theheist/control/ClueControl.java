/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist.control;

/**
 *
 * @author wr
 */
public class ClueControl {
    public double getCombination(double clueA, double clueB, double clueC){
        if (clueA <= 0 || clueA > 25){
            return -1;
        }    
                
        if (clueB <= 0 || clueB > 25){
            return -1;
        }    
                
        if (clueC <= 0 || clueC > 25){
            return -1;
        }    
            
        double combo = (clueA * clueB + clueC) / clueA;
            return combo;    
    }


    public double addressClue(double clueA, double clueB, double clueC) {
        if (clueA <= 0 || clueA > 25) {
            return -1;
        }        

        if (clueB <= 0 || clueB > 25) {
            return -1;
        }

        if (clueC <= 0 || clueC > 25) { 
            return -1;
        }

        double addressNumber = Math.pow(clueA + clueB, 2) * clueC;
            return addressNumber;

    }
    
}
