/**
 * 
 */
package br.cesed.si.exercicio4.p3;

/**
 * Create the class Empregado
 * @author Diego Kazadi
 *
 */
public abstract class Empregado extends Pessoa {
	// variables
		protected String matricula;
		protected double salario;
		protected int codigoSetor;
		protected double salarioBase;
		
	public Empregado(String nome, int idade, String sexo, String endereco, String telefone,
			String matricula, double salario, double salarioBase, int codigoSetor) {
		super(nome, idade, sexo, endereco, telefone);
		this.matricula = matricula;
		this.salario = salario;
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
	}
	
	public abstract void valorInss(); // method valorInss abstract 
	public abstract void calculaSalario();
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
