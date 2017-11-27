/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.view;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Fernando
 */
public class Person implements Serializable {
    private String name;
    private String profession;
    private String healthStatus;
    private Integer healthPerCent;
    private Team team;

    public Person() {
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public Integer getHealthPerCent() {
        return healthPerCent;
    }

    public void setHealthPerCent(Integer healthPerCent) {
        this.healthPerCent = healthPerCent;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.profession);
        hash = 79 * hash + Objects.hashCode(this.healthStatus);
        hash = 79 * hash + Objects.hashCode(this.healthPerCent);
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.profession, other.profession)) {
            return false;
        }
        if (!Objects.equals(this.healthStatus, other.healthStatus)) {
            return false;
        }
        if (!Objects.equals(this.healthPerCent, other.healthPerCent)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", profession=" + profession + ", healthStatus=" + healthStatus + ", healthPerCent=" + healthPerCent + '}';
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
    
    
    
}
