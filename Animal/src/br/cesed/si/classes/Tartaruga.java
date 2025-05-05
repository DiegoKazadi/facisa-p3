package br.cesed.si.classes;

/**
 * Classe Tartaruga - Representa uma tartaruga, que é um tipo específico de réptil. 
 * Além das características gerais dos répteis, as tartarugas têm características 
 * próprias, como o comportamento de se mover lentamente e a proteção da carapaça.
 * 
 * @author Diego
 */
public class Tartaruga extends Reptil {

    /**
     * Construtor para inicializar os atributos da Tartaruga.
     * A tartaruga herda os atributos de um réptil e tem seu comportamento único.
     * 
     * @param peso        Peso da tartaruga.
     * @param idade       Idade da tartaruga.
     * @param membro      Número de membros da tartaruga.
     * @param corEscama   Cor da escama da tartaruga.
     */
    public Tartaruga(float peso, int idade, int membro, String corEscama) {
        super(peso, idade, membro, corEscama); // Chama o construtor da classe pai (Reptil)
    }

    /**
     * Método sobrescrito para a locomoção da tartaruga, que é mais lenta que outros répteis.
     * A tartaruga é conhecida por sua locomoção lenta e cautelosa.
     */
    @Override
    public void locomover() {
        System.out.println("Tartaruga se locomove lentamente.");
    }

    /**
     * Método específico para a tartaruga se proteger na sua carapaça.
     * Quando ameaçada, a tartaruga pode se retrair na sua carapaça como uma defesa.
     */
    public void seProtegerNaCarapaca() {
        System.out.println("Tartaruga se protege na carapaça.");
    }

    /**
     * Método sobrescrito para a alimentação da tartaruga, que pode comer tanto vegetais 
     * quanto pequenos animais, dependendo da espécie.
     */
    @Override
    public void alimentar() {
        System.out.println("Tartaruga se alimenta de vegetais e pequenos invertebrados.");
    }

    /**
     * Método sobrescrito para o som da tartaruga, que geralmente não emite som, mas pode 
     * fazer um som suave, especialmente quando está se comunicando com outras tartarugas.
     */
    @Override
    public void emitirSom() {
        System.out.println("Tartaruga emite um som suave ou nenhum som.");
    }

    /**
     * Método adicional que simula a tartaruga saindo da água (se for uma tartaruga marinha).
     * Representa um comportamento típico de tartarugas que vivem no ambiente marinho.
     */
    public void sairDaAgua() {
        System.out.println("Tartaruga marinha sai da água para descansar.");
    }
}
