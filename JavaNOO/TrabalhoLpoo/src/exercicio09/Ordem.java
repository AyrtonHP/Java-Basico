package exercicio09;

public class Ordem {
    int x, y, z, aux, maior, menor;

    public Ordem(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void mostrarMaior() {
        if (x > y && x > z) {
            maior = x;
        } else if (y > x && y > z) {
            maior = y;
        } else {
            maior = z;
        }
        System.out.println("O maior valor entre " + x + ", "+ y + " e "+ z  +" Fica sendo "+ maior );
    }

    public void mostrarMenor() {
        if (x < y && x < z) {
            menor = x;
        } else if (y < x && y < z) {
            menor = y;
        } else {
            menor = z;
        }
        System.out.println("O menor valor entre " + x + ", "+ y + " e "+ z  +" Fica sendo "+ menor );
    }

    public void mostrarCrescente() {
        if (x < y && y < z) {
           System.out.println("Ordem Crescente " + x + ", " + y + " e " + z);
        } else {
            if (z < x) {
                aux = z;
                z = x;
                x = aux;
            }
            if (x > y) {
                aux = x;
                x = y;
                y = aux;
            }
            if (y > z) {
                aux = y;
                y = z;
                z = aux;
            }
        System.out.println("Ordem Crescente " + x + ", " + y + " e " + z);
        }
    }

    public void mostrarDecrescente() {
        if (x > y && y > z) {
            System.out.println("Ordem Decrscente " + x + ", " + y + " e " + z);
        } else {
            if (x < z) {
                aux = x;
                x = z;
                z = aux;
            }
            if (y < z) {
                aux = y;
                y = z;
                z = aux;
            }
            if (x < y){
                aux = y;
                y = x;
                x = aux;
            }
        System.out.println("Ordem Decrscente " + x + ", " + y + " e " + z);
        }
    }
}
