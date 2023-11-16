/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_practica;

import java.util.Scanner;

/**
 *
 * @author Criatian Ulises
 */
public class EJERCICIO3_PRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introuce el numero: ");
        num = scanner.nextInt();
        
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("La sumatoria de los números es: "+ sum);
    }
    
}
