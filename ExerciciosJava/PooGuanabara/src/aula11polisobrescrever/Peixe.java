package aula11polisobrescrever;

public class Peixe  extends  Animal{

    private String corPena;

    public void fazerNinho(){

    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substãncias");

    }

    @Override
    public void emitirSom() {
        System.out.println("Soltou bolhar");

    }
}
