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
    
    static ClueTypeScene[] scenes;

    public static Map createMap() {

        Map map = new Map(4, 4);

        ClueTypeScene[] scenes = createScenes();
        GameControl.assignScenesToLocations(map, scenes);
        return map;
    }

    private static ClueTypeScene[] createScenes() {
        Game game = TheHeist.getCurrentGame();

        ClueTypeScene[] scene = new ClueTypeScene[SceneType.values().length];
    
        ClueTypeScene arlinScene = new ClueTypeScene();
        arlinScene.setDescription(
                            "\nYou will begin your adventure here"
                            + "and then you will move on to another "
                            + "location.");
        arlinScene.setMapSymbol("A");
        arlinScene.setLocked(false);        
        scenes[SceneType.start.ordinal()] = arlinScene;
        
        
        ClueTypeScene bouryScene = new ClueTypeScene();
        bouryScene.setDescription(
                            "\nWelcome to Boury");
        bouryScene.setMapSymbol("B");
        bouryScene.setLocked(false);
        scenes[SceneType.boury.ordinal()] = bouryScene;
        
        ClueTypeScene celnigScene = new ClueTypeScene();
        celnigScene.setDescription(
                            "\nWelcome to Celnig");
        celnigScene.setMapSymbol("C");
        celnigScene.setLocked(false);
        scenes[SceneType.celnig.ordinal()] = celnigScene;
        
        ClueTypeScene duvinScene = new ClueTypeScene();
        duvinScene.setDescription(
                            "\nWelcome to Duvin");
        duvinScene.setMapSymbol("D");
        duvinScene.setLocked(false);
        scenes[SceneType.duvin.ordinal()] = duvinScene;
        
        ClueTypeScene estripScene = new ClueTypeScene();
        estripScene.setDescription(
                            "\nWelcome to Estrip");
        estripScene.setMapSymbol("E");
        estripScene.setLocked(false);
        scenes[SceneType.estrip.ordinal()] = estripScene;
        
        ClueTypeScene farginScene = new ClueTypeScene();
        farginScene.setDescription(
                            "\nWelcome to Fargin");
        farginScene.setMapSymbol("F");
        farginScene.setLocked(false);
        scenes[SceneType.fargin.ordinal()] = farginScene;
        
        ClueTypeScene goverieScene = new ClueTypeScene();
        goverieScene.setDescription(
                            "\nWelcome to Goverie");
        goverieScene.setMapSymbol("G");
        goverieScene.setLocked(false);
        scenes[SceneType.goverie.ordinal()] = goverieScene;
        
        ClueTypeScene howertyScene = new ClueTypeScene();
        howertyScene.setDescription(
                            "\nWelcome to Howerty");
        howertyScene.setMapSymbol("H");
        howertyScene.setLocked(false);
        scenes[SceneType.howerty.ordinal()] = howertyScene;
        
        ClueTypeScene inlinScene = new ClueTypeScene();
        inlinScene.setDescription(
                            "\nWelcome to Inlin");
        inlinScene.setMapSymbol("I");
        inlinScene.setLocked(false);
        scenes[SceneType.inlin.ordinal()] = inlinScene;
        
        ClueTypeScene jawelScene = new ClueTypeScene();
        jawelScene.setDescription(
                            "\nWelcome to Jawel");
        jawelScene.setMapSymbol("J");
        jawelScene.setLocked(false);
        scenes[SceneType.jawel.ordinal()] = jawelScene;
        
        ClueTypeScene kinteScene = new ClueTypeScene();
        kinteScene.setDescription(
                            "\nWelcome to Kinte");
        kinteScene.setMapSymbol("K");
        kinteScene.setLocked(false);
        scenes[SceneType.kinte.ordinal()] = kinteScene;
        
        ClueTypeScene lerlyScene = new ClueTypeScene();
        lerlyScene.setDescription(
                            "\nWelcome to Lerly.");
        lerlyScene.setMapSymbol("L");
        lerlyScene.setLocked(false);
        scenes[SceneType.lerly.ordinal()] = lerlyScene;
        
        ClueTypeScene murtanScene = new ClueTypeScene();
        murtanScene.setDescription(
                            "\nWelcome to Murtan.");
        murtanScene.setMapSymbol("M");
        murtanScene.setLocked(false);
        scenes[SceneType.murtan.ordinal()] = murtanScene;
        
        ClueTypeScene nolafeScene = new ClueTypeScene();
        nolafeScene.setDescription(
                            "\nWelcome to Nolafe.");
        nolafeScene.setMapSymbol("N");
        nolafeScene.setLocked(false);
        scenes[SceneType.nolafe.ordinal()] = nolafeScene;
        
        ClueTypeScene opsteraScene = new ClueTypeScene();
        opsteraScene.setDescription(
                            "\nWelcome to Opstera.");
        opsteraScene.setMapSymbol("O");
        opsteraScene.setLocked(false);
        scenes[SceneType.opstera.ordinal()] = opsteraScene;
        
        ClueTypeScene parquinScene = new ClueTypeScene();
        parquinScene.setDescription(
                            "\nWelcome to Parquin.");
        parquinScene.setMapSymbol("P");
        parquinScene.setLocked(false);
        scenes[SceneType.parquin.ordinal()] = parquinScene;
        
        ClueTypeScene rysterScene = new ClueTypeScene();
        rysterScene.setDescription(
                            "\nWelcome to Ryster.");
        rysterScene.setMapSymbol("R");
        rysterScene.setLocked(false);
        scenes[SceneType.ryster.ordinal()] = rysterScene;
        
        ClueTypeScene swerlinScene = new ClueTypeScene();
        swerlinScene.setDescription(
                            "\nWelcome to Swerlin.");
        swerlinScene.setMapSymbol("S");
        swerlinScene.setLocked(false);
        scenes[SceneType.swerlin.ordinal()] = swerlinScene;
        
        ClueTypeScene terwaltScene = new ClueTypeScene();
        terwaltScene.setDescription(
                            "\nWelcome to Terwalt.");
        terwaltScene.setMapSymbol("T");
        terwaltScene.setLocked(false);
        scenes[SceneType.terwalt.ordinal()] = terwaltScene;
        
        ClueTypeScene urtlinScene = new ClueTypeScene();
        urtlinScene.setDescription(
                            "\nWelcome to Urtlin.");
        urtlinScene.setMapSymbol("U");
        urtlinScene.setLocked(false);
        scenes[SceneType.urtlin.ordinal()] = urtlinScene;
        
        ClueTypeScene verluScene = new ClueTypeScene();
        verluScene.setDescription(
                            "\nWelcome to Verlu.");
        verluScene.setMapSymbol("V");
        verluScene.setLocked(false);
        scenes[SceneType.verlu.ordinal()] = verluScene;
        
        ClueTypeScene webelScene = new ClueTypeScene();
        webelScene.setDescription(
                            "\nWelcome to Webel.");
        webelScene.setMapSymbol("W");
        webelScene.setLocked(false);
        scenes[SceneType.webel.ordinal()] = webelScene;
        
        ClueTypeScene xinaScene = new ClueTypeScene();
        xinaScene.setDescription(
                            "\nWelcome to Xina.");
        xinaScene.setMapSymbol("X");
        xinaScene.setLocked(false);
        scenes[SceneType.xina.ordinal()] = xinaScene;
        
        ClueTypeScene yasterScene = new ClueTypeScene();
        yasterScene.setDescription(
                            "\nWelcome to Yaster.");
        yasterScene.setMapSymbol("Y");
        yasterScene.setLocked(false);
        scenes[SceneType.yaster.ordinal()] = yasterScene;
        
        
        ClueTypeScene finishScene = new ClueTypeScene();
        finishScene.setDescription(
                    "Welcome to Zinta."
                    + "Thanks for helping us solve the mystery");
        finishScene.setMapSymbol("Z");
        finishScene.setLocked(false);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
    }

    static void moveActorsToStartingLocation(Map map) {
        
        System.out.println("\n*** moveActorsToStartingLocation stub function called ***");
        
    }

    

    
        
}

