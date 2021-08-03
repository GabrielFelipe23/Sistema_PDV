package Sistema;

public class Tela7_Caixa_PDV extends javax.swing.JFrame {

    public Tela7_Caixa_PDV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Tela7_CALCULATROCO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Button_Tela7_Voltar_Menu = new javax.swing.JLabel();
        Button_Tela7_ADD_PRODUTO = new javax.swing.JLabel();
        Button_Tela7_REMOVE_PRODUTO = new javax.swing.JLabel();
        Button_Tela7_FINALIZACOMPRA = new javax.swing.JLabel();
        Button_Tela7_CANCELACOMPRA = new javax.swing.JLabel();
        Text_Tela7_ADDPRODUTO = new javax.swing.JTextField();
        Text_Tela7_REMOVEPRODUTO = new javax.swing.JTextField();
        Text_Tela7_CALCULATROCO = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Tela7_CALCULATROCO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/tela--7-calculadora.png"))); // NOI18N
        getContentPane().add(Button_Tela7_CALCULATROCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 20, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela--7--HELP.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 30, 30));

        Button_Tela7_Voltar_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela--7--MENU.png"))); // NOI18N
        Button_Tela7_Voltar_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela7_Voltar_MenuMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela7_Voltar_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 95, 20, 20));

        Button_Tela7_ADD_PRODUTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/tela-7add.png"))); // NOI18N
        getContentPane().add(Button_Tela7_ADD_PRODUTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 20, 20));

        Button_Tela7_REMOVE_PRODUTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela---7REMOVE.png"))); // NOI18N
        getContentPane().add(Button_Tela7_REMOVE_PRODUTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 20, 30));

        Button_Tela7_FINALIZACOMPRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela--7-Botão-finalizar-Compra.png"))); // NOI18N
        Button_Tela7_FINALIZACOMPRA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela7_FINALIZACOMPRAMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela7_FINALIZACOMPRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, -1, -1));

        Button_Tela7_CANCELACOMPRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser1/Tela--7-Botão-Cancelar-Compra.png"))); // NOI18N
        Button_Tela7_CANCELACOMPRA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela7_CANCELACOMPRAMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela7_CANCELACOMPRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        Text_Tela7_ADDPRODUTO.setBackground(new java.awt.Color(255, 255, 255));
        Text_Tela7_ADDPRODUTO.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        Text_Tela7_ADDPRODUTO.setForeground(new java.awt.Color(102, 102, 102));
        Text_Tela7_ADDPRODUTO.setToolTipText("");
        Text_Tela7_ADDPRODUTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(Text_Tela7_ADDPRODUTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 110, 20));

        Text_Tela7_REMOVEPRODUTO.setBackground(new java.awt.Color(255, 255, 255));
        Text_Tela7_REMOVEPRODUTO.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        Text_Tela7_REMOVEPRODUTO.setForeground(new java.awt.Color(102, 102, 102));
        Text_Tela7_REMOVEPRODUTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(Text_Tela7_REMOVEPRODUTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 110, 20));

        Text_Tela7_CALCULATROCO.setBackground(new java.awt.Color(255, 255, 255));
        Text_Tela7_CALCULATROCO.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        Text_Tela7_CALCULATROCO.setForeground(new java.awt.Color(102, 102, 102));
        Text_Tela7_CALCULATROCO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(Text_Tela7_CALCULATROCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroudsUser1/Tela-7--.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela7_Voltar_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela7_Voltar_MenuMouseClicked
        //Botão retorna Menu principal
        new Tela3_MenuPrincipalUser1 ().setVisible(true);
            dispose();
    }//GEN-LAST:event_Button_Tela7_Voltar_MenuMouseClicked

    private void Button_Tela7_CANCELACOMPRAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela7_CANCELACOMPRAMouseClicked
        // Cancela a compra e retorna a Forma de pagamento
        new Tela6_Forma_de_Pagamento ().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela7_CANCELACOMPRAMouseClicked

    private void Button_Tela7_FINALIZACOMPRAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela7_FINALIZACOMPRAMouseClicked
        // TODO add your handling code here:
        new Tela9_Compra_Finalizada ().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela7_FINALIZACOMPRAMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new Tela7_Help().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windowns".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela7_Caixa_PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela7_Caixa_PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela7_Caixa_PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela7_Caixa_PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela7_Caixa_PDV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Tela7_ADD_PRODUTO;
    private javax.swing.JLabel Button_Tela7_CALCULATROCO;
    private javax.swing.JLabel Button_Tela7_CANCELACOMPRA;
    private javax.swing.JLabel Button_Tela7_FINALIZACOMPRA;
    private javax.swing.JLabel Button_Tela7_REMOVE_PRODUTO;
    private javax.swing.JLabel Button_Tela7_Voltar_Menu;
    private javax.swing.JTextField Text_Tela7_ADDPRODUTO;
    private javax.swing.JTextField Text_Tela7_CALCULATROCO;
    private javax.swing.JTextField Text_Tela7_REMOVEPRODUTO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
