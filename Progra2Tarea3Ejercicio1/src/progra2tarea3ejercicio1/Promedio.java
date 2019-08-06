/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2tarea3ejercicio1;

/**
 *
 * @author christianpernillo
 */
public class Promedio {
    private double nota1, nota2, nota3, nota4;
    public Promedio(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
    
    public String verificarClase() {
        String resultado = "";
        double promedio_final;
        promedio_final = (nota1 + nota2 + nota3 + nota4) / 4;
        if(promedio_final < 61) {
            resultado = "Reprobado";
        } else {
            resultado = "Aprobado";
        }
        return resultado;
    }
}
