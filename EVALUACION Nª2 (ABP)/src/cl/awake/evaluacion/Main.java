package cl.awake.evaluacion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
	
		/**
		 * Variables de entradas 
		 * @param valorElectro, totalElectrodomesticos, totalTv, totalLavadoras.
		 */
		double valorElectro=0;
        int totalElectrodomesticos = 0;
        int totalTV = 0;
        int totalLavadoras = 0;
		/**
		 * Genera una array con 10 posiciones por defecto 
		 */
		Electrodomesticos arrayElectro[] = new Electrodomesticos[10];
		
		arrayElectro[0] = new Lavadora(10000, 10);
		arrayElectro[1] = new Lavadora("Gris", 'A', 2000, 20, 2);
		arrayElectro[2] = new Lavadora(3000, 20);
		arrayElectro[3] = new Lavadora("Rojo", 'C', 400, 40, 4);
		arrayElectro[4] = new Electrodomesticos(10000, 99);
		arrayElectro[5] = new Electrodomesticos();
		arrayElectro[6] = new Lavadora(10000, 200);
		arrayElectro[7] = new Lavadora(10000, 85);
		arrayElectro[8] = new Televicion(10000, 120);
		arrayElectro[9] = new Televicion(10000, 85);
		
		
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
		System.out.println("\t  \n Valores \n ");
		System.out.println("Electrodomesticos son: " + valorElectro);
	}
}
