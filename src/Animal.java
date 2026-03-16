// Classe abstrata - representa um conceito genérico
public abstract class Animal {

    protected String nome;
    protected int idade;

    // Construtor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método concreto
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    // Método abstrato (será implementado pelas subclasses)
    public abstract void emitirSom();
}

//O que está acontecendo aqui
//
//abstract class Animal → não pode ser instanciada diretamente
//
//emitirSom() → método abstrato (não tem implementação)
//
//As classes filhas serão obrigadas a implementar esse método