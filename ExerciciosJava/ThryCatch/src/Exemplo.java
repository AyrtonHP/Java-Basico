public class Exemplo {

    public static void main(String[] args) {
        Questao1 q1 = new Questao1() ;
        int x= 10;
        int resultado = q1. calculaValorX(x);
        System.out.println("Resultado da chamada ao metodo calculaValorpassando o valor " + x + ": " + resultado) ;


      /*  try{
            System.out.println(1/0);
            System.out.println("M");
        } catch (ArithmeticException ex2){
            System.out.println("x");
        } *//*finally {
            System.out.println("Z");
        }*//*
        System.out.println("F");*/

    }
    public static class Questao1 {
        public int calculaValorX(int x) {
            int resultado;
            if ((x > 4) && (x < 10)) {
                resultado = 2 * x;
            } else if (x <= 4) {
                resultado = 3 * x;
            } else {
                resultado = 4 * x;
            }
            return resultado;

        }
    }
}
