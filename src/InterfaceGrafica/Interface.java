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

        panelXogo = new javax.swing.JPanel();
        pantallaInicial = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        bIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 900));
        setMinimumSize(new java.awt.Dimension(900, 900));
        setResizable(false);

        panelXogo.setVisible(false);
        panelXogo.setBackground(new java.awt.Color(182, 255, 182));
        panelXogo.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(80, 40, 0))));
        panelXogo.setMaximumSize(new java.awt.Dimension(900, 900));
        panelXogo.setMinimumSize(new java.awt.Dimension(900, 900));
        panelXogo.setPreferredSize(new java.awt.Dimension(900, 900));
        panelXogo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelXogoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelXogoLayout = new javax.swing.GroupLayout(panelXogo);
        panelXogo.setLayout(panelXogoLayout);
        panelXogoLayout.setHorizontalGroup(
            panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 894, Short.MAX_VALUE)
        );
        panelXogoLayout.setVerticalGroup(
            panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 894, Short.MAX_VALUE)
        );

        pantallaInicial.setBackground(new java.awt.Color(182, 255, 182));
        pantallaInicial.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(80, 40, 0)));
        pantallaInicial.setMaximumSize(new java.awt.Dimension(900, 900));
        pantallaInicial.setMinimumSize(new java.awt.Dimension(900, 900));

        titulo.setBackground(new java.awt.Color(153, 0, 153));
        titulo.setFont(new java.awt.Font("Trebuchet MS", 3, 70)); // NOI18N
        titulo.setForeground(new java.awt.Color(153, 0, 153));
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

        javax.swing.GroupLayout pantallaInicialLayout = new javax.swing.GroupLayout(pantallaInicial);
        pantallaInicial.setLayout(pantallaInicialLayout);
        pantallaInicialLayout.setHorizontalGroup(
            pantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaInicialLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(352, 352, 352))
            .addGroup(pantallaInicialLayout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(bIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(387, 387, 387))
        );
        pantallaInicialLayout.setVerticalGroup(
            pantallaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaInicialLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(titulo)
                .addGap(142, 142, 142)
                .addComponent(bIniciar)
                .addContainerGap(484, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelXogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pantallaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelXogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pantallaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelXogoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelXogoKeyPressed
        // TODO add your handling code here:
        /*if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            irMenuPrincipal();
            reiniciar();
            sound.getCancion().stop();
        }
        if (xogo1.isPausa()){
            if (evt.getKeyCode()==KeyEvent.VK_ESCAPE){
                timerContaAtras.start();
            }
        }
        else {*/
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
            /*
            if (evt.getKeyCode()==KeyEvent.VK_ESCAPE){
                pausar();
            }
            
        }*/
    }//GEN-LAST:event_panelXogoKeyPressed

    private void bIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIniciarActionPerformed
        // TODO add your handling code here:
        xogo = new Xogo(this);
        pantallaInicial.setVisible(false);
        panelXogo.setFocusable(true);
        panelXogo.setVisible(true);
        crearTimerXogo(delay);
        timer.start();
    }//GEN-LAST:event_bIniciarActionPerformed

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
    /**
     * Pinta no panelXogo a label do cadrado que lle pasan.
     * @param cadrado 
     */
    public void pintarCadrado(Cadrado cadrado){
        panelXogo.add(cadrado.getLblCadrado());
        panelXogo.updateUI();
    }
    
    private void crearTimerXogo (int delay){
        timer=new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xogo.avanzarSerpe();
                panelXogo.requestFocus();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bIniciar;
    private javax.swing.JPanel panelXogo;
    private javax.swing.JPanel pantallaInicial;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
