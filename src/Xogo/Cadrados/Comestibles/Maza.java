/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo.Cadrados.Comestibles;

import Xogo.Xogo;
import static java.awt.Color.BLACK;
import static java.awt.Color.RED;
import javax.swing.BorderFactory;

/**
 *
 * @author a22noellr
 */
public class Maza extends Comestible{
    
    public Maza(Xogo xogo) {
        super(xogo);
    }
    
    @Override
    public void cor() {
        lblCadrado.setBackground(RED);
        lblCadrado.setBorder(BorderFactory.createLineBorder(BLACK));
        lblCadrado.setOpaque(true);
    }
    
    @Override
    public void efecto(){
        xogo.setPuntuacion(xogo.getPuntuacion()+10);
        xogo.aumentarLonxitudeSerpe();
    }
}
