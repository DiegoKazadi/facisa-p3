package br.cesed.si.p3.arrays;

import java.util.ArrayList;

/**
 * Exemplo de uso da classe ArrayList do Java.
 * Demonstra como adicionar, armazenar e percorrer elementos em uma lista dinâmica.
 * 
 * Autor: Diego
 */
public class UsandoArrayList {

	public static void main(String[] args) {
		
		// Criando uma lista de Strings sem limite de tamanho
		ArrayList<String> meuAl = new ArrayList<String>();

		// Adicionando elementos na lista
		meuAl.add("Daniel");
		meuAl.add("Wesley Safadão com Cabelo Cortado");

		// Percorrendo e exibindo os elementos da lista
		for (String nome : meuAl) {
			System.out.println(nome);
		}

		// Exemplo adicional: adicionando, removendo e acessando
		meuAl.add("Maria");
		System.out.println("\nElemento na posição 1: " + meuAl.get(1));
		meuAl.remove("Daniel");

		System.out.println("\nApós remoção:");
		for (String nome : meuAl) {
			System.out.println(nome);
		}
	}
}
