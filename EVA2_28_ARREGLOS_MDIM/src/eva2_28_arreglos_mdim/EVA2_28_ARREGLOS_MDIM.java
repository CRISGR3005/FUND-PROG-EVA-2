/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_28_arreglos_mdim;

/**
 *
 * @author Criatian Ulises
 */
public class EVA2_28_ARREGLOS_MDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[][] matriz = new int[5][10];
         //ADIGNAR UN VALOR
         matriz [1][3] = 100;
         System.out.println("valor [1][3]= " + matriz [1][3]);
         System.out.println("matriz.length = " + matriz.length);
         //matriz.length siempre es la primer dimension 
         for(int i = 0; i < matriz.length; i++){//filas
              for(int j = 0; j < matriz[i].length; j++){//columnas
                  matriz[i][j] = (int)(Math.random() * 100);
         }
       }
              //leer nuestro arreglo
                 for(int i = 0; i < matriz.length; i++){
                 for(int j = 0; j < matriz[i].length; j++){
                     System.out.print("[" + matriz[i][j] + "]");
                 }
                 System.out.println("");
   } 
  }
 } 

