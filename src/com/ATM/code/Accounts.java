/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ATM.code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author meraz
 */
public class Accounts {
    private int id;
    private String accNumber;
    private double balance;
    
    private Connection conn = DBConnect.connectDB();
    private PreparedStatement st = null;
    private ResultSet rs= null;

    public Accounts(int id, String accNumber, double balance) {
        this.id = id;
        this.accNumber = accNumber;
        this.balance = balance;
    }
    
    
    public int getId() {
        return id;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }
    
    
    
    
    
    
    
}
