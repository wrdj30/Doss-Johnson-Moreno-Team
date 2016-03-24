/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist.control;

import byui.cit260.theHeist.exceptions.mapControlException;
import byui.cit260.theHeist.model.Actor;
import byui.cit260.theHeist.model.ClueTypeScene;
import byui.cit260.theHeist.model.SceneType;
import byui.cit260.theHeist.model.Game;
import byui.cit260.theHeist.model.Map;
import java.awt.Point;
import theheist.TheHeist;

/**
 *
 * @author wr
 */
public class MapControl {

    static ClueTypeScene[] scenes;

    public static Map createMap() throws mapControlException {

        Map map = new Map(5, 5);

        ClueTypeScene[] scenes = createScenes();
        GameControl.assignScenesToLocations(map, scenes);
        return map;
    }

    private static ClueTypeScene[] createScenes() {
        Game game = TheHeist.getCurrentGame();

        ClueTypeScene[] scenes = new ClueTypeScene[SceneType.values().length];

        ClueTypeScene arlinScene = new ClueTypeScene();
        arlinScene.setDescription(
                "\nYou will begin your adventure here"
                + "and then you will move on to another "
                + "location.");
        arlinScene.setMapSymbol("A");
        arlinScene.setTravelLength(3);
        arlinScene.setLockType("not locked");
        arlinScene.setClueType("puzzle");
        scenes[SceneType.start.ordinal()] = arlinScene;

        ClueTypeScene bouryScene = new ClueTypeScene();
        bouryScene.setDescription(
                "\nWelcome to Boury");
        bouryScene.setMapSymbol("B");
        bouryScene.setTravelLength(3);
        bouryScene.setLockType("locked");
        bouryScene.setClueType("puzzle");
        scenes[SceneType.boury.ordinal()] = bouryScene;

        ClueTypeScene celnigScene = new ClueTypeScene();
        celnigScene.setDescription(
                "\nWelcome to Celnig");
        celnigScene.setMapSymbol("C");
        celnigScene.setTravelLength(3);
        celnigScene.setLockType("locked");
        celnigScene.setClueType("puzzle");
        scenes[SceneType.celnig.ordinal()] = celnigScene;

        ClueTypeScene duvinScene = new ClueTypeScene();
        duvinScene.setDescription(
                "\nWelcome to Duvin");
        duvinScene.setMapSymbol("D");
        duvinScene.setTravelLength(3);
        duvinScene.setLockType("locked");
        duvinScene.setClueType("puzzle");
        scenes[SceneType.duvin.ordinal()] = duvinScene;

        ClueTypeScene estripScene = new ClueTypeScene();
        estripScene.setDescription(
                "\nWelcome to Estrip");
        estripScene.setMapSymbol("E");
        estripScene.setTravelLength(3);
        estripScene.setLockType("locked");
        estripScene.setClueType("puzzle");
        scenes[SceneType.estrip.ordinal()] = estripScene;

        ClueTypeScene farginScene = new ClueTypeScene();
        farginScene.setDescription(
                "\nWelcome to Fargin");
        farginScene.setMapSymbol("F");
        farginScene.setTravelLength(3);
        farginScene.setLockType("locked");
        farginScene.setClueType("puzzle");
        scenes[SceneType.fargin.ordinal()] = farginScene;

        ClueTypeScene goverieScene = new ClueTypeScene();
        goverieScene.setDescription(
                "\nWelcome to Goverie");
        goverieScene.setMapSymbol("G");
        goverieScene.setTravelLength(3);
        goverieScene.setLockType("locked");
        goverieScene.setClueType("puzzle");
        scenes[SceneType.goverie.ordinal()] = goverieScene;

        ClueTypeScene howertyScene = new ClueTypeScene();
        howertyScene.setDescription(
                "\nWelcome to Howerty");
        howertyScene.setMapSymbol("H");
        howertyScene.setTravelLength(3);
        howertyScene.setLockType("locked");
        howertyScene.setClueType("puzzle");
        scenes[SceneType.howerty.ordinal()] = howertyScene;

        ClueTypeScene inlinScene = new ClueTypeScene();
        inlinScene.setDescription(
                "\nWelcome to Inlin");
        inlinScene.setMapSymbol("I");
        inlinScene.setTravelLength(3);
        inlinScene.setLockType("locked");
        inlinScene.setClueType("puzzle");
        scenes[SceneType.inlin.ordinal()] = inlinScene;

        ClueTypeScene jawelScene = new ClueTypeScene();
        jawelScene.setDescription(
                "\nWelcome to Jawel");
        jawelScene.setMapSymbol("J");
        jawelScene.setTravelLength(3);
        jawelScene.setLockType("locked");
        jawelScene.setClueType("puzzle");
        scenes[SceneType.jawel.ordinal()] = jawelScene;

        ClueTypeScene kinteScene = new ClueTypeScene();
        kinteScene.setDescription(
                "\nWelcome to Kinte");
        kinteScene.setMapSymbol("K");
        kinteScene.setTravelLength(3);
        kinteScene.setLockType("locked");
        kinteScene.setClueType("puzzle");
        scenes[SceneType.kinte.ordinal()] = kinteScene;

        ClueTypeScene lerlyScene = new ClueTypeScene();
        lerlyScene.setDescription(
                "\nWelcome to Lerly.");
        lerlyScene.setMapSymbol("L");
        lerlyScene.setTravelLength(3);
        lerlyScene.setLockType("locked");
        lerlyScene.setClueType("puzzle");
        scenes[SceneType.lerly.ordinal()] = lerlyScene;

        ClueTypeScene murtanScene = new ClueTypeScene();
        murtanScene.setDescription(
                "\nWelcome to Murtan.");
        murtanScene.setMapSymbol("M");
        murtanScene.setTravelLength(3);
        murtanScene.setLockType("locked");
        murtanScene.setClueType("puzzle");
        scenes[SceneType.murtan.ordinal()] = murtanScene;

        ClueTypeScene nolafeScene = new ClueTypeScene();
        nolafeScene.setDescription(
                "\nWelcome to Nolafe.");
        nolafeScene.setMapSymbol("N");
        nolafeScene.setTravelLength(3);
        nolafeScene.setLockType("locked");
        nolafeScene.setClueType("puzzle");
        scenes[SceneType.nolafe.ordinal()] = nolafeScene;

        ClueTypeScene opsteraScene = new ClueTypeScene();
        opsteraScene.setDescription(
                "\nWelcome to Opstera.");
        opsteraScene.setMapSymbol("O");
        opsteraScene.setTravelLength(3);
        opsteraScene.setLockType("locked");
        opsteraScene.setClueType("puzzle");
        scenes[SceneType.opstera.ordinal()] = opsteraScene;

        ClueTypeScene parquinScene = new ClueTypeScene();
        parquinScene.setDescription(
                "\nWelcome to Parquin.");
        parquinScene.setMapSymbol("P");
        parquinScene.setTravelLength(3);
        parquinScene.setLockType("locked");
        parquinScene.setClueType("puzzle");
        scenes[SceneType.parquin.ordinal()] = parquinScene;

        ClueTypeScene rysterScene = new ClueTypeScene();
        rysterScene.setDescription(
                "\nWelcome to Ryster.");
        rysterScene.setMapSymbol("R");
        rysterScene.setTravelLength(3);
        rysterScene.setLockType("locked");
        rysterScene.setClueType("puzzle");
        scenes[SceneType.ryster.ordinal()] = rysterScene;

        ClueTypeScene swerlinScene = new ClueTypeScene();
        swerlinScene.setDescription(
                "\nWelcome to Swerlin.");
        swerlinScene.setMapSymbol("S");
        swerlinScene.setTravelLength(3);
        swerlinScene.setLockType("locked");
        swerlinScene.setClueType("puzzle");
        scenes[SceneType.swerlin.ordinal()] = swerlinScene;

        ClueTypeScene terwaltScene = new ClueTypeScene();
        terwaltScene.setDescription(
                "\nWelcome to Terwalt.");
        terwaltScene.setMapSymbol("T");
        terwaltScene.setTravelLength(3);
        terwaltScene.setLockType("locked");
        terwaltScene.setClueType("puzzle");
        scenes[SceneType.terwalt.ordinal()] = terwaltScene;

        ClueTypeScene urtlinScene = new ClueTypeScene();
        urtlinScene.setDescription(
                "\nWelcome to Urtlin.");
        urtlinScene.setMapSymbol("U");
        urtlinScene.setTravelLength(3);
        urtlinScene.setLockType("locked");
        urtlinScene.setClueType("puzzle");
        scenes[SceneType.urtlin.ordinal()] = urtlinScene;

        ClueTypeScene verluScene = new ClueTypeScene();
        verluScene.setDescription(
                "\nWelcome to Verlu.");
        verluScene.setMapSymbol("V");
        verluScene.setTravelLength(3);
        verluScene.setLockType("locked");
        verluScene.setClueType("puzzle");
        scenes[SceneType.verlu.ordinal()] = verluScene;

        ClueTypeScene webelScene = new ClueTypeScene();
        webelScene.setDescription(
                "\nWelcome to Webel.");
        webelScene.setMapSymbol("W");
        webelScene.setTravelLength(3);
        webelScene.setLockType("locked");
        webelScene.setClueType("puzzle");
        scenes[SceneType.webel.ordinal()] = webelScene;

        ClueTypeScene xinaScene = new ClueTypeScene();
        xinaScene.setDescription(
                "\nWelcome to Xina.");
        xinaScene.setMapSymbol("X");
        xinaScene.setTravelLength(3);
        xinaScene.setLockType("locked");
        xinaScene.setClueType("puzzle");
        scenes[SceneType.xina.ordinal()] = xinaScene;

        ClueTypeScene yasterScene = new ClueTypeScene();
        yasterScene.setDescription(
                "\nWelcome to Yaster.");
        yasterScene.setMapSymbol("Y");
        yasterScene.setTravelLength(3);
        yasterScene.setLockType("locked");
        yasterScene.setClueType("puzzle");
        scenes[SceneType.yaster.ordinal()] = yasterScene;

        ClueTypeScene finishScene = new ClueTypeScene();
        finishScene.setDescription(
                "Welcome to Zinta."
                + "Thanks for helping us solve the mystery");
        finishScene.setMapSymbol("Z");
        finishScene.setTravelLength(3);
        finishScene.setLockType("locked");
        finishScene.setClueType("puzzle");
        scenes[SceneType.finish.ordinal()] = finishScene;

        return scenes;
    }

    public static void moveActorToLocation(Actor actor, Point coordinates) 
        throws mapControlException {
        
        Map map = TheHeist.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() || 
            newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new mapControlException("Actor cannot be moved to location"
                                          + coordinates.x + ", " + coordinates.y
                                          + " that city is locked at the moment." );
        }

    }

    

}
               
