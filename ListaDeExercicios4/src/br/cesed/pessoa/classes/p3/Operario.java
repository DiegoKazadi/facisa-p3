/**
 * 
 */
package br.cesed.pessoa.classes.p3;

import br.cesed.si.exercicio4.p3.Empregado;
import br.cesed.si.exercicio4.p3.Pessoa;

/**
 * @author Diego Kazadi
 *
 */
public class Operario extends Empregado {
	private double valorProducao;
	
	
	public Operario(String nome, int idade, String sexo, String endereco, String telefone, String matricula,
			double salario, double salarioBase, int codigoSetor, double valorProducao) {
		super(nome, idade, sexo, endereco, telefone, matricula, salario, salarioBase, codigoSetor);
		this.valorProducao = valorProducao;
	}

	/**
	 * @param nome
	 * @param idade
	 * @param sexo
	 * @param endereco
	 * @param telefone
	 */
	
	/**
	 * @return the valorProducao
	 */
	public double getValorProducao() {
		return valorProducao;
	}

	/**
	 * @param valorProducao the valorProducao to set
	 */
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	@Override
	public void valorInss() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculaSalario() {
		// TODO Auto-generated method stub
		
	}
	
	
}
