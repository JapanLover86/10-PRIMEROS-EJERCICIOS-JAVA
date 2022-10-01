
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    //PEDIR EL RADIO DE UN CIRCULO Y CALCULAR SU AREA A=PI*R*R
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        
        double a,r; // área y radio
        System.out.print("Introduce el radio de un circulo: ");
        r=sc.nextDouble();
        a=Math.PI*(r*r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)

 System.out.println("El área de una circunferencia de radio " + r+ " es: " + a);

 }
}
