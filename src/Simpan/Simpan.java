/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simpan;
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
    public String lama_inap;
    public String ket;
    public String jumlah_bayar;
    public Object kode;

    
    public void simpan()throws SQLException{
        conn =koneksi.getKoneksi();
        sql = "INSERT INTO data_tamu(nama, kode, lama_inap, ket, jumlah_bayar)VALUE(? ,? ,?, ?, ?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, nama);
        pst.setString(2, (String) kode);
        pst.setString(3, lama_inap);
        pst.setString(4, ket);
        pst.setString(5, jumlah_bayar);
        pst.execute();
        pst.close();
    }
}
