/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_operaciones;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1, var2, resu;
        Scanner input = new Scanner(System.in);
        // OEPRADOR +
        //SUMA
        //CONCATENAR --> UNIR CADENAS DE TEXTO
        var1 = 100;
        var2 = 200;
        resu = var1 + var2;
        System.out.println(); //SALTO DE LINEA ENTER
        System.out.println("suma: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 =" + var2);
        System.out.println("var1 + var2 =" + resu);
        
        //RESTA
        //OPERADOR -
        resu = var1 - var2;
        System.out.println(); //SALTO DE LINEA ENTER
        System.out.println("resta: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 =" + var2);
        System.out.println("var1 - var2 =" + resu);
        
        //MULTIPLICACION
        //OPERADOR *
        resu = var1 * var2;
        System.out.println(); //SALTO DE LINEA ENTER
        System.out.println("multiplicaion: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 =" + var2);
        System.out.println("var1 * var2 =" + resu);
        
        //DIVISION
        //OPERADOR /
        //OJO: el tipo de dato es importante, si quieren 
        // el resultado de una division, hay que manejarlo flotante
        //si lo manejan entero, les dara el # de veces que cabe
        // el divisor en el dividendo
        var1 = 15;
        var2 = 7;
        resu = var1 / var2;
        System.out.println(); //SALTO DE LINEA ENTER
        System.out.println("division: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 =" + var2);
        System.out.println("var1 / var2 =" + resu);
        
        //DIVISION FLOTANTE
        double resuExacto;
        resuExacto = var1 / var2;
        System.out.println(); //SALTO DE LINEA ENTER
        System.out.println("Division exacta: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 =" + var2);
        System.out.println("var1 / var2 =" + resuExacto);
        
        double var2F = 7;
        resuExacto = var1 / var2F;
        System.out.println(); //SALTO DE LINEA ENTER
        System.out.println("Division exacta (¿SERA?): ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 =" + var2F);
        System.out.println("var1 / var2 =" + resuExacto);
        
        int cifra = 7;
        double cifraDouble = 7.0;
        
        double division = 100 / 10; //SE TOMA EL DIVISIOR COMO ENTERO
        
        //PRECEDENCIA DE OPERACIONES:
        int a = 5, b =3, c = 2;
        int resultado = (a * b) + (a - c) * (b -a ); //(15) + (3) * (-2)// 15 - 6 = 9
        System.out.println("Resultado procedencia: " + resultado);
        
        //POTENCIAS Y RAICES
        double potencia;
        potencia = Math.pow(100,0.5);
        System.out.println("Potencia = " + potencia);
        
       
     
    }
    
}
