/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paket_C;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author WINDOWS
 */
public class dftr {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public String id;
    public String username;
    public String password;
    
    public void simpan()throws SQLException{
        conn =Paket_C.koneksi_login.getKoneksi();
        sql = "INSERT INTO login(id, username, password)VALUE(? ,? ,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, id);
        pst.setString(2, username);
        pst.setString(3, password);
        pst.execute();
        pst.close();
    }
}
