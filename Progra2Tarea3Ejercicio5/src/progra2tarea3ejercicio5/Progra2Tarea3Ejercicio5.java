/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio5;

import java.util.Scanner;

/**
 *
 * @author christianpernillo
 */
public class Progra2Tarea3Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese la edad de la persona");
        edad = in.nextInt();
        Persona persona = new Persona(edad);
        System.out.println(persona.clasificacion());
    }
    
}
