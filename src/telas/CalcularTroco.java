/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import javax.swing.JOptionPane;

/**
 *
 * @author betin
 */
public class CalcularTroco extends javax.swing.JInternalFrame {
    float total, recebido,troco;
    
    public CalcularTroco(float total) {
        initComponents();
        this.total = total;
        jTextFieldTotalAPagar.setText(String.format(" R$  %.2f", total));
    }
    

    private void mostraNaTela(){
        
        recebido = Float.parseFloat(jTextFieldValorRecebido.getText());
        
        jTextFieldTroco.setText(String.format("R$  %.2f",recebido - total));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldTotalAPagar = new javax.swing.JTextField();
        jTextFieldValorRecebido = new javax.swing.JTextField();
        jTextFieldTroco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jTextFieldTotalAPagar.setEditable(false);
        jTextFieldTotalAPagar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldTotalAPagar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextFieldValorRecebido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldValorRecebido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldValorRecebido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldValorRecebidoKeyPressed(evt);
            }
        });

        jTextFieldTroco.setEditable(false);
        jTextFieldTroco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldTroco.setForeground(new java.awt.Color(255, 51, 51));
        jTextFieldTroco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTrocoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("TOTAL A PAGAR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("VALOR RECEBIDO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("TROCO");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Venda de Tickets");

        jButton2.setText("EditarValores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(148, 148, 148)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(this, "Concluido");
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldValorRecebidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorRecebidoKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            //recebido = Float.parseFloat(jTextFieldValorRecebido.getText());
            mostraNaTela();
        }
    }//GEN-LAST:event_jTextFieldValorRecebidoKeyPressed

    private void jTextFieldTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTrocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTrocoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldTotalAPagar;
    private javax.swing.JTextField jTextFieldTroco;
    private javax.swing.JTextField jTextFieldValorRecebido;
    // End of variables declaration//GEN-END:variables
}
