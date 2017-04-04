package br.cesed.si.abstrac;

public abstract class Animal {
	protected float peso;
	protected int idade;
	protected int membro;
	protected static int numeroAnimal = 0;
	
	
	public Animal(float peso, int idade, int membro) {
		super();
		this.peso = peso;
		this.idade = idade;
		this.membro = membro;
		numeroAnimal ++; // total dos animais que serão criadas todas terão o mesmo acesso nessa variavel
		// porque ela é static não muda.
	}
	/**
	 * @category métodos abstract 
	 */
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	// metodo static
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
}
