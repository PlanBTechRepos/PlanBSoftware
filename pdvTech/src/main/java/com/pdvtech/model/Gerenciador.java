/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pdvtech.model;

/**
 *
 * @author limal
 */
public class Gerenciador {
    public static int idLogado;
    public static Usuario usuarioLogado;

    public static int getIdLogado() {
        return idLogado;
    }

    public static void setIdLogado(int idLogado) {
        Gerenciador.idLogado = idLogado;
    }

    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public static void setUsuarioLogado(Usuario usuarioLogado) {
        Gerenciador.usuarioLogado = usuarioLogado;
    }
    
    //public static void setUsuarioLogado(Usuario usuario){
        //.usuarioLogado = usuario;
       // gerenciadogerenciadorr.setIdLogado(usuario.getId());
    //}
    
}
