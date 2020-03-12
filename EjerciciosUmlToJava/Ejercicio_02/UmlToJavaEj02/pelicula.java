package UmlToJavaEj02;

import java.util.Collection;
import java.util.Date;
import java.util.TreeSet;

import UmlToJavaEj01.Genero;

/**
 * 
 * @author Alonso
 *
 * @param <E>
 */
public class pelicula<E> {
	/**
	 * VARIABLES
	 */
	private String titulo;
	private Date agno;
	private String sinopsis;
	private Genero genero;
	private String pais;
	
	public java.util.Collection actor = new java.util.TreeSet<E>();
	public TreeSet<E> director = new java.util.TreeSet<E>();
	public TreeSet<E> productor = new java.util.TreeSet<E>();
	public TreeSet<E> guionista = new java.util.TreeSet<E>();
	public trailer tieneTrailer;
	public pelicula() {
		tieneTrailer = new trailer();
	}
	/**	C	ONSTRUCTOR
	 * @param titulo
	 * @param agno
	 * @param sinopsis
	 * @param genero
	 * @param pais
	 * @param actor
	 * @param director
	 * @param productor
	 * @param guionista
	 * @param tieneTrailer
	 */
	public pelicula(String titulo, Date agno, String sinopsis, Genero genero, String pais, Collection actor,
			TreeSet<E> director, TreeSet<E> productor, TreeSet<E> guionista, trailer tieneTrailer) {
		super();
		this.titulo = titulo;
		this.agno = agno;
		this.sinopsis = sinopsis;
		this.genero = genero;
		this.pais = pais;
		this.actor = actor;
		this.director = director;
		this.productor = productor;
		this.guionista = guionista;
		this.tieneTrailer = tieneTrailer;
	}
	
	
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the agno
	 */
	public Date getAgno() {
		return agno;
	}
	/**
	 * @param agno the agno to set
	 */
	public void setAgno(Date agno) {
		this.agno = agno;
	}
	/**
	 * @return the sinopsis
	 */
	public String getSinopsis() {
		return sinopsis;
	}
	/**
	 * @param sinopsis the sinopsis to set
	 */
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	/**
	 * @return the actor
	 */
	public java.util.Collection getActor() {
		return actor;
	}
	/**
	 * @param actor the actor to set
	 */
	public void setActor(java.util.Collection actor) {
		this.actor = actor;
	}
	/**
	 * @return the director
	 */
	public TreeSet<E> getDirector() {
		return director;
	}
	/**
	 * @param director the director to set
	 */
	public void setDirector(TreeSet<E> director) {
		this.director = director;
	}
	/**
	 * @return the productor
	 */
	public TreeSet<E> getProductor() {
		return productor;
	}
	/**
	 * @param productor the productor to set
	 */
	public void setProductor(TreeSet<E> productor) {
		this.productor = productor;
	}
	/**
	 * @return the guionista
	 */
	public TreeSet<E> getGuionista() {
		return guionista;
	}
	/**
	 * @param guionista the guionista to set
	 */
	public void setGuionista(TreeSet<E> guionista) {
		this.guionista = guionista;
	}
	/**
	 * @return the tieneTrailer
	 */
	public trailer getTieneTrailer() {
		return tieneTrailer;
	}
	/**
	 * @param tieneTrailer the tieneTrailer to set
	 */
	public void setTieneTrailer(trailer tieneTrailer) {
		this.tieneTrailer = tieneTrailer;
	}
	
	
	
	
	
}
