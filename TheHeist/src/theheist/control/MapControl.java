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
import byui.cit260.theHeist.model.Map;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import theheist.TheHeist;

/**
 *
 * @author wr
 */
public class MapControl {

    public static Map createMap() throws mapControlException {

        Map map = null;
        try {
            map = new Map(5, 5);
        } catch (mapControlException ex) {
            Logger.getLogger(MapControl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return map;
    }

    public static ClueTypeScene[] createScenes() {
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
        arlinScene.setQuestion("Tear one off and scratch my head what was red is black instead.\n");
        arlinScene.setAnswer("MATCHSTICK");
        arlinScene.setNextLocation(new Point(0, 0));
        scenes[SceneType.start.ordinal()] = arlinScene;

        ClueTypeScene bouryScene = new ClueTypeScene();
        bouryScene.setDescription(
                "\nWelcome to Boury");
        bouryScene.setMapSymbol("B");
        bouryScene.setTravelLength(3);
        bouryScene.setLockType("locked");
        bouryScene.setClueType("puzzle");
        bouryScene.setQuestion("The eight of us go forth not back to protect our king from a foes attack.\n");
        bouryScene.setAnswer("CHESS PAWNS");
        bouryScene.setNextLocation(new Point(1, 3));
        scenes[SceneType.boury.ordinal()] = bouryScene;

        ClueTypeScene celnigScene = new ClueTypeScene();
        celnigScene.setDescription(
                "\nWelcome to Celnig");
        celnigScene.setMapSymbol("C");
        celnigScene.setTravelLength(3);
        celnigScene.setLockType("locked");
        celnigScene.setClueType("puzzle");
        celnigScene.setQuestion("What room can no one enter?\n");
        celnigScene.setAnswer("MUSHROOM");
        celnigScene.setNextLocation(new Point(2, 2));
        scenes[SceneType.celnig.ordinal()] = celnigScene;

        ClueTypeScene duvinScene = new ClueTypeScene();
        duvinScene.setDescription(
                "\nWelcome to Duvin");
        duvinScene.setMapSymbol("D");
        duvinScene.setTravelLength(3);
        duvinScene.setLockType("locked");
        duvinScene.setClueType("puzzle");
        duvinScene.setQuestion("If you look at the number on my face you won't find thirteen anyplace.\n");
        duvinScene.setAnswer("CLOCK");
        duvinScene.setNextLocation(new Point(0, 4));
        scenes[SceneType.duvin.ordinal()] = duvinScene;

        ClueTypeScene estripScene = new ClueTypeScene();
        estripScene.setDescription(
                "\nWelcome to Estrip");
        estripScene.setMapSymbol("E");
        estripScene.setTravelLength(3);
        estripScene.setLockType("locked");
        estripScene.setClueType("puzzle");
        estripScene.setQuestion("What belongs to you, but is used by others?\n");
        estripScene.setAnswer("YOUR NAME");
        estripScene.setNextLocation(new Point(3, 1));
        scenes[SceneType.estrip.ordinal()] = estripScene;

        ClueTypeScene farginScene = new ClueTypeScene();
        farginScene.setDescription(
                "\nWelcome to Fargin");
        farginScene.setMapSymbol("F");
        farginScene.setTravelLength(3);
        farginScene.setLockType("locked");
        farginScene.setClueType("puzzle");
        farginScene.setQuestion("I have billions of eyes, yet I live in darkness. I have millions of ears, yet only four lobes. I have no muscle, yet I rule two hemispheres. What am I?\n");
        farginScene.setAnswer("BRAIN");
        farginScene.setNextLocation(new Point(3, 4));
        scenes[SceneType.fargin.ordinal()] = farginScene;

        ClueTypeScene goverieScene = new ClueTypeScene();
        goverieScene.setDescription(
                "\nWelcome to Goverie");
        goverieScene.setMapSymbol("G");
        goverieScene.setTravelLength(3);
        goverieScene.setLockType("locked");
        goverieScene.setClueType("puzzle");
        goverieScene.setQuestion("What people are always in a hurry?\n");
        goverieScene.setAnswer("RUSSIANS");
        goverieScene.setNextLocation(new Point(4, 0));
        scenes[SceneType.goverie.ordinal()] = goverieScene;

        ClueTypeScene howertyScene = new ClueTypeScene();
        howertyScene.setDescription(
                "\nWelcome to Howerty");
        howertyScene.setMapSymbol("H");
        howertyScene.setTravelLength(3);
        howertyScene.setLockType("locked");
        howertyScene.setClueType("puzzle");
        howertyScene.setQuestion("What goes up white and comes down yellow and white?\n");
        howertyScene.setAnswer("EGG");
        howertyScene.setNextLocation(new Point(0, 3));
        scenes[SceneType.howerty.ordinal()] = howertyScene;

        ClueTypeScene inlinScene = new ClueTypeScene();
        inlinScene.setDescription(
                "\nWelcome to Inlin");
        inlinScene.setMapSymbol("I");
        inlinScene.setTravelLength(3);
        inlinScene.setLockType("locked");
        inlinScene.setClueType("puzzle");
        inlinScene.setQuestion("What has neither flesh, bone, nor nail yet has 4 fingers and a thumb?\n");
        inlinScene.setAnswer("GLOVE");
        inlinScene.setNextLocation(new Point(1, 2));
        scenes[SceneType.inlin.ordinal()] = inlinScene;

        ClueTypeScene jawelScene = new ClueTypeScene();
        jawelScene.setDescription(
                "\nWelcome to Jawel");
        jawelScene.setMapSymbol("J");
        jawelScene.setTravelLength(3);
        jawelScene.setLockType("locked");
        jawelScene.setClueType("puzzle");
        jawelScene.setQuestion("What kind of pins are used in soup?\n");
        jawelScene.setAnswer("Terrapins");
        jawelScene.setNextLocation(new Point(2, 0));
        scenes[SceneType.jawel.ordinal()] = jawelScene;

        ClueTypeScene kinteScene = new ClueTypeScene();
        kinteScene.setDescription(
                "\nWelcome to Kinte");
        kinteScene.setMapSymbol("K");
        kinteScene.setTravelLength(3);
        kinteScene.setLockType("locked");
        kinteScene.setClueType("puzzle");
        kinteScene.setQuestion("How many sides has a circle?\n");
        kinteScene.setAnswer("TWO");
        kinteScene.setNextLocation(new Point(3, 3));
        scenes[SceneType.kinte.ordinal()] = kinteScene;

        ClueTypeScene lerlyScene = new ClueTypeScene();
        lerlyScene.setDescription(
                "\nWelcome to Lerly.");
        lerlyScene.setMapSymbol("L");
        lerlyScene.setTravelLength(3);
        lerlyScene.setLockType("locked");
        lerlyScene.setClueType("puzzle");
        lerlyScene.setQuestion("What won't run long without winding?\n");
        lerlyScene.setAnswer("RIVER");
        lerlyScene.setNextLocation(new Point(1, 4));
        scenes[SceneType.lerly.ordinal()] = lerlyScene;

        ClueTypeScene murtanScene = new ClueTypeScene();
        murtanScene.setDescription(
                "\nWelcome to Murtan.");
        murtanScene.setMapSymbol("M");
        murtanScene.setTravelLength(3);
        murtanScene.setLockType("locked");
        murtanScene.setClueType("puzzle");
        murtanScene.setQuestion("What has branches and leaves and no bark?\n");
        murtanScene.setAnswer("LIBRARY");
        murtanScene.setNextLocation(new Point(4, 2));
        scenes[SceneType.murtan.ordinal()] = murtanScene;

        ClueTypeScene nolafeScene = new ClueTypeScene();
        nolafeScene.setDescription(
                "\nWelcome to Nolafe.");
        nolafeScene.setMapSymbol("N");
        nolafeScene.setTravelLength(3);
        nolafeScene.setLockType("locked");
        nolafeScene.setClueType("puzzle");
        nolafeScene.setQuestion("What do you find in a kitchen cabinet that is not alive?\n");
        nolafeScene.setAnswer("DEADPANS");
        nolafeScene.setNextLocation(new Point(1, 1));
        scenes[SceneType.nolafe.ordinal()] = nolafeScene;

        ClueTypeScene opsteraScene = new ClueTypeScene();
        opsteraScene.setDescription(
                "\nWelcome to Opstera.");
        opsteraScene.setMapSymbol("O");
        opsteraScene.setTravelLength(3);
        opsteraScene.setLockType("locked");
        opsteraScene.setClueType("puzzle");
        opsteraScene.setQuestion("What kind of men are always above board?\n");
        opsteraScene.setAnswer("CHESSMEN");
        opsteraScene.setNextLocation(new Point(0, 1));
        scenes[SceneType.opstera.ordinal()] = opsteraScene;

        ClueTypeScene parquinScene = new ClueTypeScene();
        parquinScene.setDescription(
                "\nWelcome to Parquin.");
        parquinScene.setMapSymbol("P");
        parquinScene.setTravelLength(3);
        parquinScene.setLockType("locked");
        parquinScene.setClueType("puzzle");
        parquinScene.setQuestion("What is it that travels on all fours in the morning, on two legs at noon, and three at twilight?\n");
        parquinScene.setAnswer("MAN");
        parquinScene.setNextLocation(new Point(1, 0));
        scenes[SceneType.parquin.ordinal()] = parquinScene;

        ClueTypeScene rysterScene = new ClueTypeScene();
        rysterScene.setDescription(
                "\nWelcome to Ryster.");
        rysterScene.setMapSymbol("R");
        rysterScene.setTravelLength(3);
        rysterScene.setLockType("locked");
        rysterScene.setClueType("puzzle");
        rysterScene.setQuestion("What do many boats, shovels, laundries, whistles, and hot showers have in common?\n");
        rysterScene.setAnswer("STEAM");
        rysterScene.setNextLocation(new Point(2, 3));
        scenes[SceneType.ryster.ordinal()] = rysterScene;

        ClueTypeScene swerlinScene = new ClueTypeScene();
        swerlinScene.setDescription(
                "\nWelcome to Swerlin.");
        swerlinScene.setMapSymbol("S");
        swerlinScene.setTravelLength(3);
        swerlinScene.setLockType("locked");
        swerlinScene.setClueType("puzzle");
        swerlinScene.setQuestion("What have the following in common - hemming, basting, pearling, and tagging?\n");
        swerlinScene.setAnswer("NEEDLEWORK");
        swerlinScene.setNextLocation(new Point(0, 2));
        scenes[SceneType.swerlin.ordinal()] = swerlinScene;

        ClueTypeScene terwaltScene = new ClueTypeScene();
        terwaltScene.setDescription(
                "\nWelcome to Terwalt.");
        terwaltScene.setMapSymbol("T");
        terwaltScene.setTravelLength(3);
        terwaltScene.setLockType("locked");
        terwaltScene.setClueType("puzzle");
        terwaltScene.setQuestion("We're five little items of an everyday sort; you'll find us all in a tennis court.\n");
        terwaltScene.setAnswer("VOWELS");
        terwaltScene.setNextLocation(new Point(4, 3));
        scenes[SceneType.terwalt.ordinal()] = terwaltScene;

        ClueTypeScene urtlinScene = new ClueTypeScene();
        urtlinScene.setDescription(
                "\nWelcome to Urtlin.");
        urtlinScene.setMapSymbol("U");
        urtlinScene.setTravelLength(3);
        urtlinScene.setLockType("locked");
        urtlinScene.setClueType("puzzle");
        urtlinScene.setQuestion("You can have me but not hold me, gain me and quickly lose me, if treated with care I can be great, and if betrayed I will break, what am I?\n");
        urtlinScene.setAnswer("TRUST");
        urtlinScene.setNextLocation(new Point(2, 1));
        scenes[SceneType.urtlin.ordinal()] = urtlinScene;

        ClueTypeScene verluScene = new ClueTypeScene();
        verluScene.setDescription(
                "\nWelcome to Verlu.");
        verluScene.setMapSymbol("V");
        verluScene.setTravelLength(3);
        verluScene.setLockType("locked");
        verluScene.setClueType("puzzle");
        verluScene.setQuestion("The poor have me, the rich need me, and if you eat me, you'll die.\n");
        verluScene.setAnswer("NOTHING");
        verluScene.setNextLocation(new Point(3, 2));
        scenes[SceneType.verlu.ordinal()] = verluScene;

        ClueTypeScene webelScene = new ClueTypeScene();
        webelScene.setDescription(
                "\nWelcome to Webel.");
        webelScene.setMapSymbol("W");
        webelScene.setTravelLength(3);
        webelScene.setLockType("locked");
        webelScene.setClueType("puzzle");
        webelScene.setQuestion("What gets wetter and wetter the more it drys?\n");
        webelScene.setAnswer("TOWEL");
        webelScene.setNextLocation(new Point(2, 4));
        scenes[SceneType.webel.ordinal()] = webelScene;

        ClueTypeScene xinaScene = new ClueTypeScene();
        xinaScene.setDescription(
                "\nWelcome to Xina.");
        xinaScene.setMapSymbol("X");
        xinaScene.setTravelLength(3);
        xinaScene.setLockType("locked");
        xinaScene.setClueType("puzzle");
        xinaScene.setQuestion("What can travel around the world while staying in a corner?\n");
        xinaScene.setAnswer("STAMP");
        xinaScene.setNextLocation(new Point(3, 0));
        scenes[SceneType.xina.ordinal()] = xinaScene;

        ClueTypeScene yasterScene = new ClueTypeScene();
        yasterScene.setDescription(
                "\nWelcome to Yaster.");
        yasterScene.setMapSymbol("Y");
        yasterScene.setTravelLength(3);
        yasterScene.setLockType("locked");
        yasterScene.setClueType("puzzle");
        yasterScene.setQuestion("If you have me, you want to share me. If you share me, you haven't got me. What am I?\n");
        yasterScene.setAnswer("SECRET");
        yasterScene.setNextLocation(new Point(0, 2));
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
        int newRow = coordinates.x - 1;
        int newColumn = coordinates.y - 1;

        if (newRow < 0 || newRow >= map.getNoOfRows()
                || newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new mapControlException("Actor cannot be moved to location"
                    + coordinates.x + ", " + coordinates.y
                    + " that city is locked at the moment.");
        }

    }

}
