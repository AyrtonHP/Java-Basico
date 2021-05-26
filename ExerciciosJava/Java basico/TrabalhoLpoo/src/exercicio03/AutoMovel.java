/*3 (0,5 ponto) Escreva uma classe em Java para as seguintes especificações:
        - Nome da classe: Automovel
        - Atributos
        - Placa : String
        - Cor : String
        - Nr Portas : int
        - Combustível : String
        - Quilometragem : long
        - Renavam : String
        - Chassi : String
        - Nr Marchas : int
        - Ligado : boolean
        - Velocidade : int
        - Métodos:
        - Criar um método construtor que receba todas as informações (atributos) para a classe
        - ligarDesligar(boolean ligaDesliga)
        - Ligar Ligado = true
        - Desligar Ligado = false
        Escrever uma classe Teste que realizará a chamada de todos os métodos, permitindo a verificação do funcionamento
        dos mesmos.*/

//"tipo" Aluno.
//AYRTON VITORINO DA SILVA
//N56419-9
//SI3P39
//09/05/2021

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
