/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio8;

import java.util.Scanner;

/**
 *
 * @author christianpernillo
 */
public class Progra2Tarea3Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nit, nombre_cliente, nombre_articulo, fechaCompra, resultado;
        double precio_articulo;
        int existencia_articulo, cantidad_compra;
        System.out.println("Ingrese el nit del cliente:");
        nit = in.nextLine();
        System.out.println("Ingrese el nombre del cliente:");
        nombre_cliente = in.nextLine();
        Cliente cliente = new Cliente(nit, nombre_cliente);
        System.out.println("Ingrese el nombre del articulo");
        nombre_articulo = in.nextLine();
        System.out.println("Ingrese el precio del articulo");
        precio_articulo = in.nextDouble();
        System.out.println("Ingrese las existencias que tiene este producto");
        existencia_articulo = in.nextInt();
        Articulo articulo = new Articulo(nombre_articulo, precio_articulo, existencia_articulo);
        System.out.println("Ingrese la cantidad de articulos comprados");
        cantidad_compra = in.nextInt();
        System.out.println("Ingrese la fecha de la compra");
        fechaCompra = in.nextLine();
        Venta venta = new Venta(cliente,articulo,cantidad_compra,fechaCompra);
        venta.setTotal();
        resultado = venta.ventaString();
        System.out.println(resultado);
    }
    
}
