/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea2ejercicio4;

import java.util.Scanner;

/**
 *
 * @author christianpernillo
 */
public class Progra2Tarea2Ejercicio4 {

    public static void calcularTotales(double planilla[][]) {
        double total_planilla = 0;
        for (int i =0 ; i < planilla.length ; i++) {
            planilla[i][1] = planilla[i][0] * 0.0483;
            planilla[i][2] = planilla[i][0] - planilla[i][1];
            total_planilla += planilla[i][2];
            System.out.println("Empleado no. " + (i + 1));
            System.out.println("Igss: " + planilla[i][1]);
            System.out.println("Sueldo liquido: " + planilla[i][2]);
            System.out.println();
        }      
        System.out.println("Total de planilla: " + total_planilla);
    }
    public static void solicitarDatos() {
        Scanner in = new Scanner(System.in);
        int numero_empleados;
        System.out.println("Ingrese el numero de empleados a guardar en la planilla");
        numero_empleados = in.nextInt();
        double planilla[][] = new double[numero_empleados][3];
        for (int i = 0 ; i < numero_empleados ; i++) {
            double sueldo_base;
            System.out.println("Ingrese el sueldo base del empleado " + (i + 1));
            sueldo_base = in.nextDouble();
            planilla[i][0] = sueldo_base;
        }
        calcularTotales(planilla);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        solicitarDatos();
    }
    
}
