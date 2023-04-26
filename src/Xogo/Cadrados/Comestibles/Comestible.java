/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo.Cadrados.Comestibles;

import Xogo.Cadrados.Cadrado;
import Xogo.Xogo;

/**
 *
 * @author a22noellr
 */
public abstract class Comestible extends Cadrado{
    Xogo xogo;
    
    public Comestible(Xogo xogo) {
        this.xogo=xogo;
        lblCadrado = new javax.swing.JLabel();
        lblCadrado.setSize(TAMANO, TAMANO);
        establecerPosicion();
        cor();
    }
    
    
    @Override
    protected void establecerPosicion() {
        do{
            setCoordX((int) (Math.floor(Math.random() * (xogo.getMAXX()/TAMANO-1 - 0 + 1) + 0) * TAMANO));
            setCoordY((int) (Math.floor(Math.random() * (xogo.getMAXX()/TAMANO-1 - 0 + 1) + 0) * TAMANO)); 
        }while(!xogo.comprobarPosicionValida(getCoordX(), getCoordY()));
    }
}
