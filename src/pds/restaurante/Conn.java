/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;
import java.sql.Connection;//biblioteca de conecção
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Wallison
 */
public class Conn {//com todas as partes para fazer a conecção com o servidor
    private static String user ="root";//o usuário é o raiz
    private static String server = "localhost";//busca no servidor local
    private static String pass = "";//vai receber a string
    private static String database = "artemis";//nome do banco 
    private final static String driver = "com.mysql.jdbc.Driver";//?
    private static Connection conn = null;//estado da conecção
    private static Conn uniqueInstance;//implementação do singleton
    
    private Conn(){}// somente controe com o construtor padrão dentro da coneção
    
    public static Conn getInstance(){//singleton
        if(uniqueInstance == null)
            uniqueInstance = new Conn();
        return uniqueInstance;
    }
    public Connection getConnection(){//essa conexão com o banco de dados está sendo feita pela biblioteca connector
       try
       {
           //Class.forName(driver);
           if(conn == null || conn.isClosed())
           {
               conn = DriverManager.getConnection("jdbc:mysql://"+server+"/"+database+"",user, pass);
           }
           return conn;
       }
       catch(SQLException e)//não conseguiu fazer a conexão pelos dados enviados
       {
            closeConnection();
            return null;
       }
       
   }
    private static void closeConnection(){//se o motivo foi a conexão aberta ou não nula fecha
        try{
            if(conn!=null && !conn.isClosed()){
                conn.close();
            }
        }catch (Exception e) {// se não foi mostra o que foi
            throw new RuntimeException(e);
        }
    }
}
