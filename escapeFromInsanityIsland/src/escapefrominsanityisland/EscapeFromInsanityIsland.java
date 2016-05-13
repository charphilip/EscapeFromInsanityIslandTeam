/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapefrominsanityisland;

import byui.cit260.EscapeFromInsanityIsland.model.Action;
import byui.cit260.EscapeFromInsanityIsland.model.Game;
import byui.cit260.EscapeFromInsanityIsland.model.GroundChallenge;
import byui.cit260.EscapeFromInsanityIsland.model.Memory;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 *
 * @author FELIPE and WARLLEN
 */
public class EscapeFromInsanityIsland {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
    //*************************************************************************************************
        //Warllen test class
        
        Scanner input;  
        input = new Scanner(System.in);
        int option;
        
        System.out.println("Choose one class to show the text");
        System.out.println("1 Action");
        System.out.println("2 Challenge");
        System.out.println("3 GroundChallenge");
        System.out.println("4 AirChallenge");
        System.out.println("5 WaterChallenge");
        System.out.println("6 Scene");
        System.out.println("7 BuilderResouce");
        System.out.println("8 Game");
        System.out.println("0 exit");
               
        option = input.nextInt();
        
        switch( option ){
            
            case 1:
                //Test class Action
                
                Action act = new Action();
                //Setters
                act.setName("Test setName 1");
                act.setArrows("Test setArrows 1");
                act.setAttack("Test setAttack 1");
                act.setSpecialPowers("Test setSpecialPowers 1");
                
                //gets
                System.out.println("Name: " + act.getName());
                System.out.println("Arrows: " + act.getArrows());
                System.out.println("Attack: " + act.getAttack());
                System.out.println("Special Attack: " + act.getSpecialPowers());
                System.out.println(act.getName().length());
                
                //hashCode
            
                
                        
                
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            default:
        
        }
        

        
    //**************************************************************************************************
    
     //*************************************************************************************************
        //Felipe test class
        
       
                
    //**************************************************************************************************
       
    }
    
}
