/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHeist.model;

import java.io.Serializable;

/**
 *
 * @author wr
 */
public enum TransportationType implements Serializable {

    Plane("You need to use the plane if you are traveling over 200 miles"),
    Car("Use if traveling over 8 miles"),
    Walk("You can walk the rest of the time");

    private final String description;

    TransportationType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
