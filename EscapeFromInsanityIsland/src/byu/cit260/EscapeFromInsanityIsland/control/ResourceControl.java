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
    
    public String createTool(Resource resource, BuilderResource builderResource, Memory memory){
      
       if(resource.isAvailableResource()){
       
            Memory memory1 = new Memory();
            memory1.setToolSaved(builderResource.getName());
        }
       
       return "The tool was created!";
        
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
    
    public String setSizeTool(BuilderResource builderResource){
        
        BuilderResource bResource1 = new BuilderResource();
                
        bResource1.setName(builderResource.getName());
        bResource1.setSizeTool(builderResource.getSizeTool());
        
        return "The size was set";
    }
  
    
    public String calcQuantityRawMaterial(String sizeTool, int quantityToolToCreate, boolean resourcesGained){
        
        
        String message = "";
        
        if (sizeTool == "Big" && quantityToolToCreate == 1 && resourcesGained == true){
            message = ("Wood 30 pieces && Iron 50 pieces && Nails 10 pieces && Rope 10 pieces");
            
        }else if ((sizeTool != "Big") && (quantityToolToCreate == 1) && (resourcesGained == true)){
            message = ("The size is invalid");
                
        }else if (sizeTool == "Big" && quantityToolToCreate != 1 && resourcesGained == true){
            message = ("The quantity of created tool must be one");
        }else if (sizeTool == "Big" && quantityToolToCreate == 1 && resourcesGained == false){
            message = ("The end user cannot create any tool without ResourceGained");
        }
        
        if (sizeTool == "Medium" && quantityToolToCreate == 1 && resourcesGained == true){
            message = ("Wood 40 pieces && Iron 30 pieces && Nails 15 pieces && Rope 15 pieces");
            
        }else if (sizeTool != "Medium" && quantityToolToCreate == 1 && resourcesGained == true){
            message = ("The size is invalid");
            
        }else if (sizeTool == "Medium" && quantityToolToCreate != 1 && resourcesGained == true){
            message = ("The quantity of created tool must be one");
            
        }else if (sizeTool == "Medium" && quantityToolToCreate == 1 && resourcesGained == false){
            message = ("The end user cannot create any tool without ResourceGained");
            
        }
        
        if (sizeTool == "Small" && quantityToolToCreate == 1 && resourcesGained == true){
            message = ("Wood 50 pieces && Iron 10 pieces && Nails 20 pieces && Rope 20 pieces");
            
        }else if (sizeTool != "Small" && quantityToolToCreate == 1 && resourcesGained == true){
            message = ("The size is invalid");
            
        }else if (sizeTool == "Small" && quantityToolToCreate != 1 && resourcesGained == true){
            message = ("The quantity of created tool must be one");
            
        }else if (sizeTool == "Small" && quantityToolToCreate == 1 && resourcesGained == false){
            message = ("The end user cannot create any tool without ResourceGained");
            
        }
        
        return message;
    }
        
    public String calcQuantityTool(String quantityStored, boolean resourcesGained, String typeResource){
        
        
        
        String message = "";
        
            if (resourcesGained == true){
            
                if ((typeResource == "Ground Tool") || (typeResource == "Air Tool") || (typeResource == "Water Tool") && (quantityStored == "W10 N5 R2 I10")){
                   message = "You has created a tool!";
                
                
                }
                else if ((typeResource == "Ground Tool") || (typeResource == "Air Tool") || (typeResource =="Water Tool") && (quantityStored != "W10 N5 R2 I10")){
                    message = "The Quantity resource is invalid!";
                }
        }else {
            message = "The rule is that you need to have resources gained";
        }
               
        return message;
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
