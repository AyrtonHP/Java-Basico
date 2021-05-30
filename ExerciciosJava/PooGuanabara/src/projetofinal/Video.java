package projetofinal;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao, views, custidas;
    private boolean  reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.custidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
    this.reproduzindo = true;

    }

    @Override
    public void pause() {
        this.reproduzindo = false;

    }

    @Override
    public void like() {
        this.custidas ++;

    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCustidas() {
        return custidas;
    }

    public void setCustidas(int custidas) {
        this.custidas = custidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "=-=-=-=- Video -=-=-=-=-=" +
                "\ntitulo = " + titulo +
                "\navaliacao = " + avaliacao +
                "\nviews= " + views +
                "\ncustidas = " + custidas +
                "\nreproduzindo = " + reproduzindo +
                "\n=-=-=-=-=-=-=-=-=-=-=-=-=";
    }
}
