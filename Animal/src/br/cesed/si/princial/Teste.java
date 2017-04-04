/**
 * 
 */
package br.cesed.si.princial;

import br.cesed.si.classes.Ave;
import br.cesed.si.classes.Cachorro;
import br.cesed.si.classes.Mamifero;
import br.cesed.si.classes.Peixe;
import br.cesed.si.classes.Reptil;
import br.cesed.si.enume.TipoDeAnimal;

/**
 * @author diego
 *
 */
public class Teste {
	public static void main(String[] args){
		// Instanciar as classes
		Mamifero mf = new Mamifero(20, 2, 1, "Jaune");
		Reptil rp = new Reptil(10, 3, 2,"Ecaille");
		Peixe px = new Peixe(32,3,1,"Azul");
		Ave av = new Ave(12, 2,3,"Plumagem");
		
		// Executando os metodos
		
		mf.alimentar();
		rp.alimentar();
		av.alimentar();
		px.emitirSom();
		Cachorro ca = new Cachorro(5, 3, 1, "Verde", TipoDeAnimal.Alenda, "Boba");
		System.out.println(ca);
		// Tratando Exceções
		ca.reagir("Olá");
		ca.reagir(false);
		ca.reagir(true);
		
	}
}
