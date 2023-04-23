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
   public static  Estoque estoque = new Estoque();
    
    public static void addEstoque(int qtd, String nome, String ingrediente, float valor, String validade, boolean border){
        conn.conectaBanco();
        try{
             String query = "CALL insertEstoque("
                     + qtd + ", "
                     + "'" + nome + "', "
                     + "'" + ingrediente + "', "
                     + valor +", "
                     + "'" + validade + "', "
                     + border + ");";
             
             conn.executarSQL(query);
            }
            catch(Exception e){
                e.getMessage();
            }
            finally{
                conn.fechaBanco();
            }
        
    }
    
    public static void editEstoque(int id, String nome, int qtd, float price){
        conn.conectaBanco();
        System.out.println("Teste1");
        try{
            String query =
                    "call UPDATEEstoque("
                    + id + ", "
                    + qtd + ", '"
                    + nome + "', "
                    + price
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
    
    public static void deletaProduto(int id){
        conn.conectaBanco();
        try{
            String query = 
                    "delete from estoque "
                    + "where id_Produto = " + id + ";";
            conn.updateSQL(query);
        }
        catch(Exception e){
            e.getMessage();
        }
        finally{
            conn.fechaBanco();
        }
    }
    
    public static DefaultTableModel listaEstoque (){
        String columNames[] = {"Codigo", "Nome", "Quantidade", "Data de Entreda", "Vencimento", "Valor", "Ação"};
        DefaultTableModel model = new DefaultTableModel(columNames, 0);
        conn.conectaBanco();
        try{
            String query = 
                    "Select id_Produto, "
                    + "estoque.nome, "
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
                estoque.setNome(nome);
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
