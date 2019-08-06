/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio1;

import java.util.Scanner;

/**
 *
 * @author christianpernillo
 */
public class Progra2Tarea3Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1, nota2, nota3, nota4;
        String resultado_clase = "";
        System.out.println("Ingrese la nota no. 1");
        nota1 = in.nextDouble();
        System.out.println("Ingrese la nota no. 2");
        nota2 = in.nextDouble();
        System.out.println("Ingrese la nota no. 3");
        nota3 = in.nextDouble();
        System.out.println("Ingrese la nota no. 4");
        nota4 = in.nextDouble();
        Promedio promedio = new Promedio(nota1, nota2, nota3, nota4);
        resultado_clase = promedio.verificarClase();
        System.out.println(resultado_clase);
    }
    
}
