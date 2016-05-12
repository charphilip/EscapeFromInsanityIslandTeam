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
public class GroundChallenges extends Challenges implements Serializable{
    
    
    private int poinGaineds;
    private String experienceReceived;
    private String name;
    private String problem;
    private String solution;

    public GroundChallenges() {
    }

    public int getPoinGaineds() {
        return poinGaineds;
    }

    public void setPoinGaineds(int poinGaineds) {
        this.poinGaineds = poinGaineds;
    }

    public String getExperienceReceived() {
        return experienceReceived;
    }

    public void setExperienceReceived(String experienceReceived) {
        this.experienceReceived = experienceReceived;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.poinGaineds;
        hash = 67 * hash + Objects.hashCode(this.experienceReceived);
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.problem);
        hash = 67 * hash + Objects.hashCode(this.solution);
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
        final GroundChallenges other = (GroundChallenges) obj;
        if (this.poinGaineds != other.poinGaineds) {
            return false;
        }
        if (!Objects.equals(this.experienceReceived, other.experienceReceived)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.problem, other.problem)) {
            return false;
        }
        if (!Objects.equals(this.solution, other.solution)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GroundChallenges{" + "poinGaineds=" + poinGaineds + ", experienceReceived=" + experienceReceived + ", name=" + name + ", problem=" + problem + ", solution=" + solution + '}';
    }
    
}
