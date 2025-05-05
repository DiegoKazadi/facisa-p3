package br.cesed.si.abstracts;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membro;
    protected static int numeroAnimal = 0;

    public Animal(float peso, int idade, int membro) {
        this.peso = peso;
        this.idade = idade;
        this.membro = membro;
        numeroAnimal++; // Conta total de animais criados
    }

    // Métodos abstratos - devem ser implementados nas subclasses
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    // Getters e Setters
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembro() {
        return membro;
    }

    public void setMembro(int membro) {
        this.membro = membro;
    }

    public static int getNumeroAnimal() {
        return numeroAnimal;
    }
}
