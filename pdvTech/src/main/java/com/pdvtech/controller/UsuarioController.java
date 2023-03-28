
package com.pdvtech.controller;

import com.pdvtech.util.MySQL;
import com.pdvtech.model.Usuario;

public class UsuarioController {
    static MySQL conn = new MySQL();
 
    public static Usuario user = new Usuario();

    public static Usuario getUser() {
        return user;
    }

    public static void setUser(Usuario user) {
        UsuarioController.user = user;
    }
    
  
    /*
    Métodos:
    */
   
    
    
    /*
    save
    */
    public static void  salvarUsuario(String nome,String user, String senha, int permissao){
        String[] nomeSeparado = nome.split(" ");
        conn.conectaBanco();
        try{
            String query =    "call cadUsuario ('"
                            + nomeSeparado[0] + "', '"
                            + nomeSeparado[nomeSeparado.length -1] + "', '"
                            + user + "', '"
                            + senha + "', "
                            + permissao + ");";
            conn.insertSQL(query);
        }
        catch(Exception e){
            e.getMessage();
        }
        finally {
            conn.fechaBanco();
        }
    }
    
    
    
    /*
    update
    getAll
    removeById
    */
}
