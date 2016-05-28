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
    private String resourcesGained;
    

    public Challenge() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResourcesGained() {
        return resourcesGained;
    }

    public void setResourcesGained(String resourcesGained) {
        this.resourcesGained = resourcesGained;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + Objects.hashCode(this.resourcesGained);
        
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Challenge other = (Challenge) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.resourcesGained, other.resourcesGained)) {
            return false;
        
        }
        return true;
    }

    @Override
    public String toString() {
        return "Challenges{" + "description=" + description + ", resourcesGained=" + resourcesGained  + '}';
    }    
    
}