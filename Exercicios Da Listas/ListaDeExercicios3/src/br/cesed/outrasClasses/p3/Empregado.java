/**
 * 
 */
package br.cesed.outrasClasses.p3;

/**
 * Create the class Empregado
 * @author Diego Kazadi
 *
 */
public class Empregado {
	/*
	 * Declaration of variables
	 */
	private String nome;
	private String matricula;
	private int idade;
	private double salario;
	
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nome do Empregado : " + nome + ", Matricula : " + matricula + ", Idade :"
				+ idade + " Anos "+", Salario : $" + salario
				+ "\n";
	}

	
	
	

}
