/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist.control;

import byui.cit260.theHeist.model.Game;
import byui.cit260.theHeist.model.Map;
import theheist.TheHeist;

/**
 *
 * @author wr
 */
public class MapControl {

    public static Map createMap() {

        Map map = new Map(25, 25);

        Scene[] scenes = createScenes();
        GameControl.assignScenesToLocations(map, scenes);
        return map;
    }

    private static Scene[] createScenes() {
        Game game = TheHeist.getCurrentGame();

        Scene[] scenes = new Scene[SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nYou will begin your adventure here"
                            + "and then you will move on to another "
                            + "location.");
        startingScene.setMapSymbol("A");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Boury");
        startingScene.setMapSymbol("B");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Celnig");
        startingScene.setMapSymbol("C");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Duvin");
        startingScene.setMapSymbol("D");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Estrip");
        startingScene.setMapSymbol("E");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Fargin");
        startingScene.setMapSymbol("F");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Goverie");
        startingScene.setMapSymbol("G");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Howerty");
        startingScene.setMapSymbol("H");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Inlin");
        startingScene.setMapSymbol("I");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Jawel");
        startingScene.setMapSymbol("J");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Kinte");
        startingScene.setMapSymbol("K");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Lerly.");
        startingScene.setMapSymbol("L");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Murtan.");
        startingScene.setMapSymbol("M");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Nolafe.");
        startingScene.setMapSymbol("N");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Opstera.");
        startingScene.setMapSymbol("O");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Parquin.");
        startingScene.setMapSymbol("P");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Ryster.");
        startingScene.setMapSymbol("R");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Swerlin.");
        startingScene.setMapSymbol("S");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Terwalt.");
        startingScene.setMapSymbol("T");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Urtlin.");
        startingScene.setMapSymbol("U");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Verlu.");
        startingScene.setMapSymbol("V");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Webel.");
        startingScene.setMapSymbol("W");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Xina.");
        startingScene.setMapSymbol("X");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                            "\nWelcome to Yaster.");
        startingScene.setMapSymbol("Y");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                    "Welcome to Zinta."
                    + "Thanks for helping us resolve the mystery");
        finishScene.setMapSymbol("Z");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
    }

    
}
