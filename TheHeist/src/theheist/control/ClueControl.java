/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist.control;

import byui.cit260.theHeist.exceptions.mapControlExceptions;
import byui.cit260.theHeist.model.InventoryItem;

/**
 *
 * @author wr
 */
public class ClueControl {

    public static double getJewelAmount(double diamonds, double rubies, double sapphires) {
        throws mapControlException {
        if (diamonds <= 0 || diamonds > 8) {
        }
        if (rubies <= 0 || rubies > 8) {
        }
        if (sapphires <= 0 || sapphires > 8) {
        }

        double worth = (int) ((7 * diamonds + 4 * rubies + 4 * sapphires) - (4 * sapphires));
    }
    }
    public double getCombination(double clueA, double clueB, double clueC) {
        if (clueA <= 0 || clueA > 25) {
            return -1;
        }

        if (clueB <= 0 || clueB > 25) {
            return -1;
        }

        if (clueC <= 0 || clueC > 25) {
            return -1;
        }

        double combo = (clueA * clueB + clueC) / clueA;
        return combo;
    }

    public static double addressClue(double clueA, double clueB, double clueC) {
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
    public double getInventoryCount(InventoryItem[] items) {
        double totalCount = 0;
        
        for(InventoryItem item : items) {                
            totalCount = item.getQuantityInStock() + totalCount;
        }
        
        return totalCount;
    }

    public void costOfItems(InventoryItem[] items) {

//   int costs[] = new int[]{32000, 45000, 67000};
//
//   int mostExp = costs[0];
//   int leastExp = costs[0];
//   
//   for(int i = 1; i <costs.length; i++)
//   {
//       if(costs[i] > leastExp)
//           leastExp = costs[i];
//       else if(costs[i] < mostExp)
//           mostExp = costs[i];
//   }
        InventoryItem mostExp = items[0];
        InventoryItem leastExp = items[0];

        for (int i = 1; i < items.length; i++) {
            if (items[i].getCost() > mostExp.getCost()) {
                mostExp = items[i];
            } else if (items[i].getCost() < leastExp.getCost()) {
                leastExp = items[i];
            }
        }

        System.out.println("The most expensive item " + mostExp.getDescription() + ", costs: $" + mostExp.getCost());
        System.out.println("The least expensive item " + mostExp.getDescription() + ",costs: $" + leastExp.getCost());

    }

    /*public void display() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
