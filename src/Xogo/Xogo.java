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
    private Interface interfaz;
    private Serpe serpe;
    private Bomba bomba;
    private Comestible froita;
    private HashMap<Integer,Comestible> froitas;
    private int puntuacion=0;
    private int tempo=0;
    private int froitasComidas=0;
    private int bombasComidas=0;
    private boolean modoClasico=true;
    
    //CONTRUCTOR
    public Xogo(Interface interfaz) {
        this.interfaz = interfaz;
        xerarConxuntoFroitas();
        serpe = new Serpe(this);
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
    public int getFroitasComidas() {
        return froitasComidas;
    }
    public void setFroitasComidas(int froitasComidas) {
        this.froitasComidas = froitasComidas;
    }
    public int getBombasComidas() {
        return bombasComidas;
    }
    public void setBombasComidas(int bombasComidas) {
        this.bombasComidas = bombasComidas;
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
    public boolean isModoClasico() {
        return modoClasico;
    }
    public void setModoClasico(boolean modoClasico) {
        this.modoClasico = modoClasico;
    }
    
    //MÉTODOS
    public void iniciarPartida(){
        serpe.formarSerpe();
        xerarFroita();
    }
    
    public void voltearSerpeArriba(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        if (comprobarPosicionSerpe(cabeza.getCoordX(), cabeza.getCoordY()-cabeza.getTAMANO()) && comprobarTeletransporte()){
            serpe.voltearArriba();
        }
    }
    
    public void voltearSerpeDereita(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        if (comprobarPosicionSerpe(cabeza.getCoordX()+cabeza.getTAMANO(), cabeza.getCoordY()) && comprobarTeletransporte()){
            serpe.voltearDereita();
        }
    }
    
    public void voltearSerpeAbaixo(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        if (comprobarPosicionSerpe(cabeza.getCoordX(), cabeza.getCoordY()+cabeza.getTAMANO()) && comprobarTeletransporte()){
            serpe.voltearAbaixo();
        }
    }
    
    public void voltearSerpeEsquerda(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        if (comprobarPosicionSerpe(cabeza.getCoordX()-cabeza.getTAMANO(), cabeza.getCoordY()) && comprobarTeletransporte()){
            serpe.voltearEsquerda();
        }
    }
    
    private void pintarSerpe(){
        for (int i = 0; i < serpe.getCorpo().size(); i++) {
            interfaz.pintarCadrado(serpe.getCorpo().get(i));
        }
    }
    
    private void finXogo(){
        interfaz.finDoXogo();
    }
    
    public void borrarCadrados(){
        serpe.setIterCorpo(serpe.getCorpo().iterator());
        while (serpe.getIterCorpo().hasNext()){
            interfaz.borrarCadrado(serpe.getIterCorpo().next());
        }
        interfaz.borrarCadrado(serpe.getCabeza());
        interfaz.borrarCadrado(froita);
        //interfaz.borrarCadrado(bomba);
        serpe.borrarSerpe();
    }
    
    public void avanzarSerpe(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        int xCabeza = cabeza.getCoordX();
        int yCabeza = cabeza.getCoordY();
        if (serpe.getVoltear() == 1) {
            yCabeza = cabeza.getCoordY()-cabeza.getTAMANO();
        }
        else if (serpe.getVoltear() == 2) {
            xCabeza = cabeza.getCoordX()+cabeza.getTAMANO();
        }
        else if (serpe.getVoltear() == 3) {
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
        else if (!modoClasico && !comprobarBordes(xCabeza, yCabeza) && comprobarTeletransporte()){
            teletransporte(xCabeza, yCabeza);
        }
        else{
            finXogo();
        }
    }
    
    private boolean comprobarTeletransporte(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        int xCabeza = cabeza.getCoordX();
        int yCabeza = cabeza.getCoordY();
        if (serpe.getVoltear() == 1) {
            yCabeza = MAXY-cabeza.getTAMANO();
        }
        else if (serpe.getVoltear() == 2) {
            xCabeza = 0;
        }
        else if (serpe.getVoltear() == 3) {
            yCabeza = 0;
        }
        else {
            xCabeza = MAXX-cabeza.getTAMANO();
        }
        return comprobarPosicionSerpe(xCabeza, yCabeza);
    }
    
    private void teletransporte(int xCabeza, int yCabeza){
        Cadrado cabeza = serpe.getCorpo().get(0);
        serpe.avanzar();
        if (xCabeza<0){
            cabeza.setCoordX(MAXX-cabeza.getTAMANO());
        }
        else if (xCabeza>=MAXX){
            cabeza.setCoordX(0);
        }
        else if (yCabeza<0){
            cabeza.setCoordY(MAXY-cabeza.getTAMANO());
        }
        else {
            cabeza.setCoordY(0);
        }
        serpe.avanzarCabeza();
        comer();
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
                if(froita.getCoordX()==cadradoCorpo.getCoordX() && froita.getCoordY()==cadradoCorpo.getCoordY()){
                    posicionValida=false;
                }/*
                if(bomba.getCoordX()==cadradoCorpo.getCoordX() && bomba.getCoordY()==cadradoCorpo.getCoordY()){
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
    
    public void xerarConxuntoFroitas(){
        froitas=new HashMap();
        froitas.put(1, new Maza(this));
        froitas.put(2, new Maza(this));
        froitas.put(3, new Maza(this));
    }
    
    /**
     * Establecese aleatoriamente un Comestible para o campo froita.
     */
    public void xerarFroita(){
        int comida = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
        froita = froitas.get(comida);
        froita.establecerPosicion();
        interfaz.pintarCadrado(froita);
    }
    
    private void comer(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        if (cabeza.getCoordX()==froita.getCoordX() && cabeza.getCoordY()==froita.getCoordY()){
            comerFroita();
            puntuacion+=10;
        }
        /*else if (cabeza.getCoordX()==bomba.getCoordX() && cabeza.getCoordY()==bomba.getCoordY()){
            comerBomba();
            puntuacion-=15;
        }*/
    }
    
    private void comerFroita(){
        serpe.aumentarLonxitude();
        interfaz.borrarCadrado(froita);
        froitasComidas++;
        interfaz.engadirFroitas(froitasComidas);
        xerarFroita();
    }
    
    private void comerBomba(){
        serpe.reducirLonxitude();
    }
}
