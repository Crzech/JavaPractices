/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio2;

/**
 *
 * @author christianpernillo
 */
public class Calculo {
    private double a;
    private double b;
    private int n;
    
    public Calculo (double a, double b) {
        this.a = a;
        this.b = b;
    }
    public Calculo(int n) {
        this.n = n;
    }
    
    public double hipotenusa() {
        double resultado;
        resultado = Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
        return resultado;
    }
    
    public String numeroEntero() {
        String resultado;
        resultado = this.n <= 0 ? "Entero negativo" : "Entero positivo";
        return resultado;
    }
}
