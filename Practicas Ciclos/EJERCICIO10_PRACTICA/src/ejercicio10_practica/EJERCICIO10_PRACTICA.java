/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_practica;

import java.util.Scanner;

/**
 *
 * @author Criatian Ulises
 */
public class EJERCICIO10_PRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        cadena = input.nextLine();
        
        if (numVal(cadena)) {
            System.out.println("La cadena representa un número válido.");
        } else {
            System.out.println("La cadena no representa un número válido.");
        }
    }
    
    public static boolean numVal(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
}
