/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio6;

/**
 *
 * @author christianpernillo
 */
public class Nomina {
    public Empleado empleado;
    public double sueldo;
    public double totalDeducciones;
    public double sueldoLiquido;

    public Nomina(Empleado empleado, double sueldo, double totalDeducciones, double sueldoLiquido) {
        this.empleado = empleado;
        this.sueldo = sueldo;
        this.totalDeducciones = totalDeducciones;
        this.sueldoLiquido = sueldoLiquido;
    }

    public Nomina() {
    }
    

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getTotalDeducciones() {
        return totalDeducciones;
    }

    public void setTotalDeducciones(double sueldo) {
        double igss = sueldo * 0.0483;
        double irtra = sueldo * 0.01;
        double intecap = sueldo * 0.01;
        this.totalDeducciones = igss + irtra + intecap;
    }

    public double getSueldoLiquido() {
        return sueldoLiquido;
    }

    public void setSueldoLiquido(double sueldo) {
        this.sueldoLiquido = sueldo - this.totalDeducciones;
    }
    
    public String resultado() {
        String resultado;
        resultado = "Nombre del empleado: " + this.empleado.nombre + "\nSueldo del empleado: " + this.sueldo + "\nTotal de deducciones: " + this.totalDeducciones + "\nSueldo liquido: " + this.sueldoLiquido;
        return resultado;
    }

    
    
    
    
    
}
