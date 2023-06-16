
package com.pdvtech.view.component.util;

import com.pdvtech.view.use.PanelActionDelete;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableCellDeleteActionRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        PanelActionDelete act = new PanelActionDelete();
        
        //Cor de célula não selecionada, linha alternada (linhas pares)
        if(isSelected == false && row % 2 != 0) {
            act.setBackground(new Color(225, 225, 225));
        } else {
            //Cor de linha quando selecionada
            if (row % 2 != 0){
                act.setBackground(new Color(115, 162, 239));
            }
        }
        
        //Cor de célular não selecionada, linha alternada (linhas impares)
        if (isSelected == false && row % 2 == 0) {
            act.setBackground(new Color(238, 238, 238));
        } else {
            //Cor de linha quando selecionada
            if (row % 2 == 0) {
                act.setBackground(new Color(84, 130, 171));
            }
        }
        
        return act;
    }
}