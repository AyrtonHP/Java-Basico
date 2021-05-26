package aula07;

public class Luta {


    public static void main(String[] args) {
        Lutador l[] = new  Lutador[6];

        Round ufc = new Round();

        l[0]  = new Lutador("Pretty Boy", "frança", 31, 1.75, 68.9, 11, 2, 1);

        l[1]   = new Lutador("putscript", "Brasil", 19, 1.68, 57.8,14,2,3);

        l[2]   = new Lutador("snapshadow", "EUA", 35,1.65, 80.9, 12, 2, 1);

        l[3]   = new Lutador(" Dead Code", "Autrália", 28, 1.93, 81.6, 13, 0, 2);

        l[4] = new Lutador("Ufocobol", "brasil", 37, 1.70, 119.3, 5, 4, 3);

        l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, 12,2,4);

        ufc.marcarLuta(l[0], l[5]);
        ufc.lutar();
        /*l[0].status();
        l[1].status();*/

    }

}
