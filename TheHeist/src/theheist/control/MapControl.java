/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist.control;

import byui.cit260.theHeist.model.ClueTypeScene;
import byui.cit260.theHeist.model.SceneType;
import byui.cit260.theHeist.model.Game;
import byui.cit260.theHeist.model.Map;
import theheist.TheHeist;

/**
 *
 * @author wr
 */
public class MapControl {

    public static Map createMap() {

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
        arlinScene.setTravelLength();
        arlinScene.setLockType(false);
        arlinScene.setClueType();
        scenes[SceneType.start.ordinal()] = arlinScene;
        
        
        ClueTypeScene bouryScene = new ClueTypeScene();
        bouryScene.setDescription(
                            "\nWelcome to Boury");
        bouryScene.setMapSymbol("B");
        arlinScene.setLockType(false);
        scenes[SceneType.boury.ordinal()] = bouryScene;
        
        ClueTypeScene celnigScene = new ClueTypeScene();
        celnigScene.setDescription(
                            "\nWelcome to Celnig");
        celnigScene.setMapSymbol("C");
        arlinScene.setLockType(false);
        scenes[SceneType.celnig.ordinal()] = celnigScene;
        
        ClueTypeScene duvinScene = new ClueTypeScene();
        duvinScene.setDescription(
                            "\nWelcome to Duvin");
        duvinScene.setMapSymbol("D");
        arlinScene.setLockType(false);
        scenes[SceneType.duvin.ordinal()] = duvinScene;
        
        ClueTypeScene estripScene = new ClueTypeScene();
        estripScene.setDescription(
                            "\nWelcome to Estrip");
        estripScene.setMapSymbol("E");
        arlinScene.setLockType(false);
        scenes[SceneType.estrip.ordinal()] = estripScene;
        
        ClueTypeScene farginScene = new ClueTypeScene();
        farginScene.setDescription(
                            "\nWelcome to Fargin");
        farginScene.setMapSymbol("F");
        arlinScene.setLockType(false);
        scenes[SceneType.fargin.ordinal()] = farginScene;
        
        ClueTypeScene goverieScene = new ClueTypeScene();
        goverieScene.setDescription(
                            "\nWelcome to Goverie");
        goverieScene.setMapSymbol("G");
        arlinScene.setLockType(false);
        scenes[SceneType.goverie.ordinal()] = goverieScene;
        
        ClueTypeScene howertyScene = new ClueTypeScene();
        howertyScene.setDescription(
                            "\nWelcome to Howerty");
        howertyScene.setMapSymbol("H");
        arlinScene.setLockType(false);
        scenes[SceneType.howerty.ordinal()] = howertyScene;
        
        ClueTypeScene inlinScene = new ClueTypeScene();
        inlinScene.setDescription(
                            "\nWelcome to Inlin");
        inlinScene.setMapSymbol("I");
        arlinScene.setLockType(false);
        scenes[SceneType.inlin.ordinal()] = inlinScene;
        
        ClueTypeScene jawelScene = new ClueTypeScene();
        jawelScene.setDescription(
                            "\nWelcome to Jawel");
        jawelScene.setMapSymbol("J");
        arlinScene.setLockType(false);
        scenes[SceneType.jawel.ordinal()] = jawelScene;
        
        ClueTypeScene kinteScene = new ClueTypeScene();
        kinteScene.setDescription(
                            "\nWelcome to Kinte");
        kinteScene.setMapSymbol("K");
        arlinScene.setLockType(false);
        scenes[SceneType.kinte.ordinal()] = kinteScene;
        
        ClueTypeScene lerlyScene = new ClueTypeScene();
        lerlyScene.setDescription(
                            "\nWelcome to Lerly.");
        lerlyScene.setMapSymbol("L");
        arlinScene.setLockType(false);
        scenes[SceneType.lerly.ordinal()] = lerlyScene;
        
        ClueTypeScene murtanScene = new ClueTypeScene();
        murtanScene.setDescription(
                            "\nWelcome to Murtan.");
        murtanScene.setMapSymbol("M");
        arlinScene.setLockType(false);
        scenes[SceneType.murtan.ordinal()] = murtanScene;
        
        ClueTypeScene nolafeScene = new ClueTypeScene();
        nolafeScene.setDescription(
                            "\nWelcome to Nolafe.");
        nolafeScene.setMapSymbol("N");
        arlinScene.setLockType(false);
        scenes[SceneType.nolafe.ordinal()] = nolafeScene;
        
        ClueTypeScene opsteraScene = new ClueTypeScene();
        opsteraScene.setDescription(
                            "\nWelcome to Opstera.");
        opsteraScene.setMapSymbol("O");
        arlinScene.setLockType(false);
        scenes[SceneType.opstera.ordinal()] = opsteraScene;
        
        ClueTypeScene parquinScene = new ClueTypeScene();
        parquinScene.setDescription(
                            "\nWelcome to Parquin.");
        parquinScene.setMapSymbol("P");
        arlinScene.setLockType(false);
        scenes[SceneType.parquin.ordinal()] = parquinScene;
        
        ClueTypeScene rysterScene = new ClueTypeScene();
        rysterScene.setDescription(
                            "\nWelcome to Ryster.");
        rysterScene.setMapSymbol("R");
        arlinScene.setLockType(false);
        scenes[SceneType.ryster.ordinal()] = rysterScene;
        
        ClueTypeScene swerlinScene = new ClueTypeScene();
        swerlinScene.setDescription(
                            "\nWelcome to Swerlin.");
        swerlinScene.setMapSymbol("S");
        arlinScene.setLockType(false);
        scenes[SceneType.swerlin.ordinal()] = swerlinScene;
        
        ClueTypeScene terwaltScene = new ClueTypeScene();
        terwaltScene.setDescription(
                            "\nWelcome to Terwalt.");
        terwaltScene.setMapSymbol("T");
        arlinScene.setLockType(false);
        scenes[SceneType.terwalt.ordinal()] = terwaltScene;
        
        ClueTypeScene urtlinScene = new ClueTypeScene();
        urtlinScene.setDescription(
                            "\nWelcome to Urtlin.");
        urtlinScene.setMapSymbol("U");
        arlinScene.setLockType(false);
        scenes[SceneType.urtlin.ordinal()] = urtlinScene;
        
        ClueTypeScene verluScene = new ClueTypeScene();
        verluScene.setDescription(
                            "\nWelcome to Verlu.");
        verluScene.setMapSymbol("V");
        arlinScene.setLockType(false);
        scenes[SceneType.verlu.ordinal()] = verluScene;
        
        ClueTypeScene webelScene = new ClueTypeScene();
        webelScene.setDescription(
                            "\nWelcome to Webel.");
        webelScene.setMapSymbol("W");
        arlinScene.setLockType(false);
        scenes[SceneType.webel.ordinal()] = webelScene;
        
        ClueTypeScene xinaScene = new ClueTypeScene();
        xinaScene.setDescription(
                            "\nWelcome to Xina.");
        xinaScene.setMapSymbol("X");
        arlinScene.setLockType(false);
        scenes[SceneType.xina.ordinal()] = xinaScene;
        
        ClueTypeScene yasterScene = new ClueTypeScene();
        yasterScene.setDescription(
                            "\nWelcome to Yaster.");
        yasterScene.setMapSymbol("Y");
        arlinScene.setLockType(false);
        scenes[SceneType.yaster.ordinal()] = yasterScene;
        
        
        ClueTypeScene finishScene = new ClueTypeScene();
        finishScene.setDescription(
                    "Welcome to Zinta."
                    + "Thanks for helping us solve the mystery");
        finishScene.setMapSymbol("Z");
        arlinScene.setLockType(false);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
    }

    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
        
}

