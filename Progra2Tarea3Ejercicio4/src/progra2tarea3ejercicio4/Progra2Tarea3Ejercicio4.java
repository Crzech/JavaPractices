/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio4;

import java.util.Scanner;

/**
 *
 * @author christianpernillo
 */
public class Progra2Tarea3Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion, n;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numero de la accion a realizar");
        System.out.println("1. Anio bisiesto");
        System.out.println("2. Trinomio cuadrado perfecto de (x + 4)2");
        opcion = in.nextInt();
        System.out.println("Ingrese un numero entero");
        n = in.nextInt();
        Calculo calc = new Calculo(n);
        switch (opcion) {
            case 1:
                String resultado = calc.bisiesto();
                System.out.println(resultado);
                break;
            case 2:
                double trinomio = calc.trinomio();
                System.out.println("El trinomio cuadrado perfecto es: " + trinomio);
                break;            
        }
        
    }
    
}
