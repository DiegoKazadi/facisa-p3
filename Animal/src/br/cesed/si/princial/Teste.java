package br.cesed.si.princial;

import br.cesed.si.classes.Ave;
import br.cesed.si.classes.Cachorro;
import br.cesed.si.classes.Mamifero;
import br.cesed.si.classes.Peixe;
import br.cesed.si.classes.Reptil;
import br.cesed.si.enume.TipoDeAnimal;
import br.cesed.si.enume.EstadoSaude;

/**
 * Classe Teste - Responsável por testar as funcionalidades de diferentes tipos de animais.
 * 
 * @author Diego
 */
public class Teste {
    public static void main(String[] args){
        // Instanciando as classes com alguns atributos de exemplo
        Mamifero mf = new Mamifero(20, 2, 1, "Jaune", EstadoSaude.SAUDAVEL);
        Reptil rp = new Reptil(10, 3, 2, "Ecaille");
        Peixe px = new Peixe(32, 3, 1, "Azul");
        Ave av = new Ave(12, 2, 3, "Plumagem");

        // Testando os métodos de alimentação, locomoção e som
        System.out.println("Mamífero:");
        mf.alimentar();
        mf.locomover();
        mf.emitirSom();
        
        System.out.println("\nRéptil:");
        rp.alimentar();
        rp.locomover();
        rp.emitirSom();
        
        System.out.println("\nPeixe:");
        px.alimentar();
        px.locomover();
        px.emitirSom();
        
        System.out.println("\nAve:");
        av.alimentar();
        av.locomover();
        av.emitirSom();

        // Criando um objeto Cachorro e demonstrando comportamento adicional
        Cachorro ca = new Cachorro(5, 3, 1, "Verde", TipoDeAnimal.MAMIFERO, "Boba");
        System.out.println("\nCachorro:");
        System.out.println(ca);
        ca.reagir("Olá");  // Reação a uma saudação
        ca.reagir(true);   // Reação a um comportamento positivo
        ca.reagir(false);  // Reação a um comportamento negativo
        
        // Exemplo de uso de estado de saúde
        System.out.println("\nEstado de saúde do cachorro: " + ca.getEstadoSaude().getDescricao());
        
        // Tratamento de exceções para reações inválidas
        try {
            ca.reagir(null); // Passando valor inválido para testar o tratamento de exceção
        } catch (IllegalArgumentException e) {
            System.out.println("\nErro ao reagir: " + e.getMessage());
        }
    }
}
