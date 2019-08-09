/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio10;

/**
 *
 * @author christianpernillo
 */
public class FiguraGeometrica {
    public String nombre;
    public double alto;
    public double ancho;

    public FiguraGeometrica(String nombre, double alto, double ancho) {
        this.nombre = nombre;
        this.alto = alto;
        this.ancho = ancho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
}
