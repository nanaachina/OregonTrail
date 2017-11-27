/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Fernando
 */
public class StoreControl {
    
    public static double getTotalAmount(double price, int quantity) {
        
        double totalAmount;
        
        if (price < 0) {
            return -60.0;
        } else if (quantity < 0) {
            return -60.0;
        } else {
            totalAmount = price * quantity;
        }
        
        return totalAmount;
    }
    
    public static double getRemainChash(double totalAmount, double cash) {
        double remainCash;
        
        if (totalAmount > cash) {
            return -100.0;
        } 
        if (totalAmount < 0) {
            return -100;
        } 
        if (cash < 0) {
            return -100.0;
        } else {
            remainCash = cash - totalAmount;
        }
        
        return remainCash;
    }
}
