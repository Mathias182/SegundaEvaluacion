package cl.awake.evaluacion;

/**
 * Clase lavadora con datos heredados de Electrodomesticos
 * 
 * @author Matias Flores
 *
 */
public class Lavadora extends Electrodomesticos {
	// +++++++++++++++++++++++++++Atributos++++++++++++++++++++++++++++++++++++++++//
	private int carga;
	private static final int cargaDefecto = 5;

	// +++++++++++++++++++++++++++Contructores+++++++++++++++++++++++++++++++++++++//
	// contructor por defecto
	public Lavadora( String color,int carga, double precio_base, char consumo_energetico, double peso) {
		super();
		this.carga = cargaDefecto;
		precioFinal();
	}

	/*
	 * Contructor con precio base y peso y carga con valor por defecto llamo al metodo de electrodomesticos
	 * (precio Final)
	 * 
	 * @param precio_base
	 * 
	 * @param peso
	 */
	public Lavadora(double precio_base, double peso) {

		super(precio_base, peso);
		this.carga = cargaDefecto;
		precioFinal();
	}

	/*
	 * Contructor con todos los valores
	 */
	public Lavadora(String color, char consumo_energetico,double precio_base, double peso, int carga) {
		super(color, consumo_energetico, precio_base, peso);
		this.carga=carga;
		precioFinal();	
	}

	// +++++++++++++++++++++++++++Metodo+++++++++++++++++++++++++++++++++++++//
	/*
	 * Metodo get de carga
	 * 
	 * @return CARGA
	 */
	public int getCARGA() {
		return carga;
	}

	/*
	 * si la carga es superior a 30 agrega 50 al monto
	 * 
	 * @return monto
	 */
	@Override
	public double precioFinal() {
		double monto = super.precioFinal();

		if (carga > 30) {
			monto += 50;
		}
		return monto;
	}

}
