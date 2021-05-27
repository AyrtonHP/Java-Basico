package aula11polimorfismosobrescrever;

public class Chamada {
    public static void main(String[] args) {
        Mamifero ma[] = new Mamifero[1];
        Reptil ra[] = new Reptil[1];
        Peixe pe[] = new Peixe[1];
        Ave av[] = new  Ave[1];

        ma[0] = new Mamifero();
        ra[0] = new Reptil();
        pe[0] = new Peixe();
        av[0] = new Ave();

        ma[0].setCorPelo("Marrom");
        ma[0].setPeso(35.5f);
        ma[0].setIdade(4);
        ma[0].locomover();
        ma[0].alimentar();
        ma[0].emitirSom();
    }
}
