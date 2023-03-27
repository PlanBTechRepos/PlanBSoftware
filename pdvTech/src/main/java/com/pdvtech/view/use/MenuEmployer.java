
package com.pdvtech.view.use;

import com.pdvtech.view.component.util.PdvColors;

import javax.swing.JFrame;

public class MenuEmployer extends javax.swing.JFrame {

    public MenuEmployer() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        Order_Panel.setRoundBottomLeft(300);
        Order_Panel.setRoundBottomRight(50);
        Order_Panel.setRoundTopLeft(300);
        Order_Panel.setRoundTopRight(100);
        Order_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
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
        Employee_Panel.setRoundBottomLeft(130);
        Employee_Panel.setRoundBottomRight(130);
        Employee_Panel.setRoundTopLeft(50);
        Employee_Panel.setRoundTopRight(500);
        Employee_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
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
                .addGap(45, 45, 45)
                .addComponent(emp_img)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(Employee_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Employee_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emp_title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emp_title1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 762, Short.MAX_VALUE)
                        .addComponent(btnMinimize)
                        .addGap(18, 18, 18)
                        .addComponent(btnMaximize)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit))
                    .addGroup(Menu_PanelLayout.createSequentialGroup()
                        .addComponent(Order_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(Employee_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Menu_PanelLayout.setVerticalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaximize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pageLocation_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Order_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Employee_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(344, 344, 344))
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

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
      
       new Login().setVisible(true);
       MenuEmployer.this.dispose();
    }//GEN-LAST:event_btnReturnMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEmployer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.pdvtech.view.component.customPanel Employee_Panel;
    private javax.swing.JPanel Menu_Panel;
    private com.pdvtech.view.component.customPanel Order_Panel;
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
    // End of variables declaration//GEN-END:variables
}
