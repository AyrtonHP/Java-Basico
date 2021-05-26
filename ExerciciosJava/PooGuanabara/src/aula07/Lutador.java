package aula07;

public class Lutador implements Espesificacao {
    private String nome;
    private String nacionalidade;
    private int idade;
    private  double altura;
    private double peso;
    private String categoria;
    private int vitoria, empates, derrota;

    public Lutador(String n,String nacio, int idade, double altura, double p, int vitoria, int derrota, int empates) {
        this.setNome(n);
        this.setNacionalidade(nacio);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(p);
        this.setVitoria(vitoria);
        this.setDerrota(derrota);
        this.setEmpates(empates);
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Invalida";
        } else if (this.getPeso() <= 70.3) {
            this.categoria =  "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria =  "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria =  "Pesado";
        } else {
            this.categoria =  "invalido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }


    @Override
    public void apresentar() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Chegou a Hora! Apresentamos o Lutador: " + this.getNome());
        System.out.println("Diretamente de: " + this.getNacionalidade());
        System.out.println(getIdade() + " Anos");
        System.out.println(getAltura() + " M de altura");
        System.out.println("Pesando: " + this.getPeso() + " KG");
        System.out.println("Ganhou: " + getVitoria());
        System.out.println("Perdeu: " + getDerrota());
        System.out.println("Empatou: " + getEmpates());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    @Override
    public void status() {
        System.out.println(getNome() + "é um peso " + this.getCategoria());
        System.out.println(getVitoria() + " Vitórias");
        System.out.println(getDerrota() + " Derrotas");
        System.out.println(getEmpates()+ " Empates");
    }

    @Override
    public void ganharLuta() {
        setVitoria(getVitoria() + 1);
    }

    @Override
    public void perderLuta() {
        setDerrota(getDerrota() + 1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates()+ 1);
    }
}
