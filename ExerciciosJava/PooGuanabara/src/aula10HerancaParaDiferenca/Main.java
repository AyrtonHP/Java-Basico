package aula10HerancaParaDiferenca;

public class Main {
    public static void main(String[] args) {
        /*Pessoa [] p = new Pessoa[1];*/ // classes abstratas não podem ser instanciadas
        Visitante [] v = new  Visitante[1];
        Professor [] pro = new  Professor[1];
        Aluno [] aluno = new Aluno[1];
        Bolsista [] bolsita = new Bolsista[1];

       /* p[0] = new Pessoa();*/
        v[0] = new Visitante();
        pro[0] = new Professor();
        aluno[0] = new Aluno();
        bolsita[0] = new Bolsista();

        // herança pobre conhecida como herança de implementação
        /*v[0].setNome("Juvenal");
        v[0].setSexo("M");
        v[0].setIdade(22);
        System.out.println(v[0].toString());*/

        aluno[0].setNome("Claudio");
        aluno[0].setCurso("Informatica");
        aluno[0].setMatricula(1111);
        aluno[0].setIdade(16);
        aluno[0].setSexo("M");
        aluno[0].pagarMatricula();

        bolsita[0].setNome("Ayrton");
        bolsita[0].setIdade(22);
        bolsita[0].setSexo("M");
        bolsita[0].setMatricula(12341);
        bolsita[0].setBolsa(12.5f);
        bolsita[0].pagarMatricula();


    }
}
