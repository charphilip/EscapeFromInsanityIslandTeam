/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.EscapeFromInsanityIsland.control;

import byui.cit260.EscapeFromInsanityIsland.model.Memory;
import byui.cit260.EscapeFromInsanityIsland.model.BuilderResource;
import byui.cit260.EscapeFromInsanityIsland.model.Resource;

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
    
    public void selectResource(String resource, String builderResource, String memory){
        
    }
    
    
    public void deleteResource(String resource, String memory){}
    
    public double setSizeTool(String builderResource){return 0;}
    
    public double calcQuantityRawMaterial(String builderResource){return 0;}
    
    public String calcQuantityTool(int quantityStored, boolean resourceGained, String typeResource){return "";}
    
    public boolean checkEnoughResourceGained(String challenge){
        
        
        return false;
    
    }
    
    public void saveTool(String memory){
    
        
        
    }
    
    public void deleteTool(Memory memory){
        
        if(memory.getToolSaved() == "Hammer"){
         
                    System.out.println ("The tool was deleted");
        }else{
        
            System.out.println ("The tool wasn't deleted");
            
        }
            
        
    }
    
}
