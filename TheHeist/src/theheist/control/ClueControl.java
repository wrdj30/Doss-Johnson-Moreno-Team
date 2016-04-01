/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist.control;

import byui.cit260.theHeist.exceptions.ClueControlException;
import byui.cit260.theHeist.model.ClueTypeScene;
import byui.cit260.theHeist.model.InventoryItem;
import byui.cit260.theHeist.model.Location;
import java.awt.Point;
import java.util.ArrayList;
import theheist.TheHeist;

/**
 *
 * @author wr
 */
public class ClueControl {

    public static double getJewelAmount(double diamonds, double rubies, double sapphires)
            throws ClueControlException {
        if (diamonds <= 0 || diamonds > 8) {
        }
        if (rubies <= 0 || rubies > 8) {
        }
        if (sapphires <= 0 || sapphires > 8) {
        }

        double worth = (int) ((7 * diamonds + 4 * rubies + 4 * sapphires) - (4 * sapphires));
        return worth;
    }

    public static double getCombination(double clueA, double clueB, double clueC) throws ClueControlException {

        if (clueA <= 0 || clueA > 25) {
            throw new ClueControlException("The first clue is incorrect.");
        }

        if (clueB <= 0 || clueB > 25) {
            throw new ClueControlException("The second clue is incorrect.");
        }

        if (clueC <= 0 || clueC > 25) {
            throw new ClueControlException("The third clue is incorrect.");
        }

        double combo = (clueA * clueB + clueC) / clueA;
        return combo;
    }

    public static double addressClue(double clueA, double clueB, double clueC)
            throws ClueControlException {

        if (clueA <= 0 || clueA > 25) {
        }

        if (clueB <= 0 || clueB > 25) {
        }

        if (clueC <= 0 || clueC > 25) {
        }

        double addressNumber = Math.pow(clueA + clueB, 2) * clueC;
        return addressNumber;

    }

    public double getInventoryCount(InventoryItem[] items) {
        double totalCount = 0;

        for (InventoryItem item : items) {
            totalCount = item.getQuantityInStock() + totalCount;
        }

        return totalCount;
    }

    public ArrayList<InventoryItem> costOfItems(InventoryItem[] items) {

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

        //create new array list 
        ArrayList<InventoryItem> costList = new ArrayList();

        //add the least expensive item to the list
        costList.add(leastExp);
        //add the most expensive item to the list
        costList.add(mostExp);
        // return the list
        return costList;
    }

    public static Location clockRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;

        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }

        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }

        if (answer.equals(clueScene.getAnswer())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;           
        }
        else{
            return null;
        }
    }
    
    public static Location matchRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;           
        }
        else{
            return null;
        }
    }    
        
    public static Location pawnsRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;           
        }
        else{
            return null;
        }
    }
    
    public static Location mushroomRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location nameRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location brainRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location russiansRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location eggRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location glovesRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }

    public static Location terrapinsRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location twoRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location riverRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location libraryRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location deadpansRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location chessmenRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location manRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location steamRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location needleworkRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location vowelsRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location trustRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location nothingRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location towelRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location stampRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }
    
    public static Location secretRiddle(ClueTypeScene clueScene, String answer)
            throws ClueControlException {
        Location newLocation = null;
        
        if (clueScene == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        
        if (answer == null) {
            throw new ClueControlException("Clue scene is invalid");
        }
        if (answer.equals(clueScene.getClass())) {
            Point coordinates = clueScene.getNextLocation();
            Location[][] locations = TheHeist.getCurrentGame().getMap().getLocations();
            newLocation = locations[coordinates.x][coordinates.y];
            newLocation.setLocked(true);
            return newLocation;
        }
        else{
            return null;
        }
    }

}
