package Aula10Heranca;

public class Professor extends Pessoa{
    private String especialidade;
    private String  salario;

    public void receberSalario(float aumento){
        this.salario += aumento;

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
