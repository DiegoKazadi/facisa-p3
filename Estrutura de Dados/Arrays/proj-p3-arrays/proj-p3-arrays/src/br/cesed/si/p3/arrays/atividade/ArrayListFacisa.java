package br.cesed.si.p3.arrays.atividade;

import java.util.Arrays;

/**
 * Classe que simula uma implementação simplificada de um ArrayList.
 * Permite adicionar, remover, buscar e imprimir elementos.
 * 
 * @author Diego
 */
public class ArrayListFacisa {

	private Object[] elementos; // Vetor de objetos
	private int size = 0;       // Quantidade real de elementos armazenados

	/**
	 * Construtor que inicializa o array com tamanho fixo.
	 * 
	 * @param capacidade capacidade inicial do ArrayList
	 */
	public ArrayListFacisa(int capacidade) {
		elementos = new Object[capacidade];
	}

	/**
	 * Retorna o número de elementos armazenados (não nulos).
	 * 
	 * @return tamanho atual da lista
	 */
	public int size() {
		return size;
	}

	/**
	 * Adiciona um objeto ao final da lista.
	 * 
	 * @param obj objeto a ser adicionado
	 */
	public void add(Object obj) {
		if (size == elementos.length) {
			// Dobra o tamanho do array caso esteja cheio
			elementos = Arrays.copyOf(elementos, elementos.length * 2);
		}
		elementos[size++] = obj;
	}

	/**
	 * Remove a primeira ocorrência de um objeto na lista.
	 * 
	 * @param obj objeto a ser removido
	 */
	public void remove(Object obj) {
		for (int i = 0; i < size; i++) {
			if (elementos[i].equals(obj)) {
				// Move os elementos seguintes uma posição à esquerda
				for (int j = i; j < size - 1; j++) {
					elementos[j] = elementos[j + 1];
				}
				elementos[--size] = null; // Remove o último duplicado e ajusta o tamanho
				return;
			}
		}
	}

	/**
	 * Retorna o objeto da posição indicada.
	 * 
	 * @param index índice desejado
	 * @return objeto na posição ou null se inválido
	 */
	public Object getByIndex(int index) {
		if (index >= 0 && index < size) {
			return elementos[index];
		}
		return null;
	}

	/**
	 * Retorna a posição do objeto informado ou -1 se não encontrar.
	 * 
	 * @param obj objeto a ser buscado
	 * @return índice do objeto ou -1
	 */
	public int findPosition(Object obj) {
		for (int i = 0; i < size; i++) {
			if (elementos[i].equals(obj)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Imprime todos os elementos da lista.
	 */
	public void printAllElements() {
		System.out.println("Elementos na lista:");
		for (int i = 0; i < size; i++) {
			System.out.println(elementos[i]);
		}
	}
}
