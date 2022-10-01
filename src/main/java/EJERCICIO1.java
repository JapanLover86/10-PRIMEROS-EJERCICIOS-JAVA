
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    //PEDIR LOS COEFICIENTES DE UNA ECUACION DE 2° GRADO Y MUESTRE SUS SOLUCIONES REALES. SI NO EXISTEN, DEBE INDICARLO.
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numero = new Scanner(System.in);
        
        double a,b,c; // coeficientes ax^2+bx+c=0
        double x1,x2,d; // soluciones y determinante
        
        System.out.println("Introduzca primer coeficiente (a):");
        a=numero.nextDouble();
        System.out.println("Introduzca segundo coeficiente: (b):");
        b=numero.nextDouble();
        System.out.println("Introduzca tercer coeficiente: (c):");
        c=numero.nextDouble();
        
        // calculamos el determinante
        d=((b*b)-4*a*c);
        if(d<0)
        System.out.println("No existen soluciones reales");
        else{
        // queda confirmar que a sea distinto de 0.

        // si a=0 nos encontramos una división por cero.

        x1=(-b+Math.sqrt(d))/(2*a);
        x2=(-b-Math.sqrt(d))/(2*a);
        System.out.println("Solución1: " + x1);
        System.out.println("Solución2: " + x2);
 }
 }
}
