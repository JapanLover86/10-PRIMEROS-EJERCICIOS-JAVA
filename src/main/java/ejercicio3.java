
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    //PEDIR EL RADIO DE UNA CIRCUNFERENCIA Y CALCULAR SU LONGITUD
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        double l,r; // longitud y radio
        System.out.print("Introduce el radio de una circunferencia: ");
        r=sc.nextDouble();
        l=2*Math.PI*r;

        System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);
 }
}

