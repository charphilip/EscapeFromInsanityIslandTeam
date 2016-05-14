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
public class Action implements Serializable{
    private String name;
    private String arrows;
    private String specialPowers;
    private String attack;

    public Action() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArrows() {
        return arrows;
    }

    public void setArrows(String arrows) {
        this.arrows = arrows;
    }

    public String getSpecialPowers() {
        return specialPowers;
    }

    public void setSpecialPowers(String specialPowers) {
        this.specialPowers = specialPowers;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.arrows);
        hash = 83 * hash + Objects.hashCode(this.specialPowers);
        hash = 83 * hash + Objects.hashCode(this.attack);
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
        final Action other = (Action) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.arrows, other.arrows)) {
            return false;
        }
        if (!Objects.equals(this.specialPowers, other.specialPowers)) {
            return false;
        }
        if (!Objects.equals(this.attack, other.attack)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Action{" + "name=" + name + ", arrows=" + arrows + ", specialPowers=" + specialPowers + ", attack=" + attack + '}';
    }
    
    
}
