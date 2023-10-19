/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11__tallas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_11__TALLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int talla;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la talla: ");
        talla  = input.nextInt();
         switch (talla){
             case 29 :
                 System.out.println("Small");
                 break;
             case 42 :
                 System.out.println("Medium");
                 break;
             case 44 :
                 System.out.println("Large");
                 break;
             case 48 :
                 System.out.println("Xlarge");
                 break;
             default:
                 System.out.println("La talla no es valida");
        
        
           
            
         
    }
   } 
}
