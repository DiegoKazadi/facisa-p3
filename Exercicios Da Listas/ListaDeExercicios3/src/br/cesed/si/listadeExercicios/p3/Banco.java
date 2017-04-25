/**
 * 
 */
package br.cesed.si.listadeExercicios.p3;

/**
 * Create class Bank 
 *  
 * @author Diego Kazadi
 *
 */
public class Banco {
	/*
	 * Declaration of the variables
	 */
	private int codigo;
	private String nome;
	private String paisOrigiem;
	
	/**
	 * Generate constructor
	 * @param codigo
	 * @param nome
	 * @param paisOrigiem
	 */
	public Banco(int codigo, String nome, String paisOrigiem) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.paisOrigiem = paisOrigiem;
	}
	/*
	 * Generate method access (get) e modifier
	 * (set) 
	 */
	
	private int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	private String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private String getPaisOrigiem() {
		return paisOrigiem;
	}
	public void setPaisOrigiem(String paisOrigiem) {
		this.paisOrigiem = paisOrigiem;
	}
	
	/*
	 * Generate toString for define input and output
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Banco : " + nome + ", Codigo : " + codigo + ", Pais de Origiem : " + paisOrigiem + "\n";
	}
	
	
}
