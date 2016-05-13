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
public class Resource implements Serializable{
    
    private String typeResource;
    private int quantityStored;
    private String descriptionResource;
    private boolean availableResource;
    private BuilderResource builRes;
    private Memory memory;

    public Resource() {
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
      

    public String getTypeResource() {
        return typeResource;
    }

    public void setTypeResource(String typeResource) {
        this.typeResource = typeResource;
    }

    public int getQuantityStored() {
        return quantityStored;
    }

    public void setQuantityStored(int quantityStored) {
        this.quantityStored = quantityStored;
    }

    public String getDescriptionResource() {
        return descriptionResource;
    }

    public void setDescriptionResource(String descriptionResource) {
        this.descriptionResource = descriptionResource;
    }

    public boolean isAvailableResource() {
        return availableResource;
    }

    public void setAvailableResource(boolean availableResource) {
        this.availableResource = availableResource;
    }

    public BuilderResource getBuilRes() {
        return builRes;
    }

    public void setBuilRes(BuilderResource builRes) {
        this.builRes = builRes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.typeResource);
        hash = 17 * hash + this.quantityStored;
        hash = 17 * hash + Objects.hashCode(this.descriptionResource);
        hash = 17 * hash + (this.availableResource ? 1 : 0);
        hash = 17 * hash + Objects.hashCode(this.builRes);
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
        final Resource other = (Resource) obj;
        if (!Objects.equals(this.typeResource, other.typeResource)) {
            return false;
        }
        if (this.quantityStored != other.quantityStored) {
            return false;
        }
        if (!Objects.equals(this.descriptionResource, other.descriptionResource)) {
            return false;
        }
        if (this.availableResource != other.availableResource) {
            return false;
        }
        if (!Objects.equals(this.builRes, other.builRes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Resource{" + "typeResource=" + typeResource + ", quantityStored=" + quantityStored + ", descriptionResource=" + descriptionResource + ", availableResource=" + availableResource + ", builRes=" + builRes + '}';
    }    
    
}
