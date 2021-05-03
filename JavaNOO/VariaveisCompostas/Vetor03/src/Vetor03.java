import java.util.Arrays;

public class Vetor03 {
    public static void main(String[] args) {
        double vetor[] = {1,2.5,5.7,6,7.1};
        Arrays.sort(vetor);
        for (double valor: vetor){
            System.out.println(valor+ "");
        }
    }
}
