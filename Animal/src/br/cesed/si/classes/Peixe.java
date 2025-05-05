package br.cesed.si.classes;

import br.cesed.si.abstrac.Animal;

/**
 * Classe Peixe - Representa um peixe, que é um tipo de Animal aquático com características
 * específicas, como escamas e o hábito de nadar. Herda da classe Animal e implementa
 * os métodos para o comportamento de locomover, alimentar e emitir som.
 * 
 * @author Diego
 */
public class Peixe extends Animal {
    
    // Atributo específico da classe Peixe
    private String corEscama;
    
    // Construtor para inicializar os atributos de Peixe
    public Peixe(float peso, int idade, int membro, String corEscama) {
        super(peso, idade, membro); // Chama o construtor da classe pai (Animal)
        this.corEscama = corEscama;
    }
    
    /**
     * Método específico para Peixe: soltar bolhas.
     * Simula o comportamento de alguns peixes de soltar bolhas na água.
     */
    public void soltarBolha() {
        System.out.println("Solta uma bolhinha de ar!");
    }

    /**
     * Sobrescrita do método locomover() de Animal, com o comportamento de um peixe.
     */
    @Override
    public void locomover() {
        System.out.println("Peixe se locomove nadando com suas nadadeiras!");
    }

    /**
     * Sobrescrita do método alimentar() de Animal, com o comportamento de alimentação de peixes.
     */
    @Override
    public void alimentar() {
        System.out.println("Peixe se alimenta de plantas aquáticas ou pequenos organismos!");
    }

    /**
     * Sobrescrita do método emitirSom() de Animal, informando que os peixes não emitem sons
     * de forma notável, em comparação com outros animais.
     */
    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som de forma notável!");
    }

    // Getter e Setter para o atributo corEscama
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
