package aula05;


public class Chamada {
    public static void main(String[] args) {
        Banco p1 = new Banco();
        p1.abrirConta();
        p1.setDono("Ayrton");

        Banco p2 = new Banco();
        p2.abrirConta();
        p2.setDono("Jubileu");

        p1.depositar(100);
        p2.depositar(200);
        p2.sacar(100);

        p1.estadoAtual();
        p2.estadoAtual();



    }
}
