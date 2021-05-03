import javax.swing.*;

public class Numero01 {

    public static void main(String[] args) {
        int pares = 0, impar = 0, maior = 0;
        float cont = 0, s = 0;
        String  res;
        do {
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número" + "0 interrompe"));
            res = JOptionPane.showInputDialog(null,"o interrompe");

            s += n;

            cont +=1;

            if (n % 2 == 0){
                pares +=1;
            }else{
                impar +=1;
            }

            if (n >= 100){
                maior +=1;
            }

        } while ( res.equals("0")  );{
            float media = s / cont;
            JOptionPane.showMessageDialog(null," Total de Valores: " + cont  +
                " total de pares " + pares + " Total de impares " + impar + " acima de 100 " + maior + "media: " + media);

        }
    }
}