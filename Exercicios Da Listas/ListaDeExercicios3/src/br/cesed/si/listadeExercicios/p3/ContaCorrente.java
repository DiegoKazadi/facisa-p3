/**
 * 
 */
package br.cesed.si.listadeExercicios.p3;

/**
 * Create of class ContaCorrente
 * @author Diego Kazadi
 *
 */
public class ContaCorrente {
	private int numero;
	private int tipo;
	private double solde;
		
	/**
	 * Generate constructor
	 * @param numero
	 * @param tipo
	 * @param solde
	 */
	public ContaCorrente(int numero, int tipo, double solde) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.solde = solde;
	}
	/*
	 * Generate the method access (get) e modifier
	 * (set)
	 */
	
	private int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	private int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	private double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/*
	 * Generate toString for define input and output
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContaCorrente Numero : " + numero + ", Tipo : " + tipo + ""
				+ ", Solde : R$ " + solde + "\n";
	}
	/**
	 * @return message
	 */
	public void  deposita(double valor){
		this.setSolde(this.getSolde() + valor);
		System.out.println("Você depositou : " + valor);
	}
	public void	setSacar(double valor){
		if (valor <= this.solde){
			this.solde -= valor;
			System.out.println("Você acabou de efetuar o saque : " + valor +
					" Seu salodo atual é de : " + this.solde);
		}else {
			System.out.println("Seu Saldo é insuficiente...");
		}
	}

}
