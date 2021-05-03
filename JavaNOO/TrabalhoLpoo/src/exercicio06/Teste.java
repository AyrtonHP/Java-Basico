package exercicio06;

public class Teste {
    public static void main(String[] args) {
        Pontuacao time = new Pontuacao();
        time.ganharPartida();
        time.empatarPartida();
        time.perdePartida();
        System.out.println(time.pontosGanhos);
    }
}
