/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio7;

/**
 *
 * @author christianpernillo
 */
public class Reparaciones {
    public Vehiculo vehiculo;
    public String tipoReparacion;
    public String caracteristicas;
    public double costo;
    public String fechaReparacion;

    public Reparaciones(Vehiculo vehiculo, String tipoReparacion, String caracteristicas, double costo, String fechaReparacion) {
        this.vehiculo = vehiculo;
        this.tipoReparacion = tipoReparacion;
        this.caracteristicas = caracteristicas;
        this.costo = costo;
        this.fechaReparacion = fechaReparacion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getTipoReparacion() {
        return tipoReparacion;
    }

    public void setTipoReparacion(String tipoReparacion) {
        this.tipoReparacion = tipoReparacion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(String fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }
    
    public String resultado() {
        String resultado = "Numero de placa: " + this.vehiculo.getPlaca() + "\nChasis del vehiculo: " + this.vehiculo.getChasis() + "\nTipo de reparacion: " + this.getTipoReparacion() + "\nCosto: " + this.getCosto();
        return resultado;
    }
}
