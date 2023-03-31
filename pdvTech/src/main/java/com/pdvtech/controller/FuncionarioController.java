/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pdvtech.controller;

import com.pdvtech.util.MySQL;
import com.pdvtech.model.Funcionario;
import java.sql.SQLException;

public class FuncionarioController {
    static Funcionario funcionario = new Funcionario();
    static MySQL conn = new MySQL();

    public static Funcionario getFuncionario() {
        return funcionario;
    }

    public static void setFuncionario(Funcionario funcionario) {
        FuncionarioController.funcionario = funcionario;
    }
    
    public static void salvarFunc(String nome, String cargo){
        String[] nomeSeparado = nome.split(" ");
        conn.conectaBanco();
        try{
            String query = 
                    "call cadFunc ('"
                    + nomeSeparado[0] + "', '"
                    + nomeSeparado[nomeSeparado.length -1] + "', '"
                    + cargo + "');" ;
            conn.insertSQL(query);
        }
        catch(Exception ex){
            ex.getMessage();
        }
        finally{
            conn.fechaBanco();
        }
    }
    
    
    public static void updateFuncionario(String newName, String newLastName, String newCargo, int id_funcionario){
        conn.conectaBanco();
        try{
            String query = "update funcionario"
                    + "set nome = '" + newName + "', "
                    + "set sobreNome = '" + newLastName + "' "
                    + "set cargo = '";
        }
        catch(Exception e){
            e.getMessage();
        }
    }
   
    
    public static void viewFuncionario(String nome){
        String[] nomeSeparado = nome.split(" ");
        conn.conectaBanco();
        try{
            String query = 
                    "Select funcionario.id_funcionario, "
                    + "cargo.nome, "
                    + "usuario.nome "
                    + "from funcionario "
                    + "join usuario on usuario.id_funcionario = funcionario.id_funcionario "
                    + "join cargo on funcionario.id_cargo = cargo.id_cargo "
                    + "where funcionario.nome = '"
                    + nomeSeparado[0] + "', "
                    + "and funcionario.sobrenome = '"
                    + nomeSeparado[nomeSeparado.length - 1] + "';";
            
            conn.executarSQL(query);
            while(conn.getResultSet().next()){
                funcionario.setId_funcionario(conn.getResultSet().getInt(1));
                funcionario.setCargo(conn.getResultSet().getString(2));
            }
        }
        catch(Exception e){
            e.getMessage();
        }
        finally{
            conn.fechaBanco();
        }
        
        
        
        
        
    }
    
   

}

