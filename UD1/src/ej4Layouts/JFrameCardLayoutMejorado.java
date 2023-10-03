/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ej4Layouts;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author DAM2Alu10
 */
public class JFrameCardLayoutMejorado extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCardLayout
     */
    
    CardLayout cardManager;
    public JFrameCardLayoutMejorado() {
        initComponents();
        cardManager = new CardLayout();
        jPanelPadre.setLayout(cardManager);
        jPanelPadre.add(jPanelClientes, "Clientes");
        jPanelPadre.add(jPanelVehiculos, "Vehículos");
        jPanelPadre.add(jPanelVehiculos, "Trabajadores");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPadre = new javax.swing.JPanel();
        jPanelTrabajadores = new javax.swing.JPanel();
        jLabelTitulo2 = new javax.swing.JLabel();
        jPanelVehiculos = new javax.swing.JPanel();
        jLabelTitulo1 = new javax.swing.JLabel();
        jPanelClientes = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelBarraBotones = new javax.swing.JPanel();
        jButtonPrimero = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonTrabajadores = new javax.swing.JButton();
        jButtonClientes = new javax.swing.JButton();
        jButtonVehiculos = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPadre.setBackground(new java.awt.Color(255, 51, 51));
        jPanelPadre.setLayout(new java.awt.CardLayout());

        jPanelTrabajadores.setToolTipText("");
        jPanelTrabajadores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelTitulo2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitulo2.setForeground(new java.awt.Color(51, 51, 255));
        jLabelTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo2.setText("Trabajadores");

        javax.swing.GroupLayout jPanelTrabajadoresLayout = new javax.swing.GroupLayout(jPanelTrabajadores);
        jPanelTrabajadores.setLayout(jPanelTrabajadoresLayout);
        jPanelTrabajadoresLayout.setHorizontalGroup(
            jPanelTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrabajadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTrabajadoresLayout.setVerticalGroup(
            jPanelTrabajadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrabajadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jPanelPadre.add(jPanelTrabajadores, "card2");

        jPanelVehiculos.setToolTipText("");
        jPanelVehiculos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelTitulo1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(51, 51, 255));
        jLabelTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo1.setText("Vehículos");

        javax.swing.GroupLayout jPanelVehiculosLayout = new javax.swing.GroupLayout(jPanelVehiculos);
        jPanelVehiculos.setLayout(jPanelVehiculosLayout);
        jPanelVehiculosLayout.setHorizontalGroup(
            jPanelVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelVehiculosLayout.setVerticalGroup(
            jPanelVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jPanelPadre.add(jPanelVehiculos, "card2");

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(51, 51, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Clientes");

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        jPanelPadre.add(jPanelClientes, "card2");

        jPanelBarraBotones.setBackground(new java.awt.Color(255, 255, 0));

        jButtonPrimero.setText("<<");
        jButtonPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeroActionPerformed(evt);
            }
        });
        jPanelBarraBotones.add(jButtonPrimero);

        jButtonAnterior.setText("<");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });
        jPanelBarraBotones.add(jButtonAnterior);

        jButtonTrabajadores.setText("Trabajadores");
        jButtonTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrabajadoresActionPerformed(evt);
            }
        });
        jPanelBarraBotones.add(jButtonTrabajadores);

        jButtonClientes.setText("Clientes");
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });
        jPanelBarraBotones.add(jButtonClientes);

        jButtonVehiculos.setText("Vehículos");
        jButtonVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVehiculosActionPerformed(evt);
            }
        });
        jPanelBarraBotones.add(jButtonVehiculos);

        jButtonSiguiente.setText(">");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });
        jPanelBarraBotones.add(jButtonSiguiente);

        jButtonUltimo.setText(">>");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });
        jPanelBarraBotones.add(jButtonUltimo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBarraBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBarraBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Boton Clientes
    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        cardManager.show(jPanelPadre, "Clientes");
    }//GEN-LAST:event_jButtonClientesActionPerformed

    // Boton Vehículos
    private void jButtonVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVehiculosActionPerformed
        cardManager.show(jPanelPadre, "Vehículos");
    }//GEN-LAST:event_jButtonVehiculosActionPerformed

    // Boton Primero
    private void jButtonPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeroActionPerformed
        cardManager.first(jPanelPadre);
    }//GEN-LAST:event_jButtonPrimeroActionPerformed

    // Boton Anterior
    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        cardManager.previous(jPanelPadre);
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    // Boton Siguiente
    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        cardManager.next(jPanelPadre);
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    // Boton Ultimo
    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        cardManager.last(jPanelPadre);
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    // Boton Trabajores
    private void jButtonTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrabajadoresActionPerformed
        cardManager.show(jPanelPadre, "Trabajadores");
    }//GEN-LAST:event_jButtonTrabajadoresActionPerformed
    
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
            java.util.logging.Logger.getLogger(JFrameCardLayoutMejorado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCardLayoutMejorado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCardLayoutMejorado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCardLayoutMejorado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCardLayoutMejorado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonPrimero;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JButton jButtonTrabajadores;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JButton jButtonVehiculos;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JPanel jPanelBarraBotones;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JPanel jPanelPadre;
    private javax.swing.JPanel jPanelTrabajadores;
    private javax.swing.JPanel jPanelVehiculos;
    // End of variables declaration//GEN-END:variables
}