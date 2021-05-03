package exercicio08;

public class Telefone {
    int numeroMinutos = 0;
    double preco = 2.0;
    public  void duracaoLigacao(int vl){
        numeroMinutos = vl;
    }
    public  void alterarpreco(double prc){
        preco = prc;
    }
    public  void mostrarContar(){
        System.out.println("O valor da sua conta é  " + numeroMinutos * preco);
    }
}
