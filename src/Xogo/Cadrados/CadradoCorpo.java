/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo.Cadrados;

import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author a22noellr
 */
public class CadradoCorpo extends Cadrado{
    //ATRIBUTOS
    private Serpe serpe;
    //CONSTRUCTOR
    public CadradoCorpo(Serpe serpe) {
        this.serpe=serpe;
        lblCadrado = new javax.swing.JLabel();
        lblCadrado.setSize(TAMANO, TAMANO);
        cor();
    }
    
    //MÉTODOS
    @Override
    protected void establecerPosicion() {
        ////////////////////////////////////////////////////////////////////////////////////////////
        setCoordX(serpe.getCorpo().get(serpe.getCorpo().size()-1).getCoordX());
        setCoordY(serpe.getCorpo().get(serpe.getCorpo().size()-1).getCoordY());
        ////////////////////////////////////////////////////////////////////////////////////////////
    }
    
    @Override
    public void cor() {
        lblCadrado.setBackground(Color.BLUE);
        lblCadrado.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblCadrado.setOpaque(true);
    }
    
}
