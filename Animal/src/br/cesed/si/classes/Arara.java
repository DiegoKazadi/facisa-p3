package br.cesed.si.classes;

/**
 * Classe Arara - Representa uma arara, que é um tipo específico de ave, conhecida 
 * por suas cores vibrantes e sua habilidade de imitar sons. As araras são aves 
 * exóticas que habitam principalmente florestas tropicais.
 * 
 * @author Diego
 */
public class Arara extends Ave {

    /**
     * Construtor para inicializar os atributos da Arara.
     * A arara herda as características gerais das aves, mas tem comportamento específico.
     * 
     * @param peso        Peso da arara.
     * @param idade       Idade da arara.
     * @param membro      Número de membros da arara.
     * @param corPena     Cor das penas da arara (característica distinta das araras).
     */
    public Arara(float peso, int idade, int membro, String corPena) {
        super(peso, idade, membro, corPena); // Chama o construtor da classe pai (Ave)
    }

    /**
     * Método sobrescrito para o som da arara, que é conhecida por sua habilidade 
     * em imitar sons humanos e outros animais.
     */
    @Override
    public void emitirSom() {
        System.out.println("Arara imita sons com seu grito característico: 'Cui-cui!'");
    }

    /**
     * Método específico da arara, que simula o comportamento de voar alto nas 
     * florestas tropicais, um dos comportamentos típicos dessas aves.
     */
    public void voarAlto() {
        System.out.println("Arara voa alto nas copas das árvores da floresta tropical.");
    }

    /**
     * Método sobrescrito para o comportamento alimentar da arara. A arara se alimenta 
     * principalmente de frutas, sementes e nozes, e ela usa seu bico forte para quebrar cascas.
     */
    @Override
    public void alimentar() {
        System.out.println("Arara se alimenta de frutas, sementes e nozes.");
    }

    /**
     * Método sobrescrito para a locomoção da arara, que usa suas asas para voar,
     * movendo-se de forma ágil entre as árvores.
     */
    @Override
    public void locomover() {
        System.out.println("Arara se locomove voando de árvore em árvore.");
    }
}
