package UmlToJavaEj01;

import java.util.Date;

/**
 * 
 * @author Alonso
 *	En este caso la persona tmbn es un extension de pelicula puesto que son persona que han intervenido en la pelicula.
 */
public class Persona  extends Pelicula{
		/**
		 * VARIABLES
		 */
		private String nombre;
		private String apellido;
		private Date fechaNacimiento;
		private String nacionalidad;
		
		/**
		 * CONSTRUCTOR
		 * @param titulo
		 * @param agno
		 * @param sinopsis
		 * @param genero
		 * @param pais
		 * @param nombre
		 * @param apellido
		 * @param fechaNacimiento
		 * @param nacionalidad
		 */
		public Persona(String titulo, Date agno, String sinopsis, Genero genero, String pais, String nombre,
				String apellido, Date fechaNacimiento, String nacionalidad) {
			super(titulo, agno, sinopsis, genero, pais);
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaNacimiento = fechaNacimiento;
			this.nacionalidad = nacionalidad;
		}
		
		/**
		 * METODOS GETTER & SETTER
		 */
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}

		public String getNacionalidad() {
			return nacionalidad;
		}

		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}

		/**
		 * METODO TO STRING
		 */
		public String toString() {
			return "Persona: [nombre = " + nombre + ", apellido = " + apellido + ", fechaNacimiento = " + fechaNacimiento
					+ ", nacionalidad = " + nacionalidad + "]";
		}
	
		
}