/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio6;

import java.util.Scanner;

/**
 *
 * @author christianpernillo
 */
public class Progra2Tarea3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre, direccion, telefono;
        double sueldo;
        System.out.println("Ingrese el nombre del empleado:");
        nombre = in.nextLine();
        System.out.println("Ingrese la direccion del empleado:");
        direccion = in.nextLine();
        System.out.println("Ingrese el telefono del empleado:");
        telefono = in.nextLine();
        System.out.println("Ingrese el sueldo del empleado:");
        sueldo = in.nextDouble();
        Empleado empleado = new Empleado(nombre,direccion,telefono);
        Nomina nomina = new Nomina();
        nomina.setEmpleado(empleado);
        nomina.setSueldo(sueldo);
        nomina.setTotalDeducciones(sueldo);
        nomina.setSueldoLiquido(sueldo);
        String resultado;
        resultado = nomina.resultado();
        System.out.println(resultado);
        
    }
    
}
