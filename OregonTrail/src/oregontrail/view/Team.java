/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;

import java.util.ArrayList;
import java.util.Objects;
import oregontrail.model.Game;

/**
 *
 * @author Fernando
 */
public class Team {
    private String location;
    private double budget;
    private Game game;
    private Wagon wagon;
    private ArrayList<Person> members = new ArrayList<>();

    public Team() {
    }

    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.location);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.budget) ^ (Double.doubleToLongBits(this.budget) >>> 32));
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
        final Team other = (Team) obj;
        if (Double.doubleToLongBits(this.budget) != Double.doubleToLongBits(other.budget)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Team{" + "location=" + location + ", budget=" + budget + '}';
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }  
}
