/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_califas_eua;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_10_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la calificacion: ");
        califa = input.nextInt();
        
        if ((califa >= 0) && (califa <= 100)){ 
           
            if((califa >= 90) && (califa <= 100))
                System.out.println("A");
            else if ((califa >= 80) && (califa <= 89))
                System.out.println("B");
            else if ((califa >= 70) && (califa <= 79))
                System.out.println("C");
            else if ((califa >= 60) && (califa <= 69))
                System.out.println("D");
            else if (califa < 60)
                System.out.println("F");
            else 
                System.out.println("El numero no es una calificacion valida");
    }
    }
}
