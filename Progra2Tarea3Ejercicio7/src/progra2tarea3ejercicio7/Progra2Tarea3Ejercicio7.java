/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio7;

import java.util.Scanner;

/**
 *
 * @author christianpernillo
 */
public class Progra2Tarea3Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String modelo, marca, chasis, placa, color, tipoReparacion, caracteristicas, fechaReparacion, resultado;
        double costo;
        System.out.println("Ingrese el modelo del vehiculo");
        modelo = in.nextLine();
        System.out.println("Ingrese la marca del vehiculo");
        marca = in.nextLine();
        System.out.println("Ingrese el no. de chasis del vehiculo");
        chasis = in.nextLine();
        System.out.println("Ingrese la placa del vehiculo");
        placa = in.nextLine();
        System.out.println("Ingrese el color del vehiculo");
        color = in.nextLine();
        Vehiculo vehiculo = new Vehiculo(modelo, marca, chasis, placa, color);
        System.out.println("Ingrese el tipo de reparacion a asignar");
        tipoReparacion = in.nextLine();
        System.out.println("Ingrese las caracteristicas de la reparacion a asignar");
        caracteristicas = in.nextLine();
        System.out.println("Ingrese el costo de la reparacion");
        costo = in.nextDouble();
        System.out.println("Ingrese la fecha de la reparacion");
        fechaReparacion = in.nextLine();
        fechaReparacion = in.nextLine();
        
        Reparaciones reparacion = new Reparaciones(vehiculo,tipoReparacion,caracteristicas,costo, fechaReparacion);
        resultado = reparacion.resultado();
        System.out.println(resultado);
        
    }
    
}
