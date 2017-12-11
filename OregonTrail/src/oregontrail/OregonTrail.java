/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import oregontrail.model.Game;
import oregontrail.model.Player;
import oregontrail.model.InventoryItem;
import oregontrail.model.LandMark;
import oregontrail.model.RandomEvent;
import oregontrail.model.Trade;
import oregontrail.view.StartProgramView;
import oregontrail.view.StartProgramView;



/**
 *
 * @author adm-achina
 */
public class OregonTrail {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {

    // create StartProgramViewOrig and display the start program view
    StartProgramView startProgramView = new StartProgramView();
    startProgramView.displayStartProgramView();
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        OregonTrail.player = player;
    }
}