package UmlToJavaEj01;

import java.util.Date;
/**
 * 
 * @author Alonso
 *	Esta, la clase Trailer extiende de pelicula y aporta un par de atributos más.
 */
public class Trailer extends Pelicula {
	/**
	 * VARIABLES
	 */
	private String url;
	private int duracion;
	
	/**
	 * CONSTRUCTOR
	 * @param titulo
	 * @param agno
	 * @param sinopsis
	 * @param genero
	 * @param pais
	 * @param url
	 * @param duracion
	 */
	public Trailer(String titulo, Date agno, String sinopsis, Genero genero, String pais, String url, int duracion) {
		super(titulo, agno, sinopsis, genero, pais);
		this.url = url;
		this.duracion = duracion;
	}
	
	/**
	 * METODOS GETTER & SETTER
	 */
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	/**
	 * METODO TO STRING
	 */
	public String toString() {
		return "Trailer: [url=" + url + ", duracion=" + duracion + "]";
	}
}
