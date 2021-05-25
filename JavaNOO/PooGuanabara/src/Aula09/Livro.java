package Aula09;

public class Livro implements  Interface{
    private String autor;
    private  int totPagninas;
    private  int pagAtual;
    private  boolean aberto;
    private String titulo;
    private Pessoa leitor;


    public String Detalhes() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", totPagninas=" + totPagninas +
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                ", titulo='" + titulo + '\'' +
                ", leitor=" + leitor.getNome() +
                '}';
    }

    public Livro(String autor, int totPagninas, String titulo, Pessoa leitor) {

        this.titulo = titulo;
        this.autor = autor;
        this.totPagninas = totPagninas;
        this.pagAtual = 0;
        this.aberto = aberto = false;
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        setAberto(true);

    }

    @Override
    public void fechar() {
        this.setAberto(false);

    }

    @Override
    public void folhear( int pagina) {
        this.pagAtual = pagina;

    }

    @Override
    public void avancarPag() {
        this.pagAtual++;

    }

    @Override
    public void voltarPag() {
        this.pagAtual--;

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPagninas() {
        return totPagninas;
    }

    public void setTotPagninas(int totPagninas) {
        this.totPagninas = totPagninas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
