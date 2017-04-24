import br.cesed.si.p3.testeEmpresa.Pagavel;

/**
 * 
 */

/**
 * @author aluno
 *
 */
public abstract class Pessoa implements Pagavel implements Identificavel {
	protected String nome;
	protected int idade;
	protected int cpf;
	/**
	 * @param nome
	 * @param idade
	 * @param cpf
	 */
	public Pessoa(String nome, int idade, int cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	/**
	 * @param nome
	 * @param cpf
	 */
	public Pessoa(String nome, int cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public abstract void verificaPessoaFisica(int cpf);
	
	public void validaCpf(int cpf){
		this.cpf = cpf;
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}
	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	/**
	 * @return the cpf
	 */
	public int getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
}
