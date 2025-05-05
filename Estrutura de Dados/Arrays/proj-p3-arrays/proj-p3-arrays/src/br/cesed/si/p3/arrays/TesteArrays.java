package br.cesed.si.p3.arrays;

/**
 * Classe de testes para manipulação de arrays em Java.
 * Demonstra como criar, inicializar, copiar e manipular arrays de tipos primitivos e objetos.
 * 
 * Autor: Diego
 */
public class TesteArrays {

	public static void main(String[] args) {

		// ------------------- TIME 2 --------------------
		
		// Exemplo de array já inicializado com valores
		int[] meuArrayInt = new int[] {1, 2, 4, 5, 9}; 
		// Note que aqui não definimos o tamanho explicitamente porque ele é inferido pelos elementos
		
		// Outra forma de inicializar um array com tamanho fixo e preenchimento posterior
		int[] meuArrayInt2 = new int[5];
		meuArrayInt2[0] = 1;
		meuArrayInt2[1] = 2;
		meuArrayInt2[2] = 4;
		meuArrayInt2[3] = 5;
		meuArrayInt2[4] = new Integer(9); // Boxing, mas pode usar apenas 9

		// "Esticando" o array para o dobro do tamanho (simulando redimensionamento manual)
		int[] meuArrayProlongado = new int[meuArrayInt2.length * 2];

		// Copiando os elementos do array original para o novo array
		for (int i = 0; i < meuArrayInt2.length; i++) {
			meuArrayProlongado[i] = meuArrayInt2[i];	
		}

		// Atribuindo o novo array ao antigo para continuar usando
		meuArrayInt2 = meuArrayProlongado;

		// ------------------- TIME 1 --------------------

		// Criação de array de inteiros com tamanho fixo
		int[] meuArray = new int[3]; // Por padrão, todos os valores serão 0

		// Exibindo os valores padrão
		for (int i : meuArray) {
			System.out.println(i);
		}

		// Criando array de objetos Conta
		Conta[] meuArrayContas = new Conta[3];
		meuArrayContas[0] = new Conta(1, 1);
		meuArrayContas[1] = new Conta(1, 2);
		meuArrayContas[2] = new Conta(1, 3);
		
		// Se descomentar a linha abaixo, causará erro em tempo de execução:
		// ArrayIndexOutOfBoundsException
		// meuArrayContas[3] = new Conta(1, 4);

		// Exibindo informações das contas usando for-each
		for (Conta conta : meuArrayContas) {
			System.out.println(conta);
		}
	}
}
