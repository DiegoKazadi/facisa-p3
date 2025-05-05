package br.cesed.si.p3.arrays;

/**
 * Classe Conta representa uma conta bancária com agência e número da conta.
 * Esta classe será usada como exemplo em estruturas de dados baseadas em arrays.
 * 
 * Autor: Diego
 */
public class Conta {

	// Atributos privados que representam o número da agência e da conta
	private int agencia;
	private int conta;

	/**
	 * Construtor da classe Conta.
	 * 
	 * @param agencia Número da agência bancária
	 * @param conta   Número da conta bancária
	 */
	public Conta(int agencia, int conta) {
		super(); // chamada à superclasse Object (implícita, pode ser omitida)
		this.agencia = agencia;
		this.conta = conta;
	}

	// Métodos getters e setters permitem acesso e modificação dos atributos privados

	/**
	 * Retorna o número da agência.
	 * 
	 * @return número da agência
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * Atualiza o número da agência.
	 * 
	 * @param agencia novo número da agência
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * Retorna o número da conta.
	 * 
	 * @return número da conta
	 */
	public int getConta() {
		return conta;
	}

	/**
	 * Atualiza o número da conta.
	 * 
	 * @param conta novo número da conta
	 */
	public void setConta(int conta) {
		this.conta = conta;
	}

	/**
	 * Representação textual da conta.
	 * Útil para depuração e exibição em listas.
	 */
	@Override
