package cl.awake.evaluacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LavadoraTest {
	private Lavadora lavadora;
	
	private int carga; 
	private String color;
	private double precio_base; 
	private char consumo_energetico;
	private double peso; 
	
	

	@BeforeEach
	void setUp() throws Exception {
		lavadora = new Lavadora(100000, 59);
		
		carga = 20;
		lavadora.setCarga(carga);
	
	}


    @Test
    void testGetPrecio() {
        assertEquals(precio_base, lavadora.getPrecio_base());
    }
    @Test
    void testGetColor() {
        assertEquals(color, lavadora.getColor());
    }
    @Test
    void testGetConsumo() {
        assertEquals(consumo_energetico, lavadora.getConsumo_energetico());
    }
    @Test
    void testGetPeso() {
        assertEquals(peso, lavadora.getPeso());
    }



    @Test
    void testSetPrecio_base() {
        long precio_base = 100000;
        lavadora.getPrecio_base();
        
        assertEquals(precio_base, lavadora.getPrecio_base());
    }


	@Test
	void testLavadoraStringCharDoubleDoubleInt() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCARGA() {
	    int carga = 200;
        lavadora.setCarga(carga);
        
        assertEquals(carga, lavadora.getCarga());
	}

}
