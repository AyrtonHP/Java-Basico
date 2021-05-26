package Aula09;

public class Index {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new  Livro[3];

    p[0] =  new Pessoa("Ayrton", 22, "M");
    p[1] = new Pessoa("Gabriela", 25,"F");

    l[0] = new Livro("Jose", 300, "aprendo java", p[0]);
    l[1] = new Livro("pedro", 500, "Aprendendo HTML", p[1]);
    l[1] = new Livro("Maria", 700, "java avançado", p[0]);

        l[0].abrir();
        l[0].folhear(500);
        System.out.println(l[0].Detalhes());



    }
}
