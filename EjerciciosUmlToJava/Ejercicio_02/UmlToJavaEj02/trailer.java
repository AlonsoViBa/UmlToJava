package UmlToJavaEj02;

import java.util.Date;
import java.util.TreeSet;

import UmlToJavaEj01.Genero;

public class trailer extends pelicula{

	private String url;
	private String duracion;
	public java.util.Collection trailerPersona = new java.util.TreeSet();
	
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
	public trailer(String titulo, Date agno, String sinopsis, Genero genero, String pais, String url, String duracion) {
		super();
		this.url = url;
		this.duracion = duracion;
	}
	/**
	 * CONSTRUCTOR VACIO
	 */
	public trailer() {
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
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	
	/**
	 * METODO TO STRING
	 */
	public String toString() {
		return "Trailer: [url=" + url + ", duracion=" + duracion + "]";
	}
}
