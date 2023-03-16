
package com.pdvtech.util;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ConnectionFactory {
    Statement statement;
    private ResultSet resultset;

    public ResultSet getResultset() {
        return resultset;
    }

    public void setResultset(ResultSet resultset) {
        this.resultset = resultset;
    }
    
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/pdvTech";
    public static final String USER = "root";
    public static final String PASS = "root";
    
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            throw new RuntimeException("Erro na conexão com o bando de dados", e);
        }
    }
    
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar a conexão com bando de dados", e);
        }
    }
    
    public void insert(String insertString){
        try{
            getConnection();
            statement.executeUpdate(insertString);
            System.out.println("Dado inserido com sucesso");
        }
        catch(Exception e){
            System.out.println("Não foi possivel inserir os dados");
        }
        finally{
            closeConnection(getConnection());
        }
    }
    public void update(String updateString){
        try{
            getConnection();
            statement.executeUpdate(updateString);
            System.out.println("Dado ayualizado com sucesso");
        }
        catch(Exception e){
            System.out.println("Não foi possivel atualizar os dados");
        }
        finally{
            closeConnection(getConnection());
        }
    }
    public void delete(String deleteString){
        try{
            getConnection();
            statement.executeUpdate(deleteString);
            System.out.println("Dado deletado com sucesso");
        }
        catch(Exception e){
            System.out.println("Não foi possivel deletar os dados");
        }
        finally{
            closeConnection(getConnection());
        }
    }
    public void view(String viewString){
        try{
            getConnection();
            resultset = statement.executeQuery(viewString);
            while(resultset.next()){
                
            }
            System.out.println("Dado Visualizados com sucesso");
        }
        catch(Exception e){
            System.out.println("Não foi possivel visualizar os dados");
        }
        finally{
            closeConnection(getConnection());
        }
    }
}
