/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_ciclo_for_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_14_CICLO_FOR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VAMOS A CAPTURAR CALIFICACIONES DE UN GRUPO
        // Y GENERARÁ EL PROMEDIO 

        int noCalifas;
        int sumaCalifas = 0; //cero es el neutro aditivo 
                            // 1 es el neutro multiplicativo 
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número de calificaciones");
        noCalifas = input.nextInt();

        for (int i =1; 1 < noCalifas; i++) {
            System.out.println("Introduce la calificación");
            int califa = input.nextInt();
           //sumatoria de calificaciones 
           //ACUMULADORES 
           //sumaCalifas = sumacalifas + califa
            sumaCalifas += califa;
        }
        //el promedio sumacalifas/nocalifas, pero ambos son enteros 
        // y diidir enteros en java da como resultado un entero, sin decimal.
        double promedio = sumaCalifas / (noCalifas * 1.0);
        System.out.println("El promedio es" + promedio);
    }
   }
