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
public class BuilderResources extends Resources implements Serializable{
    
    private String nameTool;
    private int quantityStore;
    private String descriptionTool;
    private String characteristicResource;

    public BuilderResources() {
    }

    public String getNameTool() {
        return nameTool;
    }

    public void setNameTool(String nameTool) {
        this.nameTool = nameTool;
    }

    public int getQuantityStore() {
        return quantityStore;
    }

    public void setQuantityStore(int quantityStore) {
        this.quantityStore = quantityStore;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nameTool);
        hash = 31 * hash + this.quantityStore;
        hash = 31 * hash + Objects.hashCode(this.descriptionTool);
        hash = 31 * hash + Objects.hashCode(this.characteristicResource);
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
        final BuilderResources other = (BuilderResources) obj;
        if (!Objects.equals(this.nameTool, other.nameTool)) {
            return false;
        }
        if (this.quantityStore != other.quantityStore) {
            return false;
        }
        if (!Objects.equals(this.descriptionTool, other.descriptionTool)) {
            return false;
        }
        if (!Objects.equals(this.characteristicResource, other.characteristicResource)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BuilderResources{" + "nameTool=" + nameTool + ", quantityStore=" + quantityStore + ", descriptionTool=" + descriptionTool + ", characteristicResource=" + characteristicResource + '}';
    }
       
}
