/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo.Cadrados;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author a22noellr
 */
public abstract class Cadrado implements Coloreable{
    //ATRIBUTOS
    protected final int TAMANO = 50;
    protected int coordX;
    protected int coordY;
    protected JLabel lblCadrado;
    
    //GETTER E SETTER
    public int getTAMANO() {
        return TAMANO;
    }
    public int getCoordX() {
        return coordX;
    }
    public void setCoordX(int coordX) {
        this.coordX = coordX;
        this.lblCadrado.setLocation(coordX, coordY);
    }
    public int getCoordY() {
        return coordY;
    }
    public void setCoordY(int coordY) {
        this.coordY = coordY;
        this.lblCadrado.setLocation(coordX, coordY);
    }
    public JLabel getLblCadrado() {
        return lblCadrado;
    }
    public void setLblCadrado(JLabel lblCadrado) {
        this.lblCadrado = lblCadrado;
    }
    
    //MÉTODOS
    /**
     * Establece a posición do cadrado.
     */
    protected abstract void establecerPosicion();
}
