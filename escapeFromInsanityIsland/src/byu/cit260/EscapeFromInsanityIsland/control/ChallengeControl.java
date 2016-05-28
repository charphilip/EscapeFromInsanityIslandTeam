/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.EscapeFromInsanityIsland.control;

import byui.cit260.EscapeFromInsanityIsland.model.Challenge;

/**
 *
 * @author warllen
 */
public class ChallengeControl {
    
    public double countPointGained(double point, Challenge challenge){
        
        challenge.getDescription();
        
        return 0;
    
    }
        
    public void resetChallenge(Challenge challenge){
    if (challenge.getDescription() == "Air Challenge"){
        System.out.println ("The challenge has been rest");
        }
        else {System.out.println ("The challenge has not been rest"); }
         }
    
    
    public void startChallenge(Challenge challenge){
        if (challenge.getDescription() == "Air Challenge"){
        System.out.println ("The challenge was saved");
        }
        else {System.out.println ("The tool wasn't saved"); }
         }
    
    public void saveChallenge(Challenge challenge){
        if (challenge.getDescription() == "Air Challenge"){
           System.out.println ("The challenge was saved");
        }
            else{
        
            System.out.println ("The challenge wasn't saved");
            
        }     
    
    }
    
}
