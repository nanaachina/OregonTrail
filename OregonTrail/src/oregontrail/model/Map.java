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
public class Map implements Serializable{
    private String description;
    private int rowCount;
    private String cityName;
    private int columnCount;
    private String currentCity;
    private String wearther;
    private ArrayList<Game> games = new ArrayList<>();
    
    public Map(){
        
    }

    public Map(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    public String getWearther() {
        return wearther;
    }

    public void setWearther(String wearther) {
        this.wearther = wearther;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }
    private String weather;
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

 
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + this.rowCount;
        hash = 37 * hash + Objects.hashCode(this.cityName);
        hash = 37 * hash + this.columnCount;
        hash = 37 * hash + Objects.hashCode(this.wearther);
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.cityName, other.cityName)) {
            return false;
        }
        if (!Objects.equals(this.wearther, other.wearther)) {
            return false;
        }
        return true;
    }
    
        @Override
    public String toString() {
        return "Map{" + "description=" + this.description + ", rowCount=" + this.rowCount + ", cityName=" + this.cityName + ", columnCount=" + this.columnCount + ", currentCity=" + this.currentCity + ", wearther=" + this.wearther + " }";
    }

    public Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
