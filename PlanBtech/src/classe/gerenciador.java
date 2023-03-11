/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author limal
 */
public class gerenciador {
    public static int idLogado;
    public static usuario usuarioLogado;

    public static int getIdLogado() {
        return idLogado;
    }

    public static void setIdLogado(int idLogado) {
        gerenciador.idLogado = idLogado;
    }

    public static usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public static void setUsuarioLogado(usuario usuarioLogado) {
        gerenciador.usuarioLogado = usuarioLogado;
    }
    
    public static void setUsuarioLogado(usuario usuario){
        gerenciador.usuarioLogado = usuario;
        gerenciador.setIdLogado(usuario.getId());
    }
    
}
