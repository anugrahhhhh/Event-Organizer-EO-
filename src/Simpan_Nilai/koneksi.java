/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simpan_Nilai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS
 */
public class koneksi {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi==null){
            try{
                String url;
                url="jdbc:mysql://localhost:3306/Data_Nilai";
                String user ="root";
                String password="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                
                
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }return koneksi;
        
    }static Object getConnections(){
        throw new UnsupportedOperationException("Not yet Implemented");
    }
    public Connection conn;
    public Statement stat;
}