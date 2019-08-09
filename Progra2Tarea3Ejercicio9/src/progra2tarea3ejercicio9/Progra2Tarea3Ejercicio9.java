/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio9;

import java.util.Scanner;

/**
 *
 * @author christianpernillo
 */
public class Progra2Tarea3Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre, tipoCuenta, solicitante, fecha, resultado;
        double monto;
        System.out.println("Ingrese el nombre de la cuenta");
        nombre = in.nextLine();
        System.out.println("Ingrese el tipo de cuenta");
        tipoCuenta = in.nextLine();
        System.out.println("Ingrese el monnto de la cuenta");
        monto = in.nextDouble();
        Cuenta cuenta = new Cuenta(nombre,tipoCuenta,monto);
        System.out.println("Ingrese el nombre del solicitante");
        solicitante = in.nextLine();
        solicitante = in.nextLine();
        System.out.println("Ingrese la fecha de la solicitud");
        fecha = in.nextLine();
        Financiamiento financiamiento = new Financiamiento(cuenta, solicitante, fecha);
        resultado = financiamiento.resultado();
        System.out.println(resultado);
        
        
    }
    
}
