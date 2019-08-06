/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio2;

import java.util.Scanner;
/**
 *
 * @author christianpernillo
 */
public class Progra2Tarea3Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        System.out.println("Seleccione la accion que desea realizar");
        System.out.println("1. Hipotenusa de un triangulo rectangulo");
        System.out.println("2. Entero positivo");
        opcion = in.nextInt();
        switch (opcion) {
            case 1:
                double a, b, resultado;
                System.out.println("Ingrese lado a del triangulo");
                a = in.nextInt();
                System.out.println("Ingrese lado b del triangulo");
                b = in.nextInt();
                Calculo calc = new Calculo(a, b);
                resultado = calc.hipotenusa();
                System.out.println("La hipotenusa del triangulo es: " + resultado);
                break;
            case 2:
                int n;
                String resultado_num_entero;
                System.out.println("Ingrese el numero entero");
                n = in.nextInt();
                Calculo calculo = new Calculo(n);
                resultado_num_entero = calculo.numeroEntero();
                System.out.println(resultado_num_entero);
                break;
        }
    }
    
}
