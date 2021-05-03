package Lpoo09;

import javax.swing.*;

public class Exercicio32 {
    double nota1, nota2, conceito;
    String avaliacao, tipo, situacao, con;
// metodo construtor

//    public Exercicio32() {
//        tipo = JOptionPane.showInputDialog("Escolha entre as seguinte escolaridades");
//        if (tipo.equals("segundo grau")) {
//            Avaliar();
//        } else if (tipo.equals("superior")) {
//            conta2();
//        } else {
//            conta3();
//        }
//
//    }

// Metodos sem retorno
    public void Avaliar(double nota1, double nota2, double conceito) {
         double media = (nota1 + nota2)/ 2 + conceito;
        if (media <= 3 ) {
            situacao = "Reprovado";
        } else if (media < 7) {
            situacao = "Exame";
        } else {
             situacao  = "Aprovado";
        }
        System.out.println(situacao);

    }
    public void Avaliar(double nota1, double nota2) {
         double media = (nota1 + nota2)/ 2;
        if (media <= 3 ) {
            situacao = "Reprovado";
        } else if (media < 7) {
            situacao = "Exame";
        } else {
             situacao  = "Aprovado";
        }
        System.out.println(situacao);
    }
    public void Avaliar(String con) {
        if (con.equals("a") || con.equals("b") || con.equals("c")) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
