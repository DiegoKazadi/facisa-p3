package br.cesed.si.p3.arrays.atividade;

public class TesteArrayListFacisa {

	public static void main(String[] args) {
		
		// Cria uma nova lista com capacidade inicial de 3 elementos
		ArrayListFacisa alf = new ArrayListFacisa(3);
		
		// Adiciona o primeiro elemento
		alf.add("Objeto 1");
		System.out.println(alf.size()); // deve imprimir 1
		
		// Adiciona o segundo elemento
		alf.add("Objeto 2");
		System.out.println(alf.size()); // deve imprimir 2
		
		// Adiciona o terceiro elemento
		alf.add("Objeto 3");
		System.out.println(alf.size()); // deve imprimir 3
		
		// Adiciona o quarto elemento, forçando a duplicação da capacidade interna
		alf.add("Objeto 4"); // aqui o array será duplicado internamente
		System.out.println(alf.size()); // deve imprimir 4
		
		// Acessa o elemento da posição 1 (lembrando que índices começam em 0)
		System.out.println(alf.getByIndex(1)); // deve imprimir "Objeto 2"
		
		// Busca a posição do "Objeto 2"
		System.out.println(alf.findPosition("Objeto 2")); // deve imprimir 1 
		
		// Remove o "Objeto 2" e ajusta o array
		alf.remove("Objeto 2");
		System.out.println(alf.size()); // deve imprimir 3
		
		// Imprime todos os elementos ainda presentes no array
		alf.printAllElements();
	}
}
