package br.cesed.si.classes;

import br.cesed.si.abstrac.Animal;

/**
 * Classe Reptil - Representa um réptil, que é um tipo de Animal com características
 * típicas, como escamas e locomoção rastejante. Herda da classe Animal e implementa
 * os métodos para comportamento de locomover, alimentar e emitir som, com ajustes
 * específicos para répteis.
 * 
 * @author Diego
 */
public class Reptil extends Animal {

    // Atributo específico da classe Reptil
    private String corEscama;
    
    /**
     * Construtor para inicializar os atributos do Reptil.
     * 
     * @param peso        Peso do réptil.
     * @param idade       Idade do réptil.
     * @param membro      Número de membros do réptil.
     * @param corEscama   Cor da escama do réptil.
     */
    public Reptil(float peso, int idade, int membro, String corEscama) {
        super(peso, idade, membro); // Chama o construtor da classe pai (Animal)
        this.corEscama = corEscama;
    }

    /**
     * Método específico para o comportamento de locomoção de um réptil.
     * O réptil se move rastejando no chão.
     */
    @Override
    public void locomover() {
        System.out.println("Rastejando no sol!");
    }

    /**
     * Método sobrescrito para a alimentação do réptil, que se alimenta de vegetais.
     */
    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais!");
    }

    /**
     * Método sobrescrito para a emissão de som do réptil.
     * Alguns répteis emitem sons, mas de forma diferente de mamíferos ou aves.
     */
    @Override
    public void emitirSom() {
        System.out.println("Som de réptil!");
    }

    // Getter e Setter para o atributo corEscama
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    /**
     * Método para representar o comportamento de aquecer-se no sol.
     * Alguns répteis, como cobras, se aquecem no sol, e isso pode ser representado
     * como um comportamento adicional.
     */
    public void aquecerNoSol() {
        System.out.println("Reptil se aquece no sol!");
    }
}
