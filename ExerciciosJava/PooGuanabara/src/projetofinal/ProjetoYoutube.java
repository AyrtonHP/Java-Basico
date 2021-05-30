package projetofinal;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v [] = new Video[3];
        Gafanhoto p [] = new Gafanhoto[2];

        v[0] = new Video("Aula 1 de Pyhon");
        v[1] = new Video("Aula de MYSQL");
        v[2] = new Video("Aula de HTML e CSS");



        p[0] = new Gafanhoto("Ayrton Vitorino", "M", 22, "Ayrtin");
        p[1] = new Gafanhoto("Gabriela", "F", 25, "GabiAna");


        System.out.println(p[1].toString());
        System.out.println(v[0].toString());



    }
}
