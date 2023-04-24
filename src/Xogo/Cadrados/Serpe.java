/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo.Cadrados;

import Xogo.Xogo;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author a22noellr
 */
public class Serpe {
    //ATRIBUTOS
    private Xogo xogo;
    private int lonxitudeSerpe=0;
    private ArrayList<CadradoCorpo> corpo = new ArrayList<>();
    private Iterator<CadradoCorpo> iterCorpo;
    private int voltear=2;
    
    //CONSTRUCTOR
    public Serpe(Xogo xogo) {
        this.xogo=xogo;
        formarSerpe();
    }
    
    //GETTER E SETTER
    public int getLonxitudeSerpe() {
        return lonxitudeSerpe;
    }
    public void setLonxitudeSerpe(int lonxitudeSerpe) {
        this.lonxitudeSerpe = lonxitudeSerpe;
    }
    public ArrayList<CadradoCorpo> getCorpo() {
        return corpo;
    }
    public void setCorpo(ArrayList<CadradoCorpo> corpo) {
        this.corpo = corpo;
    }
    public Iterator<CadradoCorpo> getIterCorpo() {
        return iterCorpo;
    }
    public void setIterCorpo(Iterator<CadradoCorpo> iterCorpo) {
        this.iterCorpo = iterCorpo;
    }
    
    //MÉTODOS
    private void formarSerpe(){
        int posInicioX = 300;
        int posInicioY = 300;
        for (int i = 0; i < 3; i++) {
            CadradoCorpo cCorpo = new CadradoCorpo(this);
            corpo.add(cCorpo);
            cCorpo.setCoordX(posInicioX-i*cCorpo.getTAMANO());
            cCorpo.setCoordY(posInicioY);
            xogo.getInterfaz().pintarCadrado(cCorpo);
            lonxitudeSerpe++;
        }
    }
    
    public void voltearArriba(){
        voltear=1;
    }
    
    public void voltearDereita(){
        voltear=2;
    }
    
    public void voltearAbaixo(){
        voltear=3;
    }
    
    public void voltearEsquerda(){
        voltear=4;
    }
    
    /**
     * Fai que a serpe avance na dirección na que mira.
     */
    public void avanzar(){
        for (int i = corpo.size()-1; i >= 0; i--) {
            if (i==0){
                if (voltear==1){
                    corpo.get(i).setCoordY(corpo.get(i).getCoordY()-corpo.get(i).getTAMANO());
                }
                else if (voltear==2){
                    corpo.get(i).setCoordX(corpo.get(i).getCoordX()+corpo.get(i).getTAMANO());
                }
                else if (voltear==3){
                    corpo.get(i).setCoordY(corpo.get(i).getCoordY()+corpo.get(i).getTAMANO());
                }
                else {
                    corpo.get(i).setCoordX(corpo.get(i).getCoordX()-corpo.get(i).getTAMANO());
                }
            }else{
                corpo.get(i).setCoordX(corpo.get(i-1).getCoordX());
                corpo.get(i).setCoordY(corpo.get(i-1).getCoordY());
            }
        }
    }
    
    public void aumentarLonxitude(){
        CadradoCorpo cCorpo = new CadradoCorpo(this);
        cCorpo.establecerPosicion();
        corpo.add(cCorpo);
        lonxitudeSerpe++;
    }
}
