package GUI;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import com.toedter.calendar.JDateChooser;
import database.database;
import java.text.ParseException;
import javax.swing.table.DefaultTableModel;
import kereta2.JadwalKereta;

/**
 *
 * @author Silva_Jen_Retno
 */

public class TambahKereta extends javax.swing.JFrame { 
    private database db;

    public TambahKereta() {
        initComponents();
    }
    
    /**
     * Creates new form TambahKereta
     */


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        tipe = new javax.swing.JTextField();
        rute = new javax.swing.JTextField();
        jarak = new javax.swing.JTextField();
        stasiun = new javax.swing.JTextField();
        idadmin = new javax.swing.JTextField();
        idkaryawan = new javax.swing.JTextField();
        tanggal = new com.toedter.calendar.JDateChooser();
        tambah = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        waktuawal = new javax.swing.JTextField();
        waktuselesai = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nama Kereta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DATA PENJADWALAN KERETA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipe Kereta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 20));

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Rute");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Jarak");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Stasiun");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 50, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/waktuawal.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 30, 30));

        jLabel9.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/waktuselesai.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, 30));

        jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("ID Admin");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 30));

        jLabel11.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ID Karyawan");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, 30));

        nama.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 270, 30));

        tipe.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        getContentPane().add(tipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 270, -1));

        rute.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        getContentPane().add(rute, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 270, -1));

        jarak.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        getContentPane().add(jarak, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 270, -1));

        stasiun.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        stasiun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stasiunActionPerformed(evt);
            }
        });
        getContentPane().add(stasiun, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 270, 30));

        idadmin.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        getContentPane().add(idadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 270, 30));

        idkaryawan.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        getContentPane().add(idkaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 270, 30));
        getContentPane().add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 304, 270, 30));

        tambah.setText("TAMBAH");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Tanggal");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        waktuawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waktuawalActionPerformed(evt);
            }
        });
        getContentPane().add(waktuawal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 90, 30));

        waktuselesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waktuselesaiActionPerformed(evt);
            }
        });
        getContentPane().add(waktuselesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 110, 30));

        jLabel13.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Waktu");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/menu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stasiunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stasiunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stasiunActionPerformed
    
    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        
        try {    
            String hb = nama.getText();
            String jb = tipe.getText();
            String kb = rute.getText();
            String al = jarak.getText();
            String am = stasiun.getText();
            String an = waktuawal.getText();
            String ao = waktuselesai.getText();
            java.util.Date au = tanggal.getDate();
            String ap = idadmin.getText();
            String aq = idkaryawan.getText();
            java.util.Date utilDate = tanggal.getDate();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            
            JadwalKereta jadwal = new JadwalKereta();


            jadwal.setNama_Kereta(hb);
            jadwal.setTipe_Kereta(jb);
            jadwal.setRute(kb);
            jadwal.setJarak(al);
            jadwal.setStasiun(am);
            jadwal.setWaktu_Keberangkatan(an);
            jadwal.setWaktu_Kedatangan(ao);
            jadwal.setTanggal(sqlDate);
            jadwal.setID_User(ap);
            jadwal.setId_Karyawan(aq);
            
            boolean isSuccess = jadwal.tambahjadwalkereta(tanggal);
            
            if (isSuccess) {
            JOptionPane.showMessageDialog(null, "TAMBAH DATA BERHASIL");
            new DataKereta().setVisible(true);
            } else {
            JOptionPane.showMessageDialog(null, "TAMBAH DATA GAGAL");
            new TambahKereta().setVisible(true);
        }
        
        this.dispose();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "TAMBAH DATA GAGAL"+ e.getMessage());
            new TambahKereta().setVisible(true);
            this.dispose();
                    
        }
        
    }//GEN-LAST:event_tambahActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        try {
            DataKereta m1 = new DataKereta();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        try {
            new DataKereta().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TambahKereta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TambahKereta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void waktuawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waktuawalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waktuawalActionPerformed

    private void waktuselesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waktuselesaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waktuselesaiActionPerformed
    
    private void clearFields() {
        nama.setText("");
        tipe.setText("");
        rute.setText("");
        jarak.setText("");
        stasiun.setText("");
        waktuawal.setText("");
        waktuselesai.setText("");
        tanggal.setDate(null);
        idadmin.setText("");
        idkaryawan.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(TambahKereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahKereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahKereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahKereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahKereta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField idadmin;
    private javax.swing.JTextField idkaryawan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jarak;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField rute;
    private javax.swing.JTextField stasiun;
    private javax.swing.JButton tambah;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JTextField tipe;
    private javax.swing.JTextField waktuawal;
    private javax.swing.JTextField waktuselesai;
    // End of variables declaration//GEN-END:variables
}