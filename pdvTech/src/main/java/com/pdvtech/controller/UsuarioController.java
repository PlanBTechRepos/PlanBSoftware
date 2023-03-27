
package com.pdvtech.controller;

import com.pdvtech.util.MySQL;
import com.pdvtech.model.Usuario;
import java.sql.SQLException;
public class UsuarioController {
    
    public  MySQL conn;
    public static Usuario user = new Usuario();

    public static Usuario getUser() {
        return user;
    }

    public static void setUser(Usuario user) {
        UsuarioController.user = user;
    }
    
   
    public static void Login(String user, String senha){
        
    }
    /*
    Métodos:
    */
   
    
    
    /*
    save
    update
    getAll
    removeById
    */
}
