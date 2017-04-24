/**
 * 
 */
package br.cesed.si.exercicios8.p3;

/**
 * @author Diego Kazadi
 *
 */
public class Data {
	public int mes;
	public int dia;
	public int ano;
	
	/**
	 * @param mes
	 * @param dia
	 * @param ano
	 */
	public Data(int dia, int mes, int ano) {
		super();
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}
	public String displayData(int dia, int mes,int ano){
		return ("Data de hoje : " + dia + "/" + mes + "/" + ano);
	}
	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}
	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hoje é : " + dia + "/" + mes + "/" + ano + "\n";
	}
	
}
