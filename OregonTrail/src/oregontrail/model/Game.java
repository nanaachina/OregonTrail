/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author glauc
 */
public class Game implements Serializable{

    public Game(){
        
    }
    
    @Override
    public String toString() {
        return "Game{" + "player=" + player.getName() + '}';
    }
    private double totalime;
    private int noPeople;
    private Player player;
    private Map map;
    private Team team;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    public double getTotalime() {
        return totalime;
    }

    public void setTotalime(double totalime) {
        this.totalime = totalime;
    }

    public int getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public void startGame(){
        
    }
    
    public void saveGame(){
        
    }
    
    public void loadGame(){
        
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setInventory(InventoryItem[] inventoryList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public InventoryItem[] getInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
