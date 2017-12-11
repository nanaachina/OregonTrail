/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

/**
 *
 * @author glauc
 */
public interface IStore {

    void buySupplies(int total);
    void addSupplies(String name);
    void returnSupplies(String name);
    int getTotal();
    int setTotal(int total);          
}
