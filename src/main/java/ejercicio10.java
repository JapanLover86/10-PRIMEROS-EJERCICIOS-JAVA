
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    //PEDIR 3 NUMEROS Y MOSTRARLOS ORDENADOS DE MAYOR A MENOR
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Introduzca primer numero: ");
        a=sc.nextInt();
        System.out.println("Introduzca segundo numero: ");
        b=sc.nextInt();
        System.out.println("Introduzca tercer numero: ");
        c=sc.nextInt();
        
        if(a>b && b>c){
            System.out.println(a+", "+b+", "+c);
                        
        }else{
            if(a>c && c>b){
                System.out.println(a+", "+c+", "+b);
            }else{
                if(b>a && a>c){
                    System.out.println(b+", "+a+","+c);
                }else{
                    if(b>c && c>a){
                        System.out.println(b+", "+c+", "+a);
                        
                    }else{
                        if(c>a && a>b){
                            System.out.println(c+", "+a+", "+b);
                            
                        }else{
                            if(c>b && b>a){
                                System.out.println(c+", "+b+", "+a);
                            }
                        }
                    }
                }
            }
        }
       
    }
    
}
