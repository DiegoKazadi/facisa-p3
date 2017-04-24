/**
 * 
 */
package br.cesed.pessoa.classes.p3;

import br.cesed.si.exercicio4.p3.Empregado;

/**
 * Create the class Gerente
 * @author Diego Kazadi
 *
 */
public final class Gerente extends Empregado{
	private String nomeGerencia;
	private double valor;
	
	// Method constructor
	
	
	public Gerente(String nome, int idade, String sexo, String endereco, String telefone, double valor, 
			String nomeGerencia, String matricula, double salario, double salarioBase, int codigoSetor ) {
		super(nome, idade, sexo, endereco, telefone, matricula, salario, salarioBase, codigoSetor);
		this.nomeGerencia = nomeGerencia;
		this.valor = valor;
	}

	//Generate method get & setter

	/**
	 * @return the valorInss
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @param valorInss the valorInss to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

	/**
	 * @return the nomeGerente
	 */
	public String getNomeGerente() {
		return nomeGerencia;
	}


	/**
	 * @param nomeGerente the nomeGerente to set
	 */
	public void setNomeGerente(String nomeGerente) {
		this.nomeGerencia = nomeGerente;
	}


	@Override
	public void valorInss() {
		// TODO Implement the method
		this.valor = (salario * 11/ 100);
	}
	@Override
	public void calculaSalario() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nome : " + this.nome + ", Idade : " + this.idade + ", Matricula : " 
	+ this.matricula + ", Nome do Gerente : " + nomeGerencia + ", Valor do INSS : " + this.valor +"\n";
	}

	
}
