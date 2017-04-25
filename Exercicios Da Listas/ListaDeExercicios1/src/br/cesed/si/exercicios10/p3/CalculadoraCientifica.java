/**
 * 
 */
package br.cesed.si.exercicios10.p3;


/**
 * @author Diego Kazadi
 *
 */
public final class CalculadoraCientifica extends Calculadora{

	public CalculadoraCientifica(double numero, double numero1) {
		super(numero, numero1);
		
	}
	public double raizQuadrado(){
		return (numero1 ** 2);
	}
	@Override
	public int soma() {
		return (int) (numero + numero1);
	}

	@Override
	public int substracao() {
		
		return (int)(numero1 + numero);
	}

	@Override
	public int mutiplicacao() {
		return (int)(numero * numero1);
	}

	@Override
	public int divisao() {
		return (int)(numero / numero1);
	}

	
}
