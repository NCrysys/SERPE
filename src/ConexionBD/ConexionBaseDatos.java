/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBD;

import InterfaceGrafica.Interface;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author a22noellr
 */
public class ConexionBaseDatos {
    //ATRIBUTOS
    private Connection con = null;
    private Interface interfaz;
    private ArrayList<Object> partidas;
    
    //CONSTRUCTOR
    public ConexionBaseDatos(Interface interfaz) {
        this.interfaz = interfaz;
        this.partidas = new ArrayList();
        abrirConexion();
    }
    
    //MÉTODOS
    private void abrirConexion(){
        String url = "jdbc:mysql://localhost/BDSERPE";
        String uid = "root";
        String password = "root";
        try{
            con = DriverManager.getConnection(url, uid, password);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(interfaz, "Erro ao conectar coa base de datos.");
            interfaz.bloquearBD();
        }
    }
    
    /**
     * Garda os datos da partida na base de datos
     * @param usuario nome do usuario que xogou esta partida
     * @param puntos puntos conseguidos nesta partida
     * @param froitas número de froitas comidas nesta partida
     * @param bombas número de bombas comidas nesta partida
     * @param tempo tempo de xogo desta partida
     * @param modoClasico modo de xogo desta partida, true clasico, false esfera
     * @return true se estes datos se gardaron con éxito, false se estes datos non se puideron gardar
     */
    public boolean gardarDatos(String usuario, int puntos, int froitas, int bombas, int tempo, boolean modoClasico){
        boolean gardado=false;
        try {
            int idJugador=obterIdJugador(usuario);
            String modo;
            if (modoClasico){
                modo="Clásico";
            }
            else{
                modo="Esfera";
            }
            Statement insertPartida = null;
            String insertString = "INSERT INTO PARTIDAS VALUES (NULL, '"+idJugador+"', '"+puntos+"', '"+froitas+"', '"+bombas+"', '"+tempo+"', CURRENT_DATE(), '"+modo+"')";
            insertPartida = con.createStatement();
            insertPartida.executeUpdate(insertString);
            gardado=true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(interfaz, "Erro ao gardar a partida.");
        }
        return gardado;
    }
    
    
    private int obterIdJugador(String usuario) throws SQLException{
        Statement selectIdJugador = con.createStatement();
        ResultSet resultIdJugador = selectIdJugador.executeQuery("SELECT ID_JUGADOR FROM JUGADORES WHERE USUARIO='"+usuario+"'");
        resultIdJugador.next();
        int idJugador=resultIdJugador.getInt(1);
        return idJugador;
    }
    
    /**
     * Comproba se este usuario está rexistrado na base de datos
     * @param usuario nome deste usuario
     * @return true se este usuario está na base de datos, false se non se encontra este usuario na base de datos
     */
    public boolean comprobarUsuario(String usuario){
        boolean registrado=false;
        try{
            Statement mysqlSelect = con.createStatement();
            ResultSet mysqlResult = mysqlSelect.executeQuery("SELECT USUARIO FROM JUGADORES");
            while(mysqlResult.next() && !registrado){
                String usuarioRegistrado = mysqlResult.getString(1);
                if (usuario.equals(usuarioRegistrado)){
                    registrado=true;
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(interfaz, "Erro ao ler o usuario da base de datos.");
            
        }
        return registrado;
    }
    
    /**
     * Comproba se na base de datos está rexistrado este usuario con este contrasinal
     * @param usuario nome deste usuario
     * @param contrasinal contrasinal deste usuario
     * @return true se este usuario está na base de datos con este contrasinal, 
     *          false se non se encontra este usuario con este contrasinal na base de datos
     */
    public boolean iniciarSesion(String usuario, String contrasinal){
        boolean registrado=false;
        try{
            String contrasinalCif=obterCifrado(contrasinal);
            Statement mysqlSelect = con.createStatement();
            ResultSet mysqlResult = mysqlSelect.executeQuery("SELECT USUARIO, CONTRASINAL FROM JUGADORES");
            while(mysqlResult.next() && !registrado){
                String usuarioRegistrado = mysqlResult.getString(1);
                String contrasinalRegistrado = mysqlResult.getString(2);
                if (usuario.equals(usuarioRegistrado) && contrasinalCif.equals(contrasinalRegistrado)){
                    registrado=true;
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(interfaz, "Erro ao ler a base de datos.");
        }
        return registrado;
    }
    
    private String obterCifrado(String contrasinal) throws SQLException{
        Statement selectContrasinal = con.createStatement();
        ResultSet resultContrasinalCifrado = selectContrasinal.executeQuery("SELECT MD5('"+contrasinal+"')");
        resultContrasinalCifrado.next();
        String contrasinalCif=resultContrasinalCifrado.getString(1);
        return contrasinalCif;
    }
    
    /**
     * Rexistra este usuario con este contrasinal na base de datos
     * @param usuario nome deste usuario
     * @param contrasinal contrasinal deste usuario
     * @return true se este usuario se rexistrou con éxito, false se este usuario non se puido rexistrar
     */
    public boolean registrarse(String usuario, String contrasinal){
        boolean registrado=false;
        if (comprobarUsuario(usuario)){
        }
        else{
            Statement insertUsuario = null;
            String insertString = "INSERT INTO JUGADORES VALUES (NULL, '" + usuario + "', MD5('" + contrasinal + "'))";
            try{
                insertUsuario = con.createStatement();
                insertUsuario.executeUpdate(insertString);
                registrado=true;
            }catch (SQLException e){
                JOptionPane.showMessageDialog(interfaz, "Erro ao registrar o novo usuario.");
            }
        }
        return registrado;
    }
    
    /**
     * Obten todas as partidas gardadas na base de datos e as almacena nun ArrayList de partidas
     * @return un ArrayList con todas as partidas obtidas
     */
    public ArrayList obterPuntuacións(){
        partidas.removeAll(partidas);
        try {
            Statement mysqlSelect = con.createStatement();
            ResultSet mysqlResult = mysqlSelect.executeQuery("SELECT * FROM JUGADORES_PARTIDAS");
            while(mysqlResult.next()){
                String jugador = mysqlResult.getString(1);
                int puntuacion = mysqlResult.getInt(2);
                int froitas = mysqlResult.getInt(3);
                int bombas = mysqlResult.getInt(4);
                int tempo = mysqlResult.getInt(5);
                Date fecha = mysqlResult.getDate(6);
                String modo = mysqlResult.getString(7);
                Partida partida = new Partida(jugador, puntuacion, froitas, bombas, tempo, fecha, modo);
                partidas.add(partida.getPartida());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(interfaz, "Erro ao mostrar as puntuacións.");
        }
        return partidas;
    }
}
