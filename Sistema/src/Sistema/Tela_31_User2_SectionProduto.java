/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import Conexao.connectionFactory;
import Sistema.Tela_30_User2_ConsultarProdutosCadastrados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Refrigeração Josemaq
 */
public class Tela_31_User2_SectionProduto extends javax.swing.JFrame {
    public Connection con= connectionFactory.getConnection();
    public Tela_30_User2_ConsultarProdutosCadastrados classe = new Tela_30_User2_ConsultarProdutosCadastrados();
    public int codigo = classe.cod_produto;
    
    

    /**
     * Creates new form Tela_31_User2_SectionProduto
     */
    public Tela_31_User2_SectionProduto() {
        initComponents(); 
        Connection con = Conexao_e_Tabela.connectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        //COMANDOS
        try{
            //COMANDO QUE PREPARA
            stmt = con.prepareStatement("select quantidade,data_cadastramento,validade,preco_uni from produto where cod_barras ="+ codigo);
            rs=stmt.executeQuery();

            if(rs.next()){
                jTextField2.setText(rs.getString("quantidade"));
                jTextField3.setText(rs.getString("data_cadastramento"));
                jTextField4.setText(rs.getString("validade"));
                jTextField1.setText(rs.getString("preco_uni"));
                
            }
           
        }catch(SQLException ex){
            Logger.getLogger(Tela_31_User2_SectionProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //FINALIZA/SALVA O BANCO
        finally{
            Conexao_e_Tabela.connectionFactory.closeConnection(con, stmt, rs);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Tela31_Ranking = new javax.swing.JLabel();
        Button_Tela31_VoltaMenu = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Tela31_Ranking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/ranking.png"))); // NOI18N
        Button_Tela31_Ranking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela31_RankingMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela31_Ranking, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, -1, -1));

        Button_Tela31_VoltaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUsoGeral/Global.png"))); // NOI18N
        Button_Tela31_VoltaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela31_VoltaMenuMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela31_VoltaMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, 30));

        jTextField1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 150, -1));

        jTextField2.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 160, 90, -1));

        jTextField3.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 102, 102));
        jTextField3.setBorder(null);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 130, 20));

        jTextField4.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(102, 102, 102));
        jTextField4.setBorder(null);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 140, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroundsUser2/18.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela31_VoltaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela31_VoltaMenuMouseClicked

        new Tela_14_User2_Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela31_VoltaMenuMouseClicked

    private void Button_Tela31_RankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela31_RankingMouseClicked
        // TODO add your handling code here:
        new Tela_32_User2_Ranking().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela31_RankingMouseClicked

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
            java.util.logging.Logger.getLogger(Tela_31_User2_SectionProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_31_User2_SectionProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_31_User2_SectionProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_31_User2_SectionProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_31_User2_SectionProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Tela31_Ranking;
    private javax.swing.JLabel Button_Tela31_VoltaMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
