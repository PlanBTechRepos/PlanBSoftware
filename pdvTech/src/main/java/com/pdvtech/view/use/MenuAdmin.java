
package com.pdvtech.view.use;

import com.pdvtech.controller.UsuarioController;
import com.pdvtech.view.component.util.PdvColors;

import javax.swing.JFrame;

public class MenuAdmin extends javax.swing.JFrame {

    public MenuAdmin() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu_Panel = new javax.swing.JPanel();
        btnMaximize = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        btnReturn = new javax.swing.JLabel();
        pageLocation_Name = new javax.swing.JLabel();
        Order_Panel = new com.pdvtech.view.component.customPanel();
        order_img = new javax.swing.JLabel();
        order_title = new javax.swing.JLabel();
        Employee_Panel = new com.pdvtech.view.component.customPanel();
        emp_img = new javax.swing.JLabel();
        emp_title1 = new javax.swing.JLabel();
        emp_title2 = new javax.swing.JLabel();
        Balance_Panel = new com.pdvtech.view.component.customPanel();
        balance_img = new javax.swing.JLabel();
        balance_title = new javax.swing.JLabel();
        Storage_Panel = new com.pdvtech.view.component.customPanel();
        storage_img = new javax.swing.JLabel();
        storage_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);

        Menu_Panel.setBackground(new java.awt.Color(153, 153, 153));

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

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/voltar.png"))); // NOI18N
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });

        pageLocation_Name.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        pageLocation_Name.setText("INÍCIO");

        Order_Panel.setBackground(new java.awt.Color(102, 102, 102));
        Order_Panel.setPreferredSize(new java.awt.Dimension(152, 134));
        Order_Panel.setRoundBottomLeft(130);
        Order_Panel.setRoundBottomRight(80);
        Order_Panel.setRoundTopLeft(60);
        Order_Panel.setRoundTopRight(100);
        Order_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Order_PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Order_PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Order_PanelMouseExited(evt);
            }
        });

        order_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ordem-de-compra.png"))); // NOI18N

        order_title.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        order_title.setForeground(new java.awt.Color(255, 255, 255));
        order_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        order_title.setText("PEDIDO");

        javax.swing.GroupLayout Order_PanelLayout = new javax.swing.GroupLayout(Order_Panel);
        Order_Panel.setLayout(Order_PanelLayout);
        Order_PanelLayout.setHorizontalGroup(
            Order_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Order_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(order_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Order_PanelLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(order_img)
                .addGap(44, 44, 44))
        );
        Order_PanelLayout.setVerticalGroup(
            Order_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Order_PanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(order_img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(order_title)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Employee_Panel.setBackground(new java.awt.Color(102, 102, 102));
        Employee_Panel.setPreferredSize(new java.awt.Dimension(152, 134));
        Employee_Panel.setRoundBottomLeft(500);
        Employee_Panel.setRoundBottomRight(80);
        Employee_Panel.setRoundTopLeft(50);
        Employee_Panel.setRoundTopRight(500);
        Employee_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Employee_PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Employee_PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Employee_PanelMouseExited(evt);
            }
        });

        emp_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cracha.png"))); // NOI18N

        emp_title1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emp_title1.setForeground(new java.awt.Color(255, 255, 255));
        emp_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emp_title1.setText("GERIR");

        emp_title2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emp_title2.setForeground(new java.awt.Color(255, 255, 255));
        emp_title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emp_title2.setText("FUNCIONÁRIO");

        javax.swing.GroupLayout Employee_PanelLayout = new javax.swing.GroupLayout(Employee_Panel);
        Employee_Panel.setLayout(Employee_PanelLayout);
        Employee_PanelLayout.setHorizontalGroup(
            Employee_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Employee_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Employee_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emp_title2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emp_title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Employee_PanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(emp_img)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        Employee_PanelLayout.setVerticalGroup(
            Employee_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Employee_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emp_img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emp_title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emp_title2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Balance_Panel.setBackground(new java.awt.Color(102, 102, 102));
        Balance_Panel.setPreferredSize(new java.awt.Dimension(152, 134));
        Balance_Panel.setRoundBottomLeft(100);
        Balance_Panel.setRoundBottomRight(600);
        Balance_Panel.setRoundTopLeft(200);
        Balance_Panel.setRoundTopRight(200);
        Balance_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Balance_PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Balance_PanelMouseExited(evt);
            }
        });

        balance_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/balanca.png"))); // NOI18N

        balance_title.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        balance_title.setForeground(new java.awt.Color(255, 255, 255));
        balance_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balance_title.setText("BALANÇO");

        javax.swing.GroupLayout Balance_PanelLayout = new javax.swing.GroupLayout(Balance_Panel);
        Balance_Panel.setLayout(Balance_PanelLayout);
        Balance_PanelLayout.setHorizontalGroup(
            Balance_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Balance_PanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(balance_img)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(Balance_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(balance_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Balance_PanelLayout.setVerticalGroup(
            Balance_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Balance_PanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(balance_img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(balance_title)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Storage_Panel.setBackground(new java.awt.Color(102, 102, 102));
        Storage_Panel.setPreferredSize(new java.awt.Dimension(152, 134));
        Storage_Panel.setRoundBottomLeft(60);
        Storage_Panel.setRoundBottomRight(300);
        Storage_Panel.setRoundTopLeft(200);
        Storage_Panel.setRoundTopRight(100);
        Storage_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Storage_PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Storage_PanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Storage_PanelMouseExited(evt);
            }
        });

        storage_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/estoque-60.png"))); // NOI18N

        storage_title.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        storage_title.setForeground(new java.awt.Color(255, 255, 255));
        storage_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storage_title.setText("ESTOQUE");

        javax.swing.GroupLayout Storage_PanelLayout = new javax.swing.GroupLayout(Storage_Panel);
        Storage_Panel.setLayout(Storage_PanelLayout);
        Storage_PanelLayout.setHorizontalGroup(
            Storage_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Storage_PanelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(storage_img)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Storage_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(storage_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Storage_PanelLayout.setVerticalGroup(
            Storage_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Storage_PanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(storage_img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(storage_title)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Menu_PanelLayout = new javax.swing.GroupLayout(Menu_Panel);
        Menu_Panel.setLayout(Menu_PanelLayout);
        Menu_PanelLayout.setHorizontalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_PanelLayout.createSequentialGroup()
                        .addComponent(pageLocation_Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMinimize)
                        .addGap(18, 18, 18)
                        .addComponent(btnMaximize)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit))
                    .addGroup(Menu_PanelLayout.createSequentialGroup()
                        .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Employee_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Order_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Storage_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Balance_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 556, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Menu_PanelLayout.setVerticalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Balance_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Menu_PanelLayout.createSequentialGroup()
                        .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMaximize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(pageLocation_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Order_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Storage_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(Employee_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(170, 170, 170))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMaximizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMousePressed
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnMaximizeMousePressed

    private void btnMinimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMousePressed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMousePressed

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        System.exit(0);
    }//GEN-LAST:event_btnExitMousePressed

    private void Order_PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Order_PanelMouseEntered
        PdvColors.setColor(Order_Panel);
    }//GEN-LAST:event_Order_PanelMouseEntered

    private void Order_PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Order_PanelMouseExited
        PdvColors.resetColor(Order_Panel);
    }//GEN-LAST:event_Order_PanelMouseExited

    private void Employee_PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Employee_PanelMouseEntered
        PdvColors.setColor(Employee_Panel);
    }//GEN-LAST:event_Employee_PanelMouseEntered

    private void Employee_PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Employee_PanelMouseExited
        PdvColors.resetColor(Employee_Panel);
    }//GEN-LAST:event_Employee_PanelMouseExited

    private void Balance_PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Balance_PanelMouseEntered
        PdvColors.setColor(Balance_Panel);
    }//GEN-LAST:event_Balance_PanelMouseEntered

    private void Balance_PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Balance_PanelMouseExited
        PdvColors.resetColor(Balance_Panel);
    }//GEN-LAST:event_Balance_PanelMouseExited

    private void Storage_PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Storage_PanelMouseEntered
        PdvColors.setColor(Storage_Panel);
    }//GEN-LAST:event_Storage_PanelMouseEntered

    private void Storage_PanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Storage_PanelMouseExited
        PdvColors.resetColor(Storage_Panel);
    }//GEN-LAST:event_Storage_PanelMouseExited

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        Login MenuL = new Login();
        UsuarioController.user.setLogin(null);
        UsuarioController.user.setSenha(null);
        UsuarioController.user.setAdm(false);
        MenuL.setVisible(true);
        MenuAdmin.this.dispose();
    }//GEN-LAST:event_btnReturnMouseClicked

    private void Order_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Order_PanelMouseClicked
        Order order = new Order();
        order.setVisible(true);
    }//GEN-LAST:event_Order_PanelMouseClicked

    private void Storage_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Storage_PanelMouseClicked
        Storage st = new Storage();
        st.setVisible(true);
    }//GEN-LAST:event_Storage_PanelMouseClicked

    private void Employee_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Employee_PanelMouseClicked
        Employees emp = new Employees();
        emp.setVisible(true);
    }//GEN-LAST:event_Employee_PanelMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.pdvtech.view.component.customPanel Balance_Panel;
    private com.pdvtech.view.component.customPanel Employee_Panel;
    private javax.swing.JPanel Menu_Panel;
    private com.pdvtech.view.component.customPanel Order_Panel;
    private com.pdvtech.view.component.customPanel Storage_Panel;
    private javax.swing.JLabel balance_img;
    private javax.swing.JLabel balance_title;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnMaximize;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel btnReturn;
    private javax.swing.JLabel emp_img;
    private javax.swing.JLabel emp_title1;
    private javax.swing.JLabel emp_title2;
    private javax.swing.JLabel order_img;
    private javax.swing.JLabel order_title;
    private javax.swing.JLabel pageLocation_Name;
    private javax.swing.JLabel storage_img;
    private javax.swing.JLabel storage_title;
    // End of variables declaration//GEN-END:variables

}
