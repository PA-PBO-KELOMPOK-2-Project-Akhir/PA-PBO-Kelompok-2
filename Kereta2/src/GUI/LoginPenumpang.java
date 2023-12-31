package GUI;
import database.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Silva_Jen_Retno
 */
public class LoginPenumpang extends javax.swing.JFrame {
    private database Database;
    
    public LoginPenumpang (database Database) {
        this.Database = Database;
        
    }
    
    public LoginPenumpang() throws ClassNotFoundException, SQLException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kolomuser = new javax.swing.JTextField();
        kolompassw = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        kolompass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kolomuser.setBackground(new java.awt.Color(255, 210, 66));
        kolomuser.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        kolomuser.setForeground(new java.awt.Color(0, 0, 0));
        kolomuser.setBorder(null);
        kolomuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomuserActionPerformed(evt);
            }
        });
        getContentPane().add(kolomuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 240, 30));

        kolompassw.setBackground(new java.awt.Color(255, 210, 66));
        kolompassw.setFont(new java.awt.Font("Swis721 BT", 0, 12)); // NOI18N
        kolompassw.setForeground(new java.awt.Color(0, 0, 0));
        kolompassw.setBorder(null);
        kolompassw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolompasswActionPerformed(evt);
            }
        });
        getContentPane().add(kolompassw, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 240, 30));

        login.setBackground(new java.awt.Color(255, 210, 66));
        login.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 0));
        login.setText("LOGIN");
        login.setBorder(null);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 170, 50));

        kolompass.setBackground(new java.awt.Color(255, 210, 66));
        kolompass.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        kolompass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/login.jpg"))); // NOI18N
        getContentPane().add(kolompass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kolomuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomuserActionPerformed

    private void kolompasswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolompasswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolompasswActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        String ID_User= kolomuser.getText();
        String Password = kolompassw.getText();
        
        Menuawal m1 = new Menuawal();
        database db = new database();
        
        try {
            db.openConnection();
            Connection connection = db.connection;
            String sql = "SELECT * FROM penumpang WHERE ID_User = ? AND Password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ID_User);
            preparedStatement.setString(2, Password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Login Berhasil");
                this.dispose();
                try {
                    new MenuPenumpang().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginPenumpang.class.getName()).log(Level.SEVERE, null, ex);
                }
                

            } else {
                JOptionPane.showMessageDialog(null, "Login Gagal");
                try {
                new LoginPenumpang().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginPenumpang.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(LoginPenumpang.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
            }

        } catch (SQLException ex) {
            database.displayErrors(ex);
        }
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPenumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPenumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPenumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPenumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LoginPenumpang().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginPenumpang.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(LoginPenumpang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel kolompass;
    private javax.swing.JPasswordField kolompassw;
    private javax.swing.JTextField kolomuser;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
