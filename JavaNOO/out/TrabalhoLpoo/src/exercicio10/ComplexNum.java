/*10. (0,5 ponto) Class for a complex numbers. Write a class named ComplexNum for recording a complex number. The class must have two
        double instance variables, real and imaginary. Na object of this class represents the complex number real + imaginary * i (where i is the
        root of ). Write the instance method size that returns, in double, the value of real2−imaginary2
        . Write a class for testing it.*/

//"tipo" Aluno.
//AYRTON VITORINO DA SILVA
//N56419-9
//SI3P39
//09/05/2021

package exercicio10;

public class ComplexNum {
    double real, imaginary;
     public void  Complex(double real, double imaginary){
        double res = (Math.pow(real,2) + Math.pow(imaginary,2)) * Math.sqrt(-1);
         final double v = Math.pow(real, 2) - Math.pow(imaginary, 2);
         System.out.printf("the subtraction of the real value: %.0f² - Imaginary worth: %.0f²  result: %.0f",real, imaginary,v);


     }
}
