/*
9 (0,5 ponto) Escreva uma classe em Java as seguintes especificações:
        - Nome da Classe: Ordem
        - Atributos
        - x : int
        - y : int
        - z : int
        - Métodos
        - Ordem (int a, int b, int c)
        - Construtor com parâmetros
        - Atribuir parâmetros aos atributos da classe
        - mostrarMaior()
        - Indicar qual atributo possuí o maior valor (x, y ou z) e mostrar qual é o valor
        - mostrarMenor()
        - Indicar qual atributo possuí o menor valor (x, y ou z) e mostrar qual é o valor
        - mostrarCrescente()
        - Mostrar em ordem crescente os valores contidos em x, y e z
        - mostrarDecrescente()
        - Mostrar em ordem decrescente os valores contidos em x, y e z
        Escrever uma classe Teste que realizará a chamada de todos os métodos, permitindo a verificação do funcionamento dos mesmos.
*/
//"tipo" Aluno.
//AYRTON VITORINO DA SILVA
//N56419-9
//SI3P39
//09/05/2021


package exercicio09;

public class Teste {
    public static void main(String[] args) {
        Ordem credes = new Ordem(1, 7, 2);
        credes.mostrarMaior();
        credes.mostrarMenor();
        credes.mostrarCrescente();
        credes.mostrarDecrescente();

    }
}
