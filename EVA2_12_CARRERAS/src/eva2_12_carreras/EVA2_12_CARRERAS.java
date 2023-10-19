/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_carreras;

import java.util.Scanner;

/**
 *
 * @author Reynaldo
 */
public class EVA2_12_CARRERAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String carrera;
         Scanner Scanner = new Scanner(System.in);
         System.out.println("Introduce el nombre de la carrera: ");
         carrera = Scanner.nextLine();
         
         switch (carrera){
             case "ISC":
                 System.out.println("Ingeniería en Sistemas Computacionales");
                 break;
             case "IND":
                 System.out.println("Ingeniería en Informatica");
                 break;
             case "IDI":
                 System.out.println("Ingenieria en Diseño Industrial");
                 break;
             case "LA":
                 System.out.println("Licenciatura en Administracion");
                 break;
             case "IGE":
                 System.out.println("Ingenieria en Gestion Empresarial");
                 break;
             case "ARQ":
                 System.out.println("Arquitectura");
                 break;
                 default:
                 System.out.println("Nombre de la carrera no valido");
                
    }
    }  
}
