/**
 * 
 */

/**
 * @author aluno
 *
 */
public class Gerente extends Funcionario {



	public Gerente(String nome, int cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
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
