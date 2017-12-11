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
public class StartMonthView extends MenuView{

    public StartMonthView() {
        super("\n"
        + "\n===============Oregon Trail Game================="
        + "\n                                                 "
        + "\n     You have chosen to leave in "+ GameControl.getStartMonth()+""
        + "\n                                                 "
        + "\n    Before leaving your current location,        "
        + "\n    first you should step by Glen´s store        "
        + "\n    and buy supplies for your journey            "
        + "\n    right now you have $"+ GameControl.getFundAmount()+"                                    "
        + "\n                      ***                        "
        + "\n                 Use it wisely.                  "
        + "\n                                                 "
        + "\n================================================="
        ,"Please press 'C' to continue:  ");
    }

    @Override
    public void display(){              
        // prompt for and get menu option
        String value = this.getInput();
        if(value.toUpperCase().equals("C"))// user wants to exit view                
        // do the requested action and display the next view
        this.doAction(value);        
    }
    
    @Override
    public boolean doAction(String value) {  
        
        //Create StoreMenuView Object
        StoreView store = new StoreView();
        
        //Display the StoreMenuView
        store.displayStorePage();
        
        return false;        

    }         
}