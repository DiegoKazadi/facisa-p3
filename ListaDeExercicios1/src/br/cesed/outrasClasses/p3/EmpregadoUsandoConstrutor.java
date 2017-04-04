/**
 * 
 */
package br.cesed.outrasClasses.p3;

/**
 * Create class Empregado using constructor
 * @author Diego Kazadi
 *
 */
public class EmpregadoUsandoConstrutor {
	/*
	 * Declaration of variables
	 */
	private String nome;
	private String matricula;
	private int idade;
	private double salario;
	
	/**
	 * Using constructor
	 * @param nome
	 * @param matricula
	 * @param idade
	 * @param salario
	 */
	public EmpregadoUsandoConstrutor(String nome, String matricula, int idade, double salario) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		this.salario = salario;
		
	}
	/*
	 * Generate method access (get) e modifier
	 * (set) 
	 */

	/**
	 * @return the nome
	 */
	private String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the matricula
	 */
	private String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the idade
	 */
	private int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the salario
	 */
	private double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
