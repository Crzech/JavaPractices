/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea2ejercicio1;

import java.util.Scanner;

/**
 *
 * @author christianpernillo
 */
public class Progra2Tarea2Ejercicio1 {

    public static int calcularN3(int n1, int n2){
        return n1 + n2;
    }
    
    public static void fibonacci() {
        int n1=0, n2=1, n3;
        int contador;
        
        Scanner in = new Scanner (System.in); 

        System.out.println("Ingrese la cantidad de numeros de la serie fibonacci que desea ver: ");
        contador = in.nextInt();
        int[] fibonacciarr = new int[contador];
        fibonacciarr[0] = n1;
        fibonacciarr[1] = n2;
        for(int i=2; i < contador ; i++) {
            n3 = calcularN3(n1,n2);
            n1 = n2;
            n2 = n3;
            fibonacciarr[i] = n3;
            fibonacciarr[i] = n1;
            fibonacciarr[i] = n2;
        }
        for(int i=0; i < fibonacciarr.length ; i++) {
            System.out.print(fibonacciarr[i] + " ");   
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fibonacci();
    }
    
}
