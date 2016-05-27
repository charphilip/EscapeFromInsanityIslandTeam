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
    
    private Float coordinates;
    private Float column;
    private Float row;
    private Float exploredArea;
    private Memory memory;
    private Map map;

    public Location() {
    }

    public Float getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Float coordinates) {
        this.coordinates = coordinates;
    }

    public Float getColumn() {
        return column;
    }

    public void setColumn(Float column) {
        this.column = column;
    }

    public Float getRow() {
        return row;
    }

    public void setRow(Float row) {
        this.row = row;
    }

    public Float getExploredArea() {
        return exploredArea;
    }

    public void setExploredArea(Float exploredArea) {
        this.exploredArea = exploredArea;
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
        hash = 41 * hash + Objects.hashCode(this.coordinates);
        hash = 41 * hash + Objects.hashCode(this.column);
        hash = 41 * hash + Objects.hashCode(this.row);
        hash = 41 * hash + Objects.hashCode(this.exploredArea);
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
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.exploredArea, other.exploredArea)) {
            return false;
        }
        if (!Objects.equals(this.memory, other.memory)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "coordinates=" + coordinates + ", column=" + column + ", row=" + row + ", exploredArea=" + exploredArea + ", memory=" + memory + '}';
    }
    
}
