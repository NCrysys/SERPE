/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo.Cadrados.Comestibles;

import Xogo.Xogo;
import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author a22noellr
 */
public class Bomba extends Comestible{
    //CONSTRUCTOR
    public Bomba(Xogo xogo) {
        super(xogo);
    }
    
    //MÉTODOS
    /**
     * Establece a imaxe para esta Bomba, se non pode chama a cor.
     * @see Xogo.Cadrados.Comestibles.Bomba#cor()
     */
    @Override
    public void imaxe() {
        try{
            getLblCadrado().setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Bomba.png")));
        }catch (NullPointerException e){
            cor();
            JOptionPane.showMessageDialog(xogo.getInterfaz(), "Erro ao cargar a imaxe da Bomba.");
        }
    }
    
    /**
     * Establece a cor desta Bomba a negro e o borde a branco.
     */
    @Override
    public void cor() {
        lblCadrado.setBackground(BLACK);
        lblCadrado.setBorder(BorderFactory.createLineBorder(WHITE));
        lblCadrado.setOpaque(true);
    }
    
    /**
     * Reduce a puntuación deste Xogo en 30 pola cantidade de bombas comidas e tamén 
     * reduce a lonxitude desta Serpe en 3 cadrados pola cantidade de bombas comidas.
     */
    @Override
    public void efecto(){
        for (int i = 0; i < xogo.getBombasComidas(); i++) {
            xogo.setPuntuacion(xogo.getPuntuacion()-30);
        }
        for (int i = 0; i < xogo.getBombasComidas()*3 && xogo.getSerpe().getLonxitudeSerpe()>1; i++) {
            xogo.getSerpe().reducirLonxitude();
        }
    }
    
    /**
     * Saca esta Bomba do panel de Xogo.
     */
    public void desaparecer(){
        setCoordX(-getTAMANO());
        setCoordY(-getTAMANO());
    }
}
