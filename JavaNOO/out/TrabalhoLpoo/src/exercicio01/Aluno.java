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

public class Aluno {
    String ra;
    String nome;
    String curso;


    public Aluno(String r, String n, String c) {
        this.ra = r;
        this.nome = n;
        this.curso = c;
        System.out.println("Bem Vindo " + this.nome + "\nSeu RA: " + this.ra + "\nAluno do curso: "+ this.curso + "\n");
    }
    



}

