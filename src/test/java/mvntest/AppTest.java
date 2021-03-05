package mvntest;

import static org.junit.Assert.*;

import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class AppTest {
	
	int[] masyvas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	Testcls testas = new Testcls(masyvas);
	

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }
		
	@Test
    public void masyvoTestas1() {
		int [] a = masyvas;
		int [] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		    
		assertArrayEquals(a, b);
    } 
	
	@Test
    public void masyvoTestas2() {
		int [] a;
		int [] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		a=b;
		assertSame (a, b);
    } 
	
    @Test
    public void pirmasTestas() {
		int a = 50;
		int paklaida = 5;
	

		int b = testas.sudeti();
	    
        assertEquals( "Nevienodi", a, b, paklaida );
    }  
	
	@Test
    public void antrasTestas() {
	
		String h = testas.lentele();
		
		assertNotNull ( h );
	}
	
    public void treciasTestas() {
	
		String h = testas.lentele();
		
		boolean x = true;

		assertTrue ( x );
	}	
	/*@Test
    public void kitasTestas() {
	double a=10.40008;
	double b=10.40004;
	
	double tikslumas = 0.00001;
	    
        assertEquals( "nesutampa a ir b reiksmes", a, b, tikslumas );
    } */
}
