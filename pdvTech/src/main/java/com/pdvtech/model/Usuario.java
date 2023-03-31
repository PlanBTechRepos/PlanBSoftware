
package com.pdvtech.model;
import com.pdvtech.util.MySQL;
import java.sql.SQLException;
import com.pdvtech.model.Funcionario;
public class Usuario {
    MySQL conn = new MySQL();

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(String nome, String cargo, int id) {
        this.func.setNome(nome);
        this.func.setCargo(cargo);
        this.func.setId_funcionario(id);
    }
 
    Funcionario func = new Funcionario();
 private int id;
 private String senha;
 private String login;
 private boolean adm;

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean getAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }
    
    public Usuario(){
        this.id = 0;
        this.login = "";
        this.senha = "";
    }
    
    public void limparUsuario (){
        this.setId(0);
        this.setLogin("");
        this.setSenha("");
}
    
    public void Login(String user, String senha) throws SQLException{
        this.conn.conectaBanco();
        try{
            String query =  "Select "
                            + "id_usuario, "
                            + "usuario, "
                            + "senha, "
                            + "permissao "
                            + "from "
                            + " usuario "
                            + "where usuario = '" + user + "' "
                            + "and senha = '" + senha + "';";
            this.conn.executarSQL(query);
            
            while (this.conn.getResultSet().next()){
                this.setId(this.conn.getResultSet().getInt(1));
                this.setLogin(this.conn.getResultSet().getString(2));
                this.setSenha(this.conn.getResultSet().getString(3));
                this.setAdm(this.conn.getResultSet().getBoolean(4));
                
            }
        }
            
            catch(SQLException ex){
                    ex.getStackTrace();
                    }
        finally{
            this.conn.fechaBanco();
        }
                            
                            
                            
        
    }
}