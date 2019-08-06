/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea2ejercicio2;

import java.util.Scanner;

/**
 *
 * @author christianpernillo
 */
public class Progra2Tarea2Ejercicio2 {

    public static void encontrarMes(String mes_buscar, Object[][] meses) {
        for(int i = 0; i < meses.length ; i++) {
            String mes = String.valueOf(meses[i][0]);
            if(mes.equals(mes_buscar)) {
                System.out.println("Este mes tiene " + meses[i][1] + " dias");
            }
        }
    }
    public static void mesesAnio() {
        String mes_buscar;
        Scanner in = new Scanner(System.in);
        Object[][] meses = new Object[12][2];
        meses[0][0] = "Enero";
        meses[0][1] = 31;
        meses[1][0] = "Febrero";
        meses[1][1] = 28;
        meses[2][0] = "Marzo";
        meses[2][1] = 31;
        meses[3][0] = "Abril";
        meses[3][1] = 30;
        meses[4][0] = "Mayo";
        meses[4][1] = 31;
        meses[5][0] = "Junio";
        meses[5][1] = 30;
        meses[6][0] = "Julio";
        meses[6][1] = 31;
        meses[7][0] = "Agosto";
        meses[7][1] = 31;
        meses[8][0] = "Septiembre";
        meses[8][1] = 30;
        meses[9][0] = "Octubre";
        meses[9][1] = 31;
        meses[10][0] = "Noviembre";
        meses[10][1] = 30;
        meses[11][0] = "Diciembre";
        meses[11][1] = 31;
        System.out.println("Ingrese el nombre del mes a buscar ej: Enero");
        mes_buscar = in.nextLine();
        encontrarMes(mes_buscar, meses);

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mesesAnio();
    }
    
}
