/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_practica;

import java.util.Scanner;

/**
 *
 * @author Criatian Ulises
 */
public class EJERCICIO6_PRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        String binario;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        numero = input.nextInt();
        
        binario = convBin(numero);
        System.out.println("El equivalente del numero en binario es: " + binario);
    }
    
        public static String convBin(int numero) {
        if (numero == 0) {
            return "0";
        }
        
        String binario = "";
        while (numero > 0) {
            binario = (numero % 2) + binario;
            numero = numero / 2;
        }
        
        return binario;
        
        
    }
  }
    
