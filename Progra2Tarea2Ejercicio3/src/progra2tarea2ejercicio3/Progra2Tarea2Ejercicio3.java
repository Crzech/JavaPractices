/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea2ejercicio3;

import java.util.Scanner;

/**
 *
 * @author christianpernillo
 */
public class Progra2Tarea2Ejercicio3 {

    public static void contarBisiestos(int anios[]) {
        int contador = 0;
        for(int i = 0; i < anios.length ; i++) {
            int anio = anios[i];
            if(anio % 400 == 0)
            {
                contador++;
            }
            else if (anio % 100 == 0)
            {
                
            }
            else {
                if(anio % 4 == 0) {
                    contador++;
                }
            }
        }
        System.out.println("Existen " + contador + " anios bisiestos en el grupo");
        
    }
    public static void ingresarGrupoAnios() {
        Scanner in = new Scanner(System.in);
        int numero_anios;
        System.out.println("Ingrese el numero de años que desea agregar al grupo");
        numero_anios = in.nextInt();
        int anios[] = new int[numero_anios];
        for(int i = 0 ; i < numero_anios ; i++) {
            System.out.println("Ingrese anio");
            anios[i] = in.nextInt();
        }
        contarBisiestos(anios);
    }
//    public static void menu() {
//        int opcion;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Seleccione la accion a realizar");
//        System.out.println("1. Crear grupo de anios");
//        System.out.println("2. Contar anios bisiestos");
//        opcion = in.nextInt();
//        switch(opcion) {
//            case 1:
//                ingresarGrupoAnios();
//                menu();
//                break;
//            case 2:
//                break;
//            default:
//                System.out.println("Saliendo del sistema");
//                break;
//        }
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ingresarGrupoAnios();

    }
    
}
