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
public class DialogueTypeScene implements Serializable{
    
    private String description;
    private int travelLenght;
    private String locationSymbol;
    private String lockedScene;

    public DialogueTypeScene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTravelLenght() {
        return travelLenght;
    }

    public void setTravelLenght(int travelLenght) {
        this.travelLenght = travelLenght;
    }

    public String getLocationSymbol() {
        return locationSymbol;
    }

    public void setLocationSymbol(String locationSymbol) {
        this.locationSymbol = locationSymbol;
    }

    public String getLockedScene() {
        return lockedScene;
    }

    public void setLockedScene(String lockedScene) {
        this.lockedScene = lockedScene;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + this.travelLenght;
        hash = 29 * hash + Objects.hashCode(this.locationSymbol);
        hash = 29 * hash + Objects.hashCode(this.lockedScene);
        return hash;
    }

    @Override
    public String toString() {
        return "DialogueTypeScene{" + "description=" + description + ", travelLenght=" + travelLenght + ", locationSymbol=" + locationSymbol + ", lockedScene=" + lockedScene + '}';
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
        final DialogueTypeScene other = (DialogueTypeScene) obj;
        if (this.travelLenght != other.travelLenght) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.locationSymbol, other.locationSymbol)) {
            return false;
        }
        if (!Objects.equals(this.lockedScene, other.lockedScene)) {
            return false;
        }
        return true;
    }
    
    
}
