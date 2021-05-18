package aula07;

public class Luta {


    public static void main(String[] args) {
        Lutador l[] = new  Lutador[6];

        l[0]  = new Lutador("Pretty Boy", "frança", 31, 1.75, 68.9, "leve",
                11, 2, 1);

        l[1]   = new Lutador("putscript", "Brasil", 19, 1.68, 57.8, "leve",14,2,3);

        l[2]   = new Lutador("snapshadow", "EUA", 35,1.65, 80.9, "medio", 12, 2, 1);

        l[3]   = new Lutador(" Dead Code", "Autrália", 28, 1.93, 81.6,"médio", 13, 0, 2);

        l[4] = new Lutador("Ufocobol", "brasil", 37, 1.70, 119.3, "Pesado", 5, 4, 3);

        l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, "pesado",
                12,2,4);

       l[0].apresentar();
       l[0].status();

    }
}
