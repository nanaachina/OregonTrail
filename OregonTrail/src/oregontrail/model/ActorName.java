/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.model;

import oregontrail.control.GameControl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author adm-achina
 */
public class ActorName {
    //private static List<Actor> actors = new ArrayList<>();
    public static void main(String [] args){
        getActorNamesFromUser();
        printActors();
    }

    private static void getActorNamesFromUser() {
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0;  i < 5; i++){
            System.out.print("Please enter actor " + (i + 1) + ": ");
            String actorName = keyboard.nextLine();
            Actor actorOne = new Actor();
            actorOne.setName(actorName);
            
        }
    }

    private static void printActors() {
        
    }
}
