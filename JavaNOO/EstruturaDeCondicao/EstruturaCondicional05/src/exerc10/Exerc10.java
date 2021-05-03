
package exerc10;
import javax.swing.JOptionPane;
public class Exerc10 {
    public static void main(String[] args) {
        float tupila = (float) 6.00; float pizza = (float) 34.00; float sobremesa = (float) 9.00;
        int conta1 = 1;
        
        JOptionPane.showMessageDialog(null,"Quantas pizzas consumidas (01)");
        JOptionPane.showMessageDialog(null,"Quantidade de Chopps Bebidos (03)");
        JOptionPane.showMessageDialog(null,"Quantidade de Sobremesas Consumidas (08)");
        
        
        while (conta1 != 00)
        {
            float n1 = Float.parseFloat(JOptionPane.showInputDialog("(01)"));
            float n2 = Float.parseFloat(JOptionPane.showInputDialog("(03)"));
            float n3 = Float.parseFloat(JOptionPane.showInputDialog("08"));
            int conta = Integer.parseInt(JOptionPane.showInputDialog("Para fechar a conta digite 00"));
            
            n1 =+ n1;
            n2 =+ n2;
            n3 =+ n3;
            
            conta1  = conta;
            if (conta1 == 00)
            {
                float N = tupila * n1;
                float NN = pizza * n2;
                float NNN = sobremesa * n3;
                float M = (float) ((N + NN + NNN));
                float MM  = (float) ((float)  M * 0.10);
                float MMM = (float) (M + MM);
                JOptionPane.showMessageDialog(null, MMM);
            }  
        }           
    }
}
