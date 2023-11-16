/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_pratica;

import java.util.Scanner;

/**
 *
 * @author Criatian Ulises
 */
public class EJERCICIO9_PRATICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad;
        char carBuscado;
        String cadena;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena: ");
        cadena = input.nextLine();
        System.out.println("Ingrese el caracter que quiere buscar: ");
        carBuscado = input.next().charAt(0);
        cantidad = contApar(cadena, carBuscado);
        System.out.println("El caracter " + carBuscado + " aparece " + cantidad + " veces en la cadena.");
    }
    
    public static int contApar(String cadena, char caracter) {
        int contador = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        
        return contador;
    }
    
}
