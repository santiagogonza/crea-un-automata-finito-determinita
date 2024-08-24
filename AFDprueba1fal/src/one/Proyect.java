
package one;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author gonzalo
 */
public class Proyect extends javax.swing.JFrame {
   
     
    
       public Proyect() {
        initComponents();
           setLocationRelativeTo(null);
        // Añadir funcionalidad al botón
        btnCrearAfd.addActionListener(new CreateButtonListener());
    }
    
 
   private class CreateButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Parse states
            String[] statesArray = txtEstado.getText().split(",");
            Set<Integer> states = new HashSet<>();
            for (String state : statesArray) {
                states.add(Integer.parseInt(state.trim().substring(1))); // Remove 'q'
            }

            // Parse alphabet
            String[] alphabetArray = txtSimbolos.getText().split(",");
            Set<Character> alphabet = new HashSet<>();
            for (String symbol : alphabetArray) {
                alphabet.add(symbol.trim().charAt(0));
            }

            // Parse final states
            String[] finalStatesArray = txtEstadosFinales.getText().split(",");
            Set<Integer> finalStates = new HashSet<>();
            for (String state : finalStatesArray) {
                finalStates.add(Integer.parseInt(state.trim().substring(1))); // Remove 'q'
            }

            AFD dfa = new AFD(states, alphabet);

            // Parse transitions
            String[] transitionsInput = txtTransicion.getText().split("\\n");
            for (String transition : transitionsInput) {
                String[] parts = transition.split(",");
                if (parts.length != 3) {
                    JOptionPane.showMessageDialog(Proyect.this, "Formato de transición no válido.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int startState = Integer.parseInt(parts[0].trim().substring(1)); // Remove 'q'
                char symbol = parts[1].trim().charAt(0);
                int endState = Integer.parseInt(parts[2].trim().substring(1)); // Remove 'q'
                dfa.addTransition(startState, symbol, endState);
            }
            dfa.setFinalStates(finalStates);

            // Verificar si es un AFD determinista y graficarlo
            if (dfa.isDeterministic()) {
                dfa.drawDFA();
            } else {
                JOptionPane.showMessageDialog(Proyect.this, "El autómata no es determinista.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(Proyect.this, "Formato de entrada no válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(Proyect.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        btnCrearAfd = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSimbolos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEstadosFinales = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTransicion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrearAfd.setText("Crear AFD");
        btnCrearAfd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAfdActionPerformed(evt);
            }
        });

        jLabel1.setText("Inserte los Estados:");

        jLabel2.setText("Inserte los símbolos del alfabeto:");

        txtSimbolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSimbolosActionPerformed(evt);
            }
        });

        jLabel3.setText("Inserte los estados finales (q1,q2..,q3):");

        jLabel4.setText("Inserta las transicion (q0,aq1 o q0, 0 q1):");

        txtTransicion.setColumns(20);
        txtTransicion.setRows(5);
        jScrollPane1.setViewportView(txtTransicion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstadosFinales)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSimbolos, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnCrearAfd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtSimbolos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtEstadosFinales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnCrearAfd))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSimbolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSimbolosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSimbolosActionPerformed

    private void btnCrearAfdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAfdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearAfdActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyect().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCrearAfd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstadosFinales;
    private javax.swing.JTextField txtSimbolos;
    private javax.swing.JTextArea txtTransicion;
    // End of variables declaration//GEN-END:variables
    }


