/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.GameControl;
import java.util.Scanner;
import oregontrail.view.Player;


/**
 *
 * @author Fernando
 */
public class StartProgramView {
    
    private String promptMessage;
    
    
    public StartProgramView() {

            this.promptMessage = "\nPlease enter your name:";
            this.displayBanner();

    }

    private void displayBanner() {
        System.out.println("\n**********************************************************"
                + "\n"
                + "\n* This is a Oregon Trail Game Version"
                + "\n* In this game you will experice the life"
                + "\n* of a Pionner crossing the country to from"
                + "\n* Independence Missuri to Oregon State."
                + "\n*"
                + "\n* You will have plan your trip by choosing"
                + "\n* when to start your journey, the kind and"
                + "\n* amount of supplies to carry for your trip, etc."
                + "\n*"
                + "\n* During your trip you will face bad weather"
                + "\n* sickness and even death. You will need to take smart"
                + "\n* choices in order to finish your journey safetly. "
                + "\n*"
                + "\n* Good luck!"
                + "\n*"
                + "\n* -Oregon Coders"
                + "\n*"
                + "\n**********************************************************");
    }

    public void displayStartProgramView() {
       boolean done = false;
       
       do {
           String playerName = this.getPlayerName();
           if (playerName.toUpperCase().equals("Q")) 
               return;
               
               done = this.doAction(playerName);
           
      } while (!done);
           
       }

    private String getPlayerName() {
        // Responsive for getting the User name, evaluated and returned.
       Scanner keyboard = new Scanner(System.in);
       String value = "";
       boolean valid = false;
       
       while(!valid) {
           System.out.println("\n" + this.promptMessage);
           
           value = keyboard.nextLine();
           value = value.trim();
           
           if(value.length() < 1) {
               System.out.println("\nInvalid value: The value cannot be blank");
               continue;
           }
           
           break;
       }
       
       return value;
    }

    private boolean doAction(String playerName) {
        //Responsive of show the Welcome Message and Main Menu.
        if (playerName.length() < 2) {
            System.out.println("\n Invalid Name: The player name must be greater than one character in lenght");
            return false;
        }
        
        Player player = GameControl.createPlayer(playerName);
        
        if (player == null) {
            System.out.println("\nError creating the player");
            return false;
        }
        
        this.displayNextView();
        
        return true;
    }

    private void displayNextView() {
       System.out.println("DisplayNextView Function Called");
    }
    
}
