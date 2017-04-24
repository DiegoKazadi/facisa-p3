/**
 * 
 */
package br.cesed.si.animal.p3;

/**
 * Create the class Animal 
 * @author Diego Kazadi
 *
 */
public abstract class Animal {
	protected String nome;
	protected double peso;

	/**
	 * Generate method get e setter
	 * 
	 */

	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
		
}
