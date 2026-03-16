public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Quero Lasanha! Miau!");
    }
}

//O que temos aqui
//
//extends Animal → demonstra HERANÇA
//
//Cachorro e Gato herdam:
//
//atributo nome
//
//atributo idade
//
//método dormir()