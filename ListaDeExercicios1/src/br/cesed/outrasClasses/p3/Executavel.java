/**
 * 
 */
package br.cesed.outrasClasses.p3;

/**
 * Create the class Executavel
 * @author Diego Kazadi
 *
 */
public class Executavel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Instanciando the objects 
		Veiculo ve = new Veiculo();
		Empregado emp1 = new Empregado();
		Empregado emp2 = new Empregado();
		
		/**
		 * @param Modifie the values the variables
		 */
		ve.setAno(2017);
		ve.setProprietario("Chrispain Kalunda");
		
		emp1.setNome("Jeannette Mitonga");
		emp1.setMatricula("001/243");
		emp1.setIdade(50);
		emp1.setSalario(15000);
		
		emp2.setNome("Rebecca Muadi");
		emp2.setMatricula("002/243");
		emp2.setIdade(48);
		emp2.setSalario(1800);
		
 		//  Não pode ser impresso no console usando get() pós os métodos são privados
		// System.out.println("Veiculo : " + ve.getProprietario());
		System.out.println("Veiculo : " + ve);
		System.out.println("Empregado (a): " + emp1 );
		System.out.println("Empregado (a): " + emp2 );
	}

}
