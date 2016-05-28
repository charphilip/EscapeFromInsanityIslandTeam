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
 * @author FELIPE
 */
public class Memory implements Serializable{
    
    //Class instance variables 
    private String progress;
    private int resourceSaved;
    private int experienceGained;
    private int yearsRemembered; 
    private String toolSaved;
    private boolean availableResourceSaved;

    public Memory() {
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public int getResourceSaved() {
        return resourceSaved;
    }

    public void setResourceSaved(int resourceSaved) {
        this.resourceSaved = resourceSaved;
    }

    public int getExperienceGained() {
        return experienceGained;
    }

    public void setExperienceGained(int experienceGained) {
        this.experienceGained = experienceGained;
    }

    public int getYearsRemembered() {
        return yearsRemembered;
    }

    public void setYearsRemembered(int yearsRemembered) {
        this.yearsRemembered = yearsRemembered;
    }

    public String getToolSaved() {
        return toolSaved;
    }

    public void setToolSaved(String toolSaved) {
        this.toolSaved = toolSaved;
    }

    public boolean isAvailableResourceSaved() {
        return availableResourceSaved;
    }

    public void setAvailableResourceSaved(boolean availableResourceSaved) {
        this.availableResourceSaved = availableResourceSaved;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.progress);
        hash = 89 * hash + this.resourceSaved;
        hash = 89 * hash + this.experienceGained;
        hash = 89 * hash + this.yearsRemembered;
        hash = 89 * hash + Objects.hashCode(this.toolSaved);
        hash = 89 * hash + (this.availableResourceSaved ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Memory{" + "progress=" + progress + ", resourceSaved=" + resourceSaved + ", experienceGained=" + experienceGained + ", yearsRemembered=" + yearsRemembered + ", toolSaved=" + toolSaved + ", availableResourceSaved=" + availableResourceSaved + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Memory other = (Memory) obj;
        if (!Objects.equals(this.progress, other.progress)) {
            return false;
        }
        if (this.resourceSaved != other.resourceSaved) {
            return false;
        }
        if (this.experienceGained != other.experienceGained) {
            return false;
        }
        if (this.yearsRemembered != other.yearsRemembered) {
            return false;
        }
        if (!Objects.equals(this.toolSaved, other.toolSaved)) {
            return false;
        }
        if (this.availableResourceSaved != other.availableResourceSaved) {
            return false;
        }
        return true;
    }

    
    
    
    
}
