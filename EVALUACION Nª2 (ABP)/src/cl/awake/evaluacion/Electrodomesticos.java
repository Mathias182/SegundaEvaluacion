package cl.awake.evaluacion;

/**
 * Esta clase se encarga de gestionar los valores de las clases televicion y
 * lavadora
 * 
 * @author Matias Flores
 *
 */
public class Electrodomesticos {
	// +++++++++++++++++++++++++++Atributos++++++++++++++++++++++++++++++++++++++++//
	/**
	 * Precio base del electrodomestico
	 */
	private double precio_base;
	/**
	 * Color del consumo energetico
	 */
	private String color;
	/**
	 * Asiganacion de las letras de el consumo energetico
	 */
	private char consumo_energetico;
	/**
	 * Peso de los electrodomesticos
	 */
	private double peso;
	// Contantes 
	private static final String color_defecto = "blanco";
    private static final char consumo_energetico_defecto = 'F';
    private static final double precio_base_defecto = 100000;
    private static final double peso_defecto = 5;

	// +++++++++++++++++++++++++++Contructores++++++++++++++++++++++++++++++++++++++++//
	/**
	 * Contructor con valores por defecto
	 */
    public Electrodomesticos() {
 
        this.color = color_defecto;
        this.consumo_energetico = consumo_energetico_defecto;
        this.precio_base = precio_base_defecto;
        this.peso = peso_defecto;

	} 

	/**
	 * Contructor con los parametros precio base y peso
	 * 
	 * @param precio_base
	 * @param peso
	 */
    public Electrodomesticos (double precio_base, double peso) {

        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
        this.precio_base = precio_base;
        
    }

	/**
	 * Contructor con todos los valores
	 * 
	 * @param precio_base
	 * @param color
	 * @param consumo_energetico
	 * @param peso
	 */
    public Electrodomesticos (String color, char consumo_energetico, double precio_base, double peso) {

        this.color = comprobarColor(color);
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
        this.precio_base = precio_base;
        
    }   
	// ++++++++++++++++++++++++++++Metodos++++++++++++++++++++++++++++++++++++++++//

	/**
	 * Metodos get
	 * 
	 * @return precio_base, color, consumo_energetico,peso
	 */

	public double getPrecio_base() {
		return precio_base;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo_energetico() {
		return consumo_energetico;
	}

	public double getPeso() {
		return peso;
	}

	/**
	 * comprueba que la letra es correcta, sino es correcta usara la letra F
	 * 
	 * @param letra
	 */
	public void comprobarConsumoEnergetico(char letra) {

		boolean existe = false;

		switch (letra) {
		case 'A':
			existe = true;
			this.precio_base = 100;
			break;
		case 'B':
			existe = true;
			this.precio_base = 80;
			break;
		case 'C':
			existe = true;
			this.precio_base = 60;
			break;
		case 'D':
			existe = true;
			this.precio_base = 50;
			break;
		case 'E':
			existe = true;
			this.precio_base = 30;
			break;
		case 'F':
			existe = true;
			this.precio_base = 10;
			break;
		}

		if (existe) {
			this.consumo_energetico = letra;
		}

	}

	/**
	 * comprueba que el color es correcto, sino lo es usa el color por defecto
	 * 
	 * @param color
	 * @return color
	 */
	public String comprobarColor(String color) {

		if (color == "Negro" || color == "Rojo" || color == "Azul" || color == "Gris") {
			this.color = color;
		} else {
			this.color = "Blanco";
		}
		return color;
	}

	/**
	 * tranforma su peso en valor monetario
	 * 
	 * @return precio_base
	 */
	public double precioFinal() {
		
		double pesoXpeso = this.precio_base_defecto;

		this.comprobarConsumoEnergetico(this.consumo_energetico);

		if (this.peso >= 0 && this.peso <= 19) {
			pesoXpeso = 10;

		} else if (this.peso >= 20 && this.peso <= 49) {
			pesoXpeso = 50;

		} else if (this.peso >= 50 && this.peso <= 80) {
			pesoXpeso = 80;
		} else if (this.peso >= 80) {
			pesoXpeso = 100;
		}

		this.precio_base += pesoXpeso;

		return this.precio_base;

	}
	/**
	 * retorno el valor final
	 * @return calcularPrecio
	 */
	


}
