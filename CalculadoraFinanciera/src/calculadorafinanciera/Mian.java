/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadorafinanciera;

/**
 *
 * @author gonzalo
 */
public class Mian extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public Mian() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIntereSimple = new javax.swing.JButton();
        btnInteresCompuesto = new javax.swing.JButton();
        btnAnualidadVencida = new javax.swing.JButton();
        btnAnualidadAnticipada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIntereSimple.setText("INTERES SIMPLE");
        btnIntereSimple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIntereSimpleMouseClicked(evt);
            }
        });

        btnInteresCompuesto.setText("INTERES COMPUESTO");
        btnInteresCompuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInteresCompuestoMouseClicked(evt);
            }
        });

        btnAnualidadVencida.setText("ANUALIDAD VENCIDA");
        btnAnualidadVencida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnualidadVencidaMouseClicked(evt);
            }
        });

        btnAnualidadAnticipada.setText("ANUALIDAD ANTICIPADA");
        btnAnualidadAnticipada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnualidadAnticipadaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnualidadVencida)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnIntereSimple)
                        .addGap(21, 21, 21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInteresCompuesto)
                    .addComponent(btnAnualidadAnticipada))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIntereSimple)
                    .addComponent(btnInteresCompuesto))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnualidadVencida)
                    .addComponent(btnAnualidadAnticipada))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIntereSimpleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIntereSimpleMouseClicked
        // Intancia a la ventana iteres simple
        InteresSImple ventana1=new  InteresSImple();
        ventana1.setVisible(true);

    }//GEN-LAST:event_btnIntereSimpleMouseClicked

    private void btnInteresCompuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInteresCompuestoMouseClicked
        // TODO add your handling code here:
        
        InteresCompuesto ventana2= new InteresCompuesto();
        ventana2.setVisible(true);
    }//GEN-LAST:event_btnInteresCompuestoMouseClicked

    private void btnAnualidadVencidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnualidadVencidaMouseClicked
        // TODO add your handling code here:
        /////////
        AnualulidadVencidaMain ventana3 = new AnualulidadVencidaMain();
        ventana3.setVisible(true);
                
        
    }//GEN-LAST:event_btnAnualidadVencidaMouseClicked

    private void btnAnualidadAnticipadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnualidadAnticipadaMouseClicked
        // TODO add your handling code here:
        AnualidadAnticipada ventana4 = new AnualidadAnticipada();
        ventana4.setVisible(true);
    }//GEN-LAST:event_btnAnualidadAnticipadaMouseClicked

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
            java.util.logging.Logger.getLogger(Mian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnualidadAnticipada;
    private javax.swing.JButton btnAnualidadVencida;
    private javax.swing.JButton btnIntereSimple;
    private javax.swing.JButton btnInteresCompuesto;
    // End of variables declaration//GEN-END:variables
}
