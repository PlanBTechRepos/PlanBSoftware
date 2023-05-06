
package com.pdvtech.view.use;

public class AddEmployee_Dialog extends javax.swing.JDialog {

    public AddEmployee_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        customTextField1 = new com.pdvtech.view.component.customTextField();
        jLabel2 = new javax.swing.JLabel();
        customTextField2 = new com.pdvtech.view.component.customTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        customButton1 = new com.pdvtech.view.component.customButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Register_Panel.setBackground(new java.awt.Color(153, 153, 153));

        Account_Panel.setBackground(new java.awt.Color(80, 80, 80));
        Account_Panel.setRoundBottomLeft(500);
        Account_Panel.setRoundTopLeft(150);
        Account_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user.setText("Usuário");
        Account_Panel.add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 41, -1, -1));

        input_user.setBackground(new java.awt.Color(80, 80, 80));
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

        input_pass.setBackground(new java.awt.Color(80, 80, 80));
        input_pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_pass.setForeground(new java.awt.Color(255, 255, 255));
        input_pass.setBorder(null);
        Account_Panel.add(input_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 141, 184, 40));

        input_confirmPass.setBackground(new java.awt.Color(80, 80, 80));
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
        btn_register.setBorderColor(new java.awt.Color(51, 51, 51));
        btn_register.setColor(new java.awt.Color(51, 51, 51));
        btn_register.setColorClick(new java.awt.Color(51, 51, 51));
        btn_register.setColorOver(new java.awt.Color(115, 162, 239));
        btn_register.setRadius(20);
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        Account_Panel.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 190, 50));

        btn_showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mostrar.png"))); // NOI18N
        Account_Panel.add(btn_showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        btn_hidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/esconder.png"))); // NOI18N
        Account_Panel.add(btn_hidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fechar.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
        });
        Account_Panel.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");

        customTextField1.setRound(8);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sobrenome");

        customTextField2.setRound(8);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cargo");

        jComboBox1.setBackground(new java.awt.Color(80, 80, 80));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "Cargo X", "Cargo Y", "Cargo Z" }));
        jComboBox1.setBorder(null);

        customButton1.setBackground(new java.awt.Color(51, 51, 51));
        customButton1.setBorder(null);
        customButton1.setForeground(new java.awt.Color(255, 255, 255));
        customButton1.setText("Limpar");
        customButton1.setBorderColor(new java.awt.Color(51, 51, 51));
        customButton1.setColor(new java.awt.Color(51, 51, 51));
        customButton1.setColorClick(new java.awt.Color(51, 51, 51));
        customButton1.setColorOver(new java.awt.Color(115, 162, 239));
        customButton1.setRadius(8);

        javax.swing.GroupLayout Register_PanelLayout = new javax.swing.GroupLayout(Register_Panel);
        Register_Panel.setLayout(Register_PanelLayout);
        Register_PanelLayout.setHorizontalGroup(
            Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Register_PanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(customTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(Account_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Register_PanelLayout.setVerticalGroup(
            Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Account_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
            .addGroup(Register_PanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(customButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        //TODO: Registrar novo funcionário
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        System.exit(0);
    }//GEN-LAST:event_btnExitMousePressed

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
    private javax.swing.JPanel Menu_Panel;
    private javax.swing.JLabel Menu_Title;
    private javax.swing.JPanel Register_Panel;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btn_hidePass;
    private com.pdvtech.view.component.customButton btn_register;
    private javax.swing.JLabel btn_showPass;
    private com.pdvtech.view.component.customButton customButton1;
    private com.pdvtech.view.component.customTextField customTextField1;
    private com.pdvtech.view.component.customTextField customTextField2;
    private javax.swing.JPasswordField input_confirmPass;
    private javax.swing.JPasswordField input_pass;
    private javax.swing.JTextField input_user;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblConfirm_password;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JSeparator separator3;
    // End of variables declaration//GEN-END:variables
}
