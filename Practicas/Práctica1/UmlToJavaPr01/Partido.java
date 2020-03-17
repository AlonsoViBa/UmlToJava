package UmlToJavaPr01;

public class Partido {
	
	/**
	 * Variables
	 */
	private int puntosLocal;
	private int puntosVisitante;
	private int bonusLocal;
	private int bonusVisitante;
	
	/**
	 * Constructor
	 * @param puntosLocal
	 * @param puntosVisitante
	 * @param bonusLocal
	 * @param bonusVisitante
	 */
	public Partido(int puntosLocal, int puntosVisitante, int bonusLocal, int bonusVisitante) {
		this.puntosLocal = puntosLocal;
		this.puntosVisitante = puntosVisitante;
		this.bonusLocal = bonusLocal;
		this.bonusVisitante = bonusVisitante;
	}
	
	/**
	 * Metodos getter & setter
	 */
	/**
	 * @return the puntosLocal
	 */
	public int getPuntosLocal() {
		return puntosLocal;
	}
	
	/**
	 * Metodo para ver los resultados.
	 * @return
	 */
	public String Resultado() {
		return "Partido [puntosLocal=" + puntosLocal + ", puntosVisitante=" + puntosVisitante + ", bonusLocal="
				+ bonusLocal + ", bonusVisitante=" + bonusVisitante + "]";
	}

	/**
	 * @param puntosLocal the puntosLocal to set
	 */
	public void setPuntosLocal(int puntosLocal) {
		this.puntosLocal = puntosLocal;
	}
	/**
	 * @return the puntosVisitante
	 */
	public int getPuntosVisitante() {
		return puntosVisitante;
	}
	/**
	 * @param puntosVisitante the puntosVisitante to set
	 */
	public void setPuntosVisitante(int puntosVisitante) {
		this.puntosVisitante = puntosVisitante;
	}
	/**
	 * @return the bonusLocal
	 */
	public int getBonusLocal() {
		return bonusLocal;
	}
	/**
	 * @param bonusLocal the bonusLocal to set
	 */
	public void setBonusLocal(int bonusLocal) {
		this.bonusLocal = bonusLocal;
	}
	/**
	 * @return the bonusVisitante
	 */
	public int getBonusVisitante() {
		return bonusVisitante;
	}
	/**
	 * @param bonusVisitante the bonusVisitante to set
	 */
	public void setBonusVisitante(int bonusVisitante) {
		this.bonusVisitante = bonusVisitante;
	}
	
	
	

}
