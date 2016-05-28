/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.EscapeFromInsanityIsland.control;

import byui.cit260.EscapeFromInsanityIsland.model.Memory;
import byui.cit260.EscapeFromInsanityIsland.model.BuilderResource;
import byui.cit260.EscapeFromInsanityIsland.model.Resource;
import byui.cit260.EscapeFromInsanityIsland.model.Challenge;

/**
 *
 * @author Felipe
 */
public class ResourceControl {
    
    
    public boolean checkAvailableResource(Resource resource, Memory memory){
                    
        if ((resource.isAvailableResource()) && (memory.isAvailableResourceSaved()) ){
            return true;
              
        }else{
            return false;
        }
    }
    public void createTool(Resource resource, BuilderResource builderResource, Memory memory){
    
        
        
    }
    
    public void selectResource(Resource resource){
        if ((resource.getQuantityStored() >= 1 && resource.getTypeResource()== "Ship") || (resource.getQuantityStored() >= 1 && resource.getTypeResource()== "Sword") || (resource.getQuantityStored() >= 1 && resource.getTypeResource()== "Arrows")){
        System.out.println ("Select the Resource");
        }
        else{System.out.println ("You cannot select the Resource");
        }
        }
    
    public void deleteResource(Resource resource, Memory memory){
        if ((resource.getQuantityStored()>= 1 &&resource.getTypeResource()== "Ship") || (resource.getQuantityStored() >= 1 && resource.getTypeResource()== "Sword") || (resource.getQuantityStored() >= 1 && resource.getTypeResource()== "Arrows")){
        System.out.println ("The resource was deleted");
        }
        else {System.out.println ("The resource was not deleted");
        }
        }
    
    public double setSizeTool(String builderResource){return 0;}
    
    public double calcQuantityRawMaterial(String sizeTool, int quantityToolToCreate, boolean resourcesGained){
        if (sizeTool == "Big" && quantityToolToCreate == 1 && resourcesGained == true){
            System.out.println ("Wood 30 pieces && Iron 50 pieces && Nails 10 pieces && Rope 10 pieces");
            return -1;
            else if (sizeTool != "Big" && quantityToolToCreate == 1 && resourcesGained == true){
            System.out.println ("The size is invalid");
            return -1;}
            else if (sizeTool == "Big" && quantityToolToCreate != 1 && resourcesGained == true){
            System.out.println ("The quantity of created tool must be one");
            return-1;}
            else if (sizeTool == "Big" && quantityToolToCreate == 1 && resourcesGained == false){
            System.out.println ("The end user cannot create any tool without ResourceGained");
            return-1;}}
        if (sizeTool == "Medium" && quantityToolToCreate == 1 && resourcesGained == true){
            System.out.println ("Wood 40 pieces && Iron 30 pieces && Nails 15 pieces && Rope 15 pieces");
            return -1;
            else if (sizeTool != "Medium" && quantityToolToCreate == 1 && resourcesGained == true){
            System.out.println ("The size is invalid");
            return -1;}
            else if (sizeTool == "Medium" && quantityToolToCreate != 1 && resourcesGained == true){
            System.out.println ("The quantity of created tool must be one");
            return-1;}
            else if (sizeTool == "Medium" && quantityToolToCreate == 1 && resourcesGained == false){
            System.out.println ("The end user cannot create any tool without ResourceGained");
            return-1;}}
        if (sizeTool == "Small" && quantityToolToCreate == 1 && resourcesGained == true){
            System.out.println ("Wood 50 pieces && Iron 10 pieces && Nails 20 pieces && Rope 20 pieces");
            return -1;
            else if (sizeTool != "Small" && quantityToolToCreate == 1 && resourcesGained == true){
            System.out.println ("The size is invalid");
            return -1;}
            else if (sizeTool == "Small" && quantityToolToCreate != 1 && resourcesGained == true){
            System.out.println ("The quantity of created tool must be one");
            return-1;}
            else if (sizeTool == "Small" && quantityToolToCreate == 1 && resourcesGained == false){
            System.out.println ("The end user cannot create any tool without ResourceGained");
            return-1;}}
        }
        
    public String calcQuantityTool(String quantityStored, boolean resourcesGained, String typeResource){
        
        if (resourcesGained){
            
                if ((typeResource == "Ground Tool" || typeResource == "Air Tool" || typeResource == "Water Tool") && (quantityStored == "W10" && quantityStored == "N5" && quantityStored == "R2" && quantityStored == "I10")){
                System.out.println("You has created a tool!");
                return -1;
                else if ((typeResource != "Ground Tool" || typeResource != "Air Tool" || typeResource !="Water Tool") && (quantityStored == "W10" && quantityStored == "N5" && quantityStored == "R2" && quantityStored == "I10")){
                System.out.println ("The type of resource is invalid!");
                return -1;}
                else if ((typeResource != "Ground Tool" || typeResource != "Air Tool" || typeResource !="Water Tool") && (quantityStored != "W10" && quantityStored != "N5" && quantityStored != "R2" && quantityStored != "I10")){
                System.out.println ("The type of resource is invalid!");
                return -1;}}
        else {
            System.out.println ("The rule is that you need to have resources gained");}}
    }
        
    public boolean checkEnoughResourceGained(Challenge challenge){
        
        if (challenge.getQuantityResourceGained() <= 1){
            return true;
            
        }else{
            return false;
          }
    }
    
    public void saveTool(Memory memory){
        
        if (memory.getToolSaved() == "Hammer"){
           System.out.println ("The tool was saved");
        }
            else{
        
            System.out.println ("The tool wasn't saved");
            
        }     
    }
    
    public void deleteTool ( Memory memory){
        
        if(memory.getToolSaved() == "Hammer"){
         
                    System.out.println ("The tool was deleted");
        }else{
        
            System.out.println ("The tool wasn't deleted");
            
        }
     }
}
