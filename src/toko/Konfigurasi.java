package toko;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Konfigurasi {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
    try {       
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver Loaded");
    mysqlconfig = DriverManager.getConnection("jdbc:mysql://localhost:3306/it","root","");
    System.out.println("Terhubung...");         
} catch(ClassNotFoundException e) {
    throw new IllegalStateException(null, e); 
}
    return mysqlconfig; 
}
}
