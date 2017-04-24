/**
 * 
 */

/**
 * @author aluno
 *
 */
public abstract class Funcionario extends Pessoa {
	protected double salario;

	public Funcionario(String nome, int cpf, double salario) {
		super(nome, cpf);
		this.salario = salario;
		// TODO Auto-generated constructor stub
	}
	
	public abstract double pagaSalario(double salario);
	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/* (non-Javadoc)
	 * @see Pessoa#verificaPessoaFisica(int)
	 */
	@Override
	public void verificaPessoaFisica(int cpf) {
		// TODO Auto-generated method stub

	}

}
