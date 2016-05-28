/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EscapeFromInsanityIsland.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author warllen
 */
public class Challenge implements Serializable{

     
    private String description;
    private boolean resourcesGained;
    private int quantityResourceGained;
    private  double countPointGained;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isResourcesGained() {
        return resourcesGained;
    }

    public void setResourcesGained(boolean resourcesGained) {
        this.resourcesGained = resourcesGained;
    }

    public int getQuantityResourceGained() {
        return quantityResourceGained;
    }

    public void setQuantityResourceGained(int quantityResourceGained) {
        this.quantityResourceGained = quantityResourceGained;
    }

    public double getCountPointGained() {
        return countPointGained;
    }

    public void setCountPointGained(double countPointGained) {
        this.countPointGained = countPointGained;
    }
    
    

    public Challenge() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + (this.resourcesGained ? 1 : 0);
        hash = 71 * hash + this.quantityResourceGained;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.countPointGained) ^ (Double.doubleToLongBits(this.countPointGained) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Challenge{" + "description=" + description + ", resourcesGained=" + resourcesGained + ", quantityResourceGained=" + quantityResourceGained + ", countPointGained=" + countPointGained + '}';
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
        final Challenge other = (Challenge) obj;
        if (this.resourcesGained != other.resourcesGained) {
            return false;
        }
        if (this.quantityResourceGained != other.quantityResourceGained) {
            return false;
        }
        if (Double.doubleToLongBits(this.countPointGained) != Double.doubleToLongBits(other.countPointGained)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    

    
    
    
}