/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import oregontrail.control.GameControl;

/**
 *
 * @author adm-achina
 */
public class ChooseMonthView extends View{

    public ChooseMonthView(){
        super( "\n"
            + "\n===============Oregon Trail Game================="
            + "\n  It is 1848.                                    "
            + "\n  Decide which month to leave Independence.      "
            + "\n  Choose Your Month                              "
            + "\n                                                 "
            + "\n  1 - March                                      "
            + "\n  2 - April                                      "
            + "\n  3 - May                                        "
            + "\n  4 - June                                       "
            + "\n  5 - July                                       "
            + "\n  6 - Ask For Advice                             "
            + "\n  X - Exit                                       "
            + "\n================================================="
            ,"\nPlease enter your choice: ");

    } 
    
    @Override
    public void display(){  

        boolean done = false; // set flag to not done
        do{                
            // prompt for and get menu option
            String value = this.getInput();
            if(value.toUpperCase().equals("X"))// user wants to exit view                
            // do the requested action and display the next view
                return; // exit view
            done = this.doAction(value);        
        } while(!done);
    }
    
    @Override
    public boolean doAction(String menu) {
        menu = menu.toUpperCase(); // convert choice to upper cas
        
        switch (menu) {
            case "1": //Select March
                GameControl.setStartMonth("March");
                this.monthStartGame();
                break;
            case "2": //Select April
                GameControl.setStartMonth("April");
                this.monthStartGame();
                break;
            case "3": //Select May
                GameControl.setStartMonth("May");
                this.monthStartGame();
                break;
            case "4": //Select June
                GameControl.setStartMonth("June");
                this.monthStartGame();
                break;
            case "5": //Select July
                GameControl.setStartMonth("July");
                this.monthStartGame();
                break;
            case "6": //Go to the advice information page
                this.askAdvice();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
       
    private void monthStartGame(){
        StartMonthView startMonth = new StartMonthView();
        startMonth.display();
    }

    private void askAdvice() {
        QuestionView askForAdvice = new QuestionView();
        askForAdvice.display();
    }
}