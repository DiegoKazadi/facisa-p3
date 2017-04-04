/**
 * 
 */
package br.cesed.si.classes;

import br.cesed.si.abstrac.Animal;

/**
 * @author diego
 *
 */
public class Ave extends Animal {
	private String corEscama;

	// criação do metodo construtor se não foi definido ele estava implicito
	public Ave(float peso, int idade, int membro, String corEscama){
		super(peso, idade, membro);
		this.corEscama = corEscama;
	}
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("Voando");
		
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
		
	}
	@Override
	public void emitirSom() {
		System.out.println("Som de Ave");
		
	}
	public void fazerNinho(){
		System.out.println("Construindo um Ninho");
		
		
	}
}
