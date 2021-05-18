package aula06;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MetodosAcessores implements Aula06b{

    //Atributos
    private int volume;
    private boolean ligado;
    private  boolean tocando;

    //Métodos especiais
    public MetodosAcessores() {
        setVolume(getVolume() + 50);
        setLigado(false);
        setTocando(false);

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigado(true);

    }

    @Override
    public void desligar() {
        setLigado(false);

    }

    @Override
    public void abrirMenu() {
        System.out.println("=-=-=-=-=-Menu-=-=-=-==-");
        System.out.println("esta ligado? " + this.getLigado());
        System.out.println("esta tocando? " + this.getTocando());
        System.out.println("Volume:: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("I");
        }
        System.out.println(" ");

    }

    @Override
    public void fecharMenu() {
        System.out.println("fechar Menu");

    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            setVolume(getVolume() + 1);
        } else {
            System.out.println("impossivel aumentar volume");
        }

    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            setVolume(getVolume() - 1);
        } else {
            System.out.println("impossivel aumentar volume");
        }

    }

    @Override
    public void ligarMudo() {
        if ( this.getLigado() &&  this.getVolume() > 0) {
            setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            setVolume(50);
        }

    }

    @Override
    public void play() {
        if (this.getLigado() && !(getTocando())){
            this.setTocando(true);
        }

    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
}
