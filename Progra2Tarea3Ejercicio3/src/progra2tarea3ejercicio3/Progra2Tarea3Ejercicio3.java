/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio3;

import java.util.Scanner;

/**
 *
 * @author christianpernillo
 */
public class Progra2Tarea3Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre_equipo1, nombre_equipo2;
        int marcador1, marcador2;
        System.out.println("Ingrese el nombre del equipo 1");
        nombre_equipo1 = in.nextLine();
        System.out.println("Ingrese el nombre del equipo 2");
        nombre_equipo2 = in.nextLine();
        System.out.println("Ingrese el marcador del equipo " + nombre_equipo1);
        marcador1 = in.nextInt();
        System.out.println("Ingrese el marcador del equipo " + nombre_equipo2);
        marcador2 = in.nextInt();
        encuentroDeportivo evento = new encuentroDeportivo(nombre_equipo1,nombre_equipo2,marcador1,marcador2);
        String resultado = evento.resultado();
        System.out.println(resultado);
    }
    
}
