/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ATM.code;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author meraz
 */
public class DBConnect {
    
    public static Connection connectDB(){
        String url = "jdbc:mysql://127.0.0.1/atm";
        String user = "root";
        String password = "";
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(url, user, password);
            
            return con;
            
        }catch(ClassNotFoundException | SQLException e){
            
        }
        return null;
        
        
        
        
        
        
        
        
    }
}
