/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist.control;

/**
 *
 * @author luceromoreno
 */
public class addJewelCost {
   
  public static void costOfJewels(String args[]) {
   int costs[] = new int[]{32000, 45000, 67000};

   int mostExp = costs[0];
   int leastExp = costs[0];
   
   for(int i = 1; i <costs.length; i++)
   {
       if(costs[i] > leastExp)
           leastExp = costs[i];
       else if(costs[i] < mostExp)
           mostExp = costs[i];
   }
   System.out.println("The most expensive jewel costs: " + mostExp);
   System.out.println("The least expensive jewel costs: " + leastExp);

  }
}