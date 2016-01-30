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
public class TransportationType implements Serializable {
    
    private String travelType;
    private int lenghtOfTravel;

    public TransportationType() {
    }

    public String getTravelType() {
        return travelType;
    }

    public void setTravelType(String travelType) {
        this.travelType = travelType;
    }

    public int getLenghtOfTravel() {
        return lenghtOfTravel;
    }

    public void setLenghtOfTravel(int lenghtOfTravel) {
        this.lenghtOfTravel = lenghtOfTravel;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.travelType);
        hash = 29 * hash + this.lenghtOfTravel;
        return hash;
    }

    @Override
    public String toString() {
        return "TransportationType{" + "travelType=" + travelType + ", lenghtOfTravel=" + lenghtOfTravel + '}';
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
        final TransportationType other = (TransportationType) obj;
        if (this.lenghtOfTravel != other.lenghtOfTravel) {
            return false;
        }
        if (!Objects.equals(this.travelType, other.travelType)) {
            return false;
        }
        return true;
    }
    
    
    
}
