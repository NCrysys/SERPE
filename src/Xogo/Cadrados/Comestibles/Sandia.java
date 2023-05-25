/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo.Cadrados.Comestibles;

import Xogo.Xogo;
import static java.awt.Color.BLACK;
import static java.awt.Color.GREEN;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author a22noellr
 */
public class Sandia extends Comestible{
    //CONSTRUCTOR
    public Sandia(Xogo xogo) {
        super(xogo);
    }
    
    //MÉTODOS
    /**
     * Establece a imaxe para esta Sandia, se non pode chama a cor.
     * @see Xogo.Cadrados.Comestibles.Sandia#cor()
     */
    @Override
    public void imaxe() {
        try{
            getLblCadrado().setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Sandia.png")));
        }catch (NullPointerException e){
            cor();
            JOptionPane.showMessageDialog(xogo.getInterfaz(), "Erro ao cargar a imaxe da Sandía.");
        }
    }
    
    /**
     * Establece a cor desta Sandia a verde e o borde a negro.
     */
    @Override
    public void cor() {
        lblCadrado.setBackground(GREEN);
        lblCadrado.setBorder(BorderFactory.createLineBorder(BLACK));
        lblCadrado.setOpaque(true);
    }
    
    /**
     * Aumenta a lonxitude desta Serpe en 2, aumenta a puntuación deste Xogo en 40 e disminúe a súa velocidade en 100.
     */
    @Override
    public void efecto() {
        xogo.aumentarLonxitudeSerpe();
        xogo.aumentarLonxitudeSerpe();
        xogo.setPuntuacion(xogo.getPuntuacion()+40);
        xogo.modificarVelocidadeSerpe(-100);
    }
}
