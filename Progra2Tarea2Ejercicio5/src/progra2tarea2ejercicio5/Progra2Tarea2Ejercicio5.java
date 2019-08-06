/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea2ejercicio5;

import java.util.Scanner;

/**
 *
 * @author christianpernillo
 */
public class Progra2Tarea2Ejercicio5 {

    public static int[] numerosPares(int[] valores) {
        int numero_ciclo;
        int contador = 0;
        for(int i = 0; i < valores.length ; i++) { 
            numero_ciclo = valores[i];
            if(numero_ciclo % 2 == 0) {
                contador++;
            }
        }
        int[] numeros_pares = new int[contador];
        int contador2 = 0;
        for(int i = 0; i < valores.length ; i++) { 
            numero_ciclo = valores[i];
            if(numero_ciclo % 2 == 0) {
                numeros_pares[contador2] = numero_ciclo;
                contador2++;
            }
        }
        return numeros_pares;
    }
    public static int[] numerosImpares(int[] valores) {
        int numero_ciclo;
        int contador = 0;
        for(int i = 0; i < valores.length ; i++) { 
            numero_ciclo = valores[i];
            if(numero_ciclo % 2 != 0) {
                contador++;
            }
        }
        int[] numeros_impares = new int[contador];
        int contador2 = 0;
        for(int i = 0; i < valores.length ; i++) { 
            numero_ciclo = valores[i];
            if(numero_ciclo % 2 != 0) {
                numeros_impares[contador2] = numero_ciclo;
                contador2++;
            }
        }
        return numeros_impares;
    }
    public static void solicitarNumeros() {
        Scanner in  = new Scanner(System.in);
        int cantidad_numeros;
        System.out.println("Ingrese la cantidad de numeros que desea almacenar");
        cantidad_numeros = in.nextInt();
        int valores[] = new int[cantidad_numeros];
        for (int i = 0; i < cantidad_numeros ; i++) {
            System.out.println("Ingrese valor no. " + (i + 1));
            valores[i] = in.nextInt();
        }
        int[] vector_numeros_pares = numerosPares(valores);
        int[] vector_numeros_impares = numerosImpares(valores);
        System.out.println("Vector de numeros pares: ");
        for (int i = 0; i < vector_numeros_pares.length ; i++) {
            System.out.println(vector_numeros_pares[i]);
        }
        System.out.println();
        System.out.println("Vector de numeros impares: ");
        for (int i = 0; i < vector_numeros_impares.length ; i++) {
            System.out.println(vector_numeros_impares[i]);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        solicitarNumeros();
    }
    
}
