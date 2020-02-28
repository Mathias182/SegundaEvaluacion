package cl.awake.evaluacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TelevicionTest {

	private Televicion televicion;

	private int resolucion;
	private boolean sintonizadorTDT;

	private String color;
	private double precio_base;
	private char consumo_energetico;
	private double peso;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testPrecioFinal() {
		fail("Not yet implemented");
	}

	@Test
	void testTelevicion() {
		fail("Not yet implemented");
	}

	@Test
	void testTelevicionDoubleDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testTelevicionStringCharDoubleDoubleIntBoolean() {
		fail("Not yet implemented");
	}

	@Test
	void testGetResolucion() {
		assertEquals(resolucion, televicion.getResolucion());
	}
    @Test
    void testIsSintonizadorTDT() {
        assertEquals(sintonizadorTDT, televicion.isSintonizadorTDT());
    }



	@Test
	void testIsSintonizadorDefecto() {
		fail("Not yet implemented");
	}

	@Test
	void testSetResolucion() {
		 int resolucion = 50;
	        televicion.setResolucion(resolucion);
	        
	        assertEquals(resolucion, televicion.getResolucion());
	}

	@Test
	void testSetSintonizadorTDT() {
		boolean sintonizadorTDT = false;
        televicion.setSintonizadorTDT(sintonizadorTDT);
        
        assertEquals(sintonizadorTDT, televicion.isSintonizadorTDT());
	}

}
