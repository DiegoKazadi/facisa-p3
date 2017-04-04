package br.cesed.si.classes;

import br.cesed.si.abstrac.Animal;

public class Mamifero extends Animal{
	//Atributo da classe Mamifero
	
	private String corPelo;
	
	public Mamifero(float peso, int idade, int membro, String corPelo){
		super(peso, idade, membro);
		this.corPelo = corPelo;
	}
	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	// metodo final
	public final void irPara(int p){
		System.out.println("Animal: deslocando para " + p);
	}
	/**
	 * @ Metodos de sobre posição recebido da classe pa Animal
	 * que sera implementado para classe filho
	 */
	@Override
	public void locomover() {
		System.out.println("Correndo Tranquilo!");
	}
	@Override
	public void alimentar() {
		System.out.println("Mamando!");
	}
	@Override
	public void emitirSom() {
		System.out.println("Som de mamifero!");
	}
}
