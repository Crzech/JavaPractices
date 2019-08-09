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
public class Venta {
    public Cliente cliente;
    public Articulo articulo;
    public int cantidad;
    public double total;
    public String fechaCompra;

    public Venta(Cliente cliente, Articulo articulo, int cantidad, double total, String fechaCompra) {
        this.cliente = cliente;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.total = total;
        this.fechaCompra = fechaCompra;
    }
    public Venta(Cliente cliente, Articulo articulo, int cantidad, String fechaCompra) {
        this.cliente = cliente;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.fechaCompra = fechaCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = this.articulo.precio * this.cantidad;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
    public String ventaString() {
        String resultado;
        resultado = "Nombre del cliente: " + this.cliente.getNombre() + "\nNit del cliente: " + this.cliente.getNit() + "\nNombre del articulo: " + this.articulo.getNombre() + "\nCantidad vendida: " + this.cantidad + "\nTotal de la venta: " + this.total;
        return resultado;
    }
    
    
}
