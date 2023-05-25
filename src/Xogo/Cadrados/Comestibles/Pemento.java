/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo.Cadrados.Comestibles;

import Xogo.Xogo;
import static java.awt.Color.BLACK;
import static java.awt.Color.ORANGE;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author a22noellr
 */
public class Pemento extends Comestible{
    //CONSTRUCTOR
    public Pemento(Xogo xogo) {
        super(xogo);
    }
    
    //MÉTODOS
    /**
     * Establece a imaxe para este Pemento, se non pode chama a cor.
     * @see Xogo.Cadrados.Comestibles.Pemento#cor()
     */
    @Override
    public void imaxe() {
        try{
            getLblCadrado().setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Pemento.png")));
        }catch (NullPointerException e){
            cor();
            JOptionPane.showMessageDialog(xogo.getInterfaz(), "Erro ao cargar a imaxe da Pemento.");
        }
    }
    
    /**
     * Establece a cor deste Pemento a naranxa e o borde a negro.
     */
    @Override
    public void cor() {
        lblCadrado.setBackground(ORANGE);
        lblCadrado.setBorder(BorderFactory.createLineBorder(BLACK));
        lblCadrado.setOpaque(true);
    }
    
    /**
     * Aumenta a puntuación deste Xogo en 20 e aumenta a súa velocidade en 50.
     */
    @Override
    public void efecto() {
        xogo.setPuntuacion(xogo.getPuntuacion()+20);
        xogo.modificarVelocidadeSerpe(50);
    }
}
