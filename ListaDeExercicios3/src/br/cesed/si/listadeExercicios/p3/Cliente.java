/**
 * 
 */
package br.cesed.si.listadeExercicios.p3;

/**
 * Create of class client
 * @author Diego Kazadi
 *
 */
public class Cliente {
	/*
	 * declaration the variables
	 */
	private String nome;
	private String identidade;
	private String cpf;
		
	/**
	 * Generate constructor
	 * @param nome
	 * @param identidade
	 * @param cpf
	 */
	public Cliente(String nome, String identidade, String cpf) {
		super();
		this.nome = nome;
		this.identidade = identidade;
		this.cpf = cpf;
	}
	/*
	 * Generate method access (get) e modifier
	 * (set) 
	 */
		
	private String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private String getIdentidade() {
		return identidade;
	}
	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}
	private String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/*
	 * Generate toString for define input and output
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "Nome do Cliente : " + nome + ", Identidade : " + identidade + ", Cpf :" + cpf + "\n";
	}
	
	
	
	

}
