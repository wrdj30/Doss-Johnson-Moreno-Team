/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author wr
 */
public class Location implements Serializable{
    private int row;
    private int column;
    private boolean visited;
    private ClueTypeScene scene;
    private ArrayList<Actor> actors;
    String location;
    String locationVisited;
    

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public ClueTypeScene getScene() {
        return scene;
    }

    public void setScene(ClueTypeScene scene) {
        this.scene = scene;
    }

    /*public <any> getActors() {
        return actors;
    }

    public void setActors(<any> actors) {
        this.actors = actors;
    }*/

    public Location() {
    }



    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.location);
        hash = 37 * hash + Objects.hashCode(this.locationVisited);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "location=" + location + ", locationVisited=" + locationVisited + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return Objects.equals(this.locationVisited, other.locationVisited);
    }

    
    
    
    
}
