/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_if_anidado;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_IF_ANIDADO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
     int Valor1, Valor2;
     Scanner input = new Scanner (System.in);
     
     System.out.println("Valor 1: ");
     Valor1 = input.nextInt();
     System.out.println("Valor 2: ");
     Valor2 = input.nextInt();
     
     //>Operadores
     if(Valor1 > Valor2) // Verdad  //Concatenar
        System.out.println("El valor mas grande es el: " + Valor1);
     else{ // FALSO, EL VALOR1 NO ES MAS GRANDE QUE EL VALOR2
        //if anidado: un if dentro de otro if
        // en java:
        // = ES ASIGNACION 
        // == ES COMPARACION 
        if(Valor1 == Valor2) //Verdad
           System.out.println("Ambos valores son iguales");
        else 
           System.out.println("El valor mas pequeño es " + Valor1);
     }
     
   }
   
}
