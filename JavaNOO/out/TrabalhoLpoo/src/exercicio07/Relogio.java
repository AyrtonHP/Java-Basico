/*7 (0,5 ponto) Escreva uma classe em Java as seguintes especificações:
        - Nome da Classe: Relogio
        - Atributos
        - hora: int
        - Métodos
        - adicionarHora()
        - O campo hora é aumentado em 1, desde que não ultrapasse o valor de 23.
        Se hora > 23
        Então atribuir 0 a hora
        - subtrairHora()
        - O campo hora é diminuído em 1, desde que não fique negativo.
        Se hora < 0
        Então atribuir 23 a hora
        - mostrarHora()
        - mostrar o valor da hora
        Escrever uma classe Teste que realizará a chamada de todos os métodos, permitindo a verificação do funcionamento dos mesmos.*/
//"tipo" Aluno.
//AYRTON VITORINO DA SILVA
//N56419-9
//SI3P39
//09/05/2021

package exercicio07;

public class Relogio {
    int hora;
    public void  adicionarhora(){
        hora +=1;
        if (hora > 23) {
            hora = 0;
        }
    }
    public  void subtrairhora(){
        hora -=1;
        if (hora < 0) {
            hora = 23;
        }
    }
    public void mostrarHora(){
        System.out.println("O horario atual é: " + hora);
    }
}
