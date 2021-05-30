package aula10Heranca;

public class Aluno extends Pessoa {
    private boolean matri;
    private String curso;

    public void cancelarMatri(){
        System.out.println("Matricula será cancelada");

    }

    public boolean getMatri() {
        return matri;
    }

    public void setMatri(boolean matri) {
        this.matri = matri;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
