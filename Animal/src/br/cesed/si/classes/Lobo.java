/**
 * 
 */
package br.cesed.si.classes;

/**
 * @author diego
 *
 */
public final class Lobo extends Mamifero{

	public Lobo(float peso, int idade, int membro, String corPelo) {
		super(peso, idade, membro, corPelo);

	}
	@Override
	public void emitirSom(){
		System.out.println("Auuuuuuuuuuuuu!");
	}
}
