package UmlToJavaPr01;

import java.util.Date;

/**
 * 
 * @author Alonso
 *
 */
public class Persona {
	/**
	 * Variables
	 */
	private String nombre;
	private Date fechaNacimiento;
	
	/**
	 * Constructor
	 * @param Date
	 * @param fechaNacimiento
	 */
	public Persona(String Date, Date fechaNacimiento){
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}


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
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}


	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

}
