/**
 * 
 */
package br.cesed.si.exercicio4.p3;

/**
 * Create the class pessoa
 * @author Diego Kazadi
 *
 */
public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	protected String endereco;
	protected String telefone;
	
	
	/**
	 * @param nome
	 * @param idade
	 * @param sexo
	 * @param endereco
	 * @param telefone
	 */
	public Pessoa(String nome, int idade, String sexo, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	// Generate the method get setter
	
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
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
