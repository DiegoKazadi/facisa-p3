/**
 * 
 */
package br.cesed.pessoa.classes.p3;

import br.cesed.si.exercicio4.p3.Pessoa;

/**
 * @author Diego Kazadi
 *
 */
public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	
	/**
	 * @param nome
	 * @param idade
	 * @param sexo
	 * @param endereco
	 * @param telefone
	 */
	public Fornecedor(String nome, int idade, String sexo, String endereco, String telefone, double valorDivida, double valorCredito) {
		super(nome, idade, sexo, endereco, telefone);
		this.valorDivida = valorDivida;
		this.valorCredito = valorCredito;
	}
	/**
	 * 
	 * @return difValor
	 */
	public double obterSaldo(){
		return valorCredito - valorDivida;
	}
	

	/**
	 * @return the valorCredito
	 */
	public double getValorCredito() {
		return valorCredito;
	}

	/**
	 * @param valorCredito the valorCredito to set
	 */
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	/**
	 * @return the valorDivida
	 */
	public double getValorDivida() {
		return valorDivida;
	}

	/**
	 * @param valorDivida the valorDivida to set
	 */
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	

}
