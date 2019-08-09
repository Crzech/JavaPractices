/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio10;

import java.util.Scanner;

/**
 *
 * @author christianpernillo
 */
public class Progra2Tarea3Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre, resultado;
        double alto, ancho;
        int lados;
        System.out.println("Ingrese el nombre de la figura");
        nombre = in.nextLine();
        System.out.println("Ingrese el alto de la figura");
        alto = in.nextDouble();
        System.out.println("Ingrese el ancho de la figura");
        ancho = in.nextDouble();
        System.out.println("Ingrese el numero de lados");
        lados = in.nextInt();
        FiguraGeometrica figura = new FiguraGeometrica(nombre,alto,ancho);
        TipoFigura tipoFigura = new TipoFigura(figura, lados);
        resultado = tipoFigura.resultado();
        System.out.println(resultado);
    }
    
}
