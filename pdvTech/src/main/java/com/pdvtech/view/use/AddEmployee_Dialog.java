package com.pdvtech.view.use;

import com.pdvtech.controller.FuncionarioController;
import com.pdvtech.controller.UsuarioController;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class AddEmployee_Dialog extends javax.swing.JDialog {

    public AddEmployee_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initManualComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/tech.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Register_Panel = new javax.swing.JPanel();
        Account_Panel = new com.pdvtech.view.component.customPanel();
        lbl_user = new javax.swing.JLabel();
        input_user = new javax.swing.JTextField();
        lbl_password = new javax.swing.JLabel();
        lblConfirm_password = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        separator2 = new javax.swing.JSeparator();
        input_pass = new javax.swing.JPasswordField();
        input_confirmPass = new javax.swing.JPasswordField();
        separator3 = new javax.swing.JSeparator();
        btn_register = new com.pdvtech.view.component.customButton();
        btn_showPass = new javax.swing.JLabel();
        btn_hidePass = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        input_name = new com.pdvtech.view.component.customTextField();
        lbl_lastName = new javax.swing.JLabel();
        input_lastName = new com.pdvtech.view.component.customTextField();
        lbl_position = new javax.swing.JLabel();
        input_position = new javax.swing.JComboBox<>();
        btn_clear = new com.pdvtech.view.component.customButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setName("Adicionar Funcionário"); // NOI18N
        setUndecorated(true);

        Register_Panel.setBackground(new java.awt.Color(238, 238, 238));
        Register_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));

        Account_Panel.setBackground(new java.awt.Color(84, 130, 171));
        Account_Panel.setRoundBottomLeft(500);
        Account_Panel.setRoundTopLeft(150);
        Account_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user.setText("Usuário");
        Account_Panel.add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 41, -1, -1));

        input_user.setBackground(new java.awt.Color(84, 130, 171));
        input_user.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_user.setForeground(new java.awt.Color(255, 255, 255));
        input_user.setBorder(null);
        Account_Panel.add(input_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 57, 184, 40));

        lbl_password.setForeground(new java.awt.Color(255, 255, 255));
        lbl_password.setText("Senha");
        Account_Panel.add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 125, -1, -1));

        lblConfirm_password.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirm_password.setText("Confirmar senha");
        Account_Panel.add(lblConfirm_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 209, -1, -1));

        separator1.setBackground(new java.awt.Color(255, 255, 255));
        separator1.setForeground(new java.awt.Color(255, 255, 255));
        Account_Panel.add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 97, 190, 10));

        separator2.setBackground(new java.awt.Color(255, 255, 255));
        separator2.setForeground(new java.awt.Color(255, 255, 255));
        Account_Panel.add(separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 181, 190, 10));

        input_pass.setBackground(new java.awt.Color(84, 130, 171));
        input_pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_pass.setForeground(new java.awt.Color(255, 255, 255));
        input_pass.setBorder(null);
        Account_Panel.add(input_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 141, 184, 40));

        input_confirmPass.setBackground(new java.awt.Color(84, 130, 171));
        input_confirmPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_confirmPass.setForeground(new java.awt.Color(255, 255, 255));
        input_confirmPass.setBorder(null);
        Account_Panel.add(input_confirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 225, 184, 40));

        separator3.setBackground(new java.awt.Color(255, 255, 255));
        separator3.setForeground(new java.awt.Color(255, 255, 255));
        Account_Panel.add(separator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 265, 190, 10));

        btn_register.setBackground(new java.awt.Color(51, 51, 51));
        btn_register.setBorder(null);
        btn_register.setForeground(new java.awt.Color(255, 255, 255));
        btn_register.setText("Cadastrar");
        btn_register.setBorderColor(new java.awt.Color(84, 130, 171));
        btn_register.setColor(new java.awt.Color(51, 51, 51));
        btn_register.setColorClick(new java.awt.Color(51, 51, 51));
        btn_register.setColorOver(new java.awt.Color(115, 162, 239));
        btn_register.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_register.setRadius(20);
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        Account_Panel.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 190, 50));

        btn_showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mostrar.png"))); // NOI18N
        btn_showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_showPassMousePressed(evt);
            }
        });
        Account_Panel.add(btn_showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        btn_hidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/esconder.png"))); // NOI18N
        btn_hidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_hidePassMousePressed(evt);
            }
        });
        Account_Panel.add(btn_hidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fechar.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
        });
        Account_Panel.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        lbl_name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(68, 68, 68));
        lbl_name.setText("Nome");

        input_name.setForeground(new java.awt.Color(0, 0, 0));
        input_name.setRound(8);

        lbl_lastName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_lastName.setForeground(new java.awt.Color(68, 68, 68));
        lbl_lastName.setText("Sobrenome");

        input_lastName.setForeground(new java.awt.Color(0, 0, 0));
        input_lastName.setRound(8);

        lbl_position.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_position.setForeground(new java.awt.Color(68, 68, 68));
        lbl_position.setText("Cargo");

        input_position.setBackground(new java.awt.Color(51, 51, 51));
        input_position.setForeground(new java.awt.Color(255, 255, 255));
        input_position.setModel(new javax.swing.DefaultComboBoxModel<>(FuncionarioController.cargosView()));
        input_position.setBorder(null);
        input_position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_positionActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(51, 51, 51));
        btn_clear.setBorder(null);
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Limpar");
        btn_clear.setBorderColor(new java.awt.Color(51, 51, 51));
        btn_clear.setColor(new java.awt.Color(51, 51, 51));
        btn_clear.setColorClick(new java.awt.Color(51, 51, 51));
        btn_clear.setColorOver(new java.awt.Color(115, 162, 239));
        btn_clear.setRadius(8);
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Register_PanelLayout = new javax.swing.GroupLayout(Register_Panel);
        Register_Panel.setLayout(Register_PanelLayout);
        Register_PanelLayout.setHorizontalGroup(
            Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Register_PanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_name)
                    .addComponent(lbl_lastName)
                    .addComponent(input_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_name, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_position)
                    .addComponent(input_position, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(Account_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Register_PanelLayout.setVerticalGroup(
            Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Account_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
            .addGroup(Register_PanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbl_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lbl_lastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lbl_position)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_position, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Register_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Register_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        if (input_confirmPass.getText().isBlank()
                || input_name.getText().isBlank()
                || input_lastName.getText().isBlank()
                || input_pass.getText().isBlank()
                || input_user.getText().isBlank())
            JOptionPane.showMessageDialog(rootPane, "Campos em branco", "Campos em branco", 0);
        else if (input_pass.getText().equals(input_confirmPass.getText())) {
            UsuarioController.cadFuncUs(input_name.getText(), input_lastName.getText(), input_position.getSelectedItem().toString(), input_user.getText(), input_pass.getText());
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Senha não identica", "Senha não identica", 0);
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        this.dispose();
    }//GEN-LAST:event_btnExitMousePressed

    private void btn_hidePassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hidePassMousePressed
        this.btn_showPass.setVisible(true);
        this.btn_hidePass.setVisible(false);
        input_pass.setEchoChar('*');
        input_confirmPass.setEchoChar('*');
    }//GEN-LAST:event_btn_hidePassMousePressed

    private void btn_showPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_showPassMousePressed
        this.btn_hidePass.setVisible(true);
        this.btn_showPass.setVisible(false);
        input_pass.setEchoChar((char) 0);
        input_confirmPass.setEchoChar((char) 0);
    }//GEN-LAST:event_btn_showPassMousePressed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        //TODO: Limpar tela
    }//GEN-LAST:event_btn_clearActionPerformed

    private void input_positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_positionActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddEmployee_Dialog dialog = new AddEmployee_Dialog(new javax.swing.JFrame(), true);
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
    private com.pdvtech.view.component.customPanel Account_Panel;
    private javax.swing.JPanel Register_Panel;
    private javax.swing.JLabel btnExit;
    private com.pdvtech.view.component.customButton btn_clear;
    private javax.swing.JLabel btn_hidePass;
    private com.pdvtech.view.component.customButton btn_register;
    private javax.swing.JLabel btn_showPass;
    private javax.swing.JPasswordField input_confirmPass;
    private com.pdvtech.view.component.customTextField input_lastName;
    private com.pdvtech.view.component.customTextField input_name;
    private javax.swing.JPasswordField input_pass;
    private javax.swing.JComboBox<String> input_position;
    private javax.swing.JTextField input_user;
    private javax.swing.JLabel lblConfirm_password;
    private javax.swing.JLabel lbl_lastName;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_position;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JSeparator separator3;
    // End of variables declaration//GEN-END:variables

    public void initManualComponents() {
        this.btn_hidePass.setVisible(false);
        input_pass.setEchoChar('*');
        input_confirmPass.setEchoChar('*');
    }
}
