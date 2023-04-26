/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo.Cadrados.Comestibles;

import Xogo.Xogo;
import java.awt.Color;
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
        lblCadrado.setBackground(Color.RED);
        lblCadrado.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblCadrado.setOpaque(true);
    }
}