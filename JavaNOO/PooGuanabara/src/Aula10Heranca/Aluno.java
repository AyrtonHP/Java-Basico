package Aula10Heranca;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public void cancelarMatri(){
        System.out.println("Matricula será cancelada");

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
