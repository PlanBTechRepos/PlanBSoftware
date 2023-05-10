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
    public static  Pizza pizza = new Pizza();
    
    
    public static DefaultTableModel listarOrder (){
    String columNames[] = {"Nome", "Valor" };
    DefaultTableModel model = new DefaultTableModel(columNames, 0);
    conn.conectaBanco();
    
    
    try {
        String query = 
                "Select Nome_receita, Valor from receita;";
                conn.executarSQL(query);
                while(conn.getResultSet().next()){
                    model.addRow( new String[] {
                    conn.getResultSet().getString(1),
                    String.valueOf(conn.getResultSet().getFloat(2))
                    });
                }
    }
    
    catch  (SQLException e){
        e.getMessage();
        
    }
    finally {
        conn.fechaBanco();
    }
    return model;
} 
}


    