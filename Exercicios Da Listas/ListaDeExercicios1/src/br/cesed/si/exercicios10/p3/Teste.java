/**
 * 
 */
package br.cesed.si.exercicios10.p3;

/**
 * @author Diego Kazadi
 *
 */
public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CalculadoraCientifica cal = new  CalculadoraCientifica (23, 40);
		CalculadoraCientifica cal1 = new CalculadoraCientifica(0, 0);
		System.out.println(cal.divisao());
		System.out.println(cal.mutiplicacao());
	}

}
