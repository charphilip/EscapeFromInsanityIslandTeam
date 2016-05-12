/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapefrominsanityisland;

import byui.cit260.EscapeFromInsanityIsland.model.Game;
import byui.cit260.EscapeFromInsanityIsland.model.GroundChallenge;

/**
 *
 * @author FELIPE
 */
public class EscapeFromInsanityIsland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Game game1 = new Game();
       
       //Calling of function test
       game1.setTotalTime("11:00");
       game1.setNoPeople(true);
       
        GroundChallenge gc = new GroundChallenge();
        gc.setDescription("Warllen Almas");
        System.out.println(game1.getTotalTime() + "\n" + game1.isNoPeople() + "\n" + gc.getDescription());
    }
    
}
