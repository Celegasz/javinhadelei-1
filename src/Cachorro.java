public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Ed... Ward...! Au Au!");
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