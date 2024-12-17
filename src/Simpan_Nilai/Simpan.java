/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simpan_Nilai;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author WINDOWS
 */
public class Simpan {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public String nama;
    public String nim;
    public String nilaimid;
    public String nilaiuas;
    public Object kelas;
    public String total;
    public String huruf;
    
    public void simpan()throws SQLException{
        conn =Simpan_Nilai.koneksi.getKoneksi();
        sql = "INSERT INTO data_nilai(NIM, nama, kelas, nilaimid, nilaiuas, total, huruf)VALUE(? ,? ,?, ?, ?, ?, ?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, nim);
        pst.setString(2, nama);
        pst.setString(3, (String) kelas);      
        pst.setString(4, nilaimid);
        pst.setString(5, nilaiuas);
        pst.setString(6, total);
        pst.setString(7, huruf);
        pst.execute();
        pst.close();
    }
}
