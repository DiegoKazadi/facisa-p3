/**
 * 
 */
package br.cesed.si.animais.classes.p3;

import br.cesed.si.animal.p3.Animal;

/**
 * Create the class cachorro
 * @author Diego Kazadi
 *
 */
public class Cachorro extends Animal{
	private String raca;
	
	// Generate the method constructor
	public Cachorro(String raca){
		super();
		this.raca = raca;
	}

	/**
	 * @return the raca
	 */
	public String getRaca() {
		return raca;
	}

	/**
	 * @param raca the raca to set
	 */
	public void setRaca(String raca) {
		this.raca = raca;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Raca do Cachorro : " + raca + "\n";
	}
	
	
	
	

}
