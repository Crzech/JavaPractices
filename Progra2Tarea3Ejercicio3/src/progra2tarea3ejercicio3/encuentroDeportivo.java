/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio3;

/**
 *
 * @author christianpernillo
 */
public class encuentroDeportivo {
    protected String nombre_equipo1;
    protected String nombre_equipo2;
    protected int marcador1;
    protected int marcador2;
    public encuentroDeportivo(String nombre_equipo1, String nombre_equipo2, int marcador1, int marcador2) {
        this.nombre_equipo1 = nombre_equipo1;
        this.nombre_equipo2 = nombre_equipo2;
        this.marcador1 = marcador1;
        this.marcador2 = marcador2;
    }
    public String resultado() {
        String resultado;
        if (marcador1 > marcador2) {
            resultado = "El resultado es: " + marcador1 + " a " + marcador2 + " y el equipo ganador es " + nombre_equipo1;
        } else if (marcador2 > marcador1) {
            resultado = "El resultado es: " + marcador2 + " a " + marcador1 + " y el equipo ganador es " + nombre_equipo2;
        } else {
            resultado = "El resultado es: " + marcador1 + " a " + marcador2 + " y es un empate";
        }
        return resultado;
    }
    
}
