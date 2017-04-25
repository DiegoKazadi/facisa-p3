/**
 * 
 */
package br.cesed.si.exercicio1.classes.p3;

import br.cesed.si.exercicio1.animal.p3.Animal;

/**
 * Create the class Peixe
 * @author Diego Kazadi
 *
 */
public class Peixe extends Animal{
	private String tipoHabita;

	// Create method constructor
	public Peixe(String tipoHabita){
		super();
		this.tipoHabita = tipoHabita;
	}
	
	// Generate method get and setter
	/**
	 * @return the tipoHabita
	 */
	public String getTipoHabita() {
		return tipoHabita;
	}

	/**
	 * @param tipoHabita the tipoHabita to set
	 */
	public void setTipoHabita(String tipoHabita) {
		this.tipoHabita = tipoHabita;
	}
	//Generate output
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TipoHabita de Peixe : " + tipoHabita + "\n";
	}
	

}
