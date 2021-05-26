import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        int vetor[]= new int[20];
        Arrays.fill(vetor,0);
        for (int valor: vetor){
            System.out.println( valor + " ");
        }
    }
}
