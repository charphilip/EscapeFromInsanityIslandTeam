/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.EscapeFromInsanityIsland.control;

import byui.cit260.EscapeFromInsanityIsland.model.BuilderResource;
import byui.cit260.EscapeFromInsanityIsland.model.Challenge;
import byui.cit260.EscapeFromInsanityIsland.model.Memory;
import byui.cit260.EscapeFromInsanityIsland.model.Resource;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FELIPE
 */
public class ResourceControlTest {
    
    public ResourceControlTest() {
    }

    
    

    /**
     * Test of calcQuantityTool method, of class ResourceControl.
     */
    @Test
    public void testCalcQuantityTool() {
        System.out.println("calcQuantityTool");
        String quantityStored = "W10 N5 R2 I10";
        boolean resourcesGained = true;
        String typeResource = "Air Tool";
        ResourceControl instance = new ResourceControl();
        String expResult = "You has created a tool!";
        String result = instance.calcQuantityTool(quantityStored, resourcesGained, typeResource);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
