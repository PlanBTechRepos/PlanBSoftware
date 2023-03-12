
package com.pdvtech.view;
import com.pdvtech.util.MySQL;
import com.pdvtech.model.Usuario;
import javax.swing.JOptionPane;

public class Login_old extends javax.swing.JFrame {
    Usuario usuarioLogin = new Usuario ();
    Usuario novoUsuario = new Usuario();
    MySQL conectar = new MySQL();


    public Login_old() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login_Panel = new javax.swing.JPanel();
        btnMaximize = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        Form_Panel = new com.pdvtech.view.component.customPanel();
        btnSubmit = new com.pdvtech.view.component.customButton();
        input_Pass = new javax.swing.JPasswordField();
        input_User = new com.pdvtech.view.component.customTextField();
        error_User = new javax.swing.JLabel();
        error_Pass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Login_Panel.setBackground(new java.awt.Color(153, 153, 153));

        btnMaximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/maximizar.png"))); // NOI18N

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimizar.png"))); // NOI18N

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fechar.png"))); // NOI18N

        Form_Panel.setRoundBottomLeft(800);
        Form_Panel.setRoundBottomRight(200);
        Form_Panel.setRoundTopLeft(300);
        Form_Panel.setRoundTopRight(800);

        btnSubmit.setText("LOG IN");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        input_Pass.setBackground(new java.awt.Color(60, 63, 65));
        input_Pass.setToolTipText("Digite sua senha");
        input_Pass.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

        input_User.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário"));
        input_User.setToolTipText("Digite seu usuário");

        error_User.setOpaque(true);

        javax.swing.GroupLayout Form_PanelLayout = new javax.swing.GroupLayout(Form_Panel);
        Form_Panel.setLayout(Form_PanelLayout);
        Form_PanelLayout.setHorizontalGroup(
            Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Form_PanelLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(input_User, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_Pass, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(error_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(error_Pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addGap(134, 134, 134))
        );
        Form_PanelLayout.setVerticalGroup(
            Form_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Form_PanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(input_User, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error_User)
                .addGap(18, 18, 18)
                .addComponent(input_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error_Pass)
                .addGap(27, 27, 27)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Login_PanelLayout = new javax.swing.GroupLayout(Login_Panel);
        Login_Panel.setLayout(Login_PanelLayout);
        Login_PanelLayout.setHorizontalGroup(
            Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_PanelLayout.createSequentialGroup()
                .addContainerGap(1171, Short.MAX_VALUE)
                .addComponent(btnMinimize)
                .addGap(18, 18, 18)
                .addComponent(btnMaximize)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap())
            .addGroup(Login_PanelLayout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(Form_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Login_PanelLayout.setVerticalGroup(
            Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaximize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(Form_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
       
        
        // coloquei como old porque movi o que tinha feito
        
        
        this.conectar.conectaBanco();
        boolean sucesso = false;
        try{
            String query = "SELECT "
                    + "id, "
                    + "login, "
                    + "senha "
                    + "FROM usuario "
                    + "WHERE usuario = '" + this.input_User.getText() + "' "
                    + "AND senha = '" + this.input_Pass.getText() + "';";
            this.conectar.executarSQL(query);
            
            while (this.conectar.getResultSet().next()) {
                novoUsuario.setId(this.conectar.getResultSet().getInt(1));
                novoUsuario.setLogin(this.conectar.getResultSet().getString(2));
                novoUsuario.setAdm(this.conectar.getResultSet().getBoolean(3));
            }
            if (novoUsuario.getLogin().equals("")){
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
            } else {
                sucesso = true;
            }
        } catch (Exception e) {
            System.out.println("Erro ao efetuar login! " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao efetuar login!");
            
        } finally {
            // o codigo abaixo está comentado para não dar erro
           // setLoginUsuario(this.usuarioLogin);
            this.conectar.fechaBanco();
            if(sucesso){
                if(this.usuarioLogin.getAdm()){
                    new MenuFunci().setVisible(true);
                } else {
                    new MenuADM().setVisible(true);
                }
                Login_old.this.dispose();
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_old().setVisible(true);
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
    private javax.swing.JLabel error_Pass;
    private javax.swing.JLabel error_User;
    private javax.swing.JPasswordField input_Pass;
    private com.pdvtech.view.component.customTextField input_User;
    // End of variables declaration//GEN-END:variables
}
