package InterfaceGrafica;

import Xogo.Cadrados.Cadrado;
import Xogo.Xogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author a22noellr
 */
public class Interface extends javax.swing.JFrame {
    private Xogo xogo;
    private Timer timer;
    private Timer tempoXogo;
    private int delay =500;
    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDModoXogo = new javax.swing.JDialog();
        panelModoXogo = new javax.swing.JPanel();
        bClasico = new javax.swing.JButton();
        bEsfera = new javax.swing.JButton();
        pantallaInicial = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        bIniciar = new javax.swing.JButton();
        bModoXogo = new javax.swing.JButton();
        juego = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        lblBombas = new javax.swing.JLabel();
        lblFroitas = new javax.swing.JLabel();
        bombasComidas = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        tempoXogado = new javax.swing.JLabel();
        froitasComidas = new javax.swing.JLabel();
        bPausa = new javax.swing.JToggleButton();
        panelXogo = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();

        jDModoXogo.setVisible(false);
        jDModoXogo.setTitle("Modo de Xogo");
        jDModoXogo.setBackground(new java.awt.Color(182, 255, 182));
        jDModoXogo.setForeground(new java.awt.Color(182, 255, 182));
        jDModoXogo.setLocation(new java.awt.Point(350, 300));
        jDModoXogo.setMaximumSize(new java.awt.Dimension(400, 400));
        jDModoXogo.setMinimumSize(new java.awt.Dimension(400, 400));
        jDModoXogo.setPreferredSize(new java.awt.Dimension(400, 400));
        jDModoXogo.setResizable(false);
        jDModoXogo.setSize(new java.awt.Dimension(400, 400));

        panelModoXogo.setBackground(new java.awt.Color(182, 255, 182));
        panelModoXogo.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(80, 40, 0)));
        panelModoXogo.setMaximumSize(new java.awt.Dimension(400, 400));
        panelModoXogo.setMinimumSize(new java.awt.Dimension(400, 400));

        bClasico.setBackground(new java.awt.Color(102, 204, 255));
        bClasico.setFont(new java.awt.Font("Reem Kufi", 0, 24)); // NOI18N
        bClasico.setForeground(new java.awt.Color(102, 0, 102));
        bClasico.setText("CLÁSICO");
        bClasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClasicoActionPerformed(evt);
            }
        });

        bEsfera.setBackground(new java.awt.Color(102, 204, 255));
        bEsfera.setFont(new java.awt.Font("Reem Kufi", 0, 24)); // NOI18N
        bEsfera.setForeground(new java.awt.Color(102, 0, 102));
        bEsfera.setText("ESFERA");
        bEsfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEsferaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelModoXogoLayout = new javax.swing.GroupLayout(panelModoXogo);
        panelModoXogo.setLayout(panelModoXogoLayout);
        panelModoXogoLayout.setHorizontalGroup(
            panelModoXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModoXogoLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(panelModoXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bClasico, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(bEsfera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91))
        );
        panelModoXogoLayout.setVerticalGroup(
            panelModoXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModoXogoLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(bClasico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(51, 51, 51)
                .addComponent(bEsfera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(134, 134, 134))
        );

        javax.swing.GroupLayout jDModoXogoLayout = new javax.swing.GroupLayout(jDModoXogo.getContentPane());
        jDModoXogo.getContentPane().setLayout(jDModoXogoLayout);
        jDModoXogoLayout.setHorizontalGroup(
            jDModoXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModoXogo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDModoXogoLayout.setVerticalGroup(
            jDModoXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModoXogo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Serpe");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1150, 900));
        setMinimumSize(new java.awt.Dimension(1150, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(1150, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantallaInicial.setBackground(new java.awt.Color(182, 255, 182));
        pantallaInicial.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(80, 40, 0)));
        pantallaInicial.setMaximumSize(new java.awt.Dimension(1150, 900));
        pantallaInicial.setMinimumSize(new java.awt.Dimension(1150, 900));
        pantallaInicial.setPreferredSize(new java.awt.Dimension(1150, 900));

        titulo.setBackground(new java.awt.Color(153, 0, 153));
        titulo.setFont(new java.awt.Font("Trebuchet MS", 3, 70)); // NOI18N
        titulo.setForeground(new java.awt.Color(153, 0, 153));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("SERPE");

        bIniciar.setBackground(new java.awt.Color(102, 204, 255));
        bIniciar.setFont(new java.awt.Font("Reem Kufi", 0, 24)); // NOI18N
        bIniciar.setForeground(new java.awt.Color(102, 0, 102));
        bIniciar.setText("INICIAR");
        bIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIniciarActionPerformed(evt);
            }
        });

        bModoXogo.setBackground(new java.awt.Color(102, 204, 255));
        bModoXogo.setFont(new java.awt.Font("Reem Kufi", 0, 24)); // NOI18N
        bModoXogo.setForeground(new java.awt.Color(102, 0, 102));
        bModoXogo.setText("MODO DE XOGO");
        bModoXogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModoXogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaInicialLayout = new javax.swing.GroupLayout(pantallaInicial);
        pantallaInicial.setLayout(pantallaInicialLayout);
        pantallaInicialLayout.setHorizontalGroup(
            pantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaInicialLayout.createSequentialGroup()
                .addGap(438, 438, 438)
                .addGroup(pantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bModoXogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(494, 494, 494))
        );
        pantallaInicialLayout.setVerticalGroup(
            pantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaInicialLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(titulo)
                .addGap(94, 94, 94)
                .addComponent(bIniciar)
                .addGap(41, 41, 41)
                .addComponent(bModoXogo)
                .addContainerGap(418, Short.MAX_VALUE))
        );

        getContentPane().add(pantallaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        juego.setVisible(false);
        juego.setMaximumSize(new java.awt.Dimension(1150, 900));
        juego.setMinimumSize(new java.awt.Dimension(1150, 900));
        juego.setPreferredSize(new java.awt.Dimension(1150, 900));

        menu.setLocation(0, 0);
        menu.setBackground(new java.awt.Color(0, 102, 51));
        menu.setFocusable(false);
        menu.setMaximumSize(new java.awt.Dimension(250, 900));
        menu.setMinimumSize(new java.awt.Dimension(250, 900));
        menu.setName(""); // NOI18N
        menu.setPreferredSize(new java.awt.Dimension(250, 900));

        titulo2.setBackground(new java.awt.Color(153, 0, 153));
        titulo2.setFont(new java.awt.Font("Trebuchet MS", 3, 70)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 0, 204));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("SERPE");

        lblBombas.setFont(new java.awt.Font("Reem Kufi", 3, 24)); // NOI18N
        lblBombas.setForeground(new java.awt.Color(0, 0, 0));
        lblBombas.setText("BOMBAS");

        lblFroitas.setFont(new java.awt.Font("Reem Kufi", 3, 24)); // NOI18N
        lblFroitas.setForeground(new java.awt.Color(204, 0, 102));
        lblFroitas.setText("FROITAS");

        bombasComidas.setBackground(new java.awt.Color(0, 204, 255));
        bombasComidas.setFont(new java.awt.Font("Miriam Libre", 3, 24)); // NOI18N
        bombasComidas.setForeground(new java.awt.Color(153, 0, 204));
        bombasComidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bombasComidas.setText("0");
        bombasComidas.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        bombasComidas.setOpaque(true);

        lblTempo.setFont(new java.awt.Font("Reem Kufi", 3, 24)); // NOI18N
        lblTempo.setForeground(new java.awt.Color(255, 255, 0));
        lblTempo.setText("TEMPO");

        tempoXogado.setBackground(new java.awt.Color(0, 204, 255));
        tempoXogado.setFont(new java.awt.Font("Miriam Libre", 3, 24)); // NOI18N
        tempoXogado.setForeground(new java.awt.Color(153, 0, 204));
        tempoXogado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tempoXogado.setText("0");
        tempoXogado.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        tempoXogado.setOpaque(true);

        froitasComidas.setBackground(new java.awt.Color(0, 204, 255));
        froitasComidas.setFont(new java.awt.Font("Miriam Libre", 3, 24)); // NOI18N
        froitasComidas.setForeground(new java.awt.Color(153, 0, 204));
        froitasComidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        froitasComidas.setText("0");
        froitasComidas.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        froitasComidas.setOpaque(true);

        bPausa.setBackground(new java.awt.Color(0, 204, 255));
        bPausa.setFont(new java.awt.Font("Reem Kufi", 0, 24)); // NOI18N
        bPausa.setForeground(new java.awt.Color(102, 0, 102));
        bPausa.setText("PAUSE");
        bPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPausaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bombasComidas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tempoXogado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bPausa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTempo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(lblFroitas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(lblBombas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(froitasComidas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        menuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bombasComidas, froitasComidas, lblBombas, lblFroitas, lblTempo, tempoXogado});

        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titulo2)
                .addGap(70, 70, 70)
                .addComponent(bPausa)
                .addGap(50, 50, 50)
                .addComponent(lblFroitas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(froitasComidas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblBombas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bombasComidas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(tempoXogado, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        panelXogo.setLocation(250, 0);
        panelXogo.setBackground(new java.awt.Color(182, 255, 182));
        panelXogo.setMaximumSize(new java.awt.Dimension(900, 900));
        panelXogo.setMinimumSize(new java.awt.Dimension(900, 900));
        panelXogo.setPreferredSize(new java.awt.Dimension(900, 900));
        panelXogo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelXogoKeyPressed(evt);
            }
        });

        imagen.setLocation(0, 0);
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/TableroSerpe.jpg"))); // NOI18N

        javax.swing.GroupLayout panelXogoLayout = new javax.swing.GroupLayout(panelXogo);
        panelXogo.setLayout(panelXogoLayout);
        panelXogoLayout.setHorizontalGroup(
            panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelXogoLayout.setVerticalGroup(
            panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen)
        );

        javax.swing.GroupLayout juegoLayout = new javax.swing.GroupLayout(juego);
        juego.setLayout(juegoLayout);
        juegoLayout.setHorizontalGroup(
            juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, juegoLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelXogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        juegoLayout.setVerticalGroup(
            juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(juegoLayout.createSequentialGroup()
                .addGroup(juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelXogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        getContentPane().add(juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelXogoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelXogoKeyPressed
        // TODO add your handling code here:
        /*if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            irMenuPrincipal();
            reiniciar();
            sound.getCancion().stop();
        }*/
        if (bPausa.isSelected()){
            if (evt.getKeyCode()==KeyEvent.VK_ESCAPE){
                despausar();
                bPausa.setSelected(false);
            }
        }
        else {
            if (evt.getKeyChar()=='w' || evt.getKeyChar()=='W' || evt.getKeyCode()==38){
                xogo.voltearSerpeArriba();
            }
            if (evt.getKeyChar()=='d' || evt.getKeyChar()=='D' || evt.getKeyCode()==39){
                xogo.voltearSerpeDereita();
            }
            if (evt.getKeyChar()=='s' || evt.getKeyChar()=='S' || evt.getKeyCode()==40){
               xogo.voltearSerpeAbaixo();
            }
            if (evt.getKeyChar()=='a' || evt.getKeyChar()=='A' || evt.getKeyCode()==37){
                xogo.voltearSerpeEsquerda();
            }if (evt.getKeyChar()==' '){
                xogo.avanzarSerpe();
            }
            
            if (evt.getKeyCode()==KeyEvent.VK_ESCAPE){
                pausar();
            }
            
        }
    }//GEN-LAST:event_panelXogoKeyPressed

    private void bIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIniciarActionPerformed
        // TODO add your handling code here:
        xogo = new Xogo(this);
        pantallaInicial.setVisible(false);
        juego.setVisible(true);
        crearTimerVelocidade(delay);
        crearTempoXogo();
        despausar();
    }//GEN-LAST:event_bIniciarActionPerformed

    private void bPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPausaActionPerformed
        if (bPausa.isSelected()){
            pausar();
        }
        else{
            despausar();
        }
    }//GEN-LAST:event_bPausaActionPerformed

    private void bModoXogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModoXogoActionPerformed
        jDModoXogo.setVisible(true);
    }//GEN-LAST:event_bModoXogoActionPerformed

    private void bClasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClasicoActionPerformed
        jDModoXogo.setVisible(false);
    }//GEN-LAST:event_bClasicoActionPerformed

    private void bEsferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEsferaActionPerformed
        jDModoXogo.setVisible(false);
    }//GEN-LAST:event_bEsferaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
    
    private void pausar(){
        bPausa.setSelected(true);
        bPausa.setText("START");
        timer.stop();
        tempoXogo.stop();
        panelXogo.requestFocus();
    }
    
    private void despausar(){
        bPausa.setSelected(false);
        bPausa.setText("PAUSE");
        timer.start();
        tempoXogo.start();
        panelXogo.requestFocus();
    }
    
    /**
     * Pinta no panelXogo a label do cadrado que lle pasan
     * e pon a label da imaxe por debaixo dos demais componentes do panel.
     * @param cadrado 
     */
    public void pintarCadrado(Cadrado cadrado){
        panelXogo.add(cadrado.getLblCadrado());
        panelXogo.updateUI();
        panelXogo.setComponentZOrder(imagen, panelXogo.getComponentCount()-1);
    }
    
    public void borrarCadrado(Cadrado cadrado){
        panelXogo.remove(cadrado.getLblCadrado());
        panelXogo.updateUI();
    }
    
    private void crearTempoXogo(){
        tempoXogo=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempoXogo=xogo.getTempo();
                tempoXogo++;
                xogo.setTempo(tempoXogo);
                tempoXogado.setText(tempoXogo+"");
            }
        });
    }
    
    private void crearTimerVelocidade(int delay){
        timer=new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xogo.avanzarSerpe();
                panelXogo.requestFocus();
            }
        });
    }
    
    public void engadirFroitas(int froitas){
        froitasComidas.setText(froitas+"");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClasico;
    private javax.swing.JButton bEsfera;
    private javax.swing.JButton bIniciar;
    private javax.swing.JButton bModoXogo;
    private javax.swing.JToggleButton bPausa;
    private javax.swing.JLabel bombasComidas;
    private javax.swing.JLabel froitasComidas;
    private javax.swing.JLabel imagen;
    private javax.swing.JDialog jDModoXogo;
    private javax.swing.JPanel juego;
    private javax.swing.JLabel lblBombas;
    private javax.swing.JLabel lblFroitas;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panelModoXogo;
    private javax.swing.JPanel panelXogo;
    private javax.swing.JPanel pantallaInicial;
    private javax.swing.JLabel tempoXogado;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
