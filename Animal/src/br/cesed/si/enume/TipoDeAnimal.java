package br.cesed.si.enume;

/**
 * Enum TipoDeAnimal - Representa os tipos de animais que existem no nosso sistema.
 * 
 * @author Diego
 */
public enum TipoDeAnimal {
    MAMIFERO("Mamífero"),
    REPTIL("Réptil"),
    AVE("Ave"),
    PEIXE("Peixe"),
    ANFIBIO("Anfíbio"),
    INSETO("Inseto");

    // Atributo para armazenar o nome do tipo de animal
    private String descricao;

    // Construtor para inicializar a descrição
    TipoDeAnimal(String descricao) {
        this.descricao = descricao;
    }

    // Método para acessar a descrição do tipo de animal
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
