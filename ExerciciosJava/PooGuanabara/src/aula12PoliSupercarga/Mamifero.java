package aula12PoliSupercarga;

public class Mamifero extends Animall {

    protected  String corDaPele;


    public String getCorDaPele() {
        return corDaPele;
    }

    public void setCorDaPele(String corDaPele) {
        this.corDaPele = corDaPele;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");

    }
}
