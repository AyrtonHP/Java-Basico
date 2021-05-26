package Aula03;

public class Caneta01 {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    void status (){
        System.out.println("modelo: " + this.modelo);
        System.out.println("uma caneta: " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("Esta tampada? " + this.tampada);
    }

    public void rabiscar () {
        if (this.tampada) {
            System.out.println("ERRO!, não posso rabiscar");
        } else{
            System.out.println("Estou rabiscando");
        }
        System.out.println("\n");
    }
    public void tampar () {
        this.tampada = true;

    }
    public void destampar () {
        this.tampada = false;
    }
}
