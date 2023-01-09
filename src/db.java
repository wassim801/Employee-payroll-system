/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author wassim
 */
public class db {
    
    Connection conn=null;
    
    public static Connection java_db(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/my_database","root","");  
            return conn;
           
            
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
           
        }
        return null;
    }
}
