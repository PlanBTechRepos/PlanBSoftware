package com.pdvtech.view.use;

import com.pdvtech.model.TableActionEvent;
import com.pdvtech.view.component.util.TableCellActionEditor;
import com.pdvtech.view.component.util.TableCellActionRenderer;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import com.pdvtech.controller.UsuarioController;
import com.pdvtech.model.Usuario;
import java.awt.Toolkit;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Employees extends javax.swing.JFrame {

    public Employees() {
        initComponents();
        Employees_Table.setModel(UsuarioController.viewAllFunc());
        Employees.this.initTable();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/tech.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Employees_Panel = new javax.swing.JPanel();
        btnReturn = new javax.swing.JLabel();
        pageLocation_Name = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        btnMaximize = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        Scrollpane_Table = new javax.swing.JScrollPane();
        Employees_Table = new com.pdvtech.view.component.customTable();
        btn_AddEmployee = new com.pdvtech.view.component.customButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);

        Employees_Panel.setBackground(new java.awt.Color(153, 153, 153));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/voltar.png"))); // NOI18N
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });

        pageLocation_Name.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        pageLocation_Name.setText("FUNCIONÁRIOS");

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

        Scrollpane_Table.setBorder(null);

        Employees_Table.setModel(UsuarioController.viewAllFunc());
        Scrollpane_Table.setViewportView(Employees_Table);
        if (Employees_Table.getColumnModel().getColumnCount() > 0) {
            Employees_Table.getColumnModel().getColumn(0).setMinWidth(60);
            Employees_Table.getColumnModel().getColumn(0).setPreferredWidth(60);
            Employees_Table.getColumnModel().getColumn(0).setMaxWidth(60);
            Employees_Table.getColumnModel().getColumn(1).setMinWidth(220);
            Employees_Table.getColumnModel().getColumn(1).setPreferredWidth(240);
            Employees_Table.getColumnModel().getColumn(1).setMaxWidth(260);
            Employees_Table.getColumnModel().getColumn(2).setMinWidth(400);
            Employees_Table.getColumnModel().getColumn(2).setPreferredWidth(500);
            Employees_Table.getColumnModel().getColumn(2).setMaxWidth(700);
        }

        btn_AddEmployee.setBackground(new java.awt.Color(51, 51, 51));
        btn_AddEmployee.setBorder(null);
        btn_AddEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btn_AddEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/plus.png"))); // NOI18N
        btn_AddEmployee.setText("Funcionário");
        btn_AddEmployee.setBorderColor(new java.awt.Color(51, 51, 51));
        btn_AddEmployee.setColor(new java.awt.Color(51, 51, 51));
        btn_AddEmployee.setColorClick(new java.awt.Color(51, 51, 51));
        btn_AddEmployee.setColorOver(new java.awt.Color(115, 162, 239));
        btn_AddEmployee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_AddEmployee.setMaximumSize(new java.awt.Dimension(140, 40));
        btn_AddEmployee.setMinimumSize(new java.awt.Dimension(110, 40));
        btn_AddEmployee.setPreferredSize(new java.awt.Dimension(140, 40));
        btn_AddEmployee.setRadius(10);
        btn_AddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Employees_PanelLayout = new javax.swing.GroupLayout(Employees_Panel);
        Employees_Panel.setLayout(Employees_PanelLayout);
        Employees_PanelLayout.setHorizontalGroup(
            Employees_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Employees_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Employees_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Scrollpane_Table)
                    .addGroup(Employees_PanelLayout.createSequentialGroup()
                        .addGroup(Employees_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_AddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Employees_PanelLayout.createSequentialGroup()
                                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pageLocation_Name)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 692, Short.MAX_VALUE)
                        .addComponent(btnMinimize)
                        .addGap(18, 18, 18)
                        .addComponent(btnMaximize)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit)))
                .addContainerGap())
        );
        Employees_PanelLayout.setVerticalGroup(
            Employees_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Employees_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Employees_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaximize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pageLocation_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btn_AddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Scrollpane_Table, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Employees_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Employees_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        Usuario user = new Usuario();
        if (user.getAdm()) {
            MenuAdmin adm = new MenuAdmin();
            adm.requestFocus();
        } else {
            MenuEmployer emp = new MenuEmployer();
            emp.requestFocus();
        }
        this.dispose();
    }//GEN-LAST:event_btnReturnMouseClicked

    private void btnMinimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMousePressed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMousePressed

    private void btnMaximizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMousePressed
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnMaximizeMousePressed

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        this.dispose();
    }//GEN-LAST:event_btnExitMousePressed

    private void btn_AddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddEmployeeActionPerformed
        AddEmployee_Dialog ae = new AddEmployee_Dialog(this, rootPaneCheckingEnabled);
        ae.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Employees_Table.setModel(UsuarioController.viewAllFunc());
                Employees.this.initTable();
            }
        });
        ae.setVisible(true);
    }//GEN-LAST:event_btn_AddEmployeeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Employees_Panel;
    private static com.pdvtech.view.component.customTable Employees_Table;
    private javax.swing.JScrollPane Scrollpane_Table;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnMaximize;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel btnReturn;
    private com.pdvtech.view.component.customButton btn_AddEmployee;
    private javax.swing.JLabel pageLocation_Name;
    // End of variables declaration//GEN-END:variables

    private void initTable() {

        Employees_Table.fixTable(Scrollpane_Table);
        DefaultTableModel model = (DefaultTableModel) Employees_Table.getModel();

        DefaultTableModel m = (DefaultTableModel) Employees_Table.getModel();          


        TableActionEvent ev = new TableActionEvent() {

            @Override
            public void onEdit(int row) {
                EditEmployee_Dialog edit = new EditEmployee_Dialog(Employees.this, true);
                
                edit.addWindowListener(new WindowAdapter() {

                    @Override
                    public void windowActivated(WindowEvent e) {
                        String editName = String.valueOf(m.getValueAt(row, 0));
                        edit.setView(editName);
                    }

                    @Override
                    public void windowClosed(WindowEvent e) {

                        Employees_Table.setModel(UsuarioController.viewAllFunc());
                        Employees.this.initTable();
                    }
                });
                edit.setVisible(true);
            }

            @Override
            public void onDelete(int row) {

                if (Employees_Table.isEditing()) {
                    Employees_Table.getCellEditor().stopCellEditing();
                }

                DefaultTableModel m = (DefaultTableModel) Employees_Table.getModel();
                m.removeRow(row);

                //TODO: Remover funcionário
            }

        
                };

        Employees_Table.getColumnModel().getColumn(4).setCellRenderer(new TableCellActionRenderer());
        Employees_Table.getColumnModel().getColumn(4).setCellEditor(new TableCellActionEditor(ev));

        //TESTE: Dados teste na tabela

        for (int i = 1; i <= 5; i++) {
            model.addRow(new Object[]{i, "Caixa", "Pessoa " + i});

        }

    

        



        }
                }

