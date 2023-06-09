/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo.Cadrados;

import Xogo.Serpe;
import static java.awt.Color.BLACK;
import static java.awt.Color.BLUE;
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
    }
    
    //MÉTODOS
    /**
     * Establece a posición deste cadrado no cu da Serpe
     */
    @Override
    public void establecerPosicion() {
        setCoordX(serpe.getCorpo().get(serpe.getCorpo().size()-1).getCoordX());
        setCoordY(serpe.getCorpo().get(serpe.getCorpo().size()-1).getCoordY());
    }
    
    /**
     * Establece a cor deste cadrado do corpo da Serpe
     */
    @Override
    public void cor() {
        lblCadrado.setBackground(BLUE);
        lblCadrado.setBorder(BorderFactory.createLineBorder(BLACK));
        lblCadrado.setOpaque(true);
    }
    
}
