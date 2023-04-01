
package com.pdvtech.view.component.util;

import com.pdvtech.model.TableActionEvent;
import com.pdvtech.view.use.PanelAction;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class TableCellActionEditor extends DefaultCellEditor {

    private TableActionEvent event;
    
    public TableCellActionEditor(TableActionEvent event) {
        super(new JCheckBox());
        this.event = event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        PanelAction act = new PanelAction();
        act.initEvent(event, row);
        act.setBackground(table.getSelectionBackground());
        return act;
    }
}