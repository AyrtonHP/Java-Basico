/*
5 (0,5 ponto) Escreva uma classe em Java as seguintes especificações:
        - Nome da Classe: Carro
        - Atributos
        - velocidade : double
        - Métodos
        - acelerar()
        - Aumentar velocidade em 10
        - freiar()
        - Diminuir velocidade em 10
        - mostrarVelocidade()
        - mostrar o valor da velocidade
        Escrever uma classe Teste que realizará a chamada de todos os métodos, permitindo a verificação do funcionamento dos mesmos.
*/

//"tipo" Aluno.
//AYRTON VITORINO DA SILVA
//N56419-9
//SI3P39
//09/05/2021



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
