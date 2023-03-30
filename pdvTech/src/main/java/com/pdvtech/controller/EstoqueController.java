/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pdvtech.controller;
import com.pdvtech.model.Estoque;
import com.pdvtech.util.MySQL;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yago_
 */
public class EstoqueController {
   static MySQL conn = new MySQL();
   static  Estoque estoque = new Estoque();
    
    public static void salvaEstoque(String id, int qtd, String nome, float valor){
        conn.conectaBanco();
        if(!id.equals("")){
        try{
            String query = 
                    "call updateEstoque("
                    + id + ", "
                    + qtd + ", '"
                    + nome + "', "
                    + valor 
                    + ");";
            conn.executarSQL(query);
            
        }
        catch(Exception e){
        e.getMessage();
    }
        finally{
            conn.fechaBanco();
        }
        }
        else{
            try{
             String query = 
                     "call insertEstoque("
                     + qtd + ", '"
                     + nome + "', "
                     + valor + ");";
             
             conn.executarSQL(query);
            }
            catch(Exception e){
                e.getMessage();
            }
            finally{
                conn.fechaBanco();
            }
        }
    }
    
    public static DefaultTableModel ListaEstoque (){
        String columNames[] = {"Codigo", "Nome", "Quantidade", "Data de Entreda", "Vencimento", "Valor"};
        DefaultTableModel model = new DefaultTableModel(columNames, 0);
        conn.conectaBanco();
        try{
            String query = 
                    "Select id_Produto, "
                    + "ingredientes.nome, "
                    + "Quantidade, "
                    + "Recebimento, "
                    + "Vencimento, "
                    + "Valor_de_Compra "
                    + "from "
                    + "estoque "
                    + "join ingredientes on ingredientes.id_ingrediente = estoque.tipo_Ingrediente;";
            conn.executarSQL(query);
            while(conn.getResultSet().next()){
                model.addRow( new String[]{
                    Integer.toString(conn.getResultSet().getInt(1)),
                    conn.getResultSet().getString(2),
                    Integer.toString(conn.getResultSet().getInt(3)),
                    conn.getResultSet().getString(4),
                    conn.getResultSet().getString(5),
                    String.valueOf(conn.getResultSet().getFloat(6))
                    
                 
            });
                
            }
            
                    
        }
        catch(Exception e){
            e.getMessage();
        }
        finally{
            conn.fechaBanco();
        }
        return model; 
    }
    
    public static Estoque view(String nome){
        conn.conectaBanco();
        try{
            String query = 
                    "Select id_Produto, "
                    + "Valor_de_Compra, "
                    + "Quantidade, "
                    + "vencimento "
                    + "from estoque "
                    + "join ingredientes on ingredientes.id_ingrediente = estoque.tipo_ingrediente "
                    + "where ingredientes.nome = '" + nome + "';";
            
            conn.executarSQL(query);
            
            while(conn.getResultSet().next()){
                estoque.setId(conn.getResultSet().getInt(1));
                estoque.setValor(conn.getResultSet().getFloat(2));
                estoque.setQuantidade(conn.getResultSet().getInt(3));
                estoque.setVencimento(conn.getResultSet().getString(4));              
            }
        }
        catch(Exception e){
            e.getMessage();
        }
        finally{
        conn.fechaBanco();
    }
        return estoque;
    }
    
    
    
    
}
