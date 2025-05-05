package br.cesed.si.classes;

/**
 * Classe Cobra - representa um réptil específico.
 * Herda de Reptil e pode sobrescrever comportamentos.
 * Pode ter comportamentos próprios, como picar.
 * 
 * @author Diego
 */
public class Cobra extends Reptil {

    // Construtor
    public Cobra(float peso, int idade, int membro, String corEscama) {
        super(peso, idade, membro, corEscama);
    }

    // Sobrescrevendo comportamento específico de locomoção
    @Override
    public void locomover() {
        System.out.println("Cobra se rasteja silenciosamente");
    }

    @Override
    public void alimentar() {
        System.out.println("Cobra se alimenta de pequenos roedores");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cobra sibila: 'ssssss...'");
    }

    // Método específico da Cobra
    public void picar() {
        System.out.println("Cobra ataca com uma picada venenosa!");
    }
}
