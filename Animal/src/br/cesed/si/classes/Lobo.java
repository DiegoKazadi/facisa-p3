package br.cesed.si.classes;

/**
 * Classe Lobo - representa um lobo, um tipo de mamífero.
 * Herda de Mamifero e implementa comportamentos específicos de um lobo.
 * 
 * @author Diego
 */
public final class Lobo extends Mamifero {

    // Construtor
    public Lobo(float peso, int idade, int membro, String corPelo) {
        super(peso, idade, membro, corPelo);
    }

    // Sobrescrevendo o método emitirSom para o comportamento específico do lobo
    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuuuuuu! O lobo uiva para a lua!");
    }

    // Método específico do lobo
    public void uivar() {
        System.out.println("Lobo uiva em sintonia com o grupo!");
    }
}
