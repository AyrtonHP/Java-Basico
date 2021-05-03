package exercicio02;

import javax.swing.*;

public class Pessoa {
    String rg, cpf, nome, endereco, email, celular;
    double altura, peso;
    char sexo;
    int idade;

    public Pessoa(String rg, String cpf, String nome, String endereco, String email, String celular, String altura, String peso, String sexo, String idade) {
        this.rg = JOptionPane.showInputDialog("Informe o seu RG: " + rg);
        this.cpf = JOptionPane.showInputDialog("Informe seu CPF: " + cpf);
        this.nome = JOptionPane.showInputDialog("Informe seu nome: " + nome);
        this.endereco = JOptionPane.showInputDialog("Informe seu endereço: " + endereco);
        this.celular = JOptionPane.showInputDialog("Informe o número do seu telefone celular " + celular);
        this.email = JOptionPane.showInputDialog("Qual o seu E-mail: " + email);
        this.altura = Double.parseDouble(JOptionPane.showInputDialog("Informe Seu endereço: " + altura));
        this.peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso: : " + peso));
        this.sexo = JOptionPane.showInputDialog("Informe seu sexo").charAt(0);
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Informe seu nome: " + idade));
    }
}
