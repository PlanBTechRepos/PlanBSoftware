package com.pdvtech.controller;

import static com.pdvtech.controller.FuncionarioController.funcionario;

import com.pdvtech.util.MySQL;
import com.pdvtech.model.Usuario;
import javax.swing.table.DefaultTableModel;

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
    public static DefaultTableModel viewAllFunc() {
        conn.conectaBanco();
        String columNames[] = {"Id", "Nome", "Cargo", "Usuario", "Ação"};
        DefaultTableModel model = new DefaultTableModel(columNames, 0);
        try {
            String query
                    = "Select Funcionario.nome, "
                    + "Funcionario.sobrenome, "
                    + "Cargos.nome, "
                    + "Funcionario.id_funcionario, "
                    + "usuario.usuario, "
                    + "usuario.senha "
                    + "from "
                    + "funcionario "
                    + "join usuario on usuario.id_funcionario = funcionario.id_funcionario "
                    + "join cargos on funcionario.id_cargo = cargos.id_cargo; ";
            conn.executarSQL(query);
            while (conn.getResultSet().next()) {
                model.addRow(new String[]{
                    conn.getResultSet().getString(4),
                    conn.getResultSet().getString(1) + " " + conn.getResultSet().getString(2),
                    conn.getResultSet().getString(3),
                    conn.getResultSet().getString(5),
                });
            }

        } catch (Exception e) {
            e.getMessage();
        }
        return model;
    }

    /*
    save
     */
    public static void salvarUsuario(String nome, String user, String senha, int permissao) {
        String[] nomeSeparado = nome.split(" ");
        conn.conectaBanco();
        try {
            String query = "call cadUsuario ('"
                    + nomeSeparado[0] + "', '"
                    + nomeSeparado[nomeSeparado.length - 1] + "', '"
                    + user + "', '"
                    + senha + "', "
                    + permissao + ");";
            conn.insertSQL(query);
        } catch (Exception e) {
            e.getMessage();
        } finally {
            conn.fechaBanco();
        }
    }

    public static void cadFuncUs(String nome, String sobrenome, String cargo, String usuario, String senha) {
        conn.conectaBanco();
        try {
            String query = "call pdvplanbtech.cadUsuarioFunc("
                    + "'" + nome + "', "
                    + "'" + sobrenome + "', "
                    + "'" + cargo + "', "
                    + "'" + usuario + "', "
                    + "'" + senha + "');";
            conn.insertSQL(query);
        } catch (Exception e) {
            e.getMessage();
        } finally {
            conn.fechaBanco();
        }
    }

    /*
    update
    getAll
    removeById
     */
}
