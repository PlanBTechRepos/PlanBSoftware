
package com.pdvtech.view.use;

import com.pdvtech.util.MySQL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class EditEmployee_Dialog extends javax.swing.JDialog {
    MySQL conn = new MySQL();
    public EditEmployee_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initManualComponents();
    }

    public void setView(String nome){
        this.conn.conectaBanco();
        String[] name = nome.split(" ");
        try{
            String query = 
                    "Select cargos.nome, usuario.usuario "
                    + "from funcionario "
                    + "join usuario on usuario.id_funcionario = funcionario.id_funcionario "
                    + "join cargos on funcionario.id_cargo = cargos.id_Cargo "
                    + "where funcionario.nome = '"
                    + name[0] + "' "
                    + "and "
                    + "funcionario.sobrenome = '"
                    + name[1] + "';";
            
           this.conn.executarSQL(query);
           
           while(this.conn.getResultSet().next()){
               this.input_name.setText(name[0]);
               this.input_lastName.setText(name[1]);
               this.input_position.setSelectedItem(this.conn.getResultSet().getString(1));
               this.print_user.setText(this.conn.getResultSet().getString(2));
           }
        }
        catch(Exception e){
            e.getMessage();
        }
    }
    private List<String> getCargos(){
        this.conn.conectaBanco();
        List<String> listCargo = new ArrayList<String>();
        try{
            String query =
                    "Select "
                    + "nome from "
                    + "cargos;";
            this.conn.executarSQL(query);
            while(this.conn.getResultSet().next()){
                listCargo.add(this.conn.getResultSet().getString(1));
            }
        }
        catch(Exception e){
            e.getMessage();
        }
        return listCargo;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Register_Panel = new javax.swing.JPanel();
        Account_Panel = new com.pdvtech.view.component.customPanel();
        lbl_user = new javax.swing.JLabel();
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
        print_user = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        input_name = new com.pdvtech.view.component.customTextField();
        lbl_lastName = new javax.swing.JLabel();
        input_lastName = new com.pdvtech.view.component.customTextField();
        lbl_position = new javax.swing.JLabel();
        input_position = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Register_Panel.setBackground(new java.awt.Color(153, 153, 153));

        Account_Panel.setBackground(new java.awt.Color(80, 80, 80));
        Account_Panel.setRoundBottomLeft(500);
        Account_Panel.setRoundTopLeft(150);
        Account_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user.setText("Usuário");
        Account_Panel.add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 41, -1, -1));

        lbl_password.setForeground(new java.awt.Color(255, 255, 255));
        lbl_password.setText("Nova senha");
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
        btn_register.setText("Alterar");
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

        print_user.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        print_user.setForeground(new java.awt.Color(255, 255, 255));
        print_user.setText("user123_example");
        Account_Panel.add(print_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 180, 40));

        lbl_name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name.setText("Nome");

        input_name.setForeground(new java.awt.Color(255, 255, 255));
        input_name.setRound(8);

        lbl_lastName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_lastName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_lastName.setText("Sobrenome");

        input_lastName.setForeground(new java.awt.Color(255, 255, 255));
        input_lastName.setRound(8);

        lbl_position.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_position.setForeground(new java.awt.Color(255, 255, 255));
        lbl_position.setText("Cargo");

        input_position.setBackground(new java.awt.Color(80, 80, 80));
        input_position.setForeground(new java.awt.Color(255, 255, 255));
        input_position.setModel(new DefaultComboBoxModel<String>(getCargos().toArray(new String[0])));
        input_position.setBorder(null);

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
                    .addComponent(input_position, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(Account_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Register_PanelLayout.setVerticalGroup(
            Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Account_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
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
                .addGap(27, 150, Short.MAX_VALUE))
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
        System.out.println(this.input_name.getText() + " " + this.input_lastName.getText() + "" +
                this.input_position.getSelectedItem());
        if(this.input_pass.getText().isEmpty() && this.input_confirmPass.getText().isEmpty()){
            System.out.println("Passei aqui");
             try{
            this.conn.conectaBanco();
            String query = 
                    "Call updateFunc('pass', '"
                    + String.valueOf(this.input_position.getSelectedItem()) + "', '"
                    + this.input_name.getText() + "', '"
                    + this.input_lastName.getText() + "');" ;
            this.conn.executarSQL(query);
                    
        }
        catch(Exception e){
            e.getMessage();
        }
             finally{
                 this.conn.fechaBanco();
                 EditEmployee_Dialog.this.dispose();
             }
        }
        
        else if(this.input_pass.getText().equals(this.input_confirmPass.getText())){
        try{
            this.conn.conectaBanco();
            String query = 
                    "Call updateFunc('"
                    + this.input_confirmPass.getText() + "', '"
                    + String.valueOf(this.input_position.getSelectedItem()) + "', '"
                    + this.input_name.getText() + "', '"
                    + this.input_lastName.getText() + "');" ;
            this.conn.executarSQL(query);
                    
        }
        catch(Exception e){
            e.getMessage();
        }
        finally{
                 this.conn.fechaBanco();
                 EditEmployee_Dialog.this.dispose();
             }
        }
        
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        EditEmployee_Dialog.this.dispose();
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditEmployee_Dialog dialog = new EditEmployee_Dialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel btn_hidePass;
    private com.pdvtech.view.component.customButton btn_register;
    private javax.swing.JLabel btn_showPass;
    private javax.swing.JPasswordField input_confirmPass;
    private com.pdvtech.view.component.customTextField input_lastName;
    private com.pdvtech.view.component.customTextField input_name;
    private javax.swing.JPasswordField input_pass;
    private javax.swing.JComboBox<String> input_position;
    private javax.swing.JLabel lblConfirm_password;
    private javax.swing.JLabel lbl_lastName;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_position;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JLabel print_user;
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
