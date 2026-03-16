public class Main {

    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Nina", 3);
        Animal gato = new Gato("Garfield", 2);

        cachorro.emitirSom();
        cachorro.dormir();

        System.out.println();

        gato.emitirSom();
        gato.dormir();
    }
}

//Juntamos tudo na main