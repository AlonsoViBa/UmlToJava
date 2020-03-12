package UmlToJavaEj02;

import java.util.Date;

/**
 * 
 * @author Alonso
 *	En este caso la persona tmbn es un extension de pelicula puesto que son persona que han intervenido en la pelicula.
 */
public class persona  extends pelicula{
		/**
		 * VARIABLES
		 */
		private String nombre;
		private String apellido;
		private Date fechaNacimiento;
		private String nacionalidad;
		private Participa realiza;
		
		
		
		/**
		 * @param nombre
		 * @param apellido
		 * @param fechaNacimiento
		 * @param nacionalidad
		 * @param realiza
		 */
		public persona(String nombre, String apellido, Date fechaNacimiento, String nacionalidad, Participa realiza) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaNacimiento = fechaNacimiento;
			this.nacionalidad = nacionalidad;
			this.realiza = realiza;
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

		public Participa getRealiza() {
			return realiza;
		}

		public void setRealiza(Participa realiza) {
			this.realiza = realiza;
		}
	
		
}
