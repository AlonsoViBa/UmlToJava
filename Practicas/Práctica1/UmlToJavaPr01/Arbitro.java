package UmlToJavaPr01;

import java.util.Date;
import java.util.TreeSet;

/**
 * 
 * @author Alonso
 *
 */
public class Arbitro extends Persona{
	/**
	 * Variables
	 */
	private TreeSet<Partido> partidosArbitrados = new TreeSet<Partido>();
	
	/**
	 * Constructor
	 * @param Date
	 * @param fechaNacimiento
	 */
	public Arbitro(String Date, Date fechaNacimiento) {
		super(Date, fechaNacimiento);
		
	}
	
}