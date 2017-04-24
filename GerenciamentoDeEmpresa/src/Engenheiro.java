/**
 * 
 */

/**
 * @author aluno
 *
 */
public final class Engenheiro extends Funcionario {

	/**
	 * @param nome
	 * @param cpf
	 * @param salario
	 */
	public Engenheiro(String nome, int cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	/* 
	 * @see Funcionario#pagaSalario(double)
	 */
	@Override
	public double pagaSalario(double salario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getValorPagamento() {
		// TODO Auto-generated method stub
		return 0;
	}

}
