/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import view.StartProgramView;
import model.Game;
import model.Player;

/**x
 *
 * @author Fernando
 */
public class OregonTrail {
    
    private static Game currentGame = null;
    private static Player player = null;

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
    
    
    
    public static void main(String[] args) {
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.displayStartProgramView();
}
}
