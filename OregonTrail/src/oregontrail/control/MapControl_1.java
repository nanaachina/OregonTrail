/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import oregontrail.view.Game;
import oregontrail.view.InventoryItem;
import oregontrail.view.Location;
import oregontrail.view.Map;
import oregontrail.view.Question;
import oregontrail.view.QuestionType;
import oregontrail.view.Scene;
import oregontrail.view.SceneType;
import static oregontrail.view.SceneType.start;
import oregontrail.OregonTrail;

/**
 *
 * @author adm-achina
 */
public class MapControl {
    
    public static Map createMap(){
        // create the map
        Map map = new Map(5, 5);
        return map;
    }   
    
    public static Location[][] createLocations(int rows, int columns){

        
        if(rows < 1 || columns < 1){
            return null;
        }
        int noOfRows = 5;
        int noOfColumns = 5;
        Location[][] locations = new Location[noOfRows][noOfColumns];
        
        return locations;
    }    
    
    public static Scene[] createScenes() {
        // create scenes
        Game game = OregonTrail.getCurrentGame();
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene start = new Scene();
        start.setSceneType(0);
        start.setDescription("Start");
        start.setBlocked(false);
        start.setMapSymbol("");
        start.setTravelTime(0);
        scenes[SceneType.start.ordinal()] = start;
        
        Scene store = new Scene();
        store.setSceneType(0);
        store.setDescription("Store");
        store.setBlocked(false);
        store.setMapSymbol("");
        store.setTravelTime(0);
        scenes[SceneType.store.ordinal()] = store;

        Scene mountain = new Scene();
        mountain.setSceneType(0);
        mountain.setDescription("Mountain");
        mountain.setBlocked(false);
        mountain.setMapSymbol("");
        mountain.setTravelTime(0);
        scenes[SceneType.mountain.ordinal()] = mountain;

        Scene river = new Scene();
        river.setSceneType(0);
        river.setDescription("River");
        river.setBlocked(false);
        river.setMapSymbol("");
        river.setTravelTime(0);
        scenes[SceneType.river.ordinal()] = river;
        
        Scene wilderness = new Scene();
        wilderness.setSceneType(0);
        wilderness.setDescription("Wilderness");
        wilderness.setBlocked(false);
        wilderness.setMapSymbol("");
        wilderness.setTravelTime(0);
        scenes[SceneType.wilderness.ordinal()] = wilderness;
        
        Scene hunt = new Scene();
        hunt.setSceneType(0);
        hunt.setDescription("Hunt");
        hunt.setBlocked(false);
        hunt.setMapSymbol("");
        hunt.setTravelTime(0);
        scenes[SceneType.hunt.ordinal()] = hunt;
        
        Scene fort = new Scene();
        fort.setSceneType(0);
        fort.setDescription("Fort");
        fort.setBlocked(false);
        fort.setMapSymbol("");
        fort.setTravelTime(0);
        scenes[SceneType.fort.ordinal()] = fort;
        
        Scene bridge = new Scene();
        bridge.setSceneType(0);
        bridge.setDescription("Bridge");
        bridge.setBlocked(false);
        bridge.setMapSymbol("");
        bridge.setTravelTime(0);
        scenes[SceneType.bridge.ordinal()] = bridge;
        
        Scene finish = new Scene();
        finish.setSceneType(0);
        finish.setDescription("finish");
        finish.setBlocked(false);
        finish.setMapSymbol("");
        finish.setTravelTime(0);
        scenes[SceneType.finish.ordinal()] = finish;
        
        return scenes;
    }
    
}
