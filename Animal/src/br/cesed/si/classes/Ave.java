package br.cesed.si.classes;

import br.cesed.si.abstracts.Animal;

/**
 * Classe que representa uma Ave, subclasse de Animal.
 * Define comportamento específico de aves, como voar e fazer ninho.
 * 
 * @author Diego
 */
public class Ave extends Animal {
    private String corEscama;

    /**
     * Construtor da classe Ave.
     * 
     * @param peso       Peso da ave
     * @param idade      Idade da ave
     * @param membro     Número de membros (asas e patas)
     * @param corEscama  Cor das escamas (ou penas, se preferir)
     */
    public Ave(float peso, int idade, int membro, String corEscama) {
        super(peso, idade, membro);
        this.corEscama = corEscama;
    }

    // Getters e Setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    // Implementações dos métodos abstratos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    // Método exclusivo das aves
    public void fazerNinho() {
        System.out.println("Construindo um ninho");
    }
}
