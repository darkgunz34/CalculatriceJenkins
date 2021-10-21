/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculatrice;

import org.junit.Test;
import org.junit.Assert;
import org.junit.*;

/**
 *
 * @author steph
 */
public class NewEmptyJUnitTest {
    
    @Test
    public void testAjoutDeuxNombre(){
        testIndividualAdition(10, 20, 30);
        testIndividualAdition(0, 0, 0);
        testIndividualAdition(-10, 10, 0);
    }
    
    private void testIndividualAdition(int nombre1, int nombre2, int result){
        Assert.assertEquals(result,calculatricejenkins.CalculatriceJenkins.ajouterDeuxNombre(nombre1,nombre2));        
    }

    @Test
    public void testSoustractionDeuxNombre(){
        testIndividualSoustraction(10, 20, -10);
        testIndividualSoustraction(0, 0, 0);
        testIndividualSoustraction(-10, 10, -20);
    }
    
    private void testIndividualSoustraction(int nombre1, int nombre2, int result){
        Assert.assertEquals(result,calculatricejenkins.CalculatriceJenkins.soustraireDeuxNombre(nombre1,nombre2));        
    }

    
    @Test
    public void testMultiplierDeuxNombre(){
        testIndividualMultiplier(10, 20, 200);
        testIndividualMultiplier(0, 0, 0);
        testIndividualMultiplier(-10, 10, -100);
    }
    
    private void testIndividualMultiplier(int nombre1, int nombre2, int result){
        Assert.assertEquals(result,calculatricejenkins.CalculatriceJenkins.multiplierDeuxNombre(nombre1,nombre2));        
    }
    
    @Test
    public void testDivisionDeuxNombre(){
        testIndividualDivision(100, 20, 5);
        testIndividualDivision(-10, 10, -1);        
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivisionParZero(){
        int rs = calculatricejenkins.CalculatriceJenkins.divisionDeuxNombre(10,0);
        System.out.println(rs);
    }
    
    private void testIndividualDivision(int nombre1, int nombre2, int result){
        Assert.assertEquals(result,calculatricejenkins.CalculatriceJenkins.divisionDeuxNombre(nombre1,nombre2));        
    }

}
