/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author gusta
 */
public class Pintar_Cabecalho extends JLabel implements TableCellRenderer  {
    public Pintar_Cabecalho(Font fonte, boolean opaque,Color background, Color foreground){
    setFont(fonte);
    setOpaque(opaque);
    setBackground(background);
    setForeground(foreground);
}    

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object value, boolean bln, boolean bln1, int i, int i1) {
        setText(value.toString()); 
        return this;
    }
    
}

