
package com.pdvtech.view.component;

import com.pdvtech.view.component.util.CustomTableScrollbar;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class customTable extends JTable {
    
    private TableHeader header;
    private TableCell cell;

    public customTable() { 
        header = new TableHeader();
        cell = new TableCell();
        
        getTableHeader().setDefaultRenderer(header);
        getTableHeader().setPreferredSize(new Dimension(0, 30));
        setDefaultRenderer(Object.class, cell);
        setRowHeight(60);
    }
    
    private class TableHeader extends DefaultTableCellRenderer {
        
        private Map<Integer, Integer> alignment = new HashMap<>();
        
        public void setAlignment(int column, int align) {
            alignment.put(column, align);
        }
        
        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
            Component c = super.getTableCellRendererComponent(jtable, o, bln1, bln1, i, i1);
            
            //Alterações visuais: cores e fonte da Tabela
            c.setBackground(new Color(70, 70, 70));
            c.setForeground(new Color(220, 220, 220));
            c.setFont(c.getFont().deriveFont(Font.BOLD, 14));
            
            if (alignment.containsKey(i1)) {
                setHorizontalAlignment(alignment.get(i1));   
            } else {
                setHorizontalAlignment(JLabel.LEFT);
            }
            
            return c;
        }
    }
    
    private class TableCell extends DefaultTableCellRenderer {
        
        private Map<Integer, Integer> alignment = new HashMap<>();

        public void setAlignment(int column, int align) {
            alignment.put(column, align);
        }
        
        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int row, int column) {
            Component c = super.getTableCellRendererComponent(jtable, o, bln1, bln1, row, column);
            
            //Alterações visuais: cores: coluna/linha selecionadas
            if(isCellSelected(row, column)) {
                if (row % 2 == 0) {
                    c.setBackground(new Color(33, 103, 153));
                } else {
                    c.setBackground(new Color(29, 86, 127));
                }               
            } else {
                if (row % 2 == 0) {
                    c.setBackground(new Color(100, 100, 100));
                } else {
                    c.setBackground(new Color(150, 150, 150));
                }
            }
            
            //Alterações visuais: borda e letras
            c.setForeground(new Color(220, 220, 220));
            setBorder(new EmptyBorder(0, 5, 0, 5));
            
            if (alignment.containsKey(column)) {
                setHorizontalAlignment(alignment.get(column));  
            } else {
                setHorizontalAlignment(JLabel.LEFT);
            }
            
            return c;
        }
    }

    public void fixTable(JScrollPane scroll) {
        scroll.setVerticalScrollBar(new CustomTableScrollbar());
        JPanel panel = new JPanel();
        
        //Alterações visuais: background fundo atrás das células, canto de scrollbar e borda do panel
        panel.setBackground(new Color(70, 70, 70));     
        scroll.getViewport().setBackground(new Color(70, 70, 70));
        scroll.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153), 1));
        
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
    }
        
    public void setColumnAlignment(int column, int align) { 
        header.setAlignment(column, align);
    }

    public void setCellAlignment(int column, int align) {
        cell.setAlignment(column, align);
    }

    public void setColumnWidth(int column, int width) {  
        getColumnModel().getColumn(column).setPreferredWidth(width);
        getColumnModel().getColumn(column).setMinWidth(width);
        getColumnModel().getColumn(column).setMaxWidth(width);
        getColumnModel().getColumn(column).setMinWidth(10);
        getColumnModel().getColumn(column).setMaxWidth(10000);
    }
}