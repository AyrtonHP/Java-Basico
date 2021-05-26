
/*8 (0,5 ponto) Escreva uma classe em Java as seguintes especificações:
        - Nome da Classe: Telefone
        - Atributos
        - numeroMinutos : int – valor inicial 0
        - preco : double – valor inicial 2.0
        - Métodos
        - duracaoLigacao(int vl)
        - Adiciona o “vl” (parâmetro de entrada do método) ao atributo
        “numeroMinutos”
        - alterarPreco(double prc)
        - Altera o atributo “preco” para o valor do parâmetro “prc”
        - mostrarConta()
        - mostrar o valor da atual da conta telefônica numMinutos * preco
        Escrever uma classe Teste que realizará a chamada de todos os métodos, permitindo a verificação do funcionamento dos mesmos.*/

//"tipo" Aluno.
//AYRTON VITORINO DA SILVA
//N56419-9
//SI3P39
//09/05/2021

package exercicio08;

public class Telefone {
    int numeroMinutos = 0;
    double preco = 2.0;
    public  void duracaoLigacao(int vl){
        numeroMinutos = vl;
    }
    public  void alterarpreco(double prc){
        preco = prc;
    }
    public  void mostrarContar(){
        System.out.println("O valor da sua conta é  " + numeroMinutos * preco);
    }
}
