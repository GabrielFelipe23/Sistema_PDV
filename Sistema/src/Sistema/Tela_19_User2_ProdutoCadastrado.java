/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

/**
 *
 * @author Refrigeração Josemaq
 */
public class Tela_19_User2_ProdutoCadastrado extends javax.swing.JFrame {

    /**
     * Creates new form Tela_19_User2_ProdutoCadastrado
     */
    public Tela_19_User2_ProdutoCadastrado() {
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

        Button_Tela19_CadastrarOutroProduto = new javax.swing.JLabel();
        Button_Tela19_VoltarMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Tela19_CadastrarOutroProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/Cadastrar-outro-produto.png"))); // NOI18N
        Button_Tela19_CadastrarOutroProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela19_CadastrarOutroProdutoMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela19_CadastrarOutroProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 120, -1));

        Button_Tela19_VoltarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/VoltarMenu.png"))); // NOI18N
        Button_Tela19_VoltarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela19_VoltarMenuMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela19_VoltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroundsUser2/6.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela19_VoltarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela19_VoltarMenuMouseClicked
        // TODO add your handling code here:
        new Tela_14_User2_Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela19_VoltarMenuMouseClicked

    private void Button_Tela19_CadastrarOutroProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela19_CadastrarOutroProdutoMouseClicked
        // TODO add your handling code here:
        new Tela_18_User2_CadastrandoProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela19_CadastrarOutroProdutoMouseClicked

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
                if ("Windowns".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_19_User2_ProdutoCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_19_User2_ProdutoCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_19_User2_ProdutoCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_19_User2_ProdutoCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_19_User2_ProdutoCadastrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Tela19_CadastrarOutroProduto;
    private javax.swing.JLabel Button_Tela19_VoltarMenu;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
