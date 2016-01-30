/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author wr
 */
public class Location implements Serializable{
    private String location;
    private String locationVisited;

    public Location() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocationVisited() {
        return locationVisited;
    }

    public void setLocationVisited(String locationVisited) {
        this.locationVisited = locationVisited;
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
