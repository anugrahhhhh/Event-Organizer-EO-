/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Paket_C;
import Simpan_Nilai.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
/**
 *
 * @author WINDOWS
 */
public class Login extends javax.swing.JFrame {
    
    /** Creates new form Login */
    public Login() {
        initComponents();

        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username12 = new javax.swing.JTextField();
        pass12 = new javax.swing.JPasswordField();
        login12 = new javax.swing.JButton();
        daftar12 = new javax.swing.JButton();
        exit12 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 67, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 110, -1, -1));

        username12.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(username12, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 64, 120, -1));

        pass12.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(pass12, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 107, 120, -1));

        login12.setBackground(new java.awt.Color(0, 0, 255));
        login12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        login12.setText("LOGIN");
        login12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login12ActionPerformed(evt);
            }
        });
        getContentPane().add(login12, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 204, -1, -1));

        daftar12.setBackground(new java.awt.Color(0, 0, 255));
        daftar12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        daftar12.setText("DAFTAR");
        daftar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftar12ActionPerformed(evt);
            }
        });
        getContentPane().add(daftar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 204, -1, -1));

        exit12.setBackground(new java.awt.Color(0, 0, 255));
        exit12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exit12.setText("EXIT");
        getContentPane().add(exit12, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 277, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login12ActionPerformed
        try{
            Connection c = koneksi_login.getKoneksi();
            Statement s = c.createStatement();
            
            String sql = "SELECT * FROM login where Username='" + username12.getText()
                    +"' and password='" + pass12.getText() + "'" ;
            ResultSet r = s.executeQuery(sql);
            
            if (r.next()){
                JOptionPane.showMessageDialog(null, "Login Berhasil");
                new Entry_Data_Nilai_Mahasiswa().setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Password Salah");
                pass12.requestFocus();
            }
        }catch(SQLException e){
            System.out.println("error");
        }
    }//GEN-LAST:event_login12ActionPerformed

    private void daftar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftar12ActionPerformed
        this.dispose();
        new Daftar().setVisible(true);
    }//GEN-LAST:event_daftar12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton daftar12;
    private javax.swing.JButton exit12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login12;
    private javax.swing.JPasswordField pass12;
    private javax.swing.JTextField username12;
    // End of variables declaration//GEN-END:variables

}
