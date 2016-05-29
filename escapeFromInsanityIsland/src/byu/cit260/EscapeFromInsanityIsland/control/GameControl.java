/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.EscapeFromInsanityIsland.control;

import byui.cit260.EscapeFromInsanityIsland.model.Player;
import byui.cit260.EscapeFromInsanityIsland.model.Character;
import byui.cit260.EscapeFromInsanityIsland.model.Location;
import byui.cit260.EscapeFromInsanityIsland.model.Map;
import byui.cit260.EscapeFromInsanityIsland.model.Memory;

/**
 *
 * @author warllen
 */
public class GameControl {
    
    public void startGame(){
    
           
    
    }
    
    public void initializeMap(Map map, Location location, Memory memory){
    
       Map map1 = new Map();
       
       Location location1 = new Location();
       
        if (location.equals(location1) && (map.equals(map1))){
        
            location1.getColumn();
            location1.getRow();
            
            map1.getColumnCount();
            map1.getRowCount();
                    
        
        }
        
       
       location1 = location;
       
        System.out.println("Map starting");
       
    
    }
    
    public String saveGame(String player){
        
        Memory memory1 = new Memory();
        
        memory1.setProgress(player);
        
        return "Game saved ";
    }
    
    public String retrieveGame(String Player){return "";}
    
    public String createNewPlayer(Player player, Character character){
        
        Player newPlayer1 = new Player();
        
            newPlayer1.setName(player.getName());
            newPlayer1.setEmotion(player.getEmotion());
            newPlayer1.setLevelPlayed(player.getLevelPlayed());
            
            Character character1 = new Character();
            
            character1.setName(player.getName());
            character1.setDescription(character.getDescription());
                    
            
            
            
            return "The character was created with success!";
    }
    
        
    public void defineLevel(Player player){}
    
    public String uploadGame(Player player){return "";}
    
    public String deleteGame(Player player){return "";}
    
}
