/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo;

import Xogo.Cadrados.Cadrado;
import Xogo.Cadrados.CadradoCorpo;
import Xogo.Xogo;
import static java.awt.Color.CYAN;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

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
    private CadradoCorpo cabeza;
    private int voltear=2;
    private int velocidade = 500;
    
    //CONSTRUCTOR
    public Serpe(Xogo xogo) {
        this.xogo=xogo;
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
    public CadradoCorpo getCabeza() {
        return cabeza;
    }
    public void setCabeza(CadradoCorpo cabeza) {
        this.cabeza = cabeza;
    }
    public int getVoltear() {
        return voltear;
    }
    public void setVoltear(int voltear) {
        this.voltear = voltear;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    //MÉTODOS
    /**
     * Crea esta Serpe con 3 cadrados de corpo mais a Cabeza
     */
    public void formarSerpe(){
        cabeza = new CadradoCorpo(this);
        xogo.getInterfaz().pintarCadrado(cabeza);
        int posInicioX = 300;
        int posInicioY = 300;
        for (int i = 0; i < 3; i++) {
            CadradoCorpo cCorpo = new CadradoCorpo(this);
            corpo.add(cCorpo);
            cCorpo.cor();
            cCorpo.setCoordX(posInicioX-i*cCorpo.getTAMANO());
            cCorpo.setCoordY(posInicioY);
            xogo.getInterfaz().pintarCadrado(cCorpo);
            lonxitudeSerpe++;
        }
        establecerCabeza();
    }
    
    private void establecerCabeza(){
        cabeza.getLblCadrado().setSize(cabeza.getTAMANO() + 10, cabeza.getTAMANO() + 10);
        cabeza.setCoordX(corpo.get(0).getCoordX() - 5);
        cabeza.setCoordY(corpo.get(0).getCoordY() - 5);
        try{
            cabeza.getLblCadrado().setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/CabezaSerpe.png")));
        }catch (NullPointerException e){
            cabeza.cor();
            cabeza.getLblCadrado().setBackground(CYAN);
            JOptionPane.showMessageDialog(xogo.getInterfaz(), "Erro ao cargar a cabeza da Serpe.");
        }
    }
    
    /**
     * Cambia o movemento desta serpe cara arriba
     * @return direccion de movemento da serpe
     */
    public int voltearArriba(){
        voltear=1;
        return voltear;
    }
    
    /**
     * Cambia o movemento desta serpe cara a dereita
     * @return direccion de movemento da serpe
     */
    public int voltearDereita(){
        voltear=2;
        return voltear;
    }
    
    /**
     * Cambia o movemento desta serpe cara abaixo
     * @return direccion de movemento da serpe
     */
    public int voltearAbaixo(){
        voltear=3;
        return voltear;
    }
    
    /**
     * Cambia o movemento desta serpe cara a esquerda
     * @return direccion de movemento da serpe
     */
    public int voltearEsquerda(){
        voltear=4;
        return voltear;
    }
    
    /**
     * Fai que esta serpe avance na dirección na que mira.
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
        avanzarCabeza();
    }
    
    private void avanzarCabeza(){
        cabeza.setCoordX(corpo.get(0).getCoordX()-5);
        cabeza.setCoordY(corpo.get(0).getCoordY()-5);
    }
    
    /**
     * Teletransporta a Serpe ao lado contrario do taboleiro según a posición do primeiro cadrado do corpo.
     * @param x coordenada x do primeiro cadrado do corpo
     * @param y coordenada y do primeiro cadrado do corpo
     * @return O primeiro cadrado do corpo coa posición xa cambiada
     */
    public Cadrado teletransportar(int x, int y){
        Cadrado cabeza = corpo.get(0);
        avanzar();
        if (x<0){
            cabeza.setCoordX(xogo.getMAXX()-cabeza.getTAMANO());
        }
        else if (x>=xogo.getMAXX()){
            cabeza.setCoordX(0);
        }
        else if (y<0){
            cabeza.setCoordY(xogo.getMAXY()-cabeza.getTAMANO());
        }
        else {
            cabeza.setCoordY(0);
        }
        avanzarCabeza();
        return cabeza;
    }
    
    /**
     * Aumenta a lonxitude desta Serpe engadindolle un novo cadrado de corpo
     */
    public void aumentarLonxitude(){
        CadradoCorpo cCorpo = new CadradoCorpo(this);
        cCorpo.cor();
        cCorpo.establecerPosicion();
        corpo.add(cCorpo);
        lonxitudeSerpe++;
    }
    
    /**
     * Reduce a lonxitude desta Serpe borrandolle o último cadrado do corpo
     */
    public void reducirLonxitude(){
        xogo.getInterfaz().borrarCadrado(corpo.get(corpo.size()-1));
        corpo.remove(corpo.size()-1);
        lonxitudeSerpe--;
    }
    
    /**
     * Elimina a Serpe borrando todos os cadrados do seu corpo e restablece a dirección de movemento
     */
    public void borrarSerpe(){
        corpo.removeAll(corpo);
        lonxitudeSerpe=0;
        voltear=2;
    }
}
