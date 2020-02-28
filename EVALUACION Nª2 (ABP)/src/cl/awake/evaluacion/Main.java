package cl.awake.evaluacion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
	
        Electrodomesticos[] electrodomesticos = crearLista();
       
        mostrarPreciosFinales(electrodomesticos);
        
	}
	/**
	 * Genera una array con 10 posiciones por defecto 
	 */
	  public static Electrodomesticos[] crearLista() {
	        
	        Electrodomesticos[] arrayElectro = new Electrodomesticos[10];
	        
	        arrayElectro[0] = new Electrodomesticos(180300, 55);
	        arrayElectro[1] = new Lavadora("ROJO", 450, 200321, 'A', 20);
	        arrayElectro[2] = new Electrodomesticos();
	        arrayElectro[3] = new Lavadora(189290 ,400);
	        arrayElectro[4] = new Televicion(123234, 23);
		arrayElectro[5] = new Lavadora(150900, 40);
		arrayElectro[6] = new Lavadora(999000, 90);
	        arrayElectro[7] = new Televicion(80300, 25);
	        arrayElectro[8] = new Electrodomesticos(502500, 50);
	        arrayElectro[9] = new Televicion(325000, 12);
	       
	        
	        return arrayElectro;
	    }
	    public static void mostrarPreciosFinales(Electrodomesticos[] arrayElectro) {
	        
	    	/**
			 * Variables de entradas 
			 * @param valorElectro, totalElectrodomesticos, totalTv, totalLavadoras.
			 */
			double valorElectro=0;
	        int totalElectrodomesticos = 0;
	        int totalTV = 0;
	        int totalLavadoras = 0;
	        
	        System.out.println(" El detalle de la compra es: \n"); 
			for (int i = 0; i < arrayElectro.length; i++) {
				

				if (arrayElectro[i] instanceof Electrodomesticos) {					
					valorElectro += arrayElectro[i].precioFinal();
					totalElectrodomesticos++;
				}
				if (arrayElectro[i] instanceof Lavadora) {
					System.out.println("El Valor de la lavadora es:  " + arrayElectro[i].precioFinal());				
					totalLavadoras++;
				}
				if (arrayElectro[i] instanceof Televicion ) {
					System.out.println("El valor de la televicion es: " + arrayElectro[i].precioFinal());
					totalTV++;
				}
				
			}
	        
	        
			System.out.println("\t  \n Unidades Compradas \n ");
			
			System.out.println("La cantidad de electrodomesticos es:" + totalElectrodomesticos);
			System.out.println("La cantidad de Lavadoras :" + totalLavadoras);
			System.out.println("La cantidad de Televisores :" + totalTV);
			System.out.println("Cantidad no definida  :" + (totalTV+totalLavadoras-totalElectrodomesticos));
			System.out.println("\t  \n Valores Totales \n ");
			System.out.println("Electrodomesticos son: " + valorElectro);
		}
	    
}
