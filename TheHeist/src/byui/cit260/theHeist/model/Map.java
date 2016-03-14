/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.model;

import java.io.Serializable;

/**
 *
 * @author luceromoreno
 */
public class Map implements Serializable {
    
    private double rowCount;
    private double columnCount;
    private Location[][] locations;
    
    // define variable that is a two dimensional array of Location objects
    public Map() {
    } 
    
    public Map(int noOfRows, int noOfColumn){
        if (noOfRows < 1 || noOfColums < 1){
            Syste,.out.println("The number of rows and columns must be > zero");
            return;
        }
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        this.locations = new Locaation[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++){
            for (int column = 0; column < noOfColumns; column++){
                
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                locations[row][column] = location;
            }
        }
    }
    
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    
    
    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        return true;
    }
    
    
}
