
package com.pdvtech.view.use;

import com.pdvtech.controller.EstoqueController;
import java.awt.event.WindowAdapter;

public class AddProduct_Dialog extends javax.swing.JDialog {

    public AddProduct_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void open(){
        this.addWindowListener(new WindowAdapter() {});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddProduct_Panel = new javax.swing.JPanel();
        btnCancel = new com.pdvtech.view.component.customButton();
        btnConfirm = new com.pdvtech.view.component.customButton();
        Menu_Panel = new javax.swing.JPanel();
        Menu_Title = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        input_description = new com.pdvtech.view.component.customTextField();
        lblQuantity = new javax.swing.JLabel();
        input_quantity = new com.pdvtech.view.component.customTextField();
        input_validity = new com.pdvtech.view.component.customTextField();
        lblValidity = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        input_price = new com.pdvtech.view.component.customTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 153, 153));
        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setUndecorated(true);

        AddProduct_Panel.setBackground(new java.awt.Color(153, 153, 153));

        btnCancel.setBackground(new java.awt.Color(51, 51, 51));
        btnCancel.setBorder(null);
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancelar.png"))); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.setBorderColor(new java.awt.Color(51, 51, 51));
        btnCancel.setColor(new java.awt.Color(51, 51, 51));
        btnCancel.setColorClick(new java.awt.Color(51, 51, 51));
        btnCancel.setColorOver(new java.awt.Color(115, 162, 239));
        btnCancel.setRadius(12);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(51, 51, 51));
        btnConfirm.setBorder(null);
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/check.png"))); // NOI18N
        btnConfirm.setText("Confirmar");
        btnConfirm.setBorderColor(new java.awt.Color(51, 51, 51));
        btnConfirm.setColor(new java.awt.Color(51, 51, 51));
        btnConfirm.setColorClick(new java.awt.Color(51, 51, 51));
        btnConfirm.setColorOver(new java.awt.Color(115, 162, 239));
        btnConfirm.setRadius(12);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        Menu_Panel.setBackground(new java.awt.Color(102, 102, 102));

        Menu_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Menu_Title.setForeground(new java.awt.Color(255, 255, 255));
        Menu_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu_Title.setText("Adicionar Produto");

        javax.swing.GroupLayout Menu_PanelLayout = new javax.swing.GroupLayout(Menu_Panel);
        Menu_Panel.setLayout(Menu_PanelLayout);
        Menu_PanelLayout.setHorizontalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Menu_PanelLayout.setVerticalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        lblDesc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDesc.setForeground(new java.awt.Color(255, 255, 255));
        lblDesc.setText("Descrição");

        input_description.setForeground(new java.awt.Color(255, 255, 255));
        input_description.setToolTipText("");
        input_description.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_description.setRound(8);

        lblQuantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("Quantidade");

        input_quantity.setForeground(new java.awt.Color(255, 255, 255));
        input_quantity.setToolTipText("");
        input_quantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_quantity.setRound(8);

        input_validity.setForeground(new java.awt.Color(255, 255, 255));
        input_validity.setToolTipText("");
        input_validity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_validity.setRound(8);

        lblValidity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValidity.setForeground(new java.awt.Color(255, 255, 255));
        lblValidity.setText("Vencimento");

        lblPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setText("Preço");

        input_price.setForeground(new java.awt.Color(255, 255, 255));
        input_price.setToolTipText("");
        input_price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_price.setRound(8);

        javax.swing.GroupLayout AddProduct_PanelLayout = new javax.swing.GroupLayout(AddProduct_Panel);
        AddProduct_Panel.setLayout(AddProduct_PanelLayout);
        AddProduct_PanelLayout.setHorizontalGroup(
            AddProduct_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AddProduct_PanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(AddProduct_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrice)
                    .addGroup(AddProduct_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(AddProduct_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDesc)
                            .addComponent(input_description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(AddProduct_PanelLayout.createSequentialGroup()
                                .addGroup(AddProduct_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(input_price, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(AddProduct_PanelLayout.createSequentialGroup()
                            .addGroup(AddProduct_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblQuantity)
                                .addComponent(input_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(AddProduct_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblValidity)
                                .addComponent(input_validity, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        AddProduct_PanelLayout.setVerticalGroup(
            AddProduct_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddProduct_PanelLayout.createSequentialGroup()
                .addComponent(Menu_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_description, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AddProduct_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddProduct_PanelLayout.createSequentialGroup()
                        .addComponent(lblQuantity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_price, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(AddProduct_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(AddProduct_PanelLayout.createSequentialGroup()
                        .addComponent(lblValidity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_validity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddProduct_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddProduct_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        System.out.println("Teste3");
        EstoqueController.addEstoque(
               Integer.parseInt(this.input_quantity.getText()), 
               this.input_description.getText(), 
               Float.parseFloat(this.input_price.getText()));
       this.dispose();
    }//GEN-LAST:event_btnConfirmActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddProduct_Dialog dialog = new AddProduct_Dialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel AddProduct_Panel;
    private javax.swing.JPanel Menu_Panel;
    private javax.swing.JLabel Menu_Title;
    private com.pdvtech.view.component.customButton btnCancel;
    private com.pdvtech.view.component.customButton btnConfirm;
    private com.pdvtech.view.component.customTextField input_description;
    private com.pdvtech.view.component.customTextField input_price;
    private com.pdvtech.view.component.customTextField input_quantity;
    private com.pdvtech.view.component.customTextField input_validity;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblValidity;
    // End of variables declaration//GEN-END:variables
}
