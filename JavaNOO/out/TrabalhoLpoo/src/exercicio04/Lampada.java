/*4 (0,5 ponto) Escreva uma classe em Java para as seguintes especificações:
        - Nome da Classe: Lampada
        - Atributos:
        - estado : boolean
        - Métodos
        - ligar()
        - alterar atributo estado para true
        - desligar()
        - alterar atributo estado para false
        - mostrarEstado()
        Se o estado = true
        Então, mostrar a mensagem “Ligada”
        Senão, mostrar a mensagem “Desligada”
        Escrever uma classe Teste que realizará a chamada de todos os métodos, permitindo a verificação do funcionamento dos mesmos.*/

//"tipo" Aluno.
//AYRTON VITORINO DA SILVA
//N56419-9
//SI3P39
//09/05/2021

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
