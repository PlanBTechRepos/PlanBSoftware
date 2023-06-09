
package com.pdvtech.util;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
  /*  Statement statement;
    private ResultSet resultset;

    public ResultSet getResultset() {
        return resultset;
    }

    public void setResultset(ResultSet resultset) {
        this.resultset = resultset;
    }
    
    public  final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public  final String URL = "jdbc:mysql://localhost:3306/pdvPlanBTech";
    public  final String USER = "root";
    public  final String PASS = "1234";
    
    public void getConnection() {
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            statement = conn.createStatement();

                    
            
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
    
    public void insert(String insertString) throws SQLException{
        try{
            getConnection();
            statement.executeUpdate(insertString);
            System.out.println("Dado inserido com sucesso");
        }
        catch(SQLException e){
            System.out.println("Não foi possivel inserir os dados");
        }
        finally{
            closeConnection(statement.getConnection());
        }
    }
    public void update(String updateString){
        try{
            getConnection();
            statement.executeUpdate(updateString);
            System.out.println("Dado atualizado com sucesso");
        }
        catch(Exception e){
            System.out.println("Não foi possivel atualizar os dados");
        }
        finally{
            //closeConnection(getConnection());
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
            //closeConnection(getConnection());
        }
    }
    public void view(String viewString){
        try{
            statement.getConnection();
            resultset = statement.executeQuery(viewString);
            System.out.println("Dado Visualizados com sucesso");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            //closeConnection(getConnection());
        }
<<<<<<< HEAD
    }*/

    
    private String line = "";
    private String lineError = "";

    public String getLineError() {
        return this.lineError;
    }

    public void criaDB(String senha) {
        try {
            List<String> command = new ArrayList<String>();
            command.add("powershell");
            if (senha.equals("")) {
                command.add("Get-Content ../DB/*.sql | C:/xampp/mysql/bin/mysql -u root");
            } else {
                command.add("Get-Content ../DB/*.sql | C:/xampp/mysql/bin/mysql -u root -p" + senha);
            }

            ProcessBuilder builder = new ProcessBuilder(command);
            builder.redirectErrorStream(true);
            Process process = builder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            
            while ((this.line = reader.readLine()) != null) {
                if(line.contains("ERROR 1045"))
                    lineError = line;
                    
                System.out.println(this.line);
            }
            process.waitFor();
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("DB criada");
        }
    }



}
