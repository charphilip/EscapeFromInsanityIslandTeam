/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapefrominsanityisland;

import byui.cit260.EscapeFromInsanityIsland.model.Action;
import byui.cit260.EscapeFromInsanityIsland.model.AirChallenge;
import byui.cit260.EscapeFromInsanityIsland.model.BuilderResource;
import byui.cit260.EscapeFromInsanityIsland.model.Challenge;
import byui.cit260.EscapeFromInsanityIsland.model.Character;
import byui.cit260.EscapeFromInsanityIsland.model.Game;
import byui.cit260.EscapeFromInsanityIsland.model.GroundChallenge;
import byui.cit260.EscapeFromInsanityIsland.model.Location;
import byui.cit260.EscapeFromInsanityIsland.model.Map;
import byui.cit260.EscapeFromInsanityIsland.model.Memory;
import byui.cit260.EscapeFromInsanityIsland.model.Opponent;
import byui.cit260.EscapeFromInsanityIsland.model.Player;
import byui.cit260.EscapeFromInsanityIsland.model.Resource;
import byui.cit260.EscapeFromInsanityIsland.model.Scene;
import byui.cit260.EscapeFromInsanityIsland.model.WaterChallenge;
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
        
//************************************************************************************************************************************************************
//Warllen test class start here
        
        Scanner input;  
        input = new Scanner(System.in);
        int option = 15;
        while(option != 0){
        
            System.out.println("--------------------------------------\nChoose one class to show the test\n--------------------------------------");
            System.out.println("1 Action");
            System.out.println("2 Challenge");
            System.out.println("3 GroundChallenge");
            System.out.println("4 AirChallenge");
            System.out.println("5 WaterChallenge");
            System.out.println("6 Scene");
            System.out.println("7 BuilderResouce");
            System.out.println("8 Game");
            System.out.println("9 Character");
            System.out.println("10 Location");
            System.out.println("11 Map");
            System.out.println("12 Memory");
            System.out.println("13 Opponents");
            System.out.println("14 Player");
            System.out.println("15 Resources");
            System.out.println("0 exit");
            System.out.println("\n Number:");


            option = input.nextInt();

            switch( option ){

                case 1:
                    //Testing class Action
                    Action act = new Action();
                    
                    //Testing Setters
                    
                    System.out.println("--------------------------------\n Testing the Class Action \n--------------------------------");
                    act.setName("Test setName 1");
                    act.setArrows("Test setArrows 1");
                    act.setAttack("Test setAttack 1");
                    act.setSpecialPowers("Test setSpecialPowers 1");

                    //Tesing getters
                    
                    System.out.println("Name: " + act.getName());
                    System.out.println("Arrows: " + act.getArrows());
                    System.out.println("Attack: " + act.getAttack());
                    System.out.println("Special Attack: " + act.getSpecialPowers());

                    //Testing toString
                    
                    System.out.println(act);

                    break;

                case 2:

                    //Testing class Challenge
                    Challenge challenge = new Challenge();
                    
                    //Testing Setters
                    
                    System.out.println("--------------------------------\n Testing the Class Challenge \n--------------------------------");
                    challenge.setDescription("Test SetDescription Challenge");
                    challenge.setDisplaySimbol("Test SetDisplaySimbol Challenge");
                    challenge.setResourcesGained("Test setResourceGained");

                    //Tesing getters
                    
                    System.out.println("Description: " + challenge.getDescription());
                    System.out.println("Display Simbol: " + challenge.getDisplaySimbol());
                    System.out.println("DResource gained Silbol: " + challenge.getResourcesGained());

                    //Testing toString
                    System.out.println(challenge);

                    break;
                    
                case 3:
                    
                    //Testing class GroundChallenge

                    GroundChallenge gChallenge = new GroundChallenge();
                    //Testing Setters
                    
                    System.out.println("--------------------------------\n Testing the Class GroundChallenge \n--------------------------------");
                    gChallenge.setName("Test setName AirChallenge");
                    gChallenge.setDescription("Test setDescriprion AirChallenge");
                    gChallenge.setDisplaySimbol("Test setDisplaySimbol AirChallenge");
                    gChallenge.setExperienceReceived("Test setExperienceReceived AirChallenge");
                    gChallenge.setPointsGaineds(10);
                    gChallenge.setProblem("Test setProblem AirChallenge");
                    gChallenge.setResourcesGained("Test setResouceGained AirChallenge");
                    gChallenge.setSolution("Test setSoulution AirChallenge");
                                       
                     //Tesing getters
                    
                    System.out.println("Name: " + gChallenge.getName());
                    System.out.println("Description: " + gChallenge.getDescription());
                    System.out.println("Display Simbol: " + gChallenge.getDisplaySimbol());
                    System.out.println("Experience Received: " + gChallenge.getExperienceReceived());
                    System.out.println("Points Gaineds: " + gChallenge.getPointsGaineds());
                    System.out.println("Problems: " + gChallenge.getProblem());
                    System.out.println("Resources Gained: " + gChallenge.getResourcesGained());
                    System.out.println("Solution: " + gChallenge.getSolution());
                    
                    //Testing toString
                    
                    System.out.println(gChallenge);

                    break;
                    
                case 4:
                    
                    //Testing class AirChallenge
                    AirChallenge airChallenge = new AirChallenge();
                    
                    //Testing Setters
                    
                    System.out.println("--------------------------------\n Testing the Class AirChallenge \n--------------------------------");
                    airChallenge.setName("Test setName AirChallenge");
                    airChallenge.setDescription("Test setDescriprion AirChallenge");
                    airChallenge.setDisplaySimbol("Test setDisplaySimbol AirChallenge");
                    airChallenge.setExperienceReceived("Test setExperienceReceived AirChallenge");
                    airChallenge.setPointsGaineds(10);
                    airChallenge.setProblem("Test setProblem AirChallenge");
                    airChallenge.setResourcesGained("Test setResouceGained AirChallenge");
                    airChallenge.setSolution("Test setSoulution AirChallenge");

                    //Tesing getters
                    
                    System.out.println("Name: " + airChallenge.getName());
                    System.out.println("Description: " + airChallenge.getDescription());
                    System.out.println("Display Simbol: " + airChallenge.getDisplaySimbol());
                    System.out.println("Experience Received: " + airChallenge.getExperienceReceived());
                    System.out.println("Points Gaineds: " + airChallenge.getPointsGaineds());
                    System.out.println("Problems: " + airChallenge.getProblem());
                    System.out.println("Resources Gained: " + airChallenge.getResourcesGained());
                    System.out.println("Solution: " + airChallenge.getSolution());

                    //Testing toString
                    System.out.println(airChallenge);
                    
                    break;
                    
                case 5:
                    
                    //Testing class WaterChallenge
                    WaterChallenge wChallenge = new WaterChallenge();
                  
                    //Testing Setters
                    
                    System.out.println("--------------------------------\n Testing the Class WaterChallenge \n--------------------------------");
                    wChallenge.setName("Test setName WaterChallenge");
                    wChallenge.setDescription("Test setDescriprion WaterChallenge");
                    wChallenge.setDisplaySimbol("Test setDisplaySimbol WaterChallenge");
                    wChallenge.setExperienceReceived("Test setExperienceReceived WaterChallenge");
                    wChallenge.setPointsGaineds(10);
                    wChallenge.setProblem("Test setProblem WaterChallenge");
                    wChallenge.setResourcesGained("Test setResouceGained WaterChallenge");
                    wChallenge.setSolution("Test setSoulution WaterChallenge");

                    //Tesing getters
                    
                    System.out.println("Name: " + wChallenge.getName());
                    System.out.println("Description: " + wChallenge.getDescription());
                    System.out.println("Display Simbol: " + wChallenge.getDisplaySimbol());
                    System.out.println("Experience Received: " + wChallenge.getExperienceReceived());
                    System.out.println("Points Gaineds: " + wChallenge.getPointsGaineds());
                    System.out.println("Problems: " + wChallenge.getProblem());
                    System.out.println("Resources Gained: " + wChallenge.getResourcesGained());
                    System.out.println("Solution: " + wChallenge.getSolution());

                    //Testing toString
                    System.out.println(wChallenge);
                    
                    break;
                    
                case 6:
                    
                     //Testing class Scene
                    Scene scene = new Scene();
                  
                    //Testing Setters
                    
                    System.out.println("--------------------------------\n Testing the Class Scene \n--------------------------------");
                    scene.setDescription("Test setDescription Scene");
                    scene.setParticipants("Test setPaticipants Scene");
                    scene.setPeriodTime("Test setPeriodeTime Scene");
                    
                    //Tesing getters
                    
                    System.out.println("Description: " + scene.getDescription());
                    System.out.println("Participants: " + scene.getParticipants());
                     System.out.println("Period TIme: " + scene.getPeriodTime());
                     
                    //Testing toString
                     
                    System.out.println(scene);
                   
                    break;
                    
                case 7:
                    
                     //Testing class BuilderResource
                    BuilderResource bResource = new BuilderResource();
                  
                    //Testing Setters
                    
                    System.out.println("--------------------------------\n Testing the Class BuilderResource \n--------------------------------");
                    bResource.setName("Test setName BuilderResource");
                    bResource.setDescriptionTool("Test setDescriptionTool BuilderResource");
                    bResource.setCharacteristicResource("test setCharacteristicResource BuilderResource");
                    bResource.setQuantityStored(50);
                    bResource.setResource(null);
                    
                    
                    
                    //Tesing getters
                    
                    System.out.println("Name: " + bResource.getName());
                    System.out.println("Description Tool: " + bResource.getDescriptionTool());
                    System.out.println("Characteristic Resource: " + bResource.getCharacteristicResource());
                    System.out.println("Quantity Stored: " + bResource.getQuantityStored());
                    System.out.println("Resource: " + bResource.getResource());
                    
                    //Testing toString
                     
                    System.out.println(bResource);
                    
                    break;

//Felipe & Warllen test class GAME
                    
                case 8:
                    
                    //Testing class Game
                    Game game = new Game();
                  
                    //Testing Setters
                    
                    System.out.println("--------------------------------\n Testing the Class Game \n--------------------------------");
                    game.setNoPeople(false);
                    game.setTotalTime("60");
                    
                    //Tesing getters
                    
                    System.out.println("No People: " + game.isNoPeople());
                    System.out.println("TOtal Time: " + game.getTotalTime());
                    
                    //Tesing toString
                    
                    System.out.println(game);
                    
                    break;
                    
                default:
                    
                    System.out.println("Type a value between 1 and 8 \n or zero to exitd"
                            + "");

            
//*************************************************************************************************************************************************************
    
//*************************************************************************************************
//Felipe test class Start here
        
       case 9:
                    
                //Testing class CHARACTER
                    Character principal = new Character();
                  
                //Testing Setters
                    
                    System.out.println("--------------------------------\n Testing Class CHARACTER\n--------------------------------");
                    principal.setName("Ethan");
                    principal.setDescription("Ethan will be the principal character in the Escape from Insanity Island game...");
                                     
                //Tesing getters
                    
                    System.out.println("Name: " + principal.getName());
                    System.out.println("Description: " + principal.getDescription());
                
                //Testing toString
                     
                    System.out.println(principal);
                    
                    break;
        
        case 10:
                    float coordin, col, row, explo;
                    coordin = (float) 4.730211;
                    col = (float) 20;
                    row = (float) 15;
                    explo = (float) 100;
                //Testing class LOCATION
                    
                    Location firstPlace = new Location();
                    
                //Testing Setters
                    
                    System.out.println("--------------------------------\n Testing Class LOCATION\n--------------------------------");
                    firstPlace.setCoordinates(coordin);
                    firstPlace.setColumn(col);
                    firstPlace.setRow(row);
                    firstPlace.setExploredArea(explo);
                    
                    
                //Tesing getters
                    
                    System.out.println("Coordinates: " + firstPlace.getCoordinates());
                    System.out.println("Column: " + firstPlace.getColumn());
                    System.out.println("Row: " + firstPlace.getRow());
                    System.out.println("Explored Area: " + firstPlace.getExploredArea());
                    System.out.println("Memory: " + firstPlace.getMemory());
                    System.out.println("Map: " + firstPlace.getMap());
                    
                //Testing toString
                     
                    System.out.println(firstPlace);
                    
                    break;
        
        case 11:
                    
                //Testing class MAP
                    
                    Map ubication = new Map();
                    
                //Testing Setters
                    
                    System.out.println("--------------------------------\n Testing Class MAP\n--------------------------------");
                    ubication.setColumnCount(30);
                    ubication.setRowCount(20);
                    
                //Tesing getters
                    
                    System.out.println("Column Count: " + ubication.getColumnCount());
                    System.out.println("Row Count: " + ubication.getRowCount());
                                        
                //Testing toString
                     
                    System.out.println(ubication);
                    
                    break;
                    
        case 12:
                    
                //Testing class MEMORY
                    
                    Memory brain = new Memory();
                    
                //Testing Setters
                    
                    System.out.println("--------------------------------\n Testing Class MEMORY\n--------------------------------");
                    brain.setProgress("Medium");
                    brain.setResourceSaved(5);
                    brain.setExperienceGained(20);
                    brain.setYearsRemembered(2);
                    
                //Tesing getters
                    
                    System.out.println("Progress: " + brain.getProgress());
                    System.out.println("Resource Saved: " + brain.getResourceSaved());
                    System.out.println("Experience Gained: " + brain.getExperienceGained());
                    System.out.println("Years Remembered: " + brain.getYearsRemembered());
                                        
                //Testing toString
                     
                    System.out.println(brain);
                    
                    break;
        
        case 13:
                    
                //Testing class OPPONENTS
                    
                    Opponent enemy = new Opponent();
                    
                //Testing Setters
                    
                    System.out.println("--------------------------------\n Testing Class OPPONENTS\n--------------------------------");
                    enemy.setName("Lion Beast");
                    enemy.setRole("The Lion needs to stop the player into the jungle...");
                    enemy.setScene("In the Jungle");
                    
                //Tesing getters
                    
                    System.out.println("Name: " + enemy.getName());
                    System.out.println("Role: " + enemy.getRole());
                    System.out.println("Scene: " + enemy.getScene());
                                                            
                //Testing toString
                     
                    System.out.println(enemy);
                    
                    break;
                    
        case 14:
                    
                //Testing class PLAYER
                    
                    Player endUser = new Player();
                    
                //Testing Setters
                    
                    System.out.println("--------------------------------\n Testing Class PLAYER\n--------------------------------");
                    endUser.setName("FELIPE");
                    endUser.setLevelPlayed(1);
                    endUser.setEmotion("Lost");
                    
                //Tesing getters
                    
                    System.out.println("Name: " + endUser.getName());
                    System.out.println("Level: " + endUser.getLevelPlayed());
                    System.out.println("Emotion: " + endUser.getEmotion());
                                                            
                //Testing toString
                     
                    System.out.println(endUser);
                    
                    break;
                    
        case 15:
                    
                //Testing class RESOURCE
                    
                    Resource tool = new Resource();
                    
                //Testing Setters
                    
                    System.out.println("--------------------------------\n Testing Class RESOURCE\n--------------------------------");
                    tool.setAvailableResource(true);
                    tool.setTypeResource("Ground");
                    tool.setQuantityStored(2);
                    tool.setDescriptionResource("This tool will be used only in the Ground Challenges. Its use is to till the land");
                    
                    
                //Tesing getters
                    
                    System.out.println("Type Resource: " + tool.getTypeResource());
                    System.out.println("Quantity Stored: " + tool.getQuantityStored());
                    System.out.println("Description: " + tool.getDescriptionResource());
                    System.out.println("");
                                                            
                //Testing toString
                     
                    System.out.println(tool);
                    
                    break;
                    
                
                
//**************************************************************************************************
            }
        }
    }
    
}
