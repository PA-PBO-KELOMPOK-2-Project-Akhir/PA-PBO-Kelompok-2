package GUI;
import java.sql.SQLException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Silva_Jen_Retno
 */
public class Menuawal extends javax.swing.JFrame {

    /**
     * Creates new form Menuawal
     */
    public Menuawal() {
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

        admin = new javax.swing.JButton();
        penumpang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin.setBackground(new java.awt.Color(255, 210, 66));
        admin.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        admin.setForeground(new java.awt.Color(0, 0, 0));
        admin.setText("ADMIN");
        admin.setBorder(null);
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 205, 290, 90));

        penumpang.setBackground(new java.awt.Color(255, 210, 66));
        penumpang.setFont(new java.awt.Font("Swis721 BT", 1, 12)); // NOI18N
        penumpang.setForeground(new java.awt.Color(0, 0, 0));
        penumpang.setText("PENUMPANG");
        penumpang.setBorder(null);
        penumpang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penumpangActionPerformed(evt);
            }
        });
        getContentPane().add(penumpang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 315, 290, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/menuawal.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "ANDA AKAN MASUK KE MENU ADMIN ^.^");
        try {
            new LoginAdmin().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menuawal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Menuawal.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_adminActionPerformed

    private void penumpangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penumpangActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "ANDA AKAN MASUK KE MENU PENUMPANG ^.^");
        try {
            new LoginPenumpang().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menuawal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Menuawal.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_penumpangActionPerformed

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
            java.util.logging.Logger.getLogger(Menuawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menuawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menuawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menuawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuawal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton penumpang;
    // End of variables declaration//GEN-END:variables
}