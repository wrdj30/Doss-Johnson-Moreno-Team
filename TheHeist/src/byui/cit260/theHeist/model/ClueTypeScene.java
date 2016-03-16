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
public class ClueTypeScene implements Serializable {

    private String description;
    private int travelLength;
    private String clueType;
    private String lockType;
    private String mapSymbol;

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public ClueTypeScene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTravelLength() {
        return travelLength;
    }

    public void setTravelLength(int travelLength) {
        this.travelLength = travelLength;
    }

    public String getClueType() {
        return clueType;
    }

    public void setClueType(String clueType) {
        this.clueType = clueType;
    }

    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + this.travelLength;
        hash = 17 * hash + Objects.hashCode(this.clueType);
        hash = 17 * hash + Objects.hashCode(this.lockType);
        return hash;
    }

    @Override
    public String toString() {
        return "ClueTypeScene{" + "description=" + description + ", travelLength=" + travelLength + ", clueType=" + clueType + ", lockType=" + lockType + '}';
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
        final ClueTypeScene other = (ClueTypeScene) obj;
        if (this.travelLength != other.travelLength) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.clueType, other.clueType)) {
            return false;
        }
        return Objects.equals(this.lockType, other.lockType);
    }

    public void setLockType(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
