/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_practica;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EJERCICIO1_PRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume1, nume2;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce primer el numero:");
        nume1 = input.nextInt();
        System.out.println("Introduce el segundo numero numero:");
        nume2 = input.nextInt();
        System.out.println();
        
        for (int i = nume1+1; i <nume2; i++){
            System.out.println(i);
            for(int j = nume2+1; j <nume1; i++){
                 System.out.println(i);
            }
          
           }
   }
}