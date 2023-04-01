
package com.pdvtech.view.use;

import com.pdvtech.model.TableActionEvent;
import com.pdvtech.view.component.util.TableCellActionEditor;
import com.pdvtech.view.component.util.TableCellActionRenderer;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Storage extends javax.swing.JFrame {

    public Storage() {
        initComponents();
        initTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Storage_Panel = new javax.swing.JPanel();
        btnReturn = new javax.swing.JLabel();
        pageLocation_Name = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        btnMaximize = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        btnAddProduct = new com.pdvtech.view.component.customButton();
        Scrollpane_Table = new javax.swing.JScrollPane();
        Product_Table = new com.pdvtech.view.component.customTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);

        Storage_Panel.setBackground(new java.awt.Color(153, 153, 153));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/voltar.png"))); // NOI18N
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });

        pageLocation_Name.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        pageLocation_Name.setText("ESTOQUE");

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimizar.png"))); // NOI18N
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMinimizeMousePressed(evt);
            }
        });

        btnMaximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/maximizar.png"))); // NOI18N
        btnMaximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMaximizeMousePressed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fechar.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
        });

        btnAddProduct.setBackground(new java.awt.Color(51, 51, 51));
        btnAddProduct.setBorder(null);
        btnAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/plus.png"))); // NOI18N
        btnAddProduct.setText("PRODUTO");
        btnAddProduct.setBorderColor(new java.awt.Color(51, 51, 51));
        btnAddProduct.setColor(new java.awt.Color(51, 51, 51));
        btnAddProduct.setColorClick(new java.awt.Color(51, 51, 51));
        btnAddProduct.setColorOver(new java.awt.Color(115, 162, 239));
        btnAddProduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddProduct.setMaximumSize(new java.awt.Dimension(140, 40));
        btnAddProduct.setMinimumSize(new java.awt.Dimension(110, 40));
        btnAddProduct.setPreferredSize(new java.awt.Dimension(140, 40));
        btnAddProduct.setRadius(10);
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        Product_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teste", "Mais um", "Ações"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Scrollpane_Table.setViewportView(Product_Table);
        if (Product_Table.getColumnModel().getColumnCount() > 0) {
            Product_Table.getColumnModel().getColumn(2).setMinWidth(120);
            Product_Table.getColumnModel().getColumn(2).setPreferredWidth(120);
            Product_Table.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        javax.swing.GroupLayout Storage_PanelLayout = new javax.swing.GroupLayout(Storage_Panel);
        Storage_Panel.setLayout(Storage_PanelLayout);
        Storage_PanelLayout.setHorizontalGroup(
            Storage_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Storage_PanelLayout.createSequentialGroup()
                .addGroup(Storage_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Storage_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Scrollpane_Table))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Storage_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pageLocation_Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 740, Short.MAX_VALUE)
                        .addComponent(btnMinimize)
                        .addGap(18, 18, 18)
                        .addComponent(btnMaximize)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Storage_PanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Storage_PanelLayout.setVerticalGroup(
            Storage_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Storage_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Storage_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaximize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pageLocation_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Scrollpane_Table, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Storage_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Storage_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        //TODO: VOLTAR PÁGINA
    }//GEN-LAST:event_btnReturnMouseClicked

    private void btnMinimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMousePressed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMousePressed

    private void btnMaximizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMousePressed
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnMaximizeMousePressed

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        System.exit(0);
    }//GEN-LAST:event_btnExitMousePressed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        //TODO: ABRIR ADDPRODUCT_DIALOG E ATUALIZAR TABELA QUANDO DIALOG FECHAR, EXEMPLO COD. ABAIXO   
        /*
        addProduct_dialog.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                loadProjects();
        }
        */
    }//GEN-LAST:event_btnAddProductActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Storage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.pdvtech.view.component.customTable Product_Table;
    private javax.swing.JScrollPane Scrollpane_Table;
    private javax.swing.JPanel Storage_Panel;
    private com.pdvtech.view.component.customButton btnAddProduct;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnMaximize;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel btnReturn;
    private javax.swing.JLabel pageLocation_Name;
    // End of variables declaration//GEN-END:variables

    public void initTable() {
        
        Product_Table.fixTable(Scrollpane_Table);
        DefaultTableModel model = (DefaultTableModel) Product_Table.getModel();
        
        TableActionEvent ev = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                //TODO: ABRIR EDITPRODUCT_DIALOG E ATUALIZAR TABELA QUANDO DIALOG FECHAR, EXEMPLO COD. ABAIXO   
                /*
                editProduct_dialog.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent e) {
                        loadProjects();
                }
                */
            }

            @Override
            public void onDelete(int row) {
                if (Product_Table.isEditing()) {
                    Product_Table.getCellEditor().stopCellEditing();
                }
                
                DefaultTableModel m = (DefaultTableModel) Product_Table.getModel();
                m.removeRow(row);
                
                //TODO: MÉTODO 'DELETE' PRODUTO
            }
        };    
      
        Product_Table.getColumnModel().getColumn(2).setCellRenderer(new TableCellActionRenderer());
        Product_Table.getColumnModel().getColumn(2).setCellEditor(new TableCellActionEditor(ev));
        
        //TESTE: Dados teste na tabela
        for (int i = 1; i <= 20; i++) {
            model.addRow(new Object[] {"Teste", 50, false});
        }
    }
}