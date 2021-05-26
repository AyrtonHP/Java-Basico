/*1 (0,5 ponto) Escreva uma classe em Java para as seguintes especificações:
        - Nome da classe: Aluno
        - Atributos
        - RA : String
        - Nome : String
        - Curso : String
        - Escreva um método construtor em Java para a classe Aluno que receba como parâmetros:
        - RA, Nome e Curso
        - Os atributos devem ter receber os valores dos parâmetros
        Escreva uma classe em Java chamada TesteAluno, que contenha um método "main", e instancie 3 objetos diferentes do "tipo" Aluno.*/

//AYRTON VITORINO DA SILVA
//N56419-9
//SI3P39
//09/05/2021

package exercicio01;

import javax.swing.*;

public class TesteAluno {
    public static void main(String[] args) {
    Aluno teste = new Aluno("N564199", "Ayrton Vitorino da Silva", "Sistema da Informação");
    Aluno teste1 = new Aluno("N478961", "Gabriel Octavel Roxo Nobre", "Psicologia");
    Aluno teste2 = new Aluno("N12532", "Fernando Moura", "Interdiciplinar em Ciências e Tecnologia");
    }
}
