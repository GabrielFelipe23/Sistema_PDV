/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Conexao.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Refrigeração Josemaq
 */
public class Tela_24_User2_AtualizarDadosCliente extends javax.swing.JFrame {
    public Connection con= connectionFactory.getConnection();
        

    /**
     * Creates new form Tela_24_User2_AtualizarDadosCliente
     */
    public Tela_24_User2_AtualizarDadosCliente() {
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

        Button_Tela24_VoltarMenu = new javax.swing.JLabel();
        Button_Tela24_AttDados = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Tela24_VoltarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUsoGeral/Global.png"))); // NOI18N
        Button_Tela24_VoltarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela24_VoltarMenuMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela24_VoltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        Button_Tela24_AttDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/atualizar-dados.png"))); // NOI18N
        Button_Tela24_AttDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela24_AttDadosMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela24_AttDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, -1, -1));

        jTextField1.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 120, 20));

        jTextField2.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 120, -1));

        jTextField3.setBorder(null);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 334, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroundsUser2/11.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela24_AttDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela24_AttDadosMouseClicked
        // TODO add your handling code here:

        try{
            String query = "update cliente set "+jTextField2.getText()+"=? where id_cliente="+jTextField1.getText();
            PreparedStatement pst= con.prepareStatement(query);
            pst.setString(1,jTextField3.getText());
            pst.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        new Tela_25_User2_PosAtualizar().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela24_AttDadosMouseClicked

    private void Button_Tela24_VoltarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela24_VoltarMenuMouseClicked
        // TODO add your handling code here:
        new Tela_14_User2_Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela24_VoltarMenuMouseClicked

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
            java.util.logging.Logger.getLogger(Tela_24_User2_AtualizarDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_24_User2_AtualizarDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_24_User2_AtualizarDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_24_User2_AtualizarDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_24_User2_AtualizarDadosCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Tela24_AttDados;
    private javax.swing.JLabel Button_Tela24_VoltarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}