/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBD;

import java.sql.Date;

/**
 *
 * @author a22noellr
 */
public class Partida {
    //ATRIBUTOS
    private String jugador;
    private int puntuacion;
    private int froitas;
    private int bombas;
    private int tempo;
    private Date fecha;
    private Object[] partida;
    //CONSTRUCTOR
    public Partida(String jugador, int puntuacion, int froitas, int bombas, int tempo, Date fecha) {
        this.jugador=jugador;
        this.puntuacion=puntuacion;
        this.froitas=froitas;
        this.bombas=bombas;
        this.tempo=tempo;
        this.fecha=fecha;
        formarPartida();
    }
    
    //GETTER Y SETTER
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
    public int getFroitas() {
        return froitas;
    }
    public void setFroitas(int froitas) {
        this.froitas = froitas;
    }
    public int getBombas() {
        return bombas;
    }
    public void setBombas(int bombas) {
        this.bombas = bombas;
    }
    public int getTempo() {
        return tempo;
    }
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Object[] getPartida() {
        return partida;
    }
    public void setPartida(Object[] partida) {
        this.partida = partida;
    }
    
    //MÉTODOS
    private void formarPartida(){
        partida = new Object[6];
        partida[0] = jugador;
        partida[1] = puntuacion;
        partida[2] = froitas;
        partida[3] = bombas;
        partida[4] = tempo;
        partida[5] = fecha;
    }
}
