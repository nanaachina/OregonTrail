/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;


import oregontrail.model.Actor;
import oregontrail.model.Game;
import oregontrail.model.InventoryItem;
import oregontrail.model.Item;
import oregontrail.model.Location;
import oregontrail.model.Map;
import oregontrail.model.Player;
import java.util.ArrayList;
import java.util.List;
import oregontrail.OregonTrail;
import oregontrail.view.Occupation;
import oregontrail.view.OccupationType;

/**
 *
 * @author adm-achina
 */
public class GameControl {
    private static List<Actor> actors = new ArrayList<>();
    private static double fundAmount = 0;
    private static String startMonth = null;
    private static double initFunds = 0;
    private static double totalBill = 0;
    private static double oxen = 0;
    private static double oxenCost=40;
    private static double food = 0;
    private static double foodCost = .20;
    private static double clothing = 0;
    private static double clothingCost = 10;
    private static double ammo = 0;
    private static double ammoCost = 2;
    private static double wheel = 0;
    private static double wheelCost = 10;
    private static double axle = 0;
    private static double axleCost = 10;
    private static double tongue = 0;
    private static double tongueCost = 10;
    
    
    public static Player createPlayer(String name){

        if(name == null){
            return null;
        }
        Player player = new Player();
        player.setName(name);

        OregonTrail.setPlayer(player); // save the player

        return player;
    }

    /**
     * Add array for wagon party
     */
    public static int createActor(Actor actor){
        //Check if the actor is valid        
        if(isActorValid(actor)){
            //add actor to actors list
            actors.add(actor);
            return +1;
        }
        //if actor is not valid then display to user 
        //an invalid actor message and return to getPartyList()    
        System.out.println("\n*** Invalid actor "+ actor.toString()+"***");
        return -1;
    }

    public static List<Actor> getActors() {
        return actors;
    }
    
    private static boolean isActorValid(Actor actor){
        if(actor == null){
            return false;
        }
        if(actor.getName() == null){
            return false;
        }
        return true;
    }
    
        public static double getFundAmount() {
        return fundAmount;
    }

    public static void setFundAmount(double fundAmount) {
        GameControl.fundAmount = fundAmount;
    }

    public static String getStartMonth() {
        return startMonth;
    }

    public static void setStartMonth(String startMonth) {
        GameControl.startMonth = startMonth;
    }

    public static double getInitFunds() {
        return initFunds;
    }

    public static void setInitFunds(double initFunds) {
        GameControl.initFunds = initFunds;
    }

    public static double getTotalBill() {
        return totalBill;
    }

    public static void setTotalBill(double totalBill) {
        GameControl.totalBill = totalBill;
    }

    public static double getOxen() {
        return oxen;
    }

    public static void setOxen(double oxen) {
        GameControl.oxen = oxen;
    }

    public static double getOxenCost() {
        return oxenCost;
    }

    public static void setOxenCost(double oxenCost) {
        GameControl.oxenCost = oxenCost;
    }

    public static double getFood() {
        return food;
    }

    public static void setFood(double food) {
        GameControl.food = food;
    }

    public static double getFoodCost() {
        return foodCost;
    }

    public static void setFoodCost(double foodCost) {
        GameControl.foodCost = foodCost;
    }

    public static double getClothing() {
        return clothing;
    }

    public static void setClothing(double clothing) {
        GameControl.clothing = clothing;
    }

    public static double getClothingCost() {
        return clothingCost;
    }

    public static void setClothingCost(double clothingCost) {
        GameControl.clothingCost = clothingCost;
    }

    public static double getAmmo() {
        return ammo;
    }

    public static void setAmmo(double ammo) {
        GameControl.ammo = ammo;
    }

    public static double getAmmoCost() {
        return ammoCost;
    }

    public static void setAmmoCost(double ammoCost) {
        GameControl.ammoCost = ammoCost;
    }

    public static double getWheel() {
        return wheel;
    }

    public static void setWheel(double wheel) {
        GameControl.wheel = wheel;
    }

    public static double getWheelCost() {
        return wheelCost;
    }

    public static void setWheelCost(double wheelCost) {
        GameControl.wheelCost = wheelCost;
    }

    public static double getAxle() {
        return axle;
    }

    public static void setAxle(double axle) {
        GameControl.axle = axle;
    }

    public static double getAxleCost() {
        return axleCost;
    }

    public static void setAxleCost(double axleCost) {
        GameControl.axleCost = axleCost;
    }

    public static double getTongue() {
        return tongue;
    }

    public static void setTongue(double tongue) {
        GameControl.tongue = tongue;
    }

    public static double getTongueCost() {
        return tongueCost;
    }

    public static void setTongueCost(double tongueCost) {
        GameControl.tongueCost = tongueCost;
    }

    public static void createNewGame(Player player) {
        Game game = new Game(); // create new game
        OregonTrail.setCurrentGame(game); // save in OregonTrail
        
        game.setPlayer(player); // save player in game
        
        //System.out.println("\n*** new game started ***");
        
        // create the inventory list and save in the game
        InventoryItem[] inventoryList = GameControl.createItems();
        game.setInventory(inventoryList);
                
        //System.out.println("\n*** inventory list created ***");
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game
        
        //System.out.println("\n*** map created ***");
    }

    public static InventoryItem[] createItems() {
        // create array(list) of InventoryItem items

        InventoryItem[] inventory = new InventoryItem[7];   
        
        InventoryItem oxen = new InventoryItem();
        oxen.setDescription("Oxen");
        oxen.setQuantityInStock(3);
        oxen.setRequiredAmount(0);
        oxen.setCost(40.00);
        inventory[Item.oxen()] = oxen;
        
        InventoryItem food = new InventoryItem();
        food.setDescription("Food");
        food.setQuantityInStock(2000);
        food.setRequiredAmount(0);
        food.setCost(00.20);
        inventory[Item.food()] = food;
        
        InventoryItem clothing = new InventoryItem();
        clothing.setDescription("Clothing");
        clothing.setQuantityInStock(20);
        clothing.setRequiredAmount(0);
        clothing.setCost(10.00);
        inventory[Item.clothing()] = clothing;
        
        InventoryItem ammunition = new InventoryItem();
        ammunition.setDescription("Ammunition");
        ammunition.setQuantityInStock(10);
        ammunition.setRequiredAmount(0);
        ammunition.setCost(2.00);
        inventory[Item.ammunition()] = ammunition;
        
        InventoryItem wheel = new InventoryItem();
        wheel.setDescription("Wheel");
        wheel.setQuantityInStock(3);
        wheel.setRequiredAmount(0);
        wheel.setCost(10.00);
        inventory[Item.wheel()] = wheel;
        
        InventoryItem axle = new InventoryItem();
        axle.setDescription("Axle");
        axle.setQuantityInStock(3);
        axle.setRequiredAmount(0);
        axle.setCost(10.00);
        inventory[Item.axle()] = axle;
        
        InventoryItem tongue = new InventoryItem();
        tongue.setDescription("Tongue");
        tongue.setQuantityInStock(3);
        tongue.setRequiredAmount(0);
        tongue.setCost(10.00);
        inventory[Item.tongue()] = tongue;
        
        return inventory;
    }    
        public static OccupationType[] createOccupation() {
        // create array list of OccupationType types
        OccupationType[] occupation = new OccupationType[3];
        
        OccupationType banker = new OccupationType();
        banker.setDescription("Banker");
        banker.setFundAmount(1600);
        occupation[Occupation.banker()] = banker;
        
        OccupationType carpenter = new OccupationType();
        carpenter.setDescription("Carpenter");
        carpenter.setFundAmount(800);
        occupation[Occupation.carpenter()] = carpenter;
        
        OccupationType farmer = new OccupationType();
        farmer.setDescription("Farmer");
        farmer.setFundAmount(400);
        occupation[Occupation.farmer()] = farmer;
        
        return occupation;
    }
        public static Location[][] getMapLocations() {
        return OregonTrail.getCurrentGame().getMap().getLocations();
    }
        
        public static InventoryItem[] getSortedInventoryListDescription() {
        
        // get inventory list for the current game
        InventoryItem[] originalInventoryList = 
                OregonTrail.getCurrentGame().getInventory();
        
        // make a copy of orignalList
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
       
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++) {
                if (inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }    
        return inventoryList;
    }   
        public static InventoryItem[] getSortedInventoryListCost() {
        
        // get inventory list for the current game
        InventoryItem[] originalInventoryList = 
                OregonTrail.getCurrentGame().getInventory();
        
        // make a copy of orignalList
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
       // using a BubbleSort to sort the list of inventoryList by cost
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++) {
                if (inventoryList[j+1].getCost()< inventoryList[j].getCost()) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }    
        return inventoryList;
    }        
        //function to sort inventory by quantity in stock - Glen Sadler 
        public static InventoryItem[] getSortedInventoryListInStock() {
        
        InventoryItem[] originalInventoryList;
        originalInventoryList = OregonTrail.getCurrentGame().getInventory();
        
        // make a copy of orignalList
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
       // using a BubbleSort to sort the list of inventoryList by cost
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++) {
                if (inventoryList[j+1].getQuantityInStock()< inventoryList[j].getQuantityInStock()) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }    
        return inventoryList;
    }            
}
