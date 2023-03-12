
package com.pdvtech.view;

import javax.swing.JFrame;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.btnHidePass.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login_Panel = new javax.swing.JPanel();
        btnMaximize = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        Form_Panel = new com.pdvtech.view.component.customPanel();
        input_User = new javax.swing.JTextField();
        input_Pass = new javax.swing.JPasswordField();
        error_User = new javax.swing.JLabel();
        error_Pass = new javax.swing.JLabel();
        btnSubmit = new com.pdvtech.view.component.customButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnShowPass = new javax.swing.JLabel();
        btnHidePass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Login_Panel.setBackground(new java.awt.Color(102, 102, 102));
        Login_Panel.setForeground(new java.awt.Color(255, 255, 255));

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

        Form_Panel.setBackground(new java.awt.Color(153, 153, 153));
        Form_Panel.setRoundBottomLeft(800);
        Form_Panel.setRoundBottomRight(200);
        Form_Panel.setRoundTopLeft(300);
        Form_Panel.setRoundTopRight(800);
        Form_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_User.setBackground(new java.awt.Color(153, 153, 153));
        input_User.setForeground(new java.awt.Color(51, 51, 51));
        input_User.setToolTipText("Digite seu usuário");
        input_User.setBorder(null);
        Form_Panel.add(input_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 220, 40));

        input_Pass.setBackground(new java.awt.Color(153, 153, 153));
        input_Pass.setForeground(new java.awt.Color(51, 51, 51));
        input_Pass.setToolTipText("Digite sua senha");
        input_Pass.setBorder(null);
        Form_Panel.add(input_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 220, 40));

        error_User.setBackground(new java.awt.Color(153, 153, 153));
        error_User.setForeground(new java.awt.Color(255, 0, 0));
        error_User.setOpaque(true);
        Form_Panel.add(error_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 220, -1));

        error_Pass.setBackground(new java.awt.Color(153, 153, 153));
        error_Pass.setForeground(new java.awt.Color(255, 0, 0));
        Form_Panel.add(error_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 220, -1));

        btnSubmit.setBorder(null);
        btnSubmit.setText("LOG IN");
        btnSubmit.setColorClick(new java.awt.Color(204, 204, 204));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSubmit.setRadius(12);
        Form_Panel.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 220, 42));

        jSeparator1.setBackground(java.awt.Color.black);
        jSeparator1.setForeground(java.awt.Color.black);
        Form_Panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 220, 10));

        jSeparator2.setBackground(java.awt.Color.black);
        jSeparator2.setForeground(java.awt.Color.black);
        Form_Panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 220, 10));

        jLabel1.setBackground(java.awt.Color.black);
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Usuário");
        Form_Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel2.setBackground(java.awt.Color.black);
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("Senha");
        Form_Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        btnShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mostrar.png"))); // NOI18N
        btnShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnShowPassMousePressed(evt);
            }
        });
        Form_Panel.add(btnShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        btnHidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/esconder.png"))); // NOI18N
        btnHidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHidePassMousePressed(evt);
            }
        });
        Form_Panel.add(btnHidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        javax.swing.GroupLayout Login_PanelLayout = new javax.swing.GroupLayout(Login_Panel);
        Login_Panel.setLayout(Login_PanelLayout);
        Login_PanelLayout.setHorizontalGroup(
            Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_PanelLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_PanelLayout.createSequentialGroup()
                        .addComponent(btnMinimize)
                        .addGap(18, 18, 18)
                        .addComponent(btnMaximize)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_PanelLayout.createSequentialGroup()
                        .addComponent(Form_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(149, Short.MAX_VALUE))))
        );
        Login_PanelLayout.setVerticalGroup(
            Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaximize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(Form_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Login_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Login_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        System.exit(0);
    }//GEN-LAST:event_btnExitMousePressed

    private void btnMinimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMousePressed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMousePressed

    private void btnMaximizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMousePressed
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnMaximizeMousePressed

    private void btnShowPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPassMousePressed
        this.btnHidePass.setVisible(true);
        this.btnShowPass.setVisible(false);
        input_Pass.setEchoChar((char) 0);
    }//GEN-LAST:event_btnShowPassMousePressed

    private void btnHidePassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHidePassMousePressed
        this.btnShowPass.setVisible(true);
        this.btnHidePass.setVisible(false);
        input_Pass.setEchoChar('*');
    }//GEN-LAST:event_btnHidePassMousePressed

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
    private javax.swing.JLabel btnHidePass;
    private javax.swing.JLabel btnMaximize;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel btnShowPass;
    private com.pdvtech.view.component.customButton btnSubmit;
    private javax.swing.JLabel error_Pass;
    private javax.swing.JLabel error_User;
    private javax.swing.JPasswordField input_Pass;
    private javax.swing.JTextField input_User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
