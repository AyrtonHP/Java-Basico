package aula07;
import java.util.Random;

public class Round implements MenuLuta {

    private Lutador desafiado;
    private  Lutador desafiante;
    private  int rounds;
    private  boolean aprovado;

    @Override
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovado = true;
            this.desafiado = l1;
            this. desafiante = l2;
        } else {
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }

    }

    @Override
    public void lutar() {
        if (this.aprovado) {
            System.out.println("Desafiado");
            this.desafiado.apresentar();
            System.out.println("Desafiante");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Venceu " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Venceu " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }

        } else {
            System.out.println("luta não pode acontecer");
        }

    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
