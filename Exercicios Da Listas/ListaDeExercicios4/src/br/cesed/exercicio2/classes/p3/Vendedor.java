/**
 * 
 */
package br.cesed.exercicio2.classes.p3;

/**
 * @author Diego Kazadi
 *
 */
public final class Vendedor extends Empregado{
	private double valorVendas;
	private int qntVendas;
	
	
	// Generate method get setter

	/**
	 * @return the valorVendas
	 */
	public double getValorVendas() {
		return valorVendas;
	}


	/**
	 * @param valorVendas the valorVendas to set
	 */
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}


	/**
	 * @return the qntVendas
	 */
	public int getQntVendas() {
		return qntVendas;
	}


	/**
	 * @param qntVendas the qntVendas to set
	 */
	public void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}

	@Override
	public void valorInss() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nome do Vendedor : " + this.nome + ", Salario : " + this.salario +
				", valor de Vendas : " + valorVendas + ", Quantidade das Vendas : " + qntVendas + "\n";
	}


}
