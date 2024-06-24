
package Datos;

import javax.swing.JFrame;

/**
 *
 * @author gonzalo
 */
public class ventanasDepegableMonto extends javax.swing.JFrame {

    /**
     * Creates new form CalcularValorPrensente
     */
    public ventanasDepegableMonto() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMonto = new javax.swing.JButton();
        btnTiempo = new javax.swing.JButton();
        btnAnualidad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMonto.setText("MONTO");
        btnMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMontoActionPerformed(evt);
            }
        });

        btnTiempo.setText("TIEMPO");
        btnTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiempoActionPerformed(evt);
            }
        });

        btnAnualidad.setText("ANUALIDAD");
        btnAnualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnualidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnualidad)
                    .addComponent(btnTiempo)
                    .addComponent(btnMonto))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btnMonto)
                .addGap(18, 18, 18)
                .addComponent(btnTiempo)
                .addGap(18, 18, 18)
                .addComponent(btnAnualidad)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiempoActionPerformed
        // btn para calcular el tiempo
        CalcularTiempoMonto vp =new CalcularTiempoMonto();
        vp.setVisible(true);
        JFrame frame = new JFrame("Calcular el Tiempo monto");
        frame.setContentPane(new CalcularTiempoMonto());
        frame.pack();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTiempoActionPerformed

    private void btnMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontoActionPerformed
        // ventana de calcular valor presente
     
        CalcularValorPresente vp1 =new CalcularValorPresente();
        vp1.setVisible(true);
        JFrame frame = new JFrame("Calcular el monto vencida");
        frame.setContentPane(new CalcularMontoVencida());
        frame.pack();
        frame.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnMontoActionPerformed

    private void btnAnualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnualidadActionPerformed
        // ventana para calcular la anualidad
        
        CalcularAnualidadMonto vp1 =new CalcularAnualidadMonto();
        vp1.setVisible(true);
        JFrame frame = new JFrame("Calcular Anualidad Monto");
        frame.setContentPane(new CalcularAnualidadMonto());
        frame.pack();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAnualidadActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnualidad;
    private javax.swing.JButton btnMonto;
    private javax.swing.JButton btnTiempo;
    // End of variables declaration//GEN-END:variables
}
