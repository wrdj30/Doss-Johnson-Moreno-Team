/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist.control;

import byui.cit260.theHeist.model.Game;
import theheist.TheHeist;

/**
 *
 * @author luceromoreno
 */
class Scene {
    
    private static Scene[] createScenes() {

        Game game = TheHeist.getCurrentGame();
        
        Scenes[] scenes = new Scene[SceneType.Values().length];
        
        Scene startingScene = new Scene();
        startingScene.getDescription(
            "\n Write starting scene here");
        startingScene.setMapSymbol("");
        startingScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = startingScene;
    }
    
}
