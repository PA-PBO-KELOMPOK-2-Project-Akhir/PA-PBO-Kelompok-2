package kereta2;
import java.sql.Date;
import database.database;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;



public class JadwalKereta extends database {
    public int Id_Kereta;
    String Nama_Kereta;
    String Tipe_Kereta;
    String Rute;
    String Jarak;
    String Stasiun;
    String Waktu_Keberangkatan;
    String Waktu_Kedatangan;
    Date Tanggal;
    String ID_User;
    String Id_Karyawan;

    public JadwalKereta() {
    }
    
    
    public boolean tambahjadwalkereta(JDateChooser dateChooser) {
        boolean isOperationSuccess = false;
        try {
            this.openConnection();
            String query = "INSERT INTO jadwalkereta (Nama_Kereta, Tipe_Kereta, Rute, Jarak, Stasiun, Waktu_Keberangkatan, Waktu_Kedatangan, Tanggal, ADMIN_ID_User, KARYAWAN_Id_Karyawan) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            this.preparedStatement = this.connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

//            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, this.Nama_Kereta);
            preparedStatement.setString(2, this.Tipe_Kereta);
            preparedStatement.setString(3, this.Rute);
            preparedStatement.setString(4, this.Jarak);
            preparedStatement.setString(5, this.Stasiun);
            preparedStatement.setString(6, this.Waktu_Keberangkatan);
            preparedStatement.setString(7, this.Waktu_Kedatangan);
            
            // Konversi String ke java.sql.Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//            java.util.Date parsedDate = dateFormat.parse(this.Tanggal);
            java.util.Date date = dateChooser.getDate();
            java.sql.Date tanggalDate = new java.sql.Date(date.getTime());
            
            preparedStatement.setDate(8, this.Tanggal);
            preparedStatement.setString(9, this.ID_User);
            preparedStatement.setString(10, this.Id_Karyawan);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            return false;
        }
    }
                
    public DefaultTableModel read() {
            this.openConnection();
            String query = "SELECT Id_Kereta, Nama_Kereta, Tipe_Kereta, Rute, Jarak, Stasiun, Waktu_Keberangkatan, Waktu_Kedatangan, Tanggal, ADMIN_ID_User, KARYAWAN_Id_Karyawan";

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id_Kereta");
            model.addColumn("Nama_Kereta");
            model.addColumn("Tipe_Kereta");
            model.addColumn("Rute");
            model.addColumn("Jarak");
            model.addColumn("Stasiun");
            model.addColumn("Waktu_Keberangkatan");
            model.addColumn("Waktu_Kedatangan");
            model.addColumn("Tanggal");
            model.addColumn("ADMIN_ID_User");
            model.addColumn("KARYAWAN_Id_Karyawan");

        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(query);
            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                String Id_Kereta = result.getString("Id_Kereta");
                String Nama_Kereta = result.getString("Nama_Kereta");
                String Tipe_Kereta = result.getString("Tipe_Kereta");
                String Rute = result.getString("Rute");
                String Jarak = result.getString("Jarak");
                String Stasiun = result.getString("Stasiun");
                String Waktu_Keberangkatan = result.getString("Waktu_Keberangkatan");
                String Waktu_Kedatangan = result.getString("Waktu_Kedatangan");
                String Tanggal = result.getString("Tanggal");
                String ID_User = result.getString("ADMIN_ID_User");
                String Id_Karyawan = result.getString("KARYAWAN_Id_Karyawan");

                model.addRow(new Object[]{Id_Kereta, Nama_Kereta, Tipe_Kereta, Rute, Jarak, Stasiun, Waktu_Keberangkatan, Waktu_Kedatangan, Tanggal, ID_User, Id_Karyawan});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

        return model;
    }
    
    public boolean find(String columnName, String value) {
        boolean isOperationSuccess = false;

        try {
            this.openConnection();

            String query = "SELECT * FROM jadwalkereta WHERE " + columnName + " = ?";
            this.preparedStatement = this.connection.prepareStatement(query);

            this.preparedStatement.setString(1, value);

            this.resultSet = this.preparedStatement.executeQuery();
                
            if (this.resultSet.next()) {
                this.Id_Kereta = this.resultSet.getInt("Id_Kereta");
                this.Nama_Kereta = this.resultSet.getString("Nama_Kereta");
                this.Tipe_Kereta = this.resultSet.getString("Tipe_Kereta");
                this.Rute = this.resultSet.getString("Rute");
                this.Jarak = this.resultSet.getString("Jarak");
                this.Stasiun = this.resultSet.getString("Stasiun");
                this.Waktu_Keberangkatan = this.resultSet.getString("Waktu_Keberangkatan");
                this.Waktu_Kedatangan = this.resultSet.getString("Waktu_Kedatangan");
                this.Tanggal = this.resultSet.getDate("Tanggal");
                this.ID_User = this.resultSet.getString("ADMIN_ID_User");
                this.Id_Karyawan = this.resultSet.getString("KARYAWAN_Id_Karyawan");
                isOperationSuccess = true;
            }
        } catch (SQLException ex) {
            this.displayErrors(ex);
        } 
        return isOperationSuccess;
    }
    
    public boolean delete() {
        boolean isOperationSuccess = false;

        try {
            this.openConnection();

            String sql = "DELETE FROM jadwalkereta WHERE Id_Kereta = ?";
            this.preparedStatement = this.connection.prepareStatement(sql);
            this.preparedStatement.setInt(1, this.Id_Kereta);

            int result = this.preparedStatement.executeUpdate();

            isOperationSuccess = result > 0;
        } catch (SQLException ex) {
            this.displayErrors(ex);
        }
        return isOperationSuccess;
    }


    public int getId_Kereta() {
        return Id_Kereta;
    }

    public void setId_Kereta(int Id_Kereta) {
        this.Id_Kereta = Id_Kereta;
    }

    public String getNama_Kereta() {
        return Nama_Kereta;
    }

    public void setNama_Kereta(String Nama_Kereta) {
        this.Nama_Kereta = Nama_Kereta;
    }

    public String getTipe_Kereta() {
        return Tipe_Kereta;
    }

    public void setTipe_Kereta(String Tipe_Kereta) {
        this.Tipe_Kereta = Tipe_Kereta;
    }

    public String getRute() {
        return Rute;
    }

    public void setRute(String Rute) {
        this.Rute = Rute;
    }

    public String getJarak() {
        return Jarak;
    }

    public void setJarak(String Jarak) {
        this.Jarak = Jarak;
    }

    public String getStasiun() {
        return Stasiun;
    }

    public void setStasiun(String Stasiun) {
        this.Stasiun = Stasiun;
    }

    public String getWaktu_Keberangkatan() {
        return Waktu_Keberangkatan;
    }

    public void setWaktu_Keberangkatan(String Waktu_Keberangkatan) {
        this.Waktu_Keberangkatan = Waktu_Keberangkatan;
    }

    public String getWaktu_Kedatangan() {
        return Waktu_Kedatangan;
    }

    public void setWaktu_Kedatangan(String Waktu_Kedatangan) {
        this.Waktu_Kedatangan = Waktu_Kedatangan;
    }

    public Date getTanggal() {
        return Tanggal;
    }

    public void setTanggal(Date Tanggal) {
        this.Tanggal = Tanggal;
    }

    public String getID_User() {
        return ID_User;
    }

    public void setID_User(String ID_User) {
        this.ID_User = ID_User;
    }

    public String getId_Karyawan() {
        return Id_Karyawan;
    }

    public void setId_Karyawan(String Id_Karyawan) {
        this.Id_Karyawan = Id_Karyawan;
    }

    public boolean update(JDateChooser tanggal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
