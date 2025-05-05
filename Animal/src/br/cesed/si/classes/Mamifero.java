package br.cesed.si.classes;

import br.cesed.si.abstrac.Animal;

/**
 * Classe Mamifero - representa um mamífero, um tipo de Animal com características
 * específicas, como a presença de pelos e a alimentação através de amamentação.
 * Herda da classe Animal e implementa métodos concretos específicos para mamíferos.
 * 
 * @author Diego
 */
public class Mamifero extends Animal {

    // Atributo específico da classe Mamifero
    private String corPelo;

    // Construtor para inicializar os atributos
    public Mamifero(float peso, int idade, int membro, String corPelo) {
        super(peso, idade, membro); // Chama o construtor da classe pai (Animal)
        this.corPelo = corPelo;
    }

    // Getter e Setter para o atributo corPelo
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    /**
     * Método final - Define o deslocamento de um mamífero para um local específico.
     * Não pode ser sobrescrito pelas subclasses.
     */
    public final void irPara(int p) {
        System.out.println("Animal: deslocando para " + p + " metros.");
    }

    /**
     * Métodos sobrescritos de Animal que implementam comportamentos gerais de mamíferos.
     */
    @Override
    public void locomover() {
        System.out.println("Correndo tranquilamente!");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero: grunhido ou rugido.");
    }

    // Método específico de mamíferos, como cuidado com filhotes
    public void cuidarDosFilhotes() {
        System.out.println("Mamífero cuidando de seus filhotes com carinho.");
    }
}
