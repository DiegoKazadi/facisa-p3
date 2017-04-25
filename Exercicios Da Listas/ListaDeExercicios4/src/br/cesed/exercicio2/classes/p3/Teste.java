/**
 * 
 */
package br.cesed.exercicio2.classes.p3;

/**
 * @author Diego Kazadi
 *
 */
public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Instanciando as classes
		
		Gerente gr = new Gerente("Patrick");
		Vendedor db = new Vendedor();
		Cliente cl = new Cliente(250, null);
		
		
		System.out.println(gr);
		System.out.println(db);
		System.out.println(cl);
		

	}

}
