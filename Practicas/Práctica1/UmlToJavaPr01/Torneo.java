package UmlToJavaPr01;

import java.sql.Date;
import java.util.TreeSet;

/**
 * 
 * @author Alonso
 *
 */
public class Torneo {
	/**
	 * Variables
	 */
	private Date agno;
	private TreeSet<Jornada> jornadas = new TreeSet<Jornada>();
	
	/**
	 * Metodo para ver la clasificadi�n.
	 */
	public void clasificacion() {
		System.out.println("La clasificaci�n del a�o " + agno + " es:");
		System.out.println(jornadas);
	}
	
	/**
	 * 
	 * @return
	 */
	public Equipo ganador() {
		return new Equipo();
	}
	
}