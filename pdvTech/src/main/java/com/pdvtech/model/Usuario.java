
package com.pdvtech.model;

public class Usuario {
 private int Id;
 private String senha;
 private String login;
 private boolean adm;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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
        this.Id = 0;
        this.login = "";
        this.senha = "";
    }
    
    public void limparUsuario (){
        this.setId(0);
        this.setLogin("");
        this.setSenha("");
}
}