/**
 * 
 */
package br.cesed.si.classes;

import br.cesed.si.enume.TipoDeAnimal;

/**
 * @author diego
 *
 */
public class Cachorro extends Mamifero implements AnimalGanst{
	private String nome;
	
	public static void ganst(){
	}
	public Cachorro(float peso, int idade, int membro, String corPelo, TipoDeAnimal alenda, String nome) {
		super(peso, idade, membro, corPelo);
		this.nome = nome;
	}
	// SobrePondo o metodo
	@Override
	public void locomover(){
		System.out.println("Cachoro Ande");
	}
	// SobrePondo o metodo
	@Override
	public void emitirSom(){
		System.out.println("Au Au Au!");
	}
	/*
	 * Sobre carga do metodo reagir do cachorro na mesma classe
	 */
	public void reagir(String frase){
		if (frase.equals("Olá")|| frase.equals("Cheguei")){
			System.out.println("Abanar e Latir");
		}else {
			System.out.println("Rosnar o Rabo");
		}
	}
	public void reagir(int hora, int min){
		if (hora < 12){
			System.out.println("Abanar o  Rababo");
		}else if (hora >= 18){
			System.out.println("Ignorar");
		}else {
			System.out.println("Abanar e Latir");
		}
	}
	public void reagir(boolean dono){
		if (dono){
			System.out.println("Abanar");
		}else {
			System.out.println("Rotinar e Latir");
		}
	}
	public void reagir(int idade, float peso){
		if(idade < 5){
			if (peso < 10){
				System.out.println("Abanar");
			}else{
				System.out.println("Latir");
			}
		}else {
			if (peso < 10){
				System.out.println("Rosnar");
				this.emitirSom();
			}else{
				System.out.println("Ignorar");
			}
			
		}
	}
	@Override
	public String toString() {
		return "Cachorro: " + getNome() + ", Core: " + getCorPelo() + ", Ele pesa: " + getPeso() + " Kg" + ", Sua idade :" + getIdade()
		+ " anos" + ", Membro :" + getMembro() + ", Numero Animal: " + numeroAnimal;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
