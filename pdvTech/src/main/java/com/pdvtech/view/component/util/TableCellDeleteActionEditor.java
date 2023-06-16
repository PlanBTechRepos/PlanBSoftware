
package com.pdvtech.view.component.util;

import com.pdvtech.model.TableActionEvent;
import com.pdvtech.view.use.PanelActionDelete;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class TableCellDeleteActionEditor extends DefaultCellEditor {

    private TableActionEvent event;
    
    public TableCellDeleteActionEditor(TableActionEvent event) {
        super(new JCheckBox());
        this.event = event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        PanelActionDelete act = new PanelActionDelete();
        act.initEvent(event, row);
        act.setBackground(table.getSelectionBackground());
        return act;
    }
}