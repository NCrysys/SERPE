/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo;

import InterfaceGrafica.Interface;
import Xogo.Cadrados.Cadrado;
import Xogo.Cadrados.Serpe;
import Xogo.Cadrados.Comestibles.Bomba;
import Xogo.Cadrados.Comestibles.Comestible;
import Xogo.Cadrados.Comestibles.Maza;
import java.util.HashMap;

/**
 *
 * @author a22noellr
 */
public class Xogo {
    //ATRIBUTOS
    private final int MAXX = 900;
    private final int MAXY = 900;
    private int puntuacion;
    private int tempo=0;
    private Interface interfaz;
    private Serpe serpe;
    private Bomba bomba;
    private Comestible froita;
    private int voltear=2;
    private int froitasComidas=0;
    private int bombasComidas=0;
    
    //CONTRUCTOR
    public Xogo(Interface interfaz) {
        this.interfaz = interfaz;
        serpe = new Serpe(this);
        xerarFroita();
    }
    
    //GETTER E SETTER
    public Interface getInterfaz() {
        return interfaz;
    }
    public int getMAXX() {
        return MAXX;
    }
    public int getMAXY() {
        return MAXY;
    }
    public int getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    public int getTempo() {
        return tempo;
    }
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    public Serpe getSerpe() {
        return serpe;
    }
    public void setSerpe(Serpe serpe) {
        this.serpe = serpe;
    }
    public Bomba getBomba() {
        return bomba;
    }
    public void setBomba(Bomba bomba) {
        this.bomba = bomba;
    }
    public Comestible getFroita() {
        return froita;
    }
    public void setFroita(Comestible froita) {
        this.froita = froita;
    }
    
    //MÉTODOS
    public void voltearSerpeArriba(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        if (comprobarPosicionSerpe(cabeza.getCoordX(), cabeza.getCoordY()-cabeza.getTAMANO())){
            voltear=serpe.voltearArriba();
        }
    }
    
    public void voltearSerpeDereita(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        if (comprobarPosicionSerpe(cabeza.getCoordX()+cabeza.getTAMANO(), cabeza.getCoordY())){
            voltear=serpe.voltearDereita();
        }
    }
    
    public void voltearSerpeAbaixo(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        if (comprobarPosicionSerpe(cabeza.getCoordX(), cabeza.getCoordY()+cabeza.getTAMANO())){
            voltear=serpe.voltearAbaixo();
        }
    }
    
    public void voltearSerpeEsquerda(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        if (comprobarPosicionSerpe(cabeza.getCoordX()-cabeza.getTAMANO(), cabeza.getCoordY())){
            voltear=serpe.voltearEsquerda();
        }
    }
    
    public void avanzarSerpe(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        int xCabeza = cabeza.getCoordX();
        int yCabeza = cabeza.getCoordY();
        if (voltear == 1) {
            yCabeza = cabeza.getCoordY()-cabeza.getTAMANO();
        }
        else if (voltear == 2) {
            xCabeza = cabeza.getCoordX()+cabeza.getTAMANO();
        }
        else if (voltear == 3) {
            yCabeza = cabeza.getCoordY()+cabeza.getTAMANO();
        }
        else {
            xCabeza = cabeza.getCoordX()-cabeza.getTAMANO();
        }
        if(comprobarPosicionValida(xCabeza, yCabeza)){
            serpe.avanzar();
            comer();
            pintarSerpe();
        }
        else {
            
        }
    }
    
    private void pintarSerpe(){
        for (int i = 0; i < serpe.getCorpo().size(); i++) {
            interfaz.pintarCadrado(serpe.getCorpo().get(i));
        }
    }
    
    public boolean comprobarPosicionValida(int x, int y){
        boolean posicionValida=true;
        if (!comprobarPosicionSerpe(x, y) || !comprobarBordes(x, y)){
            posicionValida=false; 
        }
        return posicionValida;
    }
    
    private boolean comprobarPosicionSerpe(int x, int y){
        boolean posicionValida=true;
        serpe.setIterCorpo(serpe.getCorpo().iterator());
        while (serpe.getIterCorpo().hasNext()) {
            Cadrado cadradoCorpo = serpe.getIterCorpo().next();
            if(cadradoCorpo==serpe.getCorpo().get(serpe.getCorpo().size()-1)){
                /*if(froita.getCoordX()==cadradoCorpo.getCoordX() && froita.getCoordY()==cadradoCorpo.getCoordY()){
                    posicionValida=false;
                }*/
            }
            else if(x==cadradoCorpo.getCoordX() && y==cadradoCorpo.getCoordY()){
                posicionValida=false;
            }
        }
        return posicionValida;
    }
    
    private boolean comprobarBordes(int x, int y){
        boolean posicionValida=true;
        if (x<0 || x>=MAXX || y<0 || y>=MAXY){
            posicionValida=false;
        }
        return posicionValida;
    }
    
    /**
     * Establecese aleatoriamente un Comestible para o campo froita.
     */
    public void xerarFroita(){
        HashMap<Integer,Comestible> map=new HashMap();
        map.put(1, new Maza(this));
        map.put(2, new Maza(this));
        map.put(3, new Maza(this));
        int comida = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
        froita = map.get(comida);
        interfaz.pintarCadrado(froita);
    }
    
    public boolean comer(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        if (cabeza.getCoordX()==froita.getCoordX() && cabeza.getCoordY()==froita.getCoordY()){
            interfaz.borrarCadrado(froita);
            froitasComidas++;
            interfaz.engadirFroitas(froitasComidas);
            xerarFroita();
            serpe.aumentarLonxitude();
        }
        /*else if (cabeza.getCoordX()==bomba.getCoordX() && cabeza.getCoordY()==bomba.getCoordY()){
            
        }*/
        return true;
    }
}
