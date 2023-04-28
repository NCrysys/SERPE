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
    }
    
    //MÉTODOS
    /**
     * Establece a posición deste cadrado no cu da Serpe
     */
    @Override
    protected void establecerPosicion() {
        if(serpe.getCorpo().get(serpe.getCorpo().size()-1).getCoordX()==serpe.getCorpo().get(serpe.getCorpo().size()-2).getCoordX()-TAMANO){
            setCoordX(serpe.getCorpo().get(serpe.getCorpo().size()-1).getCoordX()-TAMANO);
            setCoordY(serpe.getCorpo().get(serpe.getCorpo().size()-1).getCoordY());
        }
        else if(serpe.getCorpo().get(serpe.getCorpo().size()-1).getCoordX()==serpe.getCorpo().get(serpe.getCorpo().size()-2).getCoordX()+TAMANO){
            setCoordX(serpe.getCorpo().get(serpe.getCorpo().size()-1).getCoordX()+TAMANO);
            setCoordY(serpe.getCorpo().get(serpe.getCorpo().size()-1).getCoordY());
        }
        else if(serpe.getCorpo().get(serpe.getCorpo().size()-1).getCoordY()==serpe.getCorpo().get(serpe.getCorpo().size()-2).getCoordY()+TAMANO){
            setCoordX(serpe.getCorpo().get(serpe.getCorpo().size()-1).getCoordX());
            setCoordY(serpe.getCorpo().get(serpe.getCorpo().size()-1).getCoordY()+TAMANO);
        }
        else {
            setCoordX(serpe.getCorpo().get(serpe.getCorpo().size()-1).getCoordX());
            setCoordY(serpe.getCorpo().get(serpe.getCorpo().size()-1).getCoordY()-TAMANO);
        }
    }
    
    /**
     * Establece a cor deste cadrado do corpo da Serpe
     */
    @Override
    public void cor() {
        lblCadrado.setBackground(Color.BLUE);
        lblCadrado.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblCadrado.setOpaque(true);
    }
    
}
