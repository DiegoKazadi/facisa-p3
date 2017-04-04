/**
 * 
 */
package br.cesed.si.classes;

/**
 * @author diego
 *
 */
public final class Canguru extends Mamifero{

	public Canguru(float peso, int idade, int membro, String corPelo) {
		super(peso, idade, idade, corPelo);
		
	}
	
	// SobrePondo o metodo
	@Override
	public void locomover(){
		System.out.println("Canguru se locome Saltando");
	}
	
	public void usarBolsa(){
		System.out.println("Canguru usa Bolsa");
	}
	

}
