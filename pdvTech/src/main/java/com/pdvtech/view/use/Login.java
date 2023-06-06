package com.pdvtech.view.use;

import com.pdvtech.controller.UsuarioController;
import com.pdvtech.model.Usuario;
import com.pdvtech.util.ConnectionFactory;
import java.awt.Color;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        initManualComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/tech.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login_Panel = new javax.swing.JPanel();
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
        btnExit = new javax.swing.JLabel();
        btnMaximize = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        text_welcome = new javax.swing.JLabel();
        text_welcome2 = new javax.swing.JLabel();
        text_welcome3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);

        Login_Panel.setBackground(new java.awt.Color(238, 238, 238));

        Form_Panel.setBackground(new java.awt.Color(84, 130, 171));
        Form_Panel.setForeground(new java.awt.Color(60, 63, 65));
        Form_Panel.setRoundBottomLeft(800);
        Form_Panel.setRoundTopLeft(300);
        Form_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        error_User.setForeground(new java.awt.Color(255, 0, 0));
        Form_Panel.add(error_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 220, 10));

        input_User.setBackground(new java.awt.Color(84, 130, 171));
        input_User.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_User.setForeground(new java.awt.Color(255, 255, 255));
        input_User.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_User.setToolTipText("Digite aqui seu usuário");
        input_User.setBorder(null);
        Form_Panel.add(input_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 220, 40));

        input_Pass.setBackground(new java.awt.Color(84, 130, 171));
        input_Pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_Pass.setForeground(new java.awt.Color(255, 255, 255));
        input_Pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_Pass.setToolTipText("Digite aqui sua senha");
        input_Pass.setBorder(null);
        input_Pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_PassKeyPressed(evt);
            }
        });
        Form_Panel.add(input_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 220, 40));

        btnSubmit.setBorder(null);
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setBorderColor(new java.awt.Color(51, 51, 51));
        btnSubmit.setColor(new java.awt.Color(51, 51, 51));
        btnSubmit.setColorClick(new java.awt.Color(51, 51, 51));
        btnSubmit.setColorOver(new java.awt.Color(115, 162, 239));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSubmit.setLabel("LOGIN");
        btnSubmit.setRadius(15);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        Form_Panel.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 220, 50));

        lbl_User.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_User.setForeground(new java.awt.Color(255, 255, 255));
        lbl_User.setText("Usuário");
        Form_Panel.add(lbl_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        lbl_Pass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_Pass.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Pass.setText("Senha");
        Form_Panel.add(lbl_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        error_Pass.setForeground(new java.awt.Color(255, 0, 0));
        Form_Panel.add(error_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 220, 10));

        btn_showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mostrar.png"))); // NOI18N
        btn_showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_showPassMousePressed(evt);
            }
        });
        Form_Panel.add(btn_showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        btn_hidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/esconder.png"))); // NOI18N
        btn_hidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_hidePassMousePressed(evt);
            }
        });
        Form_Panel.add(btn_hidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        separatorPass.setForeground(new java.awt.Color(255, 255, 255));
        Form_Panel.add(separatorPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 220, 10));

        separatorUser.setForeground(new java.awt.Color(255, 255, 255));
        Form_Panel.add(separatorUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 220, 10));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fechar.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
        });
        Form_Panel.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        btnMaximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/maximizar.png"))); // NOI18N
        btnMaximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMaximizeMousePressed(evt);
            }
        });
        Form_Panel.add(btnMaximize, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimizar.png"))); // NOI18N
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMinimizeMousePressed(evt);
            }
        });
        Form_Panel.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, 26));

        text_welcome.setBackground(new java.awt.Color(68, 68, 68));
        text_welcome.setFont(new java.awt.Font("Arial", 0, 52)); // NOI18N
        text_welcome.setText("Bem-vindo(a)");

        text_welcome2.setBackground(new java.awt.Color(68, 68, 68));
        text_welcome2.setFont(new java.awt.Font("Verdana", 0, 40)); // NOI18N
        text_welcome2.setText("ao software");

        text_welcome3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdv.png"))); // NOI18N

        javax.swing.GroupLayout Login_PanelLayout = new javax.swing.GroupLayout(Login_Panel);
        Login_Panel.setLayout(Login_PanelLayout);
        Login_PanelLayout.setHorizontalGroup(
            Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_PanelLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_welcome)
                    .addComponent(text_welcome2)
                    .addComponent(text_welcome3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(Form_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Login_PanelLayout.setVerticalGroup(
            Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Form_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(text_welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_welcome2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_welcome3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        submitForm();
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

    private void input_PassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_PassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            submitForm();
        }
    }//GEN-LAST:event_input_PassKeyPressed

    private void submitForm() {
        MenuAdmin menuA = new MenuAdmin();
        MenuEmployer menuE = new MenuEmployer();
        ConnectionFactory conn = new ConnectionFactory();
        Usuario user = new Usuario();
        if (input_User.getText().equals("criar db") && input_Pass.getText().equals("")) {
            conn.criaDB("");
            if (conn.getLineError().contains("ERROR 1045")) {
                JOptionPane.showMessageDialog(rootPane, "Banco de dados com senha");
            } else {
                JOptionPane.showMessageDialog(rootPane, "O banco de dados foi criado");
            }

        } else if (input_User.getText().equals("criar db") && input_Pass.getText().length() > 0) {
            conn.criaDB(input_Pass.getText());
            if (conn.getLineError().contains("ERROR 1045")) {
                JOptionPane.showMessageDialog(rootPane, "Senha errada");
            } else {
                JOptionPane.showMessageDialog(rootPane, "O banco de dados foi criado");
            }

        } else {
            try {
                UsuarioController.user.Login(this.input_User.getText(), this.input_Pass.getText());
                String userLogin = UsuarioController.user.getLogin();
                String userPass = UsuarioController.user.getSenha();

                if (!userLogin.isBlank() || !userPass.isBlank()) {
                    if (UsuarioController.user.getAdm()) {
                        menuA.setVisible(true);
                        Login.this.dispose();
                    } else {
                        menuE.setVisible(true);
                        Login.this.dispose();
                    }
                } else{
                    error_Pass.setText("Usuário ou senha incorretos");
                }
                
            } catch (Exception ex) {
                System.out.println(UsuarioController.user.getAdm());
                error_Pass.setText("Por favor reinsira seus dados");
                System.out.println(ex);
            }
        }
    }

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
    private javax.swing.JLabel text_welcome;
    private javax.swing.JLabel text_welcome2;
    private javax.swing.JLabel text_welcome3;
    // End of variables declaration//GEN-END:variables

    public void initManualComponents() {
        this.btn_hidePass.setVisible(false);
        input_Pass.setEchoChar('*');
        setExtendedState(MAXIMIZED_BOTH);
        text_welcome.setForeground(new Color(68, 68, 68));
        text_welcome2.setForeground(new Color(68, 68, 68));
    }
}
