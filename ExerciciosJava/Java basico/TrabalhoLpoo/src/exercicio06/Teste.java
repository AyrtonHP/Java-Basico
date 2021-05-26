/*6 (0,5 ponto) Escreva uma classe em Java as seguintes especificações:
        - Nome da Classe: Pontuacao
        - Atributos
        - pontosGanhos: int
        - Métodos
        - ganharPartida()
        - Aumentar pontosGanhos em 3
        - empatarPartida()
        - Aumentar pontosGanhos em 3
        - perderPartida()
        - Aumentar pontosGanhos em 0
        Escrever uma classe Teste que realizará a chamada de todos os métodos, permitindo a verificação do funcionamento dos mesmos.*/
//"tipo" Aluno.
//AYRTON VITORINO DA SILVA
//N56419-9
//SI3P39
//09/05/2021

package exercicio06;

public class Teste {
    public static void main(String[] args) {
        Pontuacao time = new Pontuacao();
        time.ganharPartida();
        time.empatarPartida();
        time.perdePartida();
        System.out.println(time.pontosGanhos);
    }
}
