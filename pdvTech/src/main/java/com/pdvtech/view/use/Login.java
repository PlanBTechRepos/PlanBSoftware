
package com.pdvtech.view.use;

import java.awt.Color;
import javax.swing.JFrame;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        initManualComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login_Panel = new javax.swing.JPanel();
        btnMaximize = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        Form_Panel = new com.pdvtech.view.component.customPanel();
        error_User = new javax.swing.JLabel();
        input_User = new javax.swing.JTextField();
        input_Pass = new javax.swing.JPasswordField();
        btnSubmit = new com.pdvtech.view.component.customButton();
        lbl_User = new javax.swing.JLabel();
        lbl_Pass = new javax.swing.JLabel();
        error_Pass = new javax.swing.JLabel();
        btn_showPass = new javax.swing.JLabel();
        btn_hidePass = new javax.swing.JLabel();
        separatorPass = new javax.swing.JSeparator();
        separatorUser = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        Login_Panel.setBackground(new java.awt.Color(153, 153, 153));

        btnMaximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/maximizar.png"))); // NOI18N
        btnMaximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMaximizeMousePressed(evt);
            }
        });

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimizar.png"))); // NOI18N
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMinimizeMousePressed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fechar.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
        });

        Form_Panel.setBackground(new java.awt.Color(102, 102, 102));
        Form_Panel.setForeground(new java.awt.Color(60, 63, 65));
        Form_Panel.setRoundBottomLeft(800);
        Form_Panel.setRoundBottomRight(200);
        Form_Panel.setRoundTopLeft(300);
        Form_Panel.setRoundTopRight(800);
        Form_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        error_User.setForeground(new java.awt.Color(255, 0, 0));
        Form_Panel.add(error_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 220, -1));

        input_User.setBackground(new java.awt.Color(102, 102, 102));
        input_User.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_User.setForeground(new java.awt.Color(255, 255, 255));
        input_User.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_User.setToolTipText("Digite aqui seu usuário");
        input_User.setBorder(null);
        Form_Panel.add(input_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 220, 40));

        input_Pass.setBackground(new java.awt.Color(102, 102, 102));
        input_Pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_Pass.setForeground(new java.awt.Color(255, 255, 255));
        input_Pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_Pass.setToolTipText("Digite aqui sua senha");
        input_Pass.setBorder(null);
        Form_Panel.add(input_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 220, 40));

        btnSubmit.setBorder(null);
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("LOG IN");
        btnSubmit.setBorderColor(new java.awt.Color(102, 102, 102));
        btnSubmit.setColor(new java.awt.Color(51, 51, 51));
        btnSubmit.setColorClick(new java.awt.Color(51, 51, 51));
        btnSubmit.setColorOver(new java.awt.Color(115, 162, 239));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSubmit.setRadius(15);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        Form_Panel.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 265, 220, 40));

        lbl_User.setForeground(new java.awt.Color(255, 255, 255));
        lbl_User.setText("Usuário");
        Form_Panel.add(lbl_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        lbl_Pass.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Pass.setText("Senha");
        Form_Panel.add(lbl_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        error_Pass.setForeground(new java.awt.Color(255, 0, 0));
        Form_Panel.add(error_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 220, -1));

        btn_showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mostrar.png"))); // NOI18N
        btn_showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_showPassMousePressed(evt);
            }
        });
        Form_Panel.add(btn_showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        btn_hidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/esconder.png"))); // NOI18N
        btn_hidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_hidePassMousePressed(evt);
            }
        });
        Form_Panel.add(btn_hidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        separatorPass.setForeground(new java.awt.Color(255, 255, 255));
        Form_Panel.add(separatorPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 220, 10));

        separatorUser.setForeground(new java.awt.Color(255, 255, 255));
        Form_Panel.add(separatorUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 220, 10));

        javax.swing.GroupLayout Login_PanelLayout = new javax.swing.GroupLayout(Login_Panel);
        Login_Panel.setLayout(Login_PanelLayout);
        Login_PanelLayout.setHorizontalGroup(
            Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimize)
                .addGap(18, 18, 18)
                .addComponent(btnMaximize)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap())
            .addGroup(Login_PanelLayout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(Form_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        Login_PanelLayout.setVerticalGroup(
            Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaximize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(Form_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO: FAZER LOGIN E CASO LOGIN/SENHA INCORRETO APRESENTAR ERRO EM ERROR_PASS E ERROR_USER
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btn_showPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_showPassMousePressed
        this.btn_hidePass.setVisible(true);
        this.btn_showPass.setVisible(false);
        input_Pass.setEchoChar((char) 0);
    }//GEN-LAST:event_btn_showPassMousePressed

    private void btn_hidePassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hidePassMousePressed
        this.btn_showPass.setVisible(true);
        this.btn_hidePass.setVisible(false);
        input_Pass.setEchoChar('*');
    }//GEN-LAST:event_btn_hidePassMousePressed

    private void btnMinimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMousePressed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMousePressed

    private void btnMaximizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMousePressed
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnMaximizeMousePressed

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        System.exit(0);
    }//GEN-LAST:event_btnExitMousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.pdvtech.view.component.customPanel Form_Panel;
    private javax.swing.JPanel Login_Panel;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnMaximize;
    private javax.swing.JLabel btnMinimize;
    private com.pdvtech.view.component.customButton btnSubmit;
    private javax.swing.JLabel btn_hidePass;
    private javax.swing.JLabel btn_showPass;
    private javax.swing.JLabel error_Pass;
    private javax.swing.JLabel error_User;
    private javax.swing.JPasswordField input_Pass;
    private javax.swing.JTextField input_User;
    private javax.swing.JLabel lbl_Pass;
    private javax.swing.JLabel lbl_User;
    private javax.swing.JSeparator separatorPass;
    private javax.swing.JSeparator separatorUser;
    // End of variables declaration//GEN-END:variables

    public void initManualComponents() {
        Form_Panel.setBackground(new Color(102, 102, 102));
        this.btn_hidePass.setVisible(false);
        input_Pass.setEchoChar('*');
        setExtendedState(MAXIMIZED_BOTH);
    }
}
