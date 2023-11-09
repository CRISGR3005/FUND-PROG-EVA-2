/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_23_arreglos;

/**
 *
 * @author invitado
 */
public class EVA2_23_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR ARREGLO:
        int[] arreglo = new int[10];
      //COMO SE USA, EL ACCESO DE INIDICES
      // EL PRIMER ELEMENTO DE ARREGLO ESTA EN LA POSICION 0 (CERO)
      //ULTIMO ELEMENTO ES N - 1, ES EL TAMAÑO DEL ARREGLO
      arreglo [0] = 100;
      arreglo [1] = 200;
      arreglo [2] = 300;
      arreglo [3] = 400;
      System.out.println(arreglo[3]);
      ///
      String[] arregloCade = new String[5];
      arregloCade[0] = "Hola";
      arregloCade[1] = " ";
      arregloCade[2] = "Mundo";
      arregloCade[3] = " ";
      arregloCade[4] = "Cruel!!";
      System.out.println(arregloCade[0]);
      System.out.println(arregloCade[1]);
      System.out.println(arregloCade[2]);
      System.out.println(arregloCade[3]);
      System.out.println(arregloCade[4]);
      
    }
    
}
