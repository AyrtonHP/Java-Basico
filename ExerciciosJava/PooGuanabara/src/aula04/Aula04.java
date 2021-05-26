package aula04;

import javax.swing.*;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(" NIC", "Amarelo", 0.4f);
        //c1.setModelo(JOptionPane.showInputDialog("Digite a marca"));
        //c1. setPonta(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da ponta:")));
        c1.status();
        Caneta c2 = new Caneta("KKK", "Laranja", 1.5f);
        c2.status();

    }


}
