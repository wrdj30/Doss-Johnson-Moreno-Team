/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theheist.control;

import byui.cit260.theHeist.exceptions.ClueControlException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import theheist.control.ClueControl;
import theheist.control.ClueControl;
import theheist.control.ClueControl;
import static org.junit.Assert.*;

/**
 *
 * @author wr
 */
public class ClueControlTest {
    
    public ClueControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCombination method, of class ClueControl.
     */
    @Test
    public void testGetCombination() throws ClueControlException {
        System.out.println("getCombination");
        System.out.println("testCase1");
        double clueA = 2.0;
        double clueB = 24.0;
        double clueC = 14.0;
        ClueControl instance = new ClueControl();
        double expResult = 31.0;
        double result = instance.getCombination(clueA, clueB, clueC);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
       System.out.println("getCombination");
        System.out.println("testCase2");
        clueA = 0.0;
        clueB = 24.0;
        clueC = 14.0;
        expResult = -1.0;
        result = instance.getCombination(clueA, clueB, clueC);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("getCombination");
        System.out.println("testCase3");
        clueA = 2.0;
        clueB = 26.0;
        clueC = 14.0;
        expResult = -1.0;
        result = instance.getCombination(clueA, clueB, clueC);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("getCombination");
        System.out.println("testCase4");
        clueA = 2.0;
        clueB = 24.0;
        clueC = -6.0;
        expResult = -1.0;
        result = instance.getCombination(clueA, clueB, clueC);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("getCombination");
        System.out.println("testCase5");
        clueA = 1.0;
        clueB = 24.0;
        clueC = 23.0;
        expResult = 47.0;
        result = instance.getCombination(clueA, clueB, clueC);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("getCombination");
        System.out.println("testCase6");
        clueA = 2.0;
        clueB = 25.0;
        clueC = 16.0;
        expResult = 33.0;
        result = instance.getCombination(clueA, clueB, clueC);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("getCombination");
        System.out.println("testCase7");
        clueA = 12.0;
        clueB = 23.0;
        clueC = 1.0;
        expResult = 23.083333333333332;
        result = instance.getCombination(clueA, clueB, clueC);
        assertEquals(expResult, result, 0.0);
    }


    public void testGetJewelAmount() throws ClueControlException {
        System.out.println("getJewelAmount");
        System.out.println("testCase1");

        double diamonds = 7.0;
        double rubies = 5.0;
        double sapphires = 3.0;
        ClueControl instance = new ClueControl();
        double expResult = 69.0;
        double result = instance.getJewelAmount(diamonds, rubies, sapphires);
        assertEquals(expResult, result, 0.0);
        
         System.out.println("getJewelAmount");
         System.out.println("testCase2");
        diamonds = 0.0;
        rubies = 5.0;
        sapphires = 3.0;
        expResult = -1.0;
        result = instance.getJewelAmount(diamonds, rubies, sapphires);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("getJewelAmount");
         System.out.println("testCase3");
        diamonds = 7.0;
        rubies = -6.0;
        sapphires = 3.0;
        expResult = -1.0;
        result = instance.getJewelAmount(diamonds, rubies, sapphires);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("getJewelAmount");
         System.out.println("testCase4");
        diamonds = 7.0;
        rubies = 5.0;
        sapphires = -5.0;
        expResult = -1.0;
        result = instance.getJewelAmount(diamonds, rubies, sapphires);
        assertEquals(expResult, result, 0.0);

        
        System.out.println("getJewelAmount");
         System.out.println("testCase5");
        diamonds = 1.0;
        rubies = 4.0;
        sapphires = 2.0;
        expResult = 23.0;
        result = instance.getJewelAmount(diamonds, rubies, sapphires);
        assertEquals(expResult, result, 0.0);

        System.out.println("getJewelAmount");
        System.out.println("testCase6");
        diamonds = 2.0;
        rubies = 8.0;
        sapphires = 1.0;
        expResult = 46.0;
        result = instance.getJewelAmount(diamonds, rubies, sapphires);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("getJewelAmount");
         System.out.println("testCase7");
        diamonds = 6.0;
        rubies = 3.0;
        sapphires = 1.0;
        expResult = 54.0;
        result = instance.getJewelAmount(diamonds, rubies, sapphires);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of addressClue method, of class ClueControl.
     */
    @Test
    public void testAddressClue() throws ClueControlException {
        System.out.println("addressClue");
        double clueA = 17.0;
        double clueB = 24.0;
        double clueC = 3.0;
        ClueControl instance = new ClueControl();
        double expResult = 5043.0;
        double result = instance.addressClue(clueA, clueB, clueC);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("addressClue");
        System.out.println("testCase1");
        clueA = 0.0;
        clueB = 24.0;
        clueC = 3.0;
        expResult = -1.0;
        result = instance.addressClue(clueA, clueB, clueC);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("addressClue");
        System.out.println("testCase2");
        clueA = 18.0;
        clueB = 37.0;
        clueC = 3.0;
        expResult = -1.0;
        result = instance.addressClue(clueA, clueB, clueC);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("addressClue");
        System.out.println("testCase3");
        clueA = 13.0;
        clueB = 21.0;
        clueC = 66.0;
        expResult = -1.0;
        result = instance.addressClue(clueA, clueB, clueC);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("addressClue");
        System.out.println("testCase4");
        clueA = 15.0;
        clueB = 24.0;
        clueC = 3.0;
        expResult = 4563.0;
        result = instance.addressClue(clueA, clueB, clueC);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("addressClue");
        System.out.println("testCase5");
        clueA = 18.0;
        clueB = 22.0;
        clueC = 3.0;
        expResult = 4800.0;
        result = instance.addressClue(clueA, clueB, clueC);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("addressClue");
        System.out.println("testCase6");
        clueA = 13.0;
        clueB = 21.0;
        clueC = 6.0;
        expResult = 6936.0;
        result = instance.addressClue(clueA, clueB, clueC);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
