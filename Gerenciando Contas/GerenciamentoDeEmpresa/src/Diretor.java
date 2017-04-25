/**
 * 
 */

/**
 * @author aluno
 *
 */
public class Diretor extends Funcionario {
	private double bonus;
	


	/**
	 * @param nome
	 * @param cpf
	 * @param salario
	 * @param bonus
	 */
	public Diretor(String nome, int cpf, double salario, double bonus) {
		super(nome, cpf, salario);
		this.bonus = bonus;
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double pagaSalario(double salario) {
		// TODO implement salario of director
		salario = salario + bonus; 
		return salario;
	}

	@Override
	public double getValorPagamento() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
