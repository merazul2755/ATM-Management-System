/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ATM.code;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author meraz
 */
public class Account_Holder {
    
    private String userName;
    private String password;
    private String user="";
    private String pass="";
    
    private Connection conn = DBConnect.connectDB();
    private PreparedStatement st = null;
    private ResultSet rs = null;

    public Account_Holder(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

    public void checkUser() throws SQLException {
        String sql = "Select * from account_holder where username=? and password=?";
        st = conn.prepareStatement(sql);
        st.setString(1, userName);
        st.setString(2, password);
        rs = st.executeQuery();

        if (rs.next()) {
            user = rs.getString("Username");
            pass = rs.getString("Password");
        }
        
        conn.close();
        st.close();
    }

    public boolean login() throws SQLException {

        checkUser();
        if (userName.equals(user) && password.equals(pass)) {
            return true;
        } 
        else{
            return false;
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    
}
