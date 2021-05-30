package projetofinal;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssostodo;

    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssostodo = 0;
    }


    @Override
    protected void ganharExperiencia() {

    }

    public void viuMaisumUm(){
        /*setViews(getViews()+1);*/

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssostodo() {
        return totAssostodo;
    }

    public void setTotAssostodo(int totAssostodo) {
        this.totAssostodo = totAssostodo;
    }

    @Override
    public String toString() {
        return "=-=-=-=-Gafanhoto =-=-=-=-\n" +
                super.toString() +
                "\nlogin = " + login +
                "\ntotAssostodo = " + totAssostodo +
                "\n=-=-=-=-=-=-=-=-=-=-=-=-=\n";
    }
}
