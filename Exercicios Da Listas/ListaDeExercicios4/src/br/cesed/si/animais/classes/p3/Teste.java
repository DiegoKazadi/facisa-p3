/**
 * 
 */
package br.cesed.si.animais.classes.p3;

/**
 * @author Diego Kazadi
 *
 */
public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Generate object of classes 
		Cachorro ca = new Cachorro("Berger Allemand");
		Peixe px = new Peixe("Agua salgada...");
		
		ca.setNome("Booba");
		ca.setPeso(15);
		System.out.println("O primeiro Cachorro comprado  � : " + ca.getNome());
		System.out.println("Seu peso �  " + ca.getPeso() + " kg");
		System.out.println(ca.toString());

		
		px.setNome("Mboto");
		px.setPeso(5);
		System.out.println("O primeiro Peixe  � : " + px.getNome());
		System.out.println("Seu peso �  " + px.getPeso() + " kg");
		System.out.println(px.toString());

	}

}
