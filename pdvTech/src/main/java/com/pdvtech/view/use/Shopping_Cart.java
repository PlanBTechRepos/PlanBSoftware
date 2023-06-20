
package com.pdvtech.view.use;

import com.pdvtech.controller.OrderController;
import com.pdvtech.model.TableActionEvent;
import com.pdvtech.view.component.util.TableCellDeleteActionEditor;
import com.pdvtech.view.component.util.TableCellDeleteActionRenderer;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Shopping_Cart extends javax.swing.JDialog {
    public void setInfo(String nome){
       String soma = OrderController.actualPrice();
        this.print_ClientName.setText(nome);
   
        this.print_OrderPrice.setText("R$" + String.valueOf(soma));
        
    }
    public Shopping_Cart(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
         
        initComponents();
        initTable();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/tech.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cart_Panel = new javax.swing.JPanel();
        Menu_Panel = new com.pdvtech.view.component.customPanel();
        btnReturn = new javax.swing.JLabel();
        pageLocation_Name = new javax.swing.JLabel();
        cart_img = new javax.swing.JLabel();
        lbl_NumOrder = new javax.swing.JLabel();
        lbl_ClientName = new javax.swing.JLabel();
        area_Name = new com.pdvtech.view.component.customPanel();
        print_ClientName = new javax.swing.JLabel();
        area_NumOrder = new com.pdvtech.view.component.customPanel();
        print_NumOrder = new javax.swing.JLabel();
        Scrollpane_Table = new javax.swing.JScrollPane();
        Product_Table = new com.pdvtech.view.component.customTable();
        separator1 = new javax.swing.JSeparator();
        lbl_ValueOrder = new javax.swing.JLabel();
        area_ValueOrder = new com.pdvtech.view.component.customPanel();
        print_OrderPrice = new javax.swing.JLabel();
        lbl_ValueReceived = new javax.swing.JLabel();
        input_ValueReceived = new com.pdvtech.view.component.customTextField();
        btn_CalculateChange = new com.pdvtech.view.component.customButton();
        lblChange = new javax.swing.JLabel();
        area_Change = new com.pdvtech.view.component.customPanel();
        print_Change = new javax.swing.JLabel();
        separator2 = new javax.swing.JSeparator();
        btn_FinishOrder = new com.pdvtech.view.component.customButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        Cart_Panel.setBackground(new java.awt.Color(238, 238, 238));

        Menu_Panel.setBackground(new java.awt.Color(84, 130, 171));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/voltar.png"))); // NOI18N
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });

        pageLocation_Name.setBackground(new java.awt.Color(68, 68, 68));
        pageLocation_Name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pageLocation_Name.setForeground(new java.awt.Color(255, 255, 255));
        pageLocation_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageLocation_Name.setText("CARRINHO");

        cart_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/carrinho-32.png"))); // NOI18N

        javax.swing.GroupLayout Menu_PanelLayout = new javax.swing.GroupLayout(Menu_Panel);
        Menu_Panel.setLayout(Menu_PanelLayout);
        Menu_PanelLayout.setHorizontalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pageLocation_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(cart_img)
                .addGap(24, 24, 24))
        );
        Menu_PanelLayout.setVerticalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cart_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pageLocation_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_NumOrder.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbl_NumOrder.setForeground(new java.awt.Color(68, 68, 68));
        lbl_NumOrder.setText("Número do pedido");

        lbl_ClientName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbl_ClientName.setForeground(new java.awt.Color(68, 68, 68));
        lbl_ClientName.setText("Nome do cliente");

        area_Name.setBackground(new java.awt.Color(255, 255, 255));
        area_Name.setRoundBottomLeft(10);
        area_Name.setRoundBottomRight(10);
        area_Name.setRoundTopLeft(10);
        area_Name.setRoundTopRight(10);

        print_ClientName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        print_ClientName.setText("Fulano");

        javax.swing.GroupLayout area_NameLayout = new javax.swing.GroupLayout(area_Name);
        area_Name.setLayout(area_NameLayout);
        area_NameLayout.setHorizontalGroup(
            area_NameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, area_NameLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(print_ClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        area_NameLayout.setVerticalGroup(
            area_NameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(print_ClientName, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        area_NumOrder.setBackground(new java.awt.Color(255, 255, 255));
        area_NumOrder.setRoundBottomLeft(10);
        area_NumOrder.setRoundBottomRight(10);
        area_NumOrder.setRoundTopLeft(10);
        area_NumOrder.setRoundTopRight(10);

        print_NumOrder.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        print_NumOrder.setText("0000");

        javax.swing.GroupLayout area_NumOrderLayout = new javax.swing.GroupLayout(area_NumOrder);
        area_NumOrder.setLayout(area_NumOrderLayout);
        area_NumOrderLayout.setHorizontalGroup(
            area_NumOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(area_NumOrderLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(print_NumOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        area_NumOrderLayout.setVerticalGroup(
            area_NumOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(print_NumOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Product_Table.setBackground(new java.awt.Color(238, 238, 238));
        Scrollpane_Table.setViewportView(Product_Table);
        if (Product_Table.getColumnModel().getColumnCount() > 0) {
            Product_Table.getColumnModel().getColumn(1).setMinWidth(80);
            Product_Table.getColumnModel().getColumn(1).setPreferredWidth(80);
            Product_Table.getColumnModel().getColumn(1).setMaxWidth(100);
            Product_Table.getColumnModel().getColumn(2).setMinWidth(110);
            Product_Table.getColumnModel().getColumn(2).setPreferredWidth(110);
            Product_Table.getColumnModel().getColumn(2).setMaxWidth(120);
            Product_Table.getColumnModel().getColumn(3).setMinWidth(80);
            Product_Table.getColumnModel().getColumn(3).setPreferredWidth(80);
            Product_Table.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        lbl_ValueOrder.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbl_ValueOrder.setForeground(new java.awt.Color(68, 68, 68));
        lbl_ValueOrder.setText("Valor do pedido");

        area_ValueOrder.setBackground(new java.awt.Color(255, 255, 255));
        area_ValueOrder.setMaximumSize(new java.awt.Dimension(170, 40));
        area_ValueOrder.setMinimumSize(new java.awt.Dimension(170, 40));
        area_ValueOrder.setRoundBottomLeft(10);
        area_ValueOrder.setRoundBottomRight(10);
        area_ValueOrder.setRoundTopLeft(10);
        area_ValueOrder.setRoundTopRight(10);

        print_OrderPrice.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        print_OrderPrice.setForeground(new java.awt.Color(115, 162, 239));
        print_OrderPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        print_OrderPrice.setText("R$ 000,00");

        javax.swing.GroupLayout area_ValueOrderLayout = new javax.swing.GroupLayout(area_ValueOrder);
        area_ValueOrder.setLayout(area_ValueOrderLayout);
        area_ValueOrderLayout.setHorizontalGroup(
            area_ValueOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, area_ValueOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(print_OrderPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        area_ValueOrderLayout.setVerticalGroup(
            area_ValueOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, area_ValueOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(print_OrderPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbl_ValueReceived.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbl_ValueReceived.setForeground(new java.awt.Color(68, 68, 68));
        lbl_ValueReceived.setText("Valor recebido");

        input_ValueReceived.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_ValueReceived.setText("000,00");
        input_ValueReceived.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        input_ValueReceived.setMaximumSize(new java.awt.Dimension(170, 40));
        input_ValueReceived.setMinimumSize(new java.awt.Dimension(170, 40));
        input_ValueReceived.setPreferredSize(new java.awt.Dimension(170, 40));
        input_ValueReceived.setRound(8);
        input_ValueReceived.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_ValueReceivedFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_ValueReceivedFocusLost(evt);
            }
        });
        input_ValueReceived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_ValueReceivedActionPerformed(evt);
            }
        });

        btn_CalculateChange.setBackground(new java.awt.Color(51, 51, 51));
        btn_CalculateChange.setBorder(null);
        btn_CalculateChange.setForeground(new java.awt.Color(255, 255, 255));
        btn_CalculateChange.setText("Calcular Troco");
        btn_CalculateChange.setBorderColor(new java.awt.Color(238, 238, 238));
        btn_CalculateChange.setColor(new java.awt.Color(51, 51, 51));
        btn_CalculateChange.setColorClick(new java.awt.Color(51, 51, 51));
        btn_CalculateChange.setColorOver(new java.awt.Color(115, 162, 239));
        btn_CalculateChange.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_CalculateChange.setMaximumSize(new java.awt.Dimension(170, 45));
        btn_CalculateChange.setMinimumSize(new java.awt.Dimension(170, 45));
        btn_CalculateChange.setPreferredSize(new java.awt.Dimension(170, 45));
        btn_CalculateChange.setRadius(12);
        btn_CalculateChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalculateChangeActionPerformed(evt);
            }
        });

        lblChange.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblChange.setForeground(new java.awt.Color(68, 68, 68));
        lblChange.setText("Troco");

        area_Change.setBackground(new java.awt.Color(255, 255, 255));
        area_Change.setMaximumSize(new java.awt.Dimension(170, 40));
        area_Change.setMinimumSize(new java.awt.Dimension(170, 40));
        area_Change.setPreferredSize(new java.awt.Dimension(170, 40));
        area_Change.setRoundBottomLeft(10);
        area_Change.setRoundBottomRight(10);
        area_Change.setRoundTopLeft(10);
        area_Change.setRoundTopRight(10);

        print_Change.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        print_Change.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        print_Change.setText("R$ 000,00");

        javax.swing.GroupLayout area_ChangeLayout = new javax.swing.GroupLayout(area_Change);
        area_Change.setLayout(area_ChangeLayout);
        area_ChangeLayout.setHorizontalGroup(
            area_ChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(area_ChangeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(print_Change, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        area_ChangeLayout.setVerticalGroup(
            area_ChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(area_ChangeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(print_Change, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_FinishOrder.setBackground(new java.awt.Color(51, 51, 51));
        btn_FinishOrder.setBorder(null);
        btn_FinishOrder.setForeground(new java.awt.Color(255, 255, 255));
        btn_FinishOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ev-carrinho-30.png"))); // NOI18N
        btn_FinishOrder.setText("        FINALIZAR");
        btn_FinishOrder.setToolTipText("");
        btn_FinishOrder.setBorderColor(new java.awt.Color(238, 238, 238));
        btn_FinishOrder.setColor(new java.awt.Color(51, 51, 51));
        btn_FinishOrder.setColorClick(new java.awt.Color(51, 51, 51));
        btn_FinishOrder.setColorOver(new java.awt.Color(115, 162, 239));
        btn_FinishOrder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_FinishOrder.setMaximumSize(new java.awt.Dimension(170, 50));
        btn_FinishOrder.setMinimumSize(new java.awt.Dimension(170, 50));
        btn_FinishOrder.setPreferredSize(new java.awt.Dimension(170, 50));
        btn_FinishOrder.setRadius(12);
        btn_FinishOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FinishOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Cart_PanelLayout = new javax.swing.GroupLayout(Cart_Panel);
        Cart_Panel.setLayout(Cart_PanelLayout);
        Cart_PanelLayout.setHorizontalGroup(
            Cart_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cart_PanelLayout.createSequentialGroup()
                .addGroup(Cart_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Cart_PanelLayout.createSequentialGroup()
                        .addComponent(Menu_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addGroup(Cart_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ClientName)
                            .addComponent(area_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(Cart_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_NumOrder)
                            .addComponent(area_NumOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Cart_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Scrollpane_Table)
                        .addGap(18, 18, 18)
                        .addGroup(Cart_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(separator1)
                            .addComponent(separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Cart_PanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btn_FinishOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Cart_PanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(Cart_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblChange)
                                    .addComponent(area_Change, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_CalculateChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_ValueReceived)
                                    .addComponent(input_ValueReceived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_ValueOrder)
                                    .addComponent(area_ValueOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(14, 14, 14))
        );
        Cart_PanelLayout.setVerticalGroup(
            Cart_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cart_PanelLayout.createSequentialGroup()
                .addGroup(Cart_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Cart_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Cart_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Cart_PanelLayout.createSequentialGroup()
                                .addComponent(lbl_NumOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(area_NumOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Cart_PanelLayout.createSequentialGroup()
                                .addComponent(lbl_ClientName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(area_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Menu_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(Cart_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cart_PanelLayout.createSequentialGroup()
                        .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_ValueOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(area_ValueOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_ValueReceived)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_ValueReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btn_CalculateChange, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(lblChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(area_Change, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_FinishOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(Scrollpane_Table, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cart_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cart_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        this.dispose();
        Order o = new Order();
        
        o.requestFocus();
    }//GEN-LAST:event_btnReturnMouseClicked

    private void btn_CalculateChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalculateChangeActionPerformed
        //TODO: CALCULAR TROCO DO PEDIDO
        
        if(Float.parseFloat(this.print_OrderPrice.getText().replace(",", ".").substring(2)) > Float.parseFloat(this.input_ValueReceived.getText())){
            JOptionPane.showMessageDialog(Cart_Panel, "Valor insuficiente");
        }
        else{
            DecimalFormat df = new DecimalFormat("0.00");
            String change = df.format(
                    (Double.parseDouble(this.print_OrderPrice.getText().replace(",", ".").substring(2) )- 
                            Double.parseDouble(this.input_ValueReceived.getText()))
                    * (-1)
                    );
            change.replace(".", ",");
            this.print_Change.setText("R$ "+ change);
        }
    }//GEN-LAST:event_btn_CalculateChangeActionPerformed

    private void btn_FinishOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FinishOrderActionPerformed
        //TODO: FINALIZAR PEDIDO
    }//GEN-LAST:event_btn_FinishOrderActionPerformed

    private void input_ValueReceivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_ValueReceivedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_ValueReceivedActionPerformed

    private void input_ValueReceivedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_ValueReceivedFocusGained
        this.input_ValueReceived.setText("");
    }//GEN-LAST:event_input_ValueReceivedFocusGained

    private void input_ValueReceivedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_ValueReceivedFocusLost
        // TODO add your handling code here:
        if(this.input_ValueReceived.getText().isBlank()){
            this.input_ValueReceived.setText("000,00");
        }
    }//GEN-LAST:event_input_ValueReceivedFocusLost

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Shopping_Cart dialog = new Shopping_Cart(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cart_Panel;
    private com.pdvtech.view.component.customPanel Menu_Panel;
    private static com.pdvtech.view.component.customTable Product_Table;
    private javax.swing.JScrollPane Scrollpane_Table;
    private com.pdvtech.view.component.customPanel area_Change;
    private com.pdvtech.view.component.customPanel area_Name;
    private com.pdvtech.view.component.customPanel area_NumOrder;
    private com.pdvtech.view.component.customPanel area_ValueOrder;
    private javax.swing.JLabel btnReturn;
    private com.pdvtech.view.component.customButton btn_CalculateChange;
    private com.pdvtech.view.component.customButton btn_FinishOrder;
    private javax.swing.JLabel cart_img;
    private com.pdvtech.view.component.customTextField input_ValueReceived;
    private javax.swing.JLabel lblChange;
    private javax.swing.JLabel lbl_ClientName;
    private javax.swing.JLabel lbl_NumOrder;
    private javax.swing.JLabel lbl_ValueOrder;
    private javax.swing.JLabel lbl_ValueReceived;
    private javax.swing.JLabel pageLocation_Name;
    private javax.swing.JLabel print_Change;
    private javax.swing.JLabel print_ClientName;
    private javax.swing.JLabel print_NumOrder;
    private javax.swing.JLabel print_OrderPrice;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
         
        Product_Table.fixTable(Scrollpane_Table);
        DefaultTableModel model = (DefaultTableModel) Product_Table.getModel();
        Product_Table.setModel(OrderController.cartTable());
        TableActionEvent ev = new TableActionEvent() {
            @Override
            public void onDelete(int row) {
                
                if (Product_Table.isEditing()) {
                    Product_Table.getCellEditor().stopCellEditing();
                }
                
                DefaultTableModel m = (DefaultTableModel) Product_Table.getModel();
                m.removeRow(row);
                
                //TODO: MÉTODO 'DELETE' PRODUTO
                OrderController.pizzas.remove(row);
                OrderController.values.remove(row);
                Shopping_Cart.this.print_OrderPrice.setText("R$" + OrderController.actualPrice());
            }

            @Override
            public void onEdit(int row) { }
            
        };
        
        Product_Table.getColumnModel().getColumn(2).setCellRenderer(new TableCellDeleteActionRenderer());
        Product_Table.getColumnModel().getColumn(2).setCellEditor(new TableCellDeleteActionEditor(ev));
         
        
        //TESTE: Dados teste na tabela
       
    }
}
