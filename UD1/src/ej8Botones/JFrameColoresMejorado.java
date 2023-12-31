/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ej8Botones;

import java.awt.Color;
import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author DAM2Alu7
 */
public class JFrameColoresMejorado extends javax.swing.JFrame {

    /**
     * Creates new form JFrameColoresMejorado
     */
    String colores[]={"Rojo", "Azul", "Amarillo", "Verde", "Naranja", "Dorado"};
    
    JRadioButton[] jrb = new JRadioButton[colores.length];
    public JFrameColoresMejorado() {
        initComponents();
        int pos = 0;
        for(String color : colores) {
            jrb[pos] = new JRadioButton(color);
            buttonGroup1.add(jrb[pos]);
            jPanelBotones.add(jrb[pos]);
            pos++;            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelBotones = new javax.swing.JPanel();
        jLabelColores = new javax.swing.JLabel();
        jPanelColor = new javax.swing.JPanel();
        jLabelColorNombre = new javax.swing.JLabel();
        jPanelSeleccionar = new javax.swing.JPanel();
        jButtonSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 200, 200));

        jPanelTitulo.setBackground(new java.awt.Color(204, 204, 204));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("COLORES");
        jPanelTitulo.add(jLabelTitulo);

        jPanelBotones.setBackground(new java.awt.Color(153, 255, 255));
        jPanelBotones.setLayout(new javax.swing.BoxLayout(jPanelBotones, javax.swing.BoxLayout.Y_AXIS));

        jLabelColores.setText("Colores");
        jPanelBotones.add(jLabelColores);

        jPanelColor.setBackground(new java.awt.Color(204, 204, 204));

        jLabelColorNombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelColorNombre.setForeground(new java.awt.Color(0, 51, 255));
        jLabelColorNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelColorNombre.setText("SIN COLOR");
        jPanelColor.add(jLabelColorNombre);

        jPanelSeleccionar.setBackground(new java.awt.Color(153, 255, 255));
        jPanelSeleccionar.setForeground(new java.awt.Color(153, 255, 255));

        jButtonSeleccionar.setText("Seleccionar");
        jButtonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarActionPerformed(evt);
            }
        });
        jPanelSeleccionar.add(jButtonSeleccionar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelColor, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
            .addComponent(jPanelSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarActionPerformed
        String mensaje;
        Enumeration e = buttonGroup1.getElements();
        while(e.hasMoreElements()) {
            JRadioButton r = (JRadioButton) e.nextElement();
            if(r.isSelected()) {
                jLabelColorNombre.setText(r.getText().toUpperCase());
            }
        }
    }//GEN-LAST:event_jButtonSeleccionarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameColoresMejorado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameColoresMejorado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameColoresMejorado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameColoresMejorado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameColoresMejorado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonSeleccionar;
    private javax.swing.JLabel jLabelColorNombre;
    private javax.swing.JLabel jLabelColores;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelColor;
    private javax.swing.JPanel jPanelSeleccionar;
    private javax.swing.JPanel jPanelTitulo;
    // End of variables declaration//GEN-END:variables
}
