/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Xogo;

import InterfaceGrafica.Interface;
import Xogo.Cadrados.Cadrado;
import Xogo.Cadrados.Comestibles.Bomba;
import Xogo.Cadrados.Comestibles.Comestible;
import Xogo.Cadrados.Comestibles.Maza;
import Xogo.Cadrados.Comestibles.Pemento;
import Xogo.Cadrados.Comestibles.Sandia;
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
    private String jugador = "invitado";
    private int puntuacion=0;
    private int tempo=0;
    private int froitasComidas=0;
    private int bombasComidas=0;
    private boolean modoClasico=true;
    
    //CONTRUCTOR
    public Xogo(Interface interfaz) {
        this.interfaz = interfaz;
        xerarComestibles();
        serpe = new Serpe(this);
    }
    
    //GETTER E SETTER
    public int getMAXX() {
        return MAXX;
    }
    public int getMAXY() {    
        return MAXY;
    }
    public Interface getInterfaz() {
        return interfaz;
    }
    public void setInterfaz(Interface interfaz) {
        this.interfaz = interfaz;
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
    public HashMap<Integer, Comestible> getFroitas() {
        return froitas;
    }
    public void setFroitas(HashMap<Integer, Comestible> froitas) {
        this.froitas = froitas;
    }
    public String getJugador() {
        return jugador;
    }
    public void setJugador(String jugador) {
        this.jugador = jugador;
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
    public boolean isModoClasico() {
        return modoClasico;
    }
    public void setModoClasico(boolean modoClasico) {
        this.modoClasico = modoClasico;
    }
    
    
    //MÉTODOS
    /**
     * Inicia esta partida chamado a formarSerpe e xerarFroita
     * @see Xogo.Serpe#formarSerpe()
     */
    public void iniciarPartida(){
        serpe.formarSerpe();
        xerarFroita();
        bomba.desaparecer();
    }
    
    /**
     * Comproba se pode cambiar a dirección de movemento cara arriba, se pode chama a voltearArriba en Serpe
     * @see Xogo.Serpe#voltearArriba()
     */
    public void voltearSerpeArriba(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        if (cabeza.getCoordY()==0 && !comprobarPosicionSerpe(cabeza.getCoordX(), MAXY-cabeza.getTAMANO())){
        }
        else if (comprobarPosicionSerpe(cabeza.getCoordX(), cabeza.getCoordY()-cabeza.getTAMANO())){
            serpe.voltearArriba();
        }
    }
    
    /**
     * Comproba se pode cambiar a dirección de movemento cara a dereita, se pode chama a voltearDereita en Serpe
     * @see Xogo.Serpe#voltearDereita()
     */
    public void voltearSerpeDereita(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        if (cabeza.getCoordX()==MAXX-cabeza.getTAMANO() && !comprobarPosicionSerpe(0, cabeza.getCoordY())){
        }
        else if (comprobarPosicionSerpe(cabeza.getCoordX()+cabeza.getTAMANO(), cabeza.getCoordY())){
            serpe.voltearDereita();
        }
    }
    
    /**
     * Comproba se pode cambiar a dirección de movemento cara abaixo, se pode chama a voltearAbaixo en Serpe
     * @see Xogo.Serpe#voltearAbaixo()
     */
    public void voltearSerpeAbaixo(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        if (cabeza.getCoordY()==MAXY-cabeza.getTAMANO() && !comprobarPosicionSerpe(cabeza.getCoordX(), 0)){
        }
        else if (comprobarPosicionSerpe(cabeza.getCoordX(), cabeza.getCoordY()+cabeza.getTAMANO())){
            serpe.voltearAbaixo();
        }
    }
    
    /**
     * Comproba se pode cambiar a dirección de movemento cara a esquerda, se pode chama a voltearEsquerda en Serpe
     * @see Xogo.Serpe#voltearEsquerda()
     */
    public void voltearSerpeEsquerda(){
        Cadrado cabeza = serpe.getCorpo().get(0);
        if (cabeza.getCoordX()==0 && !comprobarPosicionSerpe(MAXX-cabeza.getTAMANO(), cabeza.getCoordY())){
        }
        else if (comprobarPosicionSerpe(cabeza.getCoordX()-cabeza.getTAMANO(), cabeza.getCoordY())){
            serpe.voltearEsquerda();
        }
    }
    
    private void pintarSerpe(){
        for (int i = 0; i < serpe.getCorpo().size(); i++) {
            interfaz.pintarCadrado(serpe.getCorpo().get(i));
        }
    }
    
    /**
     * Comproba se esta Serpe pode avanzar chamando a comprobarPosicionValida. 
     * Se pode avanzar chama a avanzar en Serpe ou no seu caso a teletransportar, senón chamará a finDoXogo.
     * @see Xogo.Xogo#comprobarPosicionValida(int x, int y)
     * @see Xogo.Serpe#avanzar()
     * @see Xogo.Serpe#teletransportar(int x, int y)
     * @see InterfaceGrafica.Interface#finDoXogo()
     */
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
            comer(xCabeza, yCabeza);
            pintarSerpe();
        }
        else if (!modoClasico && !comprobarBordes(xCabeza, yCabeza) && comprobarTeletransporte()){
            cabeza = serpe.teletransportar(xCabeza, yCabeza);
            comer(cabeza.getCoordX(), cabeza.getCoordY());
        }
        else{
            interfaz.finDoXogo();
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
    
    /**
     * Comproba se a posición destas coordenadas pasadas é valida
     * @param x coordenada x
     * @param y coordenada y
     * @return true se a posicion é valida, false se a posición non é valida
     */
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
                }
                if(bomba.getCoordX()==cadradoCorpo.getCoordX() && bomba.getCoordY()==cadradoCorpo.getCoordY()){
                    posicionValida=false;
                }
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
     * Comproba se a posicion dos comestibles coinciden.
     * @return true se non coinciden, false se coinciden
     */
    public boolean comprobarPosicionComestibles(){
        boolean posicionValida=true;
        if (froita.getCoordX()==bomba.getCoordX() && froita.getCoordY()==bomba.getCoordY()){
            posicionValida=false;
        }
        return posicionValida;
    }
    
    private void xerarComestibles(){
        froitas=new HashMap();
        Comestible maza = new Maza(this);
        Comestible pemento = new Pemento(this);
        Comestible sandia = new Sandia(this);
        froitas.put(1, maza);
        froitas.put(2, maza);
        froitas.put(3, maza);
        froitas.put(4, maza);
        froitas.put(5, maza);
        froitas.put(6, pemento);
        froitas.put(7, pemento);
        froitas.put(8, pemento);
        froitas.put(9, sandia);
        bomba = new Bomba(this);
    }
    
    private void xerarFroita(){
        int comida = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
        froita = froitas.get(comida);
        froita.establecerPosicion();
        interfaz.pintarCadrado(froita);
    }
    
    /**
     * Establece unha nova posición para esta bomba.
     */
    public void xerarBomba(){
        bomba.establecerPosicion();
        interfaz.pintarCadrado(bomba);
    }
    
    private void comer(int x, int y){
        if (x==froita.getCoordX() && y==froita.getCoordY()){
            comerFroita();
        }
        else if (x==bomba.getCoordX() && y==bomba.getCoordY()){
            comerBomba();
        }
    }
    
    private void comerFroita(){
        froitasComidas++;
        interfaz.engadirFroitas(froitasComidas);
        froita.efecto();
        interfaz.establecerPuntos(puntuacion);
        interfaz.borrarCadrado(froita);
        xerarFroita();
    }
    
    private void comerBomba(){
        bombasComidas++;
        interfaz.engadirBombas(bombasComidas);
        bomba.efecto();
        interfaz.establecerPuntos(puntuacion);
        interfaz.borrarCadrado(bomba);
        bomba.desaparecer();
        if(puntuacion<0 || serpe.getLonxitudeSerpe()<=1){
            interfaz.finDoXogo();
        }
    }
    
    /**
     * Chama a aumentarLonxitude en Serpe.
     * @see Xogo.Serpe#aumentarLonxitude()
     */
    public void aumentarLonxitudeSerpe(){
        serpe.aumentarLonxitude();
    }
    
    /**
     * Modifica a velocidade da serpe
     * @param veloz cantidade na que se aumenta a velocidade
     */
    public void modificarVelocidadeSerpe(int veloz){
        int velocidade=serpe.getVelocidade();
        velocidade-=veloz;
        if(velocidade<150){
            velocidade=150;
        }
        else if(velocidade>500){
            velocidade=500;
        }
        serpe.setVelocidade(velocidade);
        interfaz.modificarTimerVelocidade(velocidade);
    }
    
    /**
     * Restaura os valores por defecto do xogo e borra os cadrados do xogo.
     */
    public void restaurarXogo(){
        setPuntuacion(0);
        setFroitasComidas(0);
        setBombasComidas(0);
        setTempo(0);
        serpe.setVelocidade(500);
        borrarCadrados();
    }
    
    private void borrarCadrados(){
        serpe.setIterCorpo(serpe.getCorpo().iterator());
        while (serpe.getIterCorpo().hasNext()){
            interfaz.borrarCadrado(serpe.getIterCorpo().next());
        }
        interfaz.borrarCadrado(serpe.getCabeza());
        interfaz.borrarCadrado(froita);
        interfaz.borrarCadrado(bomba);
        serpe.borrarSerpe();
    }
}
