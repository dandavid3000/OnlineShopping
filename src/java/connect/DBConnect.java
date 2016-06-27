/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dan
 */
public class DBConnect {
    public static Connection getConnection(){
        Connection con = null;   
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=shopping;user=dan;password=123");
        } catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
    public static void main(String[] args)
    {
        System.out.println(getConnection());
    }
    
}
