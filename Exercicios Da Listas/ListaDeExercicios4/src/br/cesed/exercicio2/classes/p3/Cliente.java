/**
 * 
 */
package br.cesed.exercicio2.classes.p3;

import java.util.Date;

import br.cesed.si.exercicio2.pessoa.p3.Pessoa;

/**
 * @author Diego Kazadi
 *
 */
public final class Cliente extends Pessoa{
	private double valorDivida;
	private Date data;
	
	public Cliente(double valorDivida, Date data){
		super();
		this.valorDivida = valorDivida;
		this.data = data;
		
	}
	// Generate method get setter
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
	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nome do Cliente : "+ this.nome + ", Idade : " + this.idade +
				", valor da Divida : " + valorDivida + ", Data do Nascimento : " + data + "\n";
	}
		

}
