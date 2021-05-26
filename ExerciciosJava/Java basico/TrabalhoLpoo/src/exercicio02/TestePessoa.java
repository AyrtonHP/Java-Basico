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

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa teste1 = new Pessoa("49.155.598-2","448.380.961-00","Clarice Letícia Louise Moura:","Rua das flores", "E-mail:","Celular:",
                1.56,89,'F',41);
        Pessoa teste2 = new Pessoa("16.043.809-3:","003.610.298-96:","Miguel Paulo Levi Rocha:","Rua Anu Branco:", "mmiguelpaulolevirocha@aquino.com.br","(19) 3603-8905:",
                1.71, 69, 'm',17);
        Pessoa teste3 = new Pessoa("14.526.465-8:","255.101.468-93:","Benedito André das Neves:","Rua José Antônio de Souza:", "beneditoandredasneves-96@saopaulo10hotmail.com","(18) 2849-0448:",
                1.94, 89, 'm',32);
    }
}
