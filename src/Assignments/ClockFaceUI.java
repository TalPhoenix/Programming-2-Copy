/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

import classes.Clock;
import classes.WorldClock;
import java.time.Instant;
import java.time.ZoneId;

/**
 *
 * @author taloh
 */
public class ClockFaceUI extends javax.swing.JFrame {

    /**
     * Creates new form ClockFaceUI
     */
    Clock clock;
    public ClockFaceUI() {
        initComponents();
        processTime();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        m_lbCurrentTime = new javax.swing.JLabel();
        m_lbNewYork = new javax.swing.JLabel();
        m_lbMexicoCity = new javax.swing.JLabel();
        m_lbTokyo = new javax.swing.JLabel();
        m_tfCurrentTime = new javax.swing.JTextField();
        m_tfNewYork = new javax.swing.JTextField();
        m_tfMexicoCity = new javax.swing.JTextField();
        m_tfTokyo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        m_lbCurrentTime.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        m_lbCurrentTime.setText("Current Time:");

        m_lbNewYork.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        m_lbNewYork.setText("New York:");

        m_lbMexicoCity.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        m_lbMexicoCity.setText("Mexico City:");

        m_lbTokyo.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        m_lbTokyo.setText("Tokyo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_lbCurrentTime)
                    .addComponent(m_lbTokyo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(m_lbMexicoCity, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(m_lbNewYork, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(m_tfTokyo)
                    .addComponent(m_tfMexicoCity)
                    .addComponent(m_tfNewYork)
                    .addComponent(m_tfCurrentTime, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_lbCurrentTime)
                    .addComponent(m_tfCurrentTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_lbNewYork)
                    .addComponent(m_tfNewYork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_lbMexicoCity)
                    .addComponent(m_tfMexicoCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_lbTokyo)
                    .addComponent(m_tfTokyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ClockFaceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClockFaceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClockFaceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClockFaceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClockFaceUI().setVisible(true);
            }
        });
    }
    
    private void processTime(){
        WorldClock currentTime = new WorldClock(0);
        WorldClock mexicoCityTime = new WorldClock(-60);
        WorldClock newYorkTime = new WorldClock(0);
        WorldClock tokyoTime = new WorldClock(760);
        m_tfCurrentTime.setText(currentTime.getTime());
        m_tfMexicoCity.setText(mexicoCityTime.getTime());
        m_tfNewYork.setText(newYorkTime.getTime());
        m_tfTokyo.setText(tokyoTime.getTime());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel m_lbCurrentTime;
    private javax.swing.JLabel m_lbMexicoCity;
    private javax.swing.JLabel m_lbNewYork;
    private javax.swing.JLabel m_lbTokyo;
    private javax.swing.JTextField m_tfCurrentTime;
    private javax.swing.JTextField m_tfMexicoCity;
    private javax.swing.JTextField m_tfNewYork;
    private javax.swing.JTextField m_tfTokyo;
    // End of variables declaration//GEN-END:variables
}
