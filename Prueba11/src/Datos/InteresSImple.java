
package Datos;

import javax.swing.JFrame;



/**
 *
 * @author gonzalo
 */
public class InteresSImple extends javax.swing.JFrame {

    /**
     * Creates new form InteresSImple
     */
    public InteresSImple() {
        initComponents();
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMonto = new javax.swing.JButton();
        btnCapital = new javax.swing.JButton();
        btnInteres = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMonto.setText("MONTO");
        btnMonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMontoMouseClicked(evt);
            }
        });
        btnMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMontoActionPerformed(evt);
            }
        });

        btnCapital.setText("CAPITAL");
        btnCapital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCapitalMouseClicked(evt);
            }
        });
        btnCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapitalActionPerformed(evt);
            }
        });

        btnInteres.setText("TASA DE INTERES SIMPLE");
        btnInteres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInteresMouseClicked(evt);
            }
        });
        btnInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInteresActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INTERES SIMPLE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnInteres)
                    .addComponent(btnCapital)
                    .addComponent(btnMonto)
                    .addComponent(jLabel1))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(btnMonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCapital)
                .addGap(18, 18, 18)
                .addComponent(btnInteres)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMontoMouseClicked


    }//GEN-LAST:event_btnMontoMouseClicked

    private void btnMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontoActionPerformed
                    // boton para calcular monto
      JFrame frame = new JFrame("Información de Monto Simple");
      frame.setContentPane(new CalcularMontoSimple());
      frame.pack();
      frame.setVisible(true);
      dispose();
            
        
    }//GEN-LAST:event_btnMontoActionPerformed

    private void btnCapitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapitalMouseClicked


    }//GEN-LAST:event_btnCapitalMouseClicked

    private void btnCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapitalActionPerformed

                // action de boton capital

        JFrame frame = new JFrame("Información de Capital Simple");
        frame.setContentPane(new CalcularCapitalSimple());
        frame.pack();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCapitalActionPerformed

    private void btnInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInteresActionPerformed
        // TODO add your handling code here:
      JFrame frame = new JFrame("Información de tasa de Interés Simple");
      frame.setContentPane(new CalcularTasaInteresSimple());
      frame.pack();
      frame.setVisible(true);
      dispose();
    }//GEN-LAST:event_btnInteresActionPerformed

    private void btnInteresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInteresMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInteresMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapital;
    private javax.swing.JButton btnInteres;
    private javax.swing.JButton btnMonto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
