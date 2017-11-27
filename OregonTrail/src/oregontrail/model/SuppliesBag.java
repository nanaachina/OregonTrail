/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author glauc
 */
public class SuppliesBag implements Serializable {
    private ArrayList<Supply> supplyItens;
    private int allowedQuantity;
    
    public SuppliesBag() {
        this.supplyItens = new ArrayList<Supply>();
    }    
    
    public ArrayList<Supply> getSupplyItens() {
        return supplyItens;
    }

    public void setSupplyItens(ArrayList<Supply> supplyItens) {
        this.supplyItens = supplyItens;
    }
    
    public void addSupplyItem(Supply item){
        if(supplyItens.size() <= this.allowedQuantity)
        supplyItens.add(item);
    }

    public int getAllowedQuantity() {
        return allowedQuantity;
    }

    public void setAllowedQuantity(int allowedQuantity) {
        this.allowedQuantity = allowedQuantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.supplyItens);
        hash = 17 * hash + this.allowedQuantity;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SuppliesBag other = (SuppliesBag) obj;
        if (this.allowedQuantity != other.allowedQuantity) {
            return false;
        }
        if (!Objects.equals(this.supplyItens, other.supplyItens)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SuppliesBag{" + "supplyItens=" + supplyItens + ", allowedQuantity=" + allowedQuantity + '}';
    }
    
    
}
