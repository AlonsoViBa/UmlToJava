package UmlToJavaEj01;
import java.util.Date;

/**
 * 
 * @author Alonso
 *
 */
public class Pelicula{
	/**
	 * VARIABLES
	 */
	private String titulo;
	private Date agno;
	private String sinopsis;
	private Genero genero;
	private String pais;

	/**
	 * CONSTRUCTOR
	 * @param titulo
	 * @param agno
	 * @param sinopsis
	 * @param genero
	 * @param pais
	 */
	public Pelicula(String titulo, Date agno, String sinopsis, Genero genero, String pais) {
		this.titulo = titulo;
		this.agno = agno;
		this.sinopsis = sinopsis;
		this.genero = genero;
		this.pais = pais;
		}
	/**
	 * METODOS GETTER & SETTERS
	 */
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Date getAgno() {
		return agno;
	}
	
	public void setAgno(Date agno) {
		this.agno = agno;
	}
	
	public String getSinopsis() {
		return sinopsis;
	}
	
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	/**
	 * TO STRING
	 */
	public String toString() {
		return "Pelicula: [titulo = " + titulo + ", agno = " + agno + ", sinopsis = " + sinopsis + ", genero = " + genero
				+ ", pais = " + pais + "]";
	}
}