/**
 * 
 */
package br.cesed.si.p3.dequeus;

/**
 * @author aluno
 *
 */
public class TestDequeus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dequeus dq = new Dequeus();
		System.out.println(dq);
		
		// Addicionar no Inicio
		
		dq.addInicio("Diego ");
		System.out.println(dq.toString());
		
		dq.addFinal("Valencia ");
		
		//Addicionar no Final
		dq.addFinal("Vinicius ");
		System.out.println(dq.toString());
		
		//Imprimir todos elemento
		dq.exibeAllElemento();
		
		
	}

}