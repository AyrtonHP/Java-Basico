package Aula02;

public class Caneta01 {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status (){
        System.out.println("modelo: " + this.modelo);
        System.out.println("uma caneta: " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("Esta tampada? " + this.tampada);
    }

    void rabiscar () {
        if (this.tampada) {
            System.out.println("ERRO!, não posso rabiscar");
        } else{
            System.out.println("Estou rabiscando");
        }
        System.out.println("\n");
    }
    void tampar () {
        this.tampada = true;

    }
    void destampar () {
        this.tampada = false;
    }
}
