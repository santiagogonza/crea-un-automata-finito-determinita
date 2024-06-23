

import java.text.DecimalFormat;

/**
 *
 * @author gonzalo
 */
public class CalcularMontoSimple extends javax.swing.JPanel {

    /**
     * Creates new form MontoCompuesto
     */
    public CalcularMontoSimple() {
        initComponents();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCapital = new javax.swing.JLabel();
        jTextCapital = new javax.swing.JTextField();
        jLabelInteres = new javax.swing.JLabel();
        jTextInteres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextTiempo = new javax.swing.JTextField();
        jLabelResultado = new javax.swing.JLabel();
        jTextResultado = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        jLabelCapital.setText("Inserte el capital:");

        jTextCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCapitalActionPerformed(evt);
            }
        });

        jLabelInteres.setText("Inserte el interes:");

        jTextInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextInteresActionPerformed(evt);
            }
        });

        jLabel1.setText("Inserte el tiempo:");

        jLabelResultado.setText("Rersultado");

        btnCancelar.setText("CANCELAR");

        btnCalcular.setText("CALCULAR");
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextTiempo))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelInteres)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextInteres))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelCapital)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelResultado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnCancelar)
                        .addGap(35, 35, 35)
                        .addComponent(btnCalcular)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCapital)
                    .addComponent(jTextCapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInteres)
                    .addComponent(jTextInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResultado)
                    .addComponent(jTextResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnCalcular))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCapitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCapitalActionPerformed

    private void jTextInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextInteresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextInteresActionPerformed

    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseClicked
        // TODO add your handling code here:
        // action del boton calcular monto simple
       
        
        int capital = Integer.parseInt(jTextCapital.getText());
            double tasaInteres = Double.parseDouble(jTextInteres.getText());
            int tiempo = Integer.parseInt(jTextTiempo.getText());
           
            
            // Calcular el monto compuesto usando la fórmula del interés simple
            double monto = capital *(1 + tasaInteres* tiempo);
          
         
            
          
          
               // Formatear el resultado a dos decimales
             DecimalFormat df = new DecimalFormat("#.00");
             String montoFormateado = df.format(monto);

            // Mostrar el resultado formateado en el campo de texto correspondiente
             jTextResultado.setText(montoFormateado);
       
    }//GEN-LAST:event_btnCalcularMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCapital;
    private javax.swing.JLabel jLabelInteres;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JTextField jTextCapital;
    private javax.swing.JTextField jTextInteres;
    private javax.swing.JTextField jTextResultado;
    private javax.swing.JTextField jTextTiempo;
    // End of variables declaration//GEN-END:variables
}
