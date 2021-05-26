package Aula02;

public class Aula {
    public static void main(String[] args) {
        Caneta01 c1 = new Caneta01(); // c1 ficara sendo o objeto que foi criado
        c1.modelo = "Bic";
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta01 c2 = new Caneta01();
        c2.modelo = "ReadyToRace";
        c2.cor = "Laranja";
        c2.destampar();
        c2.status();
        c2.rabiscar();



    }
}
