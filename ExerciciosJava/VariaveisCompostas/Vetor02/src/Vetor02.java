public class Vetor02 {
    public static void main(String[] args) {
        String mes[]= {"Jan", "Fev", "Mar", "Abri", "Mai", "jun", "Jul", "ago", "set",
                "Out", "Nov", "Dez" };
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,};
        for (int c = 0; c<mes.length-1; c++){
            System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " Dias ao todo.");

        }
    }
}
