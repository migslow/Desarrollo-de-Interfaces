/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ej11TabbledPane;

/**
 *
 * @author DAM2Alu10
 */
public class JFramePestañas extends javax.swing.JFrame {

    /**
     * Creates new form JFramePestañas
     */
    public JFramePestañas() {
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

        jPanelVentana = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelBotones = new javax.swing.JPanel();
        jButtonIzquierda = new javax.swing.JButton();
        jButtonDerecha = new javax.swing.JButton();
        jTabbedPaneAplicacion = new javax.swing.JTabbedPane();
        jPanelClientes = new javax.swing.JPanel();
        jLabelContenidoClientes = new javax.swing.JLabel();
        jPanelCoches = new javax.swing.JPanel();
        jLabelContenidoCoches = new javax.swing.JLabel();
        jPanelEmpleados = new javax.swing.JPanel();
        jLabelContenidoCoches1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelVentana.setBackground(new java.awt.Color(0, 102, 255));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Aplicación integral para la gestión de coches");

        jPanelBotones.setBackground(new java.awt.Color(204, 204, 255));
        jPanelBotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jButtonIzquierda.setText("<");
        jButtonIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzquierdaActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonIzquierda);

        jButtonDerecha.setText(">");
        jButtonDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDerechaActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonDerecha);

        jTabbedPaneAplicacion.setBackground(new java.awt.Color(204, 204, 255));

        jPanelClientes.setBackground(new java.awt.Color(204, 204, 255));
        jPanelClientes.setForeground(new java.awt.Color(0, 0, 0));

        jLabelContenidoClientes.setText("Clientes");

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addComponent(jLabelContenidoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 286, Short.MAX_VALUE))
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelContenidoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jTabbedPaneAplicacion.addTab("Clientes", jPanelClientes);

        jPanelCoches.setBackground(new java.awt.Color(204, 204, 255));

        jLabelContenidoCoches.setText("Coches");

        javax.swing.GroupLayout jPanelCochesLayout = new javax.swing.GroupLayout(jPanelCoches);
        jPanelCoches.setLayout(jPanelCochesLayout);
        jPanelCochesLayout.setHorizontalGroup(
            jPanelCochesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCochesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelContenidoCoches, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanelCochesLayout.setVerticalGroup(
            jPanelCochesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCochesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelContenidoCoches, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jTabbedPaneAplicacion.addTab("Coches", jPanelCoches);

        jPanelEmpleados.setBackground(new java.awt.Color(204, 204, 255));

        jLabelContenidoCoches1.setText("Empleados");

        javax.swing.GroupLayout jPanelEmpleadosLayout = new javax.swing.GroupLayout(jPanelEmpleados);
        jPanelEmpleados.setLayout(jPanelEmpleadosLayout);
        jPanelEmpleadosLayout.setHorizontalGroup(
            jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelContenidoCoches1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanelEmpleadosLayout.setVerticalGroup(
            jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelContenidoCoches1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jTabbedPaneAplicacion.addTab("Empleados", jPanelEmpleados);

        javax.swing.GroupLayout jPanelVentanaLayout = new javax.swing.GroupLayout(jPanelVentana);
        jPanelVentana.setLayout(jPanelVentanaLayout);
        jPanelVentanaLayout.setHorizontalGroup(
            jPanelVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPaneAplicacion)
        );
        jPanelVentanaLayout.setVerticalGroup(
            jPanelVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaLayout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneAplicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelVentana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzquierdaActionPerformed
        int ind = jTabbedPaneAplicacion.getSelectedIndex();
        if(ind == 0){
               
        }
        
        
        /*
        int ind = jTabbedPaneAplicacion.getSelectedIndex();
        jTabbedPaneAplicacion.setSelectedIndex(ind - 1);
        if(ind == 0){
        jTabbedPaneAplicacion.setSelectedIndex(2);
        } else {
            jTabbedPaneAplicacion.setSelectedIndex(-1);
        }
        */
    }//GEN-LAST:event_jButtonIzquierdaActionPerformed

    private void jButtonDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDerechaActionPerformed
        /*int ind = jTabbedPaneAplicacion.getSelectedIndex();
        jTabbedPaneAplicacion.setSelectedIndex(ind + 1);
        if(ind == 0){
        jTabbedPaneAplicacion.setSelectedIndex(2);
        } else {
            jTabbedPaneAplicacion.setSelectedIndex(-1);
        }
        */
    }//GEN-LAST:event_jButtonDerechaActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePestañas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePestañas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePestañas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePestañas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePestañas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDerecha;
    private javax.swing.JButton jButtonIzquierda;
    private javax.swing.JLabel jLabelContenidoClientes;
    private javax.swing.JLabel jLabelContenidoCoches;
    private javax.swing.JLabel jLabelContenidoCoches1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JPanel jPanelCoches;
    private javax.swing.JPanel jPanelEmpleados;
    private javax.swing.JPanel jPanelVentana;
    private javax.swing.JTabbedPane jTabbedPaneAplicacion;
    // End of variables declaration//GEN-END:variables
}
