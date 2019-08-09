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
public class TipoFigura {
    public FiguraGeometrica figura;
    public int lados;

    public TipoFigura(FiguraGeometrica figura, int lados) {
        this.figura = figura;
        this.lados = lados;
    }

    public FiguraGeometrica getFigura() {
        return figura;
    }

    public void setFigura(FiguraGeometrica figura) {
        this.figura = figura;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }
    
    public String resultado() {
        String resultado = "Nombre de la figura: " + this.figura.getNombre() + "\nAlto: " + this.figura.getAlto() + "\nAncho: " + this.figura.getAncho() + "\nNumero Lados: " + this.getLados();
        return resultado;
    }
}
