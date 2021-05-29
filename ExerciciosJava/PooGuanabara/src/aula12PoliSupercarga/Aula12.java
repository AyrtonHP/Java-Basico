package aula12PoliSupercarga;

public class Aula12 {
    public static void main(String[] args) {
        Cachorro ca [] = new Cachorro[1];
        Lobo lo [] = new Lobo[1];
        Mamifero ma[] = new Mamifero[1];

        ca[0] = new Cachorro();
        lo[0] = new Lobo();
        ma[0] = new Mamifero();

        /*lo[0].emitirSom();
        ca[0].emitirSom();*/

        ca[0].reagir("ola");


    }
}
