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
public class Location implements Serializable{
    
    private Float coordin;
    private Float col;
    private Float row;
    private Float explo;
    private Memory memory;
    private Map map;

    public Location() {
    }

    public Float getCoordinates() {
        return coordin;
    }

    public void setCoordinates(Float coordinates) {
        this.coordin = coordin;
    }

    public Float getColumn() {
        return col;
    }

    public void setColumn(Float column) {
        this.col = col;
    }

    public Float getRow() {
        return row;
    }

    public void setRow(Float row) {
        this.row = row;
    }

    public Float getExploredArea() {
        return explo;
    }

    public void setExploredArea(Float exploredArea) {
        this.explo = explo;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.coordin);
        hash = 41 * hash + Objects.hashCode(this.col);
        hash = 41 * hash + Objects.hashCode(this.row);
        hash = 41 * hash + Objects.hashCode(this.explo);
        hash = 41 * hash + Objects.hashCode(this.memory);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.coordin, other.coordin)) {
            return false;
        }
        if (!Objects.equals(this.col, other.col)) {
            return false;
        }
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.explo, other.explo)) {
            return false;
        }
        if (!Objects.equals(this.memory, other.memory)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "coordinates=" + coordin + ", column=" + col + ", row=" + row + ", exploredArea=" + explo + ", memory=" + memory + '}';
    }
    
}
