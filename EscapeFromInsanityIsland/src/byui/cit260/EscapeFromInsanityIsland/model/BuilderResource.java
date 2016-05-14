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
 * @author Warllen
 */
public class BuilderResource implements Serializable{
    
    private String name;    
    private int quantityStored;
    private String descriptionTool;
    private String characteristicResource;
    private Resource resource;

    public BuilderResource() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityStored() {
        return quantityStored;
    }

    public void setQuantityStored(int quantityStored) {
        this.quantityStored = quantityStored;
    }

    public String getDescriptionTool() {
        return descriptionTool;
    }

    public void setDescriptionTool(String descriptionTool) {
        this.descriptionTool = descriptionTool;
    }

    public String getCharacteristicResource() {
        return characteristicResource;
    }

    public void setCharacteristicResource(String characteristicResource) {
        this.characteristicResource = characteristicResource;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.quantityStored;
        hash = 89 * hash + Objects.hashCode(this.descriptionTool);
        hash = 89 * hash + Objects.hashCode(this.characteristicResource);
        hash = 89 * hash + Objects.hashCode(this.resource);
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
        final BuilderResource other = (BuilderResource) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.quantityStored != other.quantityStored) {
            return false;
        }
        if (!Objects.equals(this.descriptionTool, other.descriptionTool)) {
            return false;
        }
        if (!Objects.equals(this.characteristicResource, other.characteristicResource)) {
            return false;
        }
        if (!Objects.equals(this.resource, other.resource)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BuilderResource{" + "name=" + name + ", quantityStored=" + quantityStored + ", descriptionTool=" + descriptionTool + ", characteristicResource=" + characteristicResource + ", resource=" + resource + '}';
    }
       
}
