
package Datos;



/**
 *
 * @author gonzalo
 */
public class btnValorPresente extends javax.swing.JFrame {

    /**
     * Creates new form InteresSImple
     */
    public btnValorPresente() {
        initComponents();
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVP = new javax.swing.JButton();
        btnMontol = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVP.setText("vp");
        btnVP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVPMouseClicked(evt);
            }
        });
        btnVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVPActionPerformed(evt);
            }
        });

        btnMontol.setText("Monto");
        btnMontol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMontolMouseClicked(evt);
            }
        });
        btnMontol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMontolActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("valor presente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVP)
                            .addComponent(btnMontol)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(btnVP)
                .addGap(52, 52, 52)
                .addComponent(btnMontol)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVPMouseClicked


    }//GEN-LAST:event_btnVPMouseClicked

    private void btnVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVPActionPerformed
        // TODO add your handling code here:
        ventanasDepegablesvp vp=new ventanasDepegablesvp();
        vp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVPActionPerformed

    private void btnMontolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMontolMouseClicked

    }//GEN-LAST:event_btnMontolMouseClicked

    private void btnMontolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontolActionPerformed
//        // btn monto
        ventanasDepegableMonto vp=new ventanasDepegableMonto();
        vp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMontolActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new btnValorPresente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMontol;
    private javax.swing.JButton btnVP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
