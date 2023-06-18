/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pdvtech.controller;

import com.pdvtech.util.MySQL;
import com.pdvtech.model.Pizza;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author limal
 */
public class OrderController {

    static MySQL conn = new MySQL();
    public static Pizza pizza = new Pizza();

    public static DefaultTableModel listarOrder() {
        String columNames[] = {"Nome", "Valor"};
        DefaultTableModel model = new DefaultTableModel(columNames, 0);
        conn.conectaBanco();

        try {
            String query
                    = "Select DISTINCT Nome_receita, Valor from receita;";
            conn.executarSQL(query);
            while (conn.getResultSet().next()) {
                model.addRow(new String[]{
                    conn.getResultSet().getString(1),
                    String.valueOf(conn.getResultSet().getFloat(2))
                });
            }
        } catch (SQLException e) {
            e.getMessage();

        } finally {
            conn.fechaBanco();
        }
        return model;
    }

    public void setPedido(int idFunc, String nomeCl) {
        String query = "INSERT INTO pedido (id_Funcionario, Cliente) VALUES (" + idFunc + ", '" + nomeCl + "');";
        System.out.println(query);
        conn.conectaBanco();
        try {
            conn.insertSQL(query);
        } catch (Exception e) {
            e.getMessage();
        } finally {
            conn.fechaBanco();
        }
    }
    
    public int getPedido(int idFunc, String nomeCl){
        String query = "SELECT MAX(id_Pedido) FROM pedido WHERE Cliente LIKE '"+ nomeCl +"' AND id_Funcionario = "+ idFunc +" LIMIT 1;";
        int idPedido = 0;
        conn.conectaBanco();
        try {
            conn.executarSQL(query);
            while (conn.getResultSet().next()) {
                idPedido = conn.getResultSet().getInt(1);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            conn.fechaBanco();
        }
        return idPedido;
    }

}
