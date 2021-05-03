package exercicio06;

public class Pontuacao {
    int pontosGanhos;
    public void ganharPartida(){
        pontosGanhos += 3;
    }
    public void empatarPartida(){
        pontosGanhos += 3;

    }
    public void perdePartida(){
        pontosGanhos  += 0;

    }
}
