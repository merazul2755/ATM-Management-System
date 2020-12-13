/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ATM.code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author meraz
 */
public class Transaction {
    private int id;
    private String type;
    private String date;
    private double amount;
    
    private Connection conn = DBConnect.connectDB();
    private PreparedStatement st = null;
    private ResultSet rs= null;

    public Transaction(int id, String type, String date, double amount) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.amount = amount;
    }
    
    public void update(){
        
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
    
    
}
