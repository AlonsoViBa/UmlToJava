package UmlToJavaPr01;

/**
 * 
 * @author Alonso
 *
 */
public class Estadio {
	/**
	 * Variables
	 */
	private String nombre;
	private int capacidad;
	private String ciudad;
	/**
	 * Constructor
	 * @param nombre
	 * @param capacidad
	 * @param ciudad
	 */
	public Estadio(String nombre, int capacidad, String ciudad) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.ciudad = ciudad;
	}
	
	/**
	 * Metodos getter & setter
	 */
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}
	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
}
