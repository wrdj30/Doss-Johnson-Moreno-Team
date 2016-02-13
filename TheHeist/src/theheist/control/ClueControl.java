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
    
    public double getJewelAmount(double diamonds, double rubies, double sapphires){
      if (diamonds <=0  || diamonds > 8){
	return -1;
                }
      if (rubies  <=0 || rubies > 8){
	return -1;
        }
      if (sapphires <= 0 || sapphires > 8){
	return -1;
      }
      
 
      double worth = (int) ((7 * diamonds + 4 * rubies + 4 * sapphires) - (4 * sapphires));
      return worth;
    }


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
}
