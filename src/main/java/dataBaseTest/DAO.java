package dataBaseTest;

import java.sql.*;

public class DAO {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/teste";
    public static final String USER = "root";
    public static final String PASS = "";


    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(URL, USER, PASS);
        }catch (Exception ex){
            throw new RuntimeException("Erro ao conectar com o banco", ex);
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement statement){
        try {
            if (connection != null){
                connection.close();
            }
            if(statement != null){
                connection.close();
            }
        }catch (Exception ex){
            throw new RuntimeException("Erro ao conectar com o banco", ex);
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet rs){
        try {
            if (connection != null){
                connection.close();
            }
            if(statement != null){
                connection.close();
            }
            if (rs != null){
                connection.close();
            }
        }catch (Exception ex){
            throw new RuntimeException("Erro ao conectar com o banco", ex);
        }
    }

}
