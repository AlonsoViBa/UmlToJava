package UmlToJavaPr01;

import java.util.TreeSet;

/**
 * 
 * @author Alonso
 *
 */
public class Equipo {
	/**
	 * Variables
	 */
	private Pais pais;
	private Entrenador entrenador;
	private TreeSet<Partido> partidos = new TreeSet<Partido>();
	private TreeSet<Jugador> jugadores = new TreeSet<Jugador>();
	
}