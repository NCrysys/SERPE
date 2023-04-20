/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo.Cadrados.Comestibles;

import Xogo.Cadrados.Cadrado;

/**
 *
 * @author a22noellr
 */
public abstract class Comestible extends Cadrado{
    
    public Comestible() {
        lblCadrado = new javax.swing.JLabel();
        lblCadrado.setSize(TAMANO, TAMANO);
        establecerPosicion();
        cor();
    }
    
    
    @Override
    protected void establecerPosicion() {
        setCoordX((int) (Math.floor(Math.random() * (18 - 0 + 1) + 0)*50));
        setCoordY((int) (Math.floor(Math.random() * (18 - 0 + 1) + 0)*50));
    }
}
