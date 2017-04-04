/**
 * 
 */
package br.cesed.si.classes;

import br.cesed.si.abstrac.Animal;

/**
 * @author diego
 *
 */
public class Reptil extends Animal {
	// Atributo da classe Reptil
	private String corEscama;
	
	// criação do metodo construtor se não foi definido ele estava implicito
	public Reptil(float peso, int idade, int membro,String corEscama){
		super(peso, idade, membro); 
		this.corEscama = corEscama;
		
	}
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	/**
	 * @ Metodos de sobre posição recebido da classe pa Animal
	 * que sera implementado para classe filho
	 */
	@Override
	public void locomover() {
		System.out.println("Rastejando no sol");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo vejetais!");
	}
	@Override
	public void emitirSom() {
		System.out.println("Som de réptil!");
	}
}
