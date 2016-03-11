/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.model;

import java.awt.Point;
import java.io.Serializable;



/**
 *
 * @author luceromoreno
 */
public enum Actor implements Serializable{
    
    MaxZepher("The detective trying to catch the thief", new Point(1,1)),
    Queen("The Queen of Ingland", new Point(1,1)),
    Police("The police of Ingland", new Point(1,1));
    
    
    private final String description;
    private final Point coordinates;

    
    
    Actor(String description, Point coordinates) {
        this.description = description;
        this.coordinates =  coordinates;
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }   
    
}
