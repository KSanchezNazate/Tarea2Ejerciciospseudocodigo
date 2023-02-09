/*¿Qué hace este algoritmo?  
Variable valor1, valor2: real  
Inicio  
   valor1 <- enter("Introduza un valor: ")  
   valor2 <- enter("Introduza otro valor: ")  
   # tratamiento 
   valor1 <- valor2  
   valor2 <- valor1  
   escribir("valor1 = " & valor1 & "; valor2 = " & valor2)  
Fin */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        double valor1, valor2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduza un valor: ");
        valor1 = teclado.nextDouble();
        System.out.print("Introduza otro valor: ");
        valor2 = teclado.nextDouble();
        // tratamiento
        valor1 = valor2;
        valor2 = valor1;
        System.out.println("valor1 = " + valor1 + "; valor2 = " + valor2);
    }
    
}