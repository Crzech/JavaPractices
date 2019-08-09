/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio9;

/**
 *
 * @author christianpernillo
 */
public class Financiamiento {
    public Cuenta cuenta;
    public String solicitante;
    public String fecha;

    public Financiamiento(Cuenta cuenta, String solicitante, String fecha) {
        this.cuenta = cuenta;
        this.solicitante = solicitante;
        this.fecha = fecha;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String resultado() {
        String resultado;
        resultado = "Nombre de la cuenta: " + this.cuenta.getNombre() + "\nMonto: " + this.cuenta.getMonto() + "\nSolicitante: " + this.getSolicitante();
        return resultado;
    }
    
}
