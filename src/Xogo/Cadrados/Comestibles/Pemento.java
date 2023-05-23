/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo.Cadrados.Comestibles;

import Xogo.Xogo;
import static java.awt.Color.BLACK;
import static java.awt.Color.ORANGE;
import javax.swing.BorderFactory;

/**
 *
 * @author a22noellr
 */
public class Pemento extends Comestible{
    
    public Pemento(Xogo xogo) {
        super(xogo);
    }
    
    @Override
    public void cor() {
        lblCadrado.setBackground(ORANGE);
        lblCadrado.setBorder(BorderFactory.createLineBorder(BLACK));
        lblCadrado.setOpaque(true);
    }
    
    @Override
    public void efecto() {
        xogo.setPuntuacion(xogo.getPuntuacion()+20);
        xogo.modificarVelocidadeSerpe(50);
    }
}
