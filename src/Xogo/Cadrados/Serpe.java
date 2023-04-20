/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo.Cadrados;

import Xogo.Xogo;
import java.util.ArrayList;

/**
 *
 * @author a22noellr
 */
public class Serpe {
    //ATRIBUTOS
    private Xogo xogo;
    private int lonxitudeSerpe;
    private ArrayList<CadradoCorpo> corpo = new ArrayList<>();
    boolean arriba=false;
    boolean dereita=true;
    boolean abaixo=false;
    boolean esquerda=false;
    
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
    
    //MÉTODOS
    private void formarSerpe(){
        int posInicioX = 300;
        int posInicioY = 300;
        for (int i = 0; i < 3; i++) {
            CadradoCorpo cCorpo = new CadradoCorpo();
            corpo.add(cCorpo);
            cCorpo.setCoordX(posInicioX-i*cCorpo.getTAMANO());
            cCorpo.setCoordY(posInicioY);
            xogo.getInterfaz().pintarCadrado(cCorpo);
        }
    }
    
    public void voltearArriba(){
        arriba=true;
        dereita=false;
        abaixo=false;
        esquerda=false;
    }
    
    public void voltearDereita(){
        arriba=false;
        dereita=true;
        abaixo=false;
        esquerda=false;
    }
    
    public void voltearAbaixo(){
        arriba=false;
        dereita=false;
        abaixo=true;
        esquerda=false;
    }
    
    public void voltearEsquerda(){
        arriba=false;
        dereita=false;
        abaixo=false;
        esquerda=true;
    }
    
    /**
     * Fai que a serpe avance na dirección na que mira.
     */
    public void avanzar(){
        for (int i = corpo.size()-1; i >= 0; i--) {
            if (i==0){
                if (arriba){
                    corpo.get(i).setCoordY(corpo.get(i).getCoordY()-corpo.get(i).getTAMANO());
                }
                else if (dereita){
                    corpo.get(i).setCoordX(corpo.get(i).getCoordX()+corpo.get(i).getTAMANO());
                }
                else if (abaixo){
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
}
