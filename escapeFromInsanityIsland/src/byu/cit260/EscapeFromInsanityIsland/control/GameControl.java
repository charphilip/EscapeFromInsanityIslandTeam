/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.EscapeFromInsanityIsland.control;

import byui.cit260.EscapeFromInsanityIsland.model.Player;
import byui.cit260.EscapeFromInsanityIsland.model.Character;

/**
 *
 * @author warllen
 */
public class GameControl {
    
    public void startGame(){
    
           
    
    }
    
    public void initializeMap(String map, String location){}
    
    public String saveGame(String player){return "";}
    
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
