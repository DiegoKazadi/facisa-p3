/**
 * 
 */
package br.cesed.exercicio2.classes.p3;

import br.cesed.si.exercicio2.pessoa.p3.Pessoa;

/**
 * Create the class Empregado
 * @author Diego Kazadi
 *
 */
public abstract class Empregado extends Pessoa {
	// variables
	protected String matricula;
	protected double salario;
	
	public abstract void valorInss(); // method valorInss abstract 

	// Generate method get and setter
	
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
