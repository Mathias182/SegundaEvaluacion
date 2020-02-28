package cl.awake.evaluacion;

public class Televicion extends Electrodomesticos{
	// +++++++++++++++++++++++++++Atributos++++++++++++++++++++++++++++++++++++++++//
		
	private int resolucion=20;
	private boolean sintonizadorTDT=false;
	
	
	//Contantes
    private static final int resolucion_defecto = 20;
    private static final boolean sintonizador_defecto = false;
	
	// +++++++++++++++++++++++++++Contructores++++++++++++++++++++++++++++++++++++++++//
	/*Contructor por defecto
	 * @param resolucion_defecto, sintonizador, precio_base, color, consumo_energetico, peso
	 */
    public Televicion() {
        super();
        this.resolucion = resolucion_defecto;
        this.sintonizadorTDT = sintonizador_defecto;
    }	
	
	/*Contructor con precio base y peso 
	 * @param precio_base, peso
	 */
    public Televicion(double precio_base, double peso) {

        super(precio_base, peso);
        this.resolucion = resolucion_defecto;
        this.sintonizadorTDT = sintonizador_defecto;

    }
    /*Contructor con todos los datos  
     * @param color, consumo_energetico, precio_base, peso, resolucion, sintonizadorTDT
     */
    public Televicion (String color, char consumo_energetico, double precio_base, double peso, int resolucion, boolean sintonizadorTDT) {

        super(color, consumo_energetico, precio_base, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;        
    }
    //+++++++++++++++++++++++++++++++Metodos++++++++++++++++++++++++++++++++++++++++//

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public static int getResolucionDefecto() {
		return resolucion_defecto;
	}

	public static boolean isSintonizadorDefecto() {
		return sintonizador_defecto;
	}
	
    
    public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

	@Override    
	public double precioFinal() {
    	
    	double monto = super.precioFinal();
    	
    	if(this.resolucion > 40) {
    		monto += monto *30/100;	
    	}   		
		if (this.sintonizadorTDT) {
			monto += 50;
		}
		return monto;
	}
    	
}
