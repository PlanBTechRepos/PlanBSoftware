
package com.pdvtech.view.use;

import com.pdvtech.view.component.util.PdvColors;

public class Warning_Dialog extends javax.swing.JDialog {

    public Warning_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Warning_Panel = new javax.swing.JPanel();
        btnConfirm = new com.pdvtech.view.component.customPanel();
        btn_Title = new javax.swing.JLabel();
        Warning_Type = new javax.swing.JLabel();
        print_ErrorType = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        print_ErrorDescription = new javax.swing.JLabel();
        print_ErrorSub_Description = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(530, 150));
        setMinimumSize(new java.awt.Dimension(510, 150));
        setUndecorated(true);

        Warning_Panel.setBackground(new java.awt.Color(90, 90, 90));

        btnConfirm.setBackground(new java.awt.Color(153, 153, 153));
        btnConfirm.setMaximumSize(new java.awt.Dimension(70, 60));
        btnConfirm.setMinimumSize(new java.awt.Dimension(70, 60));
        btnConfirm.setName(""); // NOI18N
        btnConfirm.setRoundBottomLeft(15);
        btnConfirm.setRoundBottomRight(80);
        btnConfirm.setRoundTopLeft(80);
        btnConfirm.setRoundTopRight(15);
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfirmMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnConfirmMousePressed(evt);
            }
        });

        btn_Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/check-b.png"))); // NOI18N

        javax.swing.GroupLayout btnConfirmLayout = new javax.swing.GroupLayout(btnConfirm);
        btnConfirm.setLayout(btnConfirmLayout);
        btnConfirmLayout.setHorizontalGroup(
            btnConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConfirmLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btn_Title)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        btnConfirmLayout.setVerticalGroup(
            btnConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConfirmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Warning_Type.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        Warning_Type.setForeground(new java.awt.Color(255, 255, 255));
        Warning_Type.setText("ERR");

        print_ErrorType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        print_ErrorType.setForeground(new java.awt.Color(0, 0, 0));
        print_ErrorType.setText("Ex: Produto não adicionado");

        separator.setForeground(new java.awt.Color(255, 255, 255));

        print_ErrorDescription.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        print_ErrorDescription.setForeground(new java.awt.Color(0, 0, 0));
        print_ErrorDescription.setText("Produto tem informações necessárias para cadastro.");

        print_ErrorSub_Description.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        print_ErrorSub_Description.setForeground(new java.awt.Color(0, 0, 0));
        print_ErrorSub_Description.setText("Por favor, verifique se preenchou os campos corretamente.");

        javax.swing.GroupLayout Warning_PanelLayout = new javax.swing.GroupLayout(Warning_Panel);
        Warning_Panel.setLayout(Warning_PanelLayout);
        Warning_PanelLayout.setHorizontalGroup(
            Warning_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Warning_PanelLayout.createSequentialGroup()
                .addGroup(Warning_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Warning_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Warning_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(print_ErrorType)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Warning_PanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(Warning_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Warning_PanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(Warning_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(print_ErrorDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(print_ErrorSub_Description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(separator))))
                .addContainerGap())
        );
        Warning_PanelLayout.setVerticalGroup(
            Warning_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Warning_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Warning_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Warning_Type)
                    .addComponent(print_ErrorType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Warning_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Warning_PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(print_ErrorDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(print_ErrorSub_Description)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Warning_PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Warning_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Warning_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseEntered
        PdvColors.setColor(btnConfirm);
    }//GEN-LAST:event_btnConfirmMouseEntered

    private void btnConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseExited
        PdvColors.resetColor(btnConfirm);
    }//GEN-LAST:event_btnConfirmMouseExited

    private void btnConfirmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMousePressed
        this.dispose();
    }//GEN-LAST:event_btnConfirmMousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Warning_Dialog dialog = new Warning_Dialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel Warning_Panel;
    private javax.swing.JLabel Warning_Type;
    private com.pdvtech.view.component.customPanel btnConfirm;
    private javax.swing.JLabel btn_Title;
    private javax.swing.JLabel print_ErrorDescription;
    private javax.swing.JLabel print_ErrorSub_Description;
    private javax.swing.JLabel print_ErrorType;
    private javax.swing.JSeparator separator;
    // End of variables declaration//GEN-END:variables
}
