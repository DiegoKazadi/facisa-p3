/**
 * 
 */
package br.cesed.pessoa.classes.p3;

import br.cesed.si.exercicio4.p3.Empregado;

/**
 * @author Diego Kazadi
 *
 */
public final class Administrador extends Empregado {
	private double ajudaDeCusto;
	/**
	 * @param nome
	 * @param idade
	 * @param sexo
	 * @param endereco
	 * @param telefone
	 * @param matricula
	 * @param salario
	 * @param salarioBase
	 * @param codigoSetor
	 */
	
	public Administrador(String nome, int idade, String sexo, String endereco, String telefone, String matricula,
			double salario, double salarioBase, int codigoSetor, double ajudaDeCusto) {
		super(nome, idade, sexo, endereco, telefone, matricula, salario, salarioBase, codigoSetor);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	/**
	 * @return the ajudaDeCusto
	 */
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	/**
	 * @param ajudaDeCusto the ajudaDeCusto to set
	 */
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	/* (non-Javadoc)
	 * @see br.cesed.pessoa.classes.p3.Empregado#valorInss()
	 */
	@Override
	public void valorInss() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see br.cesed.pessoa.classes.p3.Empregado#calculaSalario()
	 */
	@Override
	public void calculaSalario() {
		// TODO Auto-generated method stub

	}

}
