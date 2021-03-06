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
 * @author luceromoreno
 */
public class Game implements Serializable{

    
    private double score;
    private double startTime;
    
    private static InventoryItem[] inventory;
    private Player player;
    private TransportationType transportationType;
    private Map map;
    private String[] actors;
    private Location[][] locations;
    private ClueTypeScene[] clueTypeScene;
    private DialogueTypeScene[] dialogueTypeScene;

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        Game.inventory = inventory;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public TransportationType getTransportationType() {
        return transportationType;
    }

    public void setTransportationType(TransportationType transportationType) {
        this.transportationType = transportationType;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] location) {
        this.locations = location;
    }

    public ClueTypeScene[] getClueTypeScene() {
        return clueTypeScene;
    }

    public void setClueTypeScene(ClueTypeScene[] clueTypeScene) {
        this.clueTypeScene = clueTypeScene;
    }

    public DialogueTypeScene[] getDialogueTypeScene() {
        return dialogueTypeScene;
    }

    public void setDialogueTypeScene(DialogueTypeScene[] dialogueTypeScene) {
        this.dialogueTypeScene = dialogueTypeScene;
    }
    
    public Game() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.score);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.startTime) ^ (Double.doubleToLongBits(this.startTime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "score=" + score + ", startTime=" + startTime + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.startTime) != Double.doubleToLongBits(other.startTime)) {
            return false;
        }
        if (!Objects.equals(this.score, other.score)) {
            return false;
        }
        return true;
    }
    
    
    
    
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }




}
