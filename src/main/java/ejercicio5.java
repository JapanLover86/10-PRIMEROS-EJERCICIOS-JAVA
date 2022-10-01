
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    //PEDIR UN NUMERO E INDICAR SI ES POSITIVO O NEGATIVO
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero: ");
        num=sc.nextInt();
        if(num<0){
            System.out.println("Negativo");
        }else{
            //suponemos que el 0 es positivo.
            System.out.println("Positivo");
        }
         
        
    }
    
}
