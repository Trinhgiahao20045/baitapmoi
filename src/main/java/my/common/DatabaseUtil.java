/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package my.common;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ADMIN
 */
public class DatabaseUtil{
    public static Connection getConnection() {
        Connection conn=null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbd.SQLServerDriver");
            conn=DriverManager.getConnection("jdbc:sqlserver://pc348;databaseName=demodb", "sa", "sa");
        }catch(Exception e){
            System.out.println("loi:"+e.toString());
        }
        return conn;
    }
}