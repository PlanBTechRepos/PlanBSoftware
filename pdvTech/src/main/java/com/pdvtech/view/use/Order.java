package com.pdvtech.view.use;

import com.pdvtech.controller.OrderController;
import com.pdvtech.model.Usuario;
import com.pdvtech.controller.UsuarioController;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Order extends javax.swing.JFrame {

        public Order() {
                initComponents();
                setExtendedState(MAXIMIZED_BOTH);
                initTable();
                setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/tech.png")));
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Order_Panel = new javax.swing.JPanel();
        btnReturn = new javax.swing.JLabel();
        pageLocation_Name = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        btnMaximize = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        Scrollpane_Table = new javax.swing.JScrollPane();
        Product_Table = new com.pdvtech.view.component.customTable();
        Ordering_Panel = new com.pdvtech.view.component.customPanel();
        separator1 = new javax.swing.JSeparator();
        cart_img = new javax.swing.JLabel();
        OrderData_Panel = new com.pdvtech.view.component.customPanel();
        numOrder = new javax.swing.JLabel();
        Ordering_Title = new javax.swing.JLabel();
        lbl_NumOrder = new javax.swing.JLabel();
        area_NumOrder = new com.pdvtech.view.component.customPanel();
        print_numOrder = new javax.swing.JLabel();
        lbl_ClientName = new javax.swing.JLabel();
        input_ClientName = new com.pdvtech.view.component.customTextField();
        btn_InsertOrder = new com.pdvtech.view.component.customButton();
        btn_DeleteOrder = new com.pdvtech.view.component.customButton();
        separator2 = new javax.swing.JSeparator();
        lbl_ValueOrder = new javax.swing.JLabel();
        area_ValueOrder = new com.pdvtech.view.component.customPanel();
        print_OrderPrice = new javax.swing.JLabel();
        btn_seeCart = new com.pdvtech.view.component.customButton();
        btnAdd_to_Ordering = new com.pdvtech.view.component.customButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);

        Order_Panel.setBackground(new java.awt.Color(238, 238, 238));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/voltar.png"))); // NOI18N
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });

        pageLocation_Name.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        pageLocation_Name.setForeground(new java.awt.Color(68, 68, 68));
        pageLocation_Name.setText("PEDIDOS");

        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimizar.png"))); // NOI18N
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMinimizeMousePressed(evt);
            }
        });

        btnMaximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/maximizar.png"))); // NOI18N
        btnMaximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMaximizeMousePressed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fechar.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
        });

        Product_Table.setBackground(new java.awt.Color(238, 238, 238));
        Product_Table.setModel(OrderController.listarOrder());
        Product_Table.setGridColor(new java.awt.Color(210, 210, 210));
        Product_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Product_TableMousePressed(evt);
            }
        });
        Scrollpane_Table.setViewportView(Product_Table);

        Ordering_Panel.setBackground(new java.awt.Color(84, 130, 171));
        Ordering_Panel.setRoundBottomLeft(10);
        Ordering_Panel.setRoundBottomRight(10);
        Ordering_Panel.setRoundTopLeft(10);
        Ordering_Panel.setRoundTopRight(10);

        separator1.setBackground(new java.awt.Color(51, 51, 51));
        separator1.setForeground(new java.awt.Color(255, 255, 255));

        cart_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/carrinho-32.png"))); // NOI18N

        OrderData_Panel.setBackground(new java.awt.Color(238, 238, 238));
        OrderData_Panel.setRoundBottomLeft(100);
        OrderData_Panel.setRoundBottomRight(100);
        OrderData_Panel.setRoundTopLeft(100);
        OrderData_Panel.setRoundTopRight(100);

        numOrder.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        numOrder.setForeground(new java.awt.Color(115, 162, 239));
        numOrder.setText("0");
        numOrder.setToolTipText("");

        javax.swing.GroupLayout OrderData_PanelLayout = new javax.swing.GroupLayout(OrderData_Panel);
        OrderData_Panel.setLayout(OrderData_PanelLayout);
        OrderData_PanelLayout.setHorizontalGroup(
            OrderData_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderData_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numOrder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OrderData_PanelLayout.setVerticalGroup(
            OrderData_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderData_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        Ordering_Title.setBackground(new java.awt.Color(68, 68, 68));
        Ordering_Title.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Ordering_Title.setForeground(new java.awt.Color(51, 51, 51));
        Ordering_Title.setText("Informações do pedido");
        Ordering_Title.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lbl_NumOrder.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbl_NumOrder.setForeground(new java.awt.Color(255, 255, 255));
        lbl_NumOrder.setText("Número do pedido");

        area_NumOrder.setBackground(new java.awt.Color(115, 162, 239));
        area_NumOrder.setRoundBottomLeft(10);
        area_NumOrder.setRoundBottomRight(10);
        area_NumOrder.setRoundTopLeft(10);
        area_NumOrder.setRoundTopRight(10);

        print_numOrder.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        print_numOrder.setForeground(new java.awt.Color(255, 255, 255));
        print_numOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        print_numOrder.setText("0000");

        javax.swing.GroupLayout area_NumOrderLayout = new javax.swing.GroupLayout(area_NumOrder);
        area_NumOrder.setLayout(area_NumOrderLayout);
        area_NumOrderLayout.setHorizontalGroup(
            area_NumOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, area_NumOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(print_numOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        area_NumOrderLayout.setVerticalGroup(
            area_NumOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, area_NumOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(print_numOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbl_ClientName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbl_ClientName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ClientName.setText("Nome do cliente");

        input_ClientName.setForeground(new java.awt.Color(255, 255, 255));
        input_ClientName.setToolTipText("");
        input_ClientName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        input_ClientName.setRound(10);

        btn_InsertOrder.setBackground(new java.awt.Color(51, 51, 51));
        btn_InsertOrder.setBorder(null);
        btn_InsertOrder.setForeground(new java.awt.Color(255, 255, 255));
        btn_InsertOrder.setText("Inserir Pedido");
        btn_InsertOrder.setBorderColor(new java.awt.Color(84, 130, 171));
        btn_InsertOrder.setColor(new java.awt.Color(51, 51, 51));
        btn_InsertOrder.setColorClick(new java.awt.Color(51, 51, 51));
        btn_InsertOrder.setColorOver(new java.awt.Color(115, 162, 239));
        btn_InsertOrder.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_InsertOrder.setMaximumSize(new java.awt.Dimension(224, 50));
        btn_InsertOrder.setMinimumSize(new java.awt.Dimension(224, 50));
        btn_InsertOrder.setPreferredSize(new java.awt.Dimension(224, 50));
        btn_InsertOrder.setRadius(12);
        btn_InsertOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertOrderActionPerformed(evt);
            }
        });

        btn_DeleteOrder.setBackground(new java.awt.Color(51, 51, 51));
        btn_DeleteOrder.setBorder(null);
        btn_DeleteOrder.setForeground(new java.awt.Color(255, 255, 255));
        btn_DeleteOrder.setText("Cancelar Pedido");
        btn_DeleteOrder.setBorderColor(new java.awt.Color(84, 130, 171));
        btn_DeleteOrder.setColor(new java.awt.Color(51, 51, 51));
        btn_DeleteOrder.setColorClick(new java.awt.Color(51, 51, 51));
        btn_DeleteOrder.setColorOver(new java.awt.Color(115, 162, 239));
        btn_DeleteOrder.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_DeleteOrder.setPreferredSize(new java.awt.Dimension(115, 50));
        btn_DeleteOrder.setRadius(12);
        btn_DeleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteOrderActionPerformed(evt);
            }
        });

        separator2.setBackground(new java.awt.Color(255, 255, 255));
        separator2.setForeground(new java.awt.Color(255, 255, 255));

        lbl_ValueOrder.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbl_ValueOrder.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ValueOrder.setText("Valor do pedido");

        area_ValueOrder.setBackground(new java.awt.Color(115, 162, 239));
        area_ValueOrder.setRoundBottomLeft(10);
        area_ValueOrder.setRoundBottomRight(10);
        area_ValueOrder.setRoundTopLeft(10);
        area_ValueOrder.setRoundTopRight(10);

        print_OrderPrice.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        print_OrderPrice.setForeground(new java.awt.Color(255, 255, 255));
        print_OrderPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        print_OrderPrice.setText("R$ 000,00");

        javax.swing.GroupLayout area_ValueOrderLayout = new javax.swing.GroupLayout(area_ValueOrder);
        area_ValueOrder.setLayout(area_ValueOrderLayout);
        area_ValueOrderLayout.setHorizontalGroup(
            area_ValueOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, area_ValueOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(print_OrderPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        area_ValueOrderLayout.setVerticalGroup(
            area_ValueOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, area_ValueOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(print_OrderPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_seeCart.setBackground(new java.awt.Color(51, 51, 51));
        btn_seeCart.setBorder(null);
        btn_seeCart.setForeground(new java.awt.Color(255, 255, 255));
        btn_seeCart.setText("VER CARRINHO");
        btn_seeCart.setBorderColor(new java.awt.Color(84, 130, 171));
        btn_seeCart.setColor(new java.awt.Color(51, 51, 51));
        btn_seeCart.setColorClick(new java.awt.Color(51, 51, 51));
        btn_seeCart.setColorOver(new java.awt.Color(115, 162, 239));
        btn_seeCart.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_seeCart.setMaximumSize(new java.awt.Dimension(224, 50));
        btn_seeCart.setMinimumSize(new java.awt.Dimension(224, 50));
        btn_seeCart.setPreferredSize(new java.awt.Dimension(224, 50));
        btn_seeCart.setRadius(12);
        btn_seeCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seeCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Ordering_PanelLayout = new javax.swing.GroupLayout(Ordering_Panel);
        Ordering_Panel.setLayout(Ordering_PanelLayout);
        Ordering_PanelLayout.setHorizontalGroup(
            Ordering_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ordering_PanelLayout.createSequentialGroup()
                .addGroup(Ordering_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ordering_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Ordering_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ordering_PanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Ordering_PanelLayout.createSequentialGroup()
                        .addGroup(Ordering_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Ordering_PanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(Ordering_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_ClientName)
                                    .addComponent(lbl_NumOrder)
                                    .addComponent(area_NumOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Ordering_PanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(input_ClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(Ordering_PanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(cart_img)
                                .addGap(0, 0, 0)
                                .addComponent(OrderData_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Ordering_Title)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ordering_PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Ordering_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ordering_PanelLayout.createSequentialGroup()
                        .addGroup(Ordering_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_ValueOrder)
                            .addComponent(area_ValueOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ordering_PanelLayout.createSequentialGroup()
                        .addComponent(btn_seeCart, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ordering_PanelLayout.createSequentialGroup()
                        .addGroup(Ordering_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_InsertOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_DeleteOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
        );
        Ordering_PanelLayout.setVerticalGroup(
            Ordering_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ordering_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Ordering_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ordering_PanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(cart_img))
                    .addComponent(OrderData_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ordering_Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_NumOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(area_NumOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lbl_ClientName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(input_ClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btn_InsertOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_DeleteOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(lbl_ValueOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(area_ValueOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btn_seeCart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btn_InsertOrder.getAccessibleContext().setAccessibleName("INSERIR ");

        btnAdd_to_Ordering.setBackground(new java.awt.Color(51, 51, 51));
        btnAdd_to_Ordering.setBorder(null);
        btnAdd_to_Ordering.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd_to_Ordering.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/duplo-direita-branco.png"))); // NOI18N
        btnAdd_to_Ordering.setBorderColor(new java.awt.Color(238, 238, 238));
        btnAdd_to_Ordering.setColor(new java.awt.Color(51, 51, 51));
        btnAdd_to_Ordering.setColorClick(new java.awt.Color(51, 51, 51));
        btnAdd_to_Ordering.setColorOver(new java.awt.Color(115, 162, 239));
        btnAdd_to_Ordering.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd_to_Ordering.setRadius(12);
        btnAdd_to_Ordering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_to_OrderingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Order_PanelLayout = new javax.swing.GroupLayout(Order_Panel);
        Order_Panel.setLayout(Order_PanelLayout);
        Order_PanelLayout.setHorizontalGroup(
            Order_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Order_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Order_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Order_PanelLayout.createSequentialGroup()
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pageLocation_Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMinimize)
                        .addGap(18, 18, 18)
                        .addComponent(btnMaximize)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit))
                    .addGroup(Order_PanelLayout.createSequentialGroup()
                        .addComponent(Scrollpane_Table, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdd_to_Ordering, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ordering_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Order_PanelLayout.setVerticalGroup(
            Order_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Order_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Order_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaximize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pageLocation_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Order_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Order_PanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Order_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ordering_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Scrollpane_Table, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Order_PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd_to_Ordering, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Order_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Order_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        

        private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnReturnMouseClicked
                Usuario user = new Usuario();
                if (user.getAdm()) {
                        MenuAdmin adm = new MenuAdmin();
                        adm.requestFocus();
                } else {
                        MenuEmployer emp = new MenuEmployer();
                        emp.requestFocus();
                }
                this.dispose();
        }// GEN-LAST:event_btnReturnMouseClicked

        private void btnMinimizeMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnMinimizeMousePressed
                this.setExtendedState(JFrame.ICONIFIED);
        }// GEN-LAST:event_btnMinimizeMousePressed

        private void btnMaximizeMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnMaximizeMousePressed
                this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }// GEN-LAST:event_btnMaximizeMousePressed

        private void btnExitMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnExitMousePressed
                this.dispose();
        }// GEN-LAST:event_btnExitMousePressed

        private void btnAdd_to_OrderingActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAdd_to_OrderingActionPerformed
                if (input_ClientName.getText().isBlank())
                        JOptionPane.showMessageDialog(rootPane, "Altere o nome do cliente");
                else {
                        int row = Product_Table.getSelectedRow();
                        DefaultTableModel model = (DefaultTableModel) Product_Table.getModel();
                        System.out.println(row);
                        OrderController.pizzas.add((String) model.getValueAt(row, 0));
                        OrderController.values.add(Float.parseFloat((String) model.getValueAt(row, 1)));
                        sumItems(Float.parseFloat((String) model.getValueAt(row, 1)));
                        numOrder.setText(String.valueOf(OrderController.pizzas.size()));
                     System.out.println(OrderController.pizzas);  
                     System.out.println(OrderController.values);
                }
        }// GEN-LAST:event_btnAdd_to_OrderingActionPerformed

        private void btn_InsertOrderActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_InsertOrderActionPerformed
                OrderController oc = new OrderController();
                if (input_ClientName.getText().isBlank())
                        JOptionPane.showMessageDialog(rootPane, "Altere o nome do cliente");
                else {
                        oc.setPedido(UsuarioController.user.getId(), input_ClientName.getText());
                        print_numOrder
                                        .setText(String.valueOf(oc.getPedido(UsuarioController.user.getId(),
                                                        input_ClientName.getText())));
                }
        }// GEN-LAST:event_btn_InsertOrderActionPerformed

        private void btn_DeleteOrderActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_DeleteOrderActionPerformed
                // TODO: CANCELAR PEDIDO
                OrderController.pizzas.clear();
                OrderController.values.clear();
                
                this.input_ClientName.setText("");
                this.numOrder.setText("0");
                this.print_OrderPrice.setText("R$ 000,00");
        }// GEN-LAST:event_btn_DeleteOrderActionPerformed

        private void btn_seeCartActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_seeCartActionPerformed
                Shopping_Cart sc = new Shopping_Cart(this, rootPaneCheckingEnabled);
                sc.setInfo(this.input_ClientName.getText());
                sc.addWindowListener(new WindowAdapter(){
                    @Override
                    public void windowClosed(WindowEvent ev){
                        System.out.println("Fechado");
                        Product_Table.setModel(OrderController.listarOrder());
                    }
                });
                sc.setVisible(true);
        }// GEN-LAST:event_btn_seeCartActionPerformed

        private void Product_TableMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Product_TableMousePressed

        }// GEN-LAST:event_Product_TableMousePressed

        private void sumItems(float item) {
                DecimalFormat df = new DecimalFormat("0.00");
                double valor = Float.parseFloat(print_OrderPrice.getText().substring(3).replace(',', '.'));
                double soma = valor + item;
                String res = df.format(soma);
                print_OrderPrice.setText("R$ " + res);
        }

        public static void main(String args[]) {

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Order().setVisible(true);
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.pdvtech.view.component.customPanel OrderData_Panel;
    private javax.swing.JPanel Order_Panel;
    private com.pdvtech.view.component.customPanel Ordering_Panel;
    private javax.swing.JLabel Ordering_Title;
    private static com.pdvtech.view.component.customTable Product_Table;
    private javax.swing.JScrollPane Scrollpane_Table;
    private com.pdvtech.view.component.customPanel area_NumOrder;
    private com.pdvtech.view.component.customPanel area_ValueOrder;
    private com.pdvtech.view.component.customButton btnAdd_to_Ordering;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnMaximize;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel btnReturn;
    private com.pdvtech.view.component.customButton btn_DeleteOrder;
    private com.pdvtech.view.component.customButton btn_InsertOrder;
    private com.pdvtech.view.component.customButton btn_seeCart;
    private javax.swing.JLabel cart_img;
    private com.pdvtech.view.component.customTextField input_ClientName;
    private javax.swing.JLabel lbl_ClientName;
    private javax.swing.JLabel lbl_NumOrder;
    private javax.swing.JLabel lbl_ValueOrder;
    private javax.swing.JLabel numOrder;
    private javax.swing.JLabel pageLocation_Name;
    private javax.swing.JLabel print_OrderPrice;
    private javax.swing.JLabel print_numOrder;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    // End of variables declaration//GEN-END:variables

        private void initTable() {

                Product_Table.fixTable(Scrollpane_Table);
                Product_Table.setModel(OrderController.listarOrder());
                DefaultTableModel model = (DefaultTableModel) Product_Table.getModel();

                // TESTE: Dados teste na tabela

        }

}
