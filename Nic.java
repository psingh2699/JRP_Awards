/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nic;
import java.sql.*;
/**
 *
 * @author priyansh singh
 */
public class Nic {
    public static Connection cn= null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception{
        // TODO code application logic here
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/award","root","tablespoon");
        System.out.println("Connection est.");
        new loginScreen().setVisible(true);
    }
    
}
