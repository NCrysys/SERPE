/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo.Cadrados.Comestibles;

import Xogo.Xogo;
import static java.awt.Color.BLACK;
import static java.awt.Color.RED;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author a22noellr
 */
public class Maza extends Comestible{
    //CONSTRUCTOR
    public Maza(Xogo xogo) {
        super(xogo);
    }
    
    //MÉTODOS
    /**
     * Establece a imaxe para esta Maza, se non pode chama a cor.
     * @see Xogo.Cadrados.Comestibles.Maza#cor()
     */
    @Override
    public void imaxe() {
        try{
            getLblCadrado().setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Maza.png")));
        }catch (NullPointerException e){
            cor();
            JOptionPane.showMessageDialog(xogo.getInterfaz(), "Erro ao cargar a imaxe da Mazá.");
        }
    }
    
    /**
     * Establece a cor desta Maza a vermello e o borde a negro.
     */
    @Override
    public void cor() {
        lblCadrado.setBackground(RED);
        lblCadrado.setBorder(BorderFactory.createLineBorder(BLACK));
        lblCadrado.setOpaque(true);
    }
    
    /**
     * Aumenta a lonxitude desta Serpe en 1 e aumenta a puntuación deste Xogo en 10.
     */
    @Override
    public void efecto(){
        xogo.setPuntuacion(xogo.getPuntuacion()+10);
        xogo.aumentarLonxitudeSerpe();
    }
}
