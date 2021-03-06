/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Conexao_e_Tabela.connectionFactory;
import Model_Bean.Compra;
import Model_DAO.OcorrenciaDAO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import teste.Pintar_Cabecalho;

/**
 *
 * @author Refrigeração Josemaq
 */
public class Tela_36_User2_ComprasClienteLoja extends javax.swing.JFrame {
    public Tela_33_User2_ConsultarClientesCadastrados classe = new Tela_33_User2_ConsultarClientesCadastrados();
    public int codigo = Tela_33_User2_ConsultarClientesCadastrados.cod_cliente;
    
    /**
     * Creates new form Tela_36_User2_ComprasClienteLoja
     */
    public Tela_36_User2_ComprasClienteLoja() {
        initComponents();
        Tabela_Compras.getColumnModel().getColumn(0).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_Compras.getColumnModel().getColumn(1).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_Compras.getColumnModel().getColumn(2).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_Compras.getColumnModel().getColumn(3).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_Compras.getColumnModel().getColumn(4).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_Compras.getColumnModel().getColumn(5).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        
        
        DefaultTableModel modelo =(DefaultTableModel) Tabela_Compras.getModel();
        Tabela_Compras.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
      
public void readJTable(){
        
        DefaultTableModel modelo =(DefaultTableModel) Tabela_Compras.getModel();
        modelo.setNumRows(0);
       
        for(Compra cp: read()){
            modelo.addRow(new Object []{
                cp.getId_compra(),
                cp.getQuantidade(),
                cp.getValor_final(),
                cp.getId_cliente(),
                cp.getId_funcionario(),
                cp.getCod_barras(),
            });
        }
    }
    public List<Compra> read(){
        //CONEXOES COM O BANCO E VAR
        Connection con = connectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs= null;
        
        List<Compra> listagem= new ArrayList<>();
        try{
            stmt = con.prepareStatement("Select *from compra where id_cliente="+codigo);
            //REALIZANDO A EXECUCTION
            rs=stmt.executeQuery();
            
            while(rs.next()){
                Compra cp = new Compra();
                
                cp.setId_compra(rs.getInt("id_compra"));
                cp.setQuantidade(rs.getInt("quantidade"));
                cp.setValor_final((int) rs.getDouble("valor_final"));
                cp.setId_cliente(rs.getInt("id_cliente"));
                cp.setId_funcionario(rs.getInt("id_funcionario"));
                cp.setCod_barras(rs.getString("cod_barras"));
                        
                
                //ADD NO ARRAY
                listagem.add(cp);
            }
        
        }catch(SQLException ex){
            Logger.getLogger(OcorrenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //FINALIZA/SALVA O BANCO
        finally{
            connectionFactory.closeConnection(con, stmt);
        }
        
        return listagem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Tela36_Avanca = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Button_Tela36_RetornarMenu = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tabela_Compras = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Tela36_Avanca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/1.png"))); // NOI18N
        Button_Tela36_Avanca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela36_AvancaMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela36_Avanca, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 370, -1, -1));

        jTextField1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 210, 30));

        Button_Tela36_RetornarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUsoGeral/Global.png"))); // NOI18N
        Button_Tela36_RetornarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela36_RetornarMenuMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela36_RetornarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane5.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane5.setToolTipText("");
        jScrollPane5.setFocusable(false);
        jScrollPane5.setFont(new java.awt.Font("Open Sans Semibold", 0, 16)); // NOI18N
        jScrollPane5.setMinimumSize(new java.awt.Dimension(10, 10));

        Tabela_Compras.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tabela_Compras.setFont(new java.awt.Font("Open Sans Semibold", 1, 12)); // NOI18N
        Tabela_Compras.setForeground(new java.awt.Color(51, 51, 51));
        Tabela_Compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_COMPRA", "QUANTIDADE", "VALOR_FINAL", "ID_CLIENTE", "ID_FUNC", "COD_BARRAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_Compras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabela_Compras.setDragEnabled(true);
        Tabela_Compras.setEditingColumn(0);
        Tabela_Compras.setEditingRow(0);
        Tabela_Compras.setGridColor(new java.awt.Color(255, 255, 255));
        Tabela_Compras.setIntercellSpacing(new java.awt.Dimension(5, 0));
        Tabela_Compras.setMinimumSize(new java.awt.Dimension(75, 315));
        Tabela_Compras.setRequestFocusEnabled(false);
        Tabela_Compras.setRowHeight(35);
        Tabela_Compras.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Tabela_Compras.setSelectionForeground(new java.awt.Color(10, 174, 239));
        Tabela_Compras.setShowHorizontalLines(false);
        Tabela_Compras.setShowVerticalLines(false);
        Tabela_Compras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Tabela_ComprasFocusGained(evt);
            }
        });
        Tabela_Compras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tabela_ComprasKeyTyped(evt);
            }
        });
        jScrollPane5.setViewportView(Tabela_Compras);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 540, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroundsUser2/23.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela36_RetornarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela36_RetornarMenuMouseClicked
        // TODO add your handling code here:
        new Tela_14_User2_Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela36_RetornarMenuMouseClicked

    private void Button_Tela36_AvancaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela36_AvancaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Tela36_AvancaMouseClicked

    private void Tabela_ComprasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Tabela_ComprasFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabela_ComprasFocusGained

    private void Tabela_ComprasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tabela_ComprasKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabela_ComprasKeyTyped

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
            java.util.logging.Logger.getLogger(Tela_36_User2_ComprasClienteLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_36_User2_ComprasClienteLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_36_User2_ComprasClienteLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_36_User2_ComprasClienteLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_36_User2_ComprasClienteLoja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Tela36_Avanca;
    private javax.swing.JLabel Button_Tela36_RetornarMenu;
    private javax.swing.JTable Tabela_Compras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
