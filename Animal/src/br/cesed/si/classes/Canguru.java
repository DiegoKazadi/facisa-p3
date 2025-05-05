package br.cesed.si.classes;

/**
 * Classe final Canguru - herda de Mamifero.
 * Exemplo de sobrescrita de método e método próprio.
 * Não pode ser herdada por outras classes (final).
 * 
 * @author Diego
 */
public final class Canguru extends Mamifero {

    // Construtor
    public Canguru(float peso, int idade, int membro, String corPelo) {
        super(peso, idade, membro, corPelo); // Correção aqui: membro no lugar de idade
    }

    // Sobrescrevendo o método locomover
    @Override
    public void locomover() {
        System.out.println("Canguru se locomove saltando");
    }

    // Método específico do Canguru
    public void usarBolsa() {
        System.out.println("Canguru usa a bolsa para carregar o filhote");
    }
}
