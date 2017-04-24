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
		System.out.println("O primeiro Cachorro comprado  é : " + ca.getNome());
		System.out.println("Seu peso é  " + ca.getPeso() + " kg");
		System.out.println(ca.toString());

		
		px.setNome("Mboto");
		px.setPeso(5);
		System.out.println("O primeiro Peixe  é : " + px.getNome());
		System.out.println("Seu peso é  " + px.getPeso() + " kg");
		System.out.println(px.toString());

	}

}
