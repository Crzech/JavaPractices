/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio4;

/**
 *
 * @author christianpernillo
 */
public class Calculo {
    public int n;
    public Calculo (int n) {
        this.n = n;
    }
    
    public String bisiesto() {
        String resultado;
        if ((this.n % 4 == 0) && ((this.n % 100 != 0) || (this.n % 400 == 0))) {
            resultado = "El anio es bisiesto";
        } else {
            resultado = "El anio no es bisiesto";
        }
        return resultado;
    }
    
    public double trinomio() {
        return Math.pow((this.n + 4), 2);
    }
}
