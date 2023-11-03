package GUI;
import database.database;
import java.sql.ResultSet;
import javax.swing.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Silva_Jen_Retno
 */
public class DataKeretaPenumpang extends javax.swing.JFrame {
    private database db;
    
    private void populateTable() {
       DefaultTableModel model = (DefaultTableModel) tabeljadwalkereta.getModel();
       model.setRowCount(0); // Mengosongkan tabel
       model.setColumnIdentifiers(new Object[]{"ID Kereta", "Nama Kereta", "Tipe", "Rute", "Jarak", "Stasiun", "Waktu Berangkat", "Waktu Tiba", "ID Admin", "ID Karyawan"});

       try {
            database db = new database();
            db.openConnection();
            db.statement = db.connection.createStatement();
           
            String query = "SELECT * FROM jadwalkereta";
            ResultSet resultSet = db.statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("Id_Kereta");
                String nama = resultSet.getString("Nama_Kereta");
                String tipe = resultSet.getString("Tipe_Kereta");
                String rute = resultSet.getString("Rute");
                String jarak = resultSet.getString("Jarak");
                String stasiun = resultSet.getString("Stasiun");
                String waktuberangkat = resultSet.getString("Waktu_Keberangkatan");
                String waktudatang = resultSet.getString("Waktu_Kedatangan");
                String tanggal = resultSet.getString("Tanggal");
                String idadmin = resultSet.getString("ADMIN_ID_User");
                String idkaryawan = resultSet.getString("Karyawan_Id_Karyawan");
                model.addRow(new Object[]{id, nama, tipe, rute, jarak, stasiun, waktuberangkat, waktudatang, tanggal, idadmin, idkaryawan});
            }

            resultSet.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }

    public DataKeretaPenumpang() throws ClassNotFoundException, SQLException {
        initComponents();
        populateTable();
        db = new database();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabeljadwalkereta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("JADWAL KERETA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        back.setBackground(new java.awt.Color(255, 210, 66));
        back.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        tabeljadwalkereta.setBackground(new java.awt.Color(255, 210, 66));
        tabeljadwalkereta.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        tabeljadwalkereta.setForeground(new java.awt.Color(0, 0, 0));
        tabeljadwalkereta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Tipe ", "Rute", "Jarak", "Stasiun", "Waktu Berangkat", "Waktu Tiba", "Tanggal", "ID Admin", "ID Karyawan"
            }
        ));
        jScrollPane2.setViewportView(tabeljadwalkereta);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 680, 270));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/menutampil (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        try {
            new MenuPenumpang().setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(MenuPenumpang.class.getName()).log(Level.SEVERE, null, ex);
            }
       this.dispose();
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DataKeretaPenumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DataKeretaPenumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DataKeretaPenumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DataKeretaPenumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DataKeretaPenumpang().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabeljadwalkereta;
    // End of variables declaration//GEN-END:variables
}
