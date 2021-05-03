package exercicio07;

public class Relogio {
    int hora;
    public void  adicionarhora(){
        hora +=1;
        if (hora > 23) {
            hora = 0;
        }
    }
    public  void subtrairhora(){
        hora -=1;
        if (hora < 0) {
            hora = 23;
        }
    }
    public void mostrarHora(){
        System.out.println("O horario atual é: " + hora);
    }
}
