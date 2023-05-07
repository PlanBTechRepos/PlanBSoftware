/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pdvtech.controller;

import com.pdvtech.util.MySQL;
import com.pdvtech.view.Pedido;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author limal
 */
public class OrderController {
    static MySQL conn = new MySQL();
    public static  Pedido estoque = new Pedido();
    
    public static void Pedido (String Nome_receita, float Valor) {
            conn.conectaBanco();
            try{
                String query = "CALL buscaReceita ("
                        + Nome_receita + ", "
                        + "'" + Valor  + ", "
                        + ");";
                
                conn.executarSQL(query);
                
            }
            catch(Exception e) {
            e.getMessage();
            }
            finally {
                conn.fechaBanco();
            }
    }
    
    /*public static DefaultTableModel listarOrder (){
    String columNames[] = {"Nome", "Valor" };
    DefaultTableModel model = new DefaultTableModel(columNames, 0);
    conn.conectaBanco();
    
    
    



} */
}


    