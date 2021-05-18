
/*2 (0,5 ponto) Escreva uma classe em Java para as seguintes especificações:
        - Nome da classe: Pessoa
        - Atributos
        - RG : String
        - CPF : String
        - Nome : String
        - Endereço : String
        - Celular : String
        - Email : String
        - Altura : double
        - Peso : double
        - Sexo : char
        - Idade : int
        - Métodos:
        - Criar um método construtor que receba todas as informações (atributos) para a classe
        Escreva uma classe em Java chamada TestePessoa, que contenha um método "main", e Instancie 3 objetos diferentes do "tipo" Pessoa.
"tipo" Aluno.*/

//AYRTON VITORINO DA SILVA
//N56419-9
//SI3P39
//09/05/2021

package exercicio02;

import javax.swing.*;

public class Pessoa {
    String rg, cpf, nome, endereco, email, celular;
    double altura, peso;
    char sexo;
    int idade;

    public Pessoa(String rg, String cpf, String nome, String endereco, String email, String celular, double altura, double peso, char sexo, int idade) {
        this.rg = rg;
        this.cpf =cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.celular = celular;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.idade = idade;

    }
}
