/**
 * 
 */
package br.cesed.si.classes;

import br.cesed.si.abstrac.Animal;

/**
 * @author diego
 *
 */
public class Peixe extends Animal{
	// Atributo da classe Peixe
	private String corEscama;
	
	// criação do metodo construtor se não foi definido ele estava implicito
	public Peixe(float peso, int idade, int membro, String corEscama){
		super(peso, idade, membro);
		this.corEscama = corEscama;				
	}
	public void soltarBolha(){
		System.out.println("Solata uma Bolhinha");
	}
	@Override
	public void locomover() {
		System.out.println("Peixe se locomove nadando");		
	}
	@Override
	public void alimentar() {
		System.out.println("Peixe se alimenta com plantas aquáticas");
		
	}
	@Override
	public void emitirSom() {
		System.out.println("Peixe não emite som!");
		
	}
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}
