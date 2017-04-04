/**
 * 
 */
package br.cesed.si.listadeExercicios.p3;

/**
 * Create class address
 * 
 * @author Diego Kazadi
 *
 */
public class Endereco {
	private String rua;
	private int numero;
	private String telefone;
	
	
	/**
	 * Generate constructor
	 * @param rua
	 * @param numero
	 * @param telefone
	 */
	public Endereco(String rua, int numero, String telefone) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.telefone = telefone;
	}

	/*
	 * Generate method access (get) e modifier
	 * (set) 
	 */
	
	private String getRua() {
		return rua;
	}
		
	public void setRua(String rua) {
		this.rua = rua;
	}
	private int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	private String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	/*
	 * Generate toString for define input and output
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Enderecon Rua : " + rua + ", Numero : " + numero + ","
				+ " Telefone : " + telefone + "\n";
	}

}
