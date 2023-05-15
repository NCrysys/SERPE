/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo.Cadrados.Comestibles;

import Xogo.Xogo;
import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;
import javax.swing.BorderFactory;

/**
 *
 * @author a22noellr
 */
public class Bomba extends Comestible{
    
    public Bomba(Xogo xogo) {
        super(xogo);
    }
    
    @Override
    public void cor() {
        lblCadrado.setBackground(BLACK);
        lblCadrado.setBorder(BorderFactory.createLineBorder(WHITE));
        lblCadrado.setOpaque(true);
    }
    
    @Override
    public void efecto(){
        for (int i = 0; i < xogo.getBombasComidas(); i++) {
            xogo.setPuntuacion(xogo.getPuntuacion()-15);
        }
        for (int i = 0; i < xogo.getBombasComidas()*3 && xogo.getSerpe().getCorpo().size()>1; i++) {
            xogo.getSerpe().reducirLonxitude();
        }
    }
}
