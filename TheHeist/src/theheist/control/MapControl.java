/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist.control;

import byui.cit260.theHeist.model.ClueTypeScene;
import byui.cit260.theHeist.model.ClueTypeScene.SceneType;
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

        ClueTypeScene[] scenes = createScenes();
        GameControl.assignScenesToLocations(map, scenes);
        return map;
    }

    private static ClueTypeScene[] createScenes() {
        Game game = TheHeist.getCurrentGame();

        ClueTypeScene[] scenes = new ClueTypeScene[SceneType.values().length];
    
        Scene arlinScene = new ClueTypeScene();
        arlinScene.setDescription(
                            "\nYou will begin your adventure here"
                            + "and then you will move on to another "
                            + "location.");
        arlinScene.setMapSymbol("A");
        arlinScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = arlinScene;
        
        
        Scene bouryScene = new ClueTypeScene();
        bouryScene.setDescription(
                            "\nWelcome to Boury");
        bouryScene.setMapSymbol("B");
        bouryScene.setBlocked(false);
        scenes[SceneType.boury.ordinal()] = bouryScene;
        
        Scene celnigScene = new ClueTypeScene();
        celnigScene.setDescription(
                            "\nWelcome to Celnig");
        celnigScene.setMapSymbol("C");
        celnigScene.setBlocked(false);
        scenes[SceneType.celnig.ordinal()] = celnigScene;
        
        Scene duvinScene = new ClueTypeScene();
        duvinScene.setDescription(
                            "\nWelcome to Duvin");
        duvinScene.setMapSymbol("D");
        duvinScene.setBlocked(false);
        scenes[SceneType.duvin.ordinal()] = duvinScene;
        
        Scene estripScene = new ClueTypeScene();
        estripScene.setDescription(
                            "\nWelcome to Estrip");
        estripScene.setMapSymbol("E");
        estripScene.setBlocked(false);
        scenes[SceneType.estrip.ordinal()] = estripScene;
        
        Scene farginScene = new ClueTypeScene();
        farginScene.setDescription(
                            "\nWelcome to Fargin");
        farginScene.setMapSymbol("F");
        farginScene.setBlocked(false);
        scenes[SceneType.fargin.ordinal()] = farginScene;
        
        Scene goverieScene = new ClueTypeScene();
        goverieScene.setDescription(
                            "\nWelcome to Goverie");
        goverieScene.setMapSymbol("G");
        goverieScene.setBlocked(false);
        scenes[SceneType.goverie.ordinal()] = goverieScene;
        
        Scene howertyScene = new ClueTypeScene();
        howertyScene.setDescription(
                            "\nWelcome to Howerty");
        howertyScene.setMapSymbol("H");
        howertyScene.setBlocked(false);
        scenes[SceneType.howerty.ordinal()] = howertyScene;
        
        Scene inlinScene = new ClueTypeScene();
        inlinScene.setDescription(
                            "\nWelcome to Inlin");
        inlinScene.setMapSymbol("I");
        inlinScene.setBlocked(false);
        scenes[SceneType.inlin.ordinal()] = inlinScene;
        
        Scene jawelScene = new ClueTypeScene();
        jawelScene.setDescription(
                            "\nWelcome to Jawel");
        jawelScene.setMapSymbol("J");
        jawelScene.setBlocked(false);
        scenes[SceneType.jawel.ordinal()] = jawelScene;
        
        Scene kinteScene = new ClueTypeScene();
        kinteScene.setDescription(
                            "\nWelcome to Kinte");
        kinteScene.setMapSymbol("K");
        kinteScene.setBlocked(false);
        scenes[SceneType.kinte.ordinal()] = kinteScene;
        
        Scene lerlyScene = new ClueTypeScene();
        lerlyScene.setDescription(
                            "\nWelcome to Lerly.");
        lerlyScene.setMapSymbol("L");
        lerlyScene.setBlocked(false);
        scenes[SceneType.lerly.ordinal()] = lerlyScene;
        
        Scene murtanScene = new ClueTypeScene();
        murtanScene.setDescription(
                            "\nWelcome to Murtan.");
        murtanScene.setMapSymbol("M");
        murtanScene.setBlocked(false);
        scenes[SceneType.murtan.ordinal()] = murtanScene;
        
        Scene nolafeScene = new ClueTypeScene();
        nolafeScene.setDescription(
                            "\nWelcome to Nolafe.");
        nolafeScene.setMapSymbol("N");
        nolafeScene.setBlocked(false);
        scenes[SceneType.nolafe.ordinal()] = nolafeScene;
        
        Scene opsteraScene = new ClueTypeScene();
        opsteraScene.setDescription(
                            "\nWelcome to Opstera.");
        opsteraScene.setMapSymbol("O");
        opsteraScene.setBlocked(false);
        scenes[SceneType.opstera.ordinal()] = opsteraScene;
        
        Scene parquinScene = new ClueTypeScene();
        parquinScene.setDescription(
                            "\nWelcome to Parquin.");
        parquinScene.setMapSymbol("P");
        parquinScene.setBlocked(false);
        scenes[SceneType.parquin.ordinal()] = parquinScene;
        
        Scene rysterScene = new ClueTypeScene();
        rysterScene.setDescription(
                            "\nWelcome to Ryster.");
        rysterScene.setMapSymbol("R");
        rysterScene.setBlocked(false);
        scenes[SceneType.ryster.ordinal()] = rysterScene;
        
        Scene swerlinScene = new ClueTypeScene();
        swerlinScene.setDescription(
                            "\nWelcome to Swerlin.");
        swerlinScene.setMapSymbol("S");
        swerlinScene.setBlocked(false);
        scenes[SceneType.swerlin.ordinal()] = swerlinScene;
        
        Scene terwaltScene = new ClueTypeScene();
        terwaltScene.setDescription(
                            "\nWelcome to Terwalt.");
        terwaltScene.setMapSymbol("T");
        terwaltScene.setBlocked(false);
        scenes[SceneType.terwalt.ordinal()] = terwaltScene;
        
        Scene urtlinScene = new ClueTypeScene();
        urtlinScene.setDescription(
                            "\nWelcome to Urtlin.");
        urtlinScene.setMapSymbol("U");
        urtlinScene.setBlocked(false);
        scenes[SceneType.urtlin.ordinal()] = urtlinScene;
        
        Scene verluScene = new ClueTypeScene();
        verluScene.setDescription(
                            "\nWelcome to Verlu.");
        verluScene.setMapSymbol("V");
        verluScene.setBlocked(false);
        scenes[SceneType.verlu.ordinal()] = verluScene;
        
        Scene webelScene = new ClueTypeScene();
        webelScene.setDescription(
                            "\nWelcome to Webel.");
        webelScene.setMapSymbol("W");
        webelScene.setBlocked(false);
        scenes[SceneType.webel.ordinal()] = webelScene;
        
        Scene xinaScene = new ClueTypeScene();
        xinaScene.setDescription(
                            "\nWelcome to Xina.");
        xinaScene.setMapSymbol("X");
        xinaScene.setBlocked(false);
        scenes[SceneType.xina.ordinal()] = xinaScene;
        
        Scene yasterScene = new ClueTypeScene();
        yasterScene.setDescription(
                            "\nWelcome to Yaster.");
        yasterScene.setMapSymbol("Y");
        yasterScene.setBlocked(false);
        scenes[SceneType.yaster.ordinal()] = yasterScene;
        
        
        Scene finishScene = new ClueTypeScene();
        finishScene.setDescription(
                    "Welcome to Zinta."
                    + "Thanks for helping us resolve the mystery");
        finishScene.setMapSymbol("Z");
        finishScene.setBlocked(false);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
}

