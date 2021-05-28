package aula11polimorfismosobrescrever;

public class Chamada {
    public static void main(String[] args) {
        Mamifero ma[] = new Mamifero[1];
        Reptil ra[] = new Reptil[1];
        Peixe pe[] = new Peixe[1];
        Ave av[] = new  Ave[1];
        Canguru ca [] = new Canguru[1];
        Cachorro cacho [] = new Cachorro[1];
        Cobra co [] = new Cobra[1];
        Tartatura ta [] = new Tartatura[1];
        Goldifish go [] = new Goldifish[1];
        Arara ara [] = new Arara[1];

        ma[0] = new Mamifero();
        ra[0] = new Reptil();
        pe[0] = new Peixe();
        av[0] = new Ave();
        ca[0] = new Canguru();
        cacho[0] = new Cachorro();
        co[0] = new Cobra();
        ta[0] = new Tartatura();
        go[0] = new Goldifish();
        ara[0] = new Arara();

        ca[0].locomover();
        ca[0].usarBolsa();
        cacho[0].locomover();


        /*ma[0].setCorPelo("Marrom");
        ma[0].setPeso(35.5f);
        ma[0].setIdade(4);
        ma[0].locomover();
        ma[0].alimentar();
        ma[0].emitirSom();

        av[0].locomover();*/


    }
}
