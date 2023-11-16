/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_practica;

import java.util.Scanner;

/**
 *
 * @author Criatian Ulises
 */
public class EJERCICIO4_PRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);

        int num;
        String resp;
        boolean terminar = false;

        while (!terminar) {
            System.out.println("Ingrese un número: ");
            num = input.nextInt();

            if (num > 0) {
                System.out.println("El número es positivo");
            } else if (num < 0) {
                System.out.println("El número es negativo");
            } else {
                System.out.println("El número es cero");
            }

            System.out.println("¿Desea terminar el programa?: ");
            resp = input.next();

            if (resp.equalsIgnoreCase("Si")) {
                terminar = true;
            }

            System.out.println();
            
        }
        input.close();

      
        
   }
}