/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_practica;

import java.util.Scanner;

/**
 *
 * @author Criatian Ulises
 */
public class EJERCICIO7_PRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE; 
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero: ");
            numero = input.nextInt();

            if (numero >= 0) {
                if (numero < min) {
                    min = numero;
                }
                if (numero > max) {
                    max = numero;
                }
            }
        } while (numero >= 0);

        if (min != Integer.MAX_VALUE) {
            System.out.println("El número más pequeño ingresado es: " + min);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        if (max != Integer.MIN_VALUE) {
            System.out.println("El número más grande ingresado es: " + max);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        input.close();
    }
    
}
