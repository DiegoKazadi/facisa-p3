/**
 * 
 */
package br.cesed.si.exercicios10.p3;

/**
 * @author Diego Kazadi
 *
 */
public abstract class Calculadora {
	protected double numero;
	protected double numero1;
	
	/**
	 * @param numero2
	 * @param numero12
	 * 
	 */
	public Calculadora(double numero2, double numero12) {
		super();
		this.numero = numero2;
		this.numero1 = numero12;
	}
	public abstract int soma();
	public abstract int substracao();
	public abstract int mutiplicacao();
	public abstract int divisao();
	/**
	 * @return the numero
	 */
	public double getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	void setNumero(double numero) {
		this.numero = numero;
	}
	/**
	 * @return the numero1
	 */
	double getNumero1() {
		return numero1;
	}
	/**
	 * @param numero1 the numero1 to set
	 */
	void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	
}
