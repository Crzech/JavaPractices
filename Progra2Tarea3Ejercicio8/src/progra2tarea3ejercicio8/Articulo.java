/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio8;

/**
 *
 * @author christianpernillo
 */
public class Articulo {
    public String nombre;
    public double precio;
    public int existencia;

    public Articulo(String nombre, double precio, int existencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
