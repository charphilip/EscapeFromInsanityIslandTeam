/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.EscapeFromInsanityIsland.control;

import byui.cit260.EscapeFromInsanityIsland.model.Action;
import byui.cit260.EscapeFromInsanityIsland.model.Memory;
import byui.cit260.EscapeFromInsanityIsland.model.Opponent;
import byui.cit260.EscapeFromInsanityIsland.model.Player;
import byui.cit260.EscapeFromInsanityIsland.model.Scene;

/**
 *
 * @author warllen
 */
public class MapControl {
    
    public void movePlayer(String player, String location){}
    
    public boolean validLocation(String player, String location){return false;}
    
    public boolean validScene(String player, String scene){return false;}
    
    public void setScene(String Scene, Memory memory){}
    
    public double getRoleOpponent(Scene scene, Memory memory, Opponent opponnent){return 0;}
    
    public double calcTime(Scene scene, Memory memory){return 0;}
    
    public String validateDirectionMovement(Player player, Action action){return "";}
    
    public String calcMaxQuantitySteps(){return "";}
    
}
