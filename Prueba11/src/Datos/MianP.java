
package Datos;

/**
 *
 * @author gonzalo
 */
public class MianP extends javax.swing.JFrame {


    public MianP() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIntereSimple = new javax.swing.JButton();
        btnInteresCompuesto = new javax.swing.JButton();
        btnAnualidadVencida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIntereSimple.setText("INTERES SIMPLE");
        btnIntereSimple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIntereSimpleMouseClicked(evt);
            }
        });
        btnIntereSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntereSimpleActionPerformed(evt);
            }
        });

        btnInteresCompuesto.setText("INTERES COMPUESTO");
        btnInteresCompuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInteresCompuestoMouseClicked(evt);
            }
        });
        btnInteresCompuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInteresCompuestoActionPerformed(evt);
            }
        });

        btnAnualidadVencida.setText("ANUALIDAD VENCIDA");
        btnAnualidadVencida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnualidadVencidaMouseClicked(evt);
            }
        });
        btnAnualidadVencida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnualidadVencidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        jLabel1.setText("Calculadora Financiera");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnAnualidadVencida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnIntereSimple)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInteresCompuesto)))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIntereSimple)
                    .addComponent(btnInteresCompuesto))
                .addGap(31, 31, 31)
                .addComponent(btnAnualidadVencida)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIntereSimpleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIntereSimpleMouseClicked
 

    }//GEN-LAST:event_btnIntereSimpleMouseClicked

    private void btnInteresCompuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInteresCompuestoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnInteresCompuestoMouseClicked

    private void btnAnualidadVencidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnualidadVencidaMouseClicked
        // TODO add your handling code here:

                
        
    }//GEN-LAST:event_btnAnualidadVencidaMouseClicked

    private void btnIntereSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntereSimpleActionPerformed
        // btn ventana tasa de interes simple
        InteresSImple ventanaInteres = new InteresSImple();
        ventanaInteres.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnIntereSimpleActionPerformed

    private void btnInteresCompuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInteresCompuestoActionPerformed
        // btn ventana de tasa de interes compuesto
        InteresCompuesto ventanaCompuesto = new InteresCompuesto();
        ventanaCompuesto.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_btnInteresCompuestoActionPerformed

    private void btnAnualidadVencidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnualidadVencidaActionPerformed
        // btn ventana valor presente de vencida
        btnValorPresente vp= new btnValorPresente();
        vp.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnAnualidadVencidaActionPerformed

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
            java.util.logging.Logger.getLogger(MianP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MianP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MianP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MianP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MianP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnualidadVencida;
    private javax.swing.JButton btnIntereSimple;
    private javax.swing.JButton btnInteresCompuesto;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
