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
	        
	        arrayElectro[0] = new Electrodomesticos();
	        arrayElectro[1] = new Lavadora(2000 ,400);
	        arrayElectro[2] = new Televicion();
	        arrayElectro[3] = new Electrodomesticos(50, 5);
	        arrayElectro[4] = new Lavadora(150, 50);
	        arrayElectro[5] = new Televicion(80, 15);
	        arrayElectro[6] = new Electrodomesticos(180, 20);
	        arrayElectro[7] = new Lavadora("ROJO", 20, 200321, 'A', 20);
	        arrayElectro[8] = new Televicion(125, 12);
	        arrayElectro[9] = new Lavadora(90, 90);
	        
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
