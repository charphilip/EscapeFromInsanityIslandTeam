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
     * Test of checkAvailableResource method, of class ResourceControl.
     */
    @Test
    public void testCheckAvailableResource() {
        System.out.println("checkAvailableResource");
        Resource resource = null;
        Memory memory = null;
        ResourceControl instance = new ResourceControl();
        boolean expResult = false;
        boolean result = instance.checkAvailableResource(resource, memory);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTool method, of class ResourceControl.
     */
    @Test
    public void testCreateTool() {
        System.out.println("createTool");
        Resource resource = null;
        BuilderResource builderResource = null;
        Memory memory = null;
        ResourceControl instance = new ResourceControl();
        String expResult = "";
        String result = instance.createTool(resource, builderResource, memory);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectResource method, of class ResourceControl.
     */
    @Test
    public void testSelectResource() {
        System.out.println("selectResource");
        Resource resource = null;
        ResourceControl instance = new ResourceControl();
        instance.selectResource(resource);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteResource method, of class ResourceControl.
     */
    @Test
    public void testDeleteResource() {
        System.out.println("deleteResource");
        Resource resource = null;
        Memory memory = null;
        ResourceControl instance = new ResourceControl();
        instance.deleteResource(resource, memory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSizeTool method, of class ResourceControl.
     */
    @Test
    public void testSetSizeTool() {
        System.out.println("setSizeTool");
        BuilderResource builderResource = null;
        ResourceControl instance = new ResourceControl();
        String expResult = "";
        String result = instance.setSizeTool(builderResource);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcQuantityRawMaterial method, of class ResourceControl.
     */
    @Test
    public void testCalcQuantityRawMaterial() {
        System.out.println("calcQuantityRawMaterial");
        String sizeTool = "";
        int quantityToolToCreate = 0;
        boolean resourcesGained = false;
        ResourceControl instance = new ResourceControl();
        String expResult = "";
        String result = instance.calcQuantityRawMaterial(sizeTool, quantityToolToCreate, resourcesGained);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcQuantityTool method, of class ResourceControl.
     */
    @Test
    public void testCalcQuantityTool() {
        System.out.println("calcQuantityTool");
        String quantityStored = "";
        boolean resourcesGained = false;
        String typeResource = "";
        ResourceControl instance = new ResourceControl();
        String expResult = "";
        String result = instance.calcQuantityTool(quantityStored, resourcesGained, typeResource);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkEnoughResourceGained method, of class ResourceControl.
     */
    @Test
    public void testCheckEnoughResourceGained() {
        System.out.println("checkEnoughResourceGained");
        Challenge challenge = null;
        ResourceControl instance = new ResourceControl();
        boolean expResult = false;
        boolean result = instance.checkEnoughResourceGained(challenge);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveTool method, of class ResourceControl.
     */
    @Test
    public void testSaveTool() {
        System.out.println("saveTool");
        Memory memory = null;
        ResourceControl instance = new ResourceControl();
        instance.saveTool(memory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTool method, of class ResourceControl.
     */
    @Test
    public void testDeleteTool() {
        System.out.println("deleteTool");
        Memory memory = null;
        ResourceControl instance = new ResourceControl();
        instance.deleteTool(memory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
