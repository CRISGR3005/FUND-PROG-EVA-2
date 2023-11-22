/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva31_for_each;

/**
 *
 * @author invitado
 */
public class EVA31_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[10];
        
        for (int i = 0; i < 10; i++){
            arreglo[i] = (int)(Math.random()*100);
        }
         // FOR EACH --> FOR especial para arreglos
         // solo funci9ona para lectura de arreglos
         
         for(int valor : arreglo){
             System.out.print("[" + valor + "]");   
         }
       String cadenas[] = new String[5];
       cadenas[0] = "Hola";
       cadenas[1] = "";
       cadenas[2] = "Mundo";
       cadenas[3] = "";
       cadenas[4] = "!!!!";
       System.out.println(""); 
       
       for(String cade: cadenas){
      System.out.print(cade);
  }
 }
} 

