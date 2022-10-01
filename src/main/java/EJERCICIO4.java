
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    //PEDIR DOS NUMEROS Y DECIR SI SON IGUALES O NO
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int n1,n2;
        System.out.print("Introduce un número: ");
        n1=sc.nextInt();
        System.out.print("Introduce otro número: ");
        n2=sc.nextInt();
        if(n1==n2)
        System.out.println("Son iguales");
        else
        System.out.println("No son iguales");
 }
}

