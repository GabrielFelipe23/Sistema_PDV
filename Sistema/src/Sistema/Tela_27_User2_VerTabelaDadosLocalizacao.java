/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Classes.DadosClienteLocaliza;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import teste.Pintar_Cabecalho;

/**
 *
 * @author Refrigeração Josemaq
 */
public class Tela_27_User2_VerTabelaDadosLocalizacao extends javax.swing.JFrame {
    

    /**
     * Creates new form Tela_27_User2_VerTabelaDadosLocalizacao
     */
    public Tela_27_User2_VerTabelaDadosLocalizacao() {
        initComponents();
        mostrar_clienteLocaliza();
        Tabela_DadosLocal.getColumnModel().getColumn(0).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_DadosLocal.getColumnModel().getColumn(1).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_DadosLocal.getColumnModel().getColumn(2).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_DadosLocal.getColumnModel().getColumn(3).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_DadosLocal.getColumnModel().getColumn(4).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_DadosLocal.getColumnModel().getColumn(5).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));
        Tabela_DadosLocal.getColumnModel().getColumn(6).setHeaderRenderer(new Pintar_Cabecalho(new java.awt.Font("Open Sans Semibold", 1, 12),true,Color.WHITE,Color.GRAY));

    }
 public ArrayList<DadosClienteLocaliza> clienteLocalizaLista(){
        ArrayList<DadosClienteLocaliza> clienteLocalizaLista = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/gerenciamento","root","");
            String sql ="select logradouro,cep,numeracao,complemento,cidade,estado,ponto_referencia from cliente";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            DadosClienteLocaliza clienteEndereco;
            while(rs.next()){
                clienteEndereco = new DadosClienteLocaliza(rs.getString("logradouro"),rs.getString("cep"),rs.getInt("numeracao"),rs.getString("complemento"),rs.getString("cidade"),rs.getString("estado"),rs.getString("ponto_referencia"));
                clienteLocalizaLista.add(clienteEndereco);
            }
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return clienteLocalizaLista;
        
    }
    public void mostrar_clienteLocaliza(){
        ArrayList<DadosClienteLocaliza> lista = clienteLocalizaLista();
        DefaultTableModel modelo =(DefaultTableModel) Tabela_DadosLocal.getModel();
        Object [] coluna = new Object[7];
        for(int i = 0; i<lista.size();i++){
            coluna[0]=lista.get(i).getlogradouro();
            coluna[1]=lista.get(i).getcep();
            coluna[2]=lista.get(i).getnumeracao();
            coluna[3]=lista.get(i).getcomplemento();
            coluna[4]=lista.get(i).getestado();
            coluna[5]=lista.get(i).getcidade();
            coluna[6]=lista.get(i).getreferencia();
            modelo.addRow(coluna);
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

        Button_Tela27_VoltarMenu = new javax.swing.JLabel();
        Button_Tela27_VoltarAtt = new javax.swing.JLabel();
        Button_Tela24_DadosContatos = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabela_DadosLocal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Tela27_VoltarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/Voltar-Ao-Menu.png"))); // NOI18N
        Button_Tela27_VoltarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela27_VoltarMenuMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela27_VoltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        Button_Tela27_VoltarAtt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/Voltar-para-Atualização.png"))); // NOI18N
        Button_Tela27_VoltarAtt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela27_VoltarAttMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela27_VoltarAtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        Button_Tela24_DadosContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ButtonsUser2/Tabela-de-Contato.png"))); // NOI18N
        Button_Tela24_DadosContatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Tela24_DadosContatosMouseClicked(evt);
            }
        });
        getContentPane().add(Button_Tela24_DadosContatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane4.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane4.setToolTipText("");
        jScrollPane4.setFocusable(false);
        jScrollPane4.setFont(new java.awt.Font("Open Sans Semibold", 0, 16)); // NOI18N
        jScrollPane4.setMinimumSize(new java.awt.Dimension(10, 10));

        Tabela_DadosLocal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tabela_DadosLocal.setFont(new java.awt.Font("Open Sans Semibold", 1, 12)); // NOI18N
        Tabela_DadosLocal.setForeground(new java.awt.Color(51, 51, 51));
        Tabela_DadosLocal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LOGADOURO", "CEP", "NUMERAÇÃO", "COMPLEMENTO", "CIDADE", "ESTADO", "REFERÊNCIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_DadosLocal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabela_DadosLocal.setDragEnabled(true);
        Tabela_DadosLocal.setEditingColumn(0);
        Tabela_DadosLocal.setEditingRow(0);
        Tabela_DadosLocal.setGridColor(new java.awt.Color(255, 255, 255));
        Tabela_DadosLocal.setIntercellSpacing(new java.awt.Dimension(5, 0));
        Tabela_DadosLocal.setMinimumSize(new java.awt.Dimension(75, 315));
        Tabela_DadosLocal.setRequestFocusEnabled(false);
        Tabela_DadosLocal.setRowHeight(35);
        Tabela_DadosLocal.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Tabela_DadosLocal.setSelectionForeground(new java.awt.Color(10, 174, 239));
        Tabela_DadosLocal.setShowHorizontalLines(false);
        Tabela_DadosLocal.setShowVerticalLines(false);
        Tabela_DadosLocal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Tabela_DadosLocalFocusGained(evt);
            }
        });
        Tabela_DadosLocal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tabela_DadosLocalKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(Tabela_DadosLocal);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 830, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/BackgroundsUser2/14.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Tela27_VoltarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela27_VoltarMenuMouseClicked
        // TODO add your handling code here:
        new Tela_14_User2_Menu(). setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela27_VoltarMenuMouseClicked

    private void Button_Tela27_VoltarAttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela27_VoltarAttMouseClicked
        // TODO add your handling code here:
        new Tela_24_User2_AtualizarDadosCliente(). setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela27_VoltarAttMouseClicked

    private void Button_Tela24_DadosContatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Tela24_DadosContatosMouseClicked
        // TODO add your handling code here:
        new Tela_28_User2_VerTabelaDadosContato(). setVisible(true);
        dispose();
    }//GEN-LAST:event_Button_Tela24_DadosContatosMouseClicked

    private void Tabela_DadosLocalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Tabela_DadosLocalFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabela_DadosLocalFocusGained

    private void Tabela_DadosLocalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tabela_DadosLocalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabela_DadosLocalKeyTyped

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
            java.util.logging.Logger.getLogger(Tela_27_User2_VerTabelaDadosLocalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_27_User2_VerTabelaDadosLocalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_27_User2_VerTabelaDadosLocalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_27_User2_VerTabelaDadosLocalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_27_User2_VerTabelaDadosLocalizacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Tela24_DadosContatos;
    private javax.swing.JLabel Button_Tela27_VoltarAtt;
    private javax.swing.JLabel Button_Tela27_VoltarMenu;
    private javax.swing.JTable Tabela_DadosLocal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}