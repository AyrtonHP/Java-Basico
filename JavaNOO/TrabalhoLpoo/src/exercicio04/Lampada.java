package exercicio04;

public class Lampada {
    boolean estado;
    public  void metodoLigar(){
        estado = true;
    }
    public  void metodoDesligar(){
        estado = false;
    }
    public  void mostrarEstado(){
        if (estado) {
            System.out.println("Ligada");
        } else {
            System.out.println("Desligado");
        }
    }
}
