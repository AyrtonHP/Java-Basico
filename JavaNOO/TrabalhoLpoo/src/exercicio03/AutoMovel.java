package exercicio03;

public class AutoMovel {
    String placa, cor, combustivel, renavam, chassi;
    int nr_portas, nr_marchas, velocidade;
    boolean ligado;

    public AutoMovel(String placa, String cor, String combustivel, String renavam, String chassi, int nr_portas, int nr_marchas, int velocidade) {
        this.placa = placa;
        this.cor = cor;
        this.combustivel = combustivel;
        this.renavam = renavam;
        this.chassi = chassi;
        this.nr_portas = nr_portas;
        this.nr_marchas = nr_marchas;
        this.velocidade = velocidade;
        this.status();
    }
    public void ligardesligar(boolean ligado){
        if (ligado) {
            this.ligado = true;
        } else {
            this.ligado = false;
        }
    }
    public void  status(){
        System.out.println("Placa: " + placa + "\nCor do veiculo: " + cor + "\nTipo de combustivel: " + combustivel + "\nRenavam: "
                + renavam + "\nchassi: " + chassi +  "\nNúmero de portas: " + nr_portas + "\nNúmero de marchar: "+ nr_marchas
                + "\nVelocidade Máxima: " + velocidade + "\nVeiculo encontra-se ligado? " + ligado);
    }

}
