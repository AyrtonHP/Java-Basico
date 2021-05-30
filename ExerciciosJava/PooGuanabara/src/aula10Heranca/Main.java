package aula10Heranca;

public class Main {
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[1];
        Aluno[] pa = new Aluno[1];
        Professor[] pp = new Professor[1];
        Funcionario[] pf = new Funcionario[1];

        p[0] = new Pessoa();
        pa[0] = new Aluno();
        pp[0] = new Professor();
        pf[0] = new Funcionario();

        p[0].setNome("pedro");
        pa[0].setNome("Maria");
        pp[0].setNome("Claudio");
        pf[0].setNome("Fabiana");

        p[0].setSexo("M");
        pa[0].setSexo("F");
        pp[0].setSexo("M");
        pf[0].setSexo("F");

        p[0].setIdade(20);
        pa[0].setIdade(27);
        pp[0].setIdade(32);
        pf[0].setIdade(12);

        pa[0].setCurso("Python");
        pa[0].setMatri(true);
        pf[0].setTrabalho(true);

        System.out.println(p[0].toString());
        System.out.println(pa[0].toString());
        System.out.println(pp[0].toString());
        System.out.println(pf[0].toString());
    }
}
