/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrecicio5_practica;

import java.util.Scanner;

/**
 *
 * @author Criatian Ulises
 */
public class EJRECICIO5_PRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int base;
       int exponente;
       int resu = 1;
       Scanner input = new Scanner(System.in);
       System.out.println("Introduce la base: ");
       base = input.nextInt();
       System.out.println("Introduce el exponente: ");
       exponente = input.nextInt();
      
        for (int i = 0; i < exponente; i++) {
            resu *= base;
        }
        System.out.println("El resultado de la potencia es: "+ resu);
    }
    
}
