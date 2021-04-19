/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dialogs.EndFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import leasons.LessonAM;
import leasons.LessonFV;
import leasons.LessonSH;

/**
 *
 * @author DEVELOP17
 */
public class MainMenu extends javax.swing.JFrame {
    
    String NOMBRE_USUARIO = "";
    LessonFV lfv;
    LessonSH lsh;
    LessonAM lam;
    EndFrame pantallaFinal;

    /**
     * Creates new form MenuPrincipal
     */
    public MainMenu(String nombreUsuario) {
        initComponents();
        getContentPane().setBackground(new Color(88, 238, 252));
        NOMBRE_USUARIO = nombreUsuario;
        if (NOMBRE_USUARIO.length() >= 10) {
            this.jLabel2.setFont(new Font("Comics Sans MS", 1, 30));
        }
        this.jLabel2.setText("Hola, " + NOMBRE_USUARIO + " Bienvenida(o) a [CUDI].");
        Image icon = new ImageIcon(getClass().getResource("../images/logo.png")).getImage();
        setIconImage(icon);
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
        btnFrutyVer = new javax.swing.JButton();
        jLabelPregubnta = new javax.swing.JLabel();
        btnEscuela = new javax.swing.JButton();
        btnAnimales = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        btnFrutyVer.setBackground(new java.awt.Color(255, 153, 0));
        btnFrutyVer.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnFrutyVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/frutas.png"))); // NOI18N
        btnFrutyVer.setText("Frutas y Verduras");
        btnFrutyVer.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnFrutyVer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFrutyVer.setMinimumSize(new java.awt.Dimension(380, 415));
        btnFrutyVer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFrutyVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrutyVerActionPerformed(evt);
            }
        });

        jLabelPregubnta.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        jLabelPregubnta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPregubnta.setText("¿Qué quieres hacer hoy?");

        btnEscuela.setBackground(new java.awt.Color(255, 153, 0));
        btnEscuela.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnEscuela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/escuela.png"))); // NOI18N
        btnEscuela.setText("Escuela");
        btnEscuela.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnEscuela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEscuela.setMinimumSize(new java.awt.Dimension(380, 415));
        btnEscuela.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEscuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscuelaActionPerformed(evt);
            }
        });

        btnAnimales.setBackground(new java.awt.Color(255, 153, 0));
        btnAnimales.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnAnimales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/animales.png"))); // NOI18N
        btnAnimales.setText("Animales");
        btnAnimales.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnAnimales.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnimales.setMinimumSize(new java.awt.Dimension(380, 415));
        btnAnimales.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFrutyVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPregubnta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelPregubnta)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnFrutyVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hola,");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFrutyVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrutyVerActionPerformed
        lfv = new LessonFV(NOMBRE_USUARIO);
        lfv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFrutyVerActionPerformed

    private void btnEscuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscuelaActionPerformed
        lsh = new LessonSH(NOMBRE_USUARIO);
        lsh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEscuelaActionPerformed

    private void btnAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimalesActionPerformed
        //lam = new LessonAM(NOMBRE_USUARIO);
        //lam.setVisible(true);
        //this.dispose();
        pantallaFinal = new EndFrame(NOMBRE_USUARIO, 3);
        pantallaFinal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAnimalesActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnimales;
    private javax.swing.JButton btnEscuela;
    private javax.swing.JButton btnFrutyVer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPregubnta;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}