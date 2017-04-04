/**
 * 
 */
package br.cesed.outrasClasses.p3;

/**
 * create the class car  
 * @author Diego Kazadi
 *
 */
public class Veiculo {
	/*
	 * Declaration of variables
	 */
	private String proprietario;
	private int ano;
	
	/*
	 * Generate method access (get) e modifier
	 * (set) 
	 */
	
	
	/**
	 * @return the proprietario
	 */
	private String getProprietario() {
		return proprietario;
	}
	/**
	 * @param proprietario the proprietario to set
	 */
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	/**
	 * @return the ano
	 */
	private int getAno() {
		return ano;
	}
	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}
	/* Generate toString for define input and output
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Veiculo proprietario : " + proprietario + ", Ano=" + ano + "\n";
	}
	
	
}
