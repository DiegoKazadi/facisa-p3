/**
 * 
 */
package br.cesed.si.listadeExercicios.p3;

/**
 * Create class Agency
 * @author Diego Kazadi
 *
 */
public class Agencia {
	/*
	 * Declaration of the variables
	 */
	private int numer;
	private String nome;
			
	/**
	 * Generate constructor
	 * @param numer
	 * @param nome
	 */
	public Agencia(int numer, String nome) {
		super();
		this.numer = numer;
		this.nome = nome;
	}

	/*
	 * Generate method access (get) e modifier
	 * (set) 
	 */
		
	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/*
	 * Generate toString for define input and output
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agencia Numero : " + numer + ", Local : " + nome + "\n";
	}
	
	

}
