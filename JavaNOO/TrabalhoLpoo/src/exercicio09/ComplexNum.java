package exercicio09;

public class ComplexNum {
    double real, imaginary;
     public void  Complex(double real, double imaginary){
        double res = (Math.pow(real,2) + Math.pow(imaginary,2)) * Math.sqrt(-1);
         final double v = Math.pow(real, 2) - Math.pow(imaginary, 2);
         System.out.printf("the subtraction of the real value: %.0f² - Imaginary worth: %.0f²  result: %.0f",real, imaginary,v);


     }
}
