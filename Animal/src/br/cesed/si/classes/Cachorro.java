package br.cesed.si.classes;

import br.cesed.si.enums.TipoDeAnimal;

/**
 * Classe que representa um Cachorro, herda de Mamífero e implementa AnimalGanst.
 * Demonstra herança, sobrescrita, sobrecarga e polimorfismo.
 * 
 * @author Diego
 */
public class Cachorro extends Mamifero implements AnimalGanst {

    private String nome;

    // Método estático só para exemplo
    public static void ganst() {
        System.out.println("Modo Ganst ativado!");
    }

    // Construtor
    public Cachorro(float peso, int idade, int membro, String corPelo, TipoDeAnimal alenda, String nome) {
        super(peso, idade, membro, corPelo);
        this.nome = nome;
    }

    // Sobrescrevendo métodos abstratos
    @Override
    public void locomover() {
        System.out.println("Cachorro andando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au!");
    }

    /**
     * Sobrecarga de métodos - diferentes reações do cachorro.
     */

    public void reagir(String frase) {
        if (frase.equals("Olá") || frase.equals("Cheguei")) {
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar e Balançar o Rabo");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar o Rabo");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e Latir");
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
                this.emitirSom();
            } else {
                System.out.println("Ignorar");
            }
        }
    }

    // Representação textual do objeto
    @Override
    public String toString() {
        return "Cachorro: " + getNome() +
               ", Cor: " + getCorPelo() +
               ", Peso: " + getPeso() + " Kg" +
               ", Idade: " + getIdade() + " anos" +
               ", Membros: " + getMembro() +
               ", Total de Animais: " + numeroAnimal;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
