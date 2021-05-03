package exercicio05;

public class Carro {
    double velocidade;

    public  void acelerar(){
        velocidade += 10;
    }
    public  void freiar(){
        velocidade -= 10;
    }
    public  void  mostrarVelocidade(){
        System.out.println("A velocidade final: " + velocidade);
    }

}
