import org.junit.Assert;
import org.junit.Test;
import start.Lanceur;

public class LanceurTest {

    @Test
    public void testAjoutDeuxNombre(){
        testIndividualAdition(10, 20, 30);
        testIndividualAdition(0, 0, 0);
        testIndividualAdition(-10, 10, 0);
    }

    private void testIndividualAdition(int nombre1, int nombre2, int result){
        Assert.assertEquals(result, Lanceur.ajouterDeuxNombre(nombre1,nombre2));
    }

    @Test
    public void testSoustractionDeuxNombre(){
        testIndividualSoustraction(10, 20, -10);
        testIndividualSoustraction(0, 0, 0);
        testIndividualSoustraction(-10, 10, -20);
    }

    private void testIndividualSoustraction(int nombre1, int nombre2, int result){
        Assert.assertEquals(result,Lanceur.soustraireDeuxNombre(nombre1,nombre2));
    }


    @Test
    public void testMultiplierDeuxNombre(){
        testIndividualMultiplier(10, 20, 200);
        testIndividualMultiplier(0, 0, 0);
        testIndividualMultiplier(-10, 10, -100);
    }

    private void testIndividualMultiplier(int nombre1, int nombre2, int result){
        Assert.assertEquals(result,Lanceur.multiplierDeuxNombre(nombre1,nombre2));
    }

    @Test
    public void testDivisionDeuxNombre(){
        testIndividualDivision(100, 20, 5);
        testIndividualDivision(-10, 10, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionParZero(){
        int rs = Lanceur.divisionDeuxNombre(10,0);
    }

    private void testIndividualDivision(int nombre1, int nombre2, int result){
        Assert.assertEquals(result,Lanceur.divisionDeuxNombre(nombre1,nombre2));
    }
}
