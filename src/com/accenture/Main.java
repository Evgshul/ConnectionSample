package com.accenture;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            String url = "jdbc:mysql://localhost/activity";
            String user = "root";
            String pass = "evgshul";

            //1 - Load the driver


            //2 - Obtain a connection using DriverManager class
            Connection cn = DriverManager.getConnection(url,user,pass);

            System.out.println("Connection successfully established! \n");
            Statement myStatement = cn.createStatement();
            myStatement.executeQuery("Select * from aTable");
            //Closing the connection

            cn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
