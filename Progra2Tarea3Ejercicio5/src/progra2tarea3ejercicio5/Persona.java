/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio5;

/**
 *
 * @author christianpernillo
 */
public class Persona {
    public int edad;
    public Persona (int edad) {
        this.edad = edad;
    }
    public String clasificacion() {
        String resultado;
        if(edad <= 5) {
            resultado = "Bebe";
        } else if(edad <= 12) {
            resultado = "Ninio";
        } else if (edad <= 17) {
            resultado = "Adolescente";
        } else if (edad <= 50) {
            resultado = "Adulto";
        } else {
            resultado = "Anciano";
        }
        return resultado;
    }
}
