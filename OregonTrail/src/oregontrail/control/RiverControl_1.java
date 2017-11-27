/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Fernando
 */
public class RiverControl {
    
    //Initializing Timer
   int seconds = 0;
        Timer riverTimer = new Timer();
        TimerTask riverTask = new TimerTask() {
            public void run() {
                seconds++;
                System.out.println(seconds);
            }
        };

        
    public String crossRiver(String wagonStatus) {
       
    
        riverTimer.scheduleAtFixedRate(riverTask, 1000, 1000);
        int keyPressed = 0;
        

        for(int i = 0; i < seconds; i++) {
           if(seconds == 20) {
               if (keyPressed >= 40) {
               System.out.println("You have crossed the river successfuly");
           } else {
                  System.out.println("You have crossed the river but your wagon has been damadge");
                  wagonStatus = "Damage";
              }
        }

       }
        return wagonStatus;
    }

    void crossRiver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
