package kereta2;
import database.database;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Silva_Jen_Retno
 */
public class EntitasKaryawan {
    
    private database database;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    
    int Id_Karyawan;
    String Nama_Karyawan;
    String Shift_Kerja;
    String Jabatan;
    int Id_Karyawan1;

    public EntitasKaryawan(int Id_Karyawan, String Nama_Karyawan, String Shift_Kerja, String Jabatan, int Id_Karyawan1) {
        this.Id_Karyawan = Id_Karyawan;
        this.Nama_Karyawan = Nama_Karyawan;
        this.Shift_Kerja = Shift_Kerja;
        this.Jabatan = Jabatan;
        this.Id_Karyawan1 = Id_Karyawan1;
    }
    
    public EntitasKaryawan(database Database) {
        this.database = Database;
    }
    
    public boolean find(String columnName, String value) {
        boolean isOperationSuccess = false;

        try {
            this.database.openConnection();
            String query = "SELECT * FROM karyawan WHERE " + columnName + " = ?";
            this.preparedStatement = this.database.connection.prepareStatement(query);

            this.preparedStatement.setString(1, value);

            this.resultSet = this.preparedStatement.executeQuery();
                
            if (this.resultSet.next()) {
                this.Id_Karyawan = this.resultSet.getInt("Id_Karyawan");
                this.Nama_Karyawan = this.resultSet.getString("Nama_Karyawan");
                this.Shift_Kerja = this.resultSet.getString("Shift_Kerja");
                this.Jabatan = this.resultSet.getString("Jabatan");
                this.Id_Karyawan1 = this.resultSet.getInt("KARYAWAN_Id_Karyawan");
                isOperationSuccess = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } 
        return isOperationSuccess;
    }

    public int getId_Karyawan() {
        return Id_Karyawan;
    }

    public void setId_Karyawan(int Id_Karyawan) {
        this.Id_Karyawan = Id_Karyawan;
    }

    public String getNama_Karyawan() {
        return Nama_Karyawan;
    }

    public void setNama_Karyawan(String Nama_Karyawan) {
        this.Nama_Karyawan = Nama_Karyawan;
    }

    public String getShift_Kerja() {
        return Shift_Kerja;
    }

    public void setShift_Kerja(String Shift_Kerja) {
        this.Shift_Kerja = Shift_Kerja;
    }

    public String getJabatan() {
        return Jabatan;
    }

    public void setJabatan(String Jabatan) {
        this.Jabatan = Jabatan;
    }

    public int getId_Karyawan1() {
        return Id_Karyawan1;
    }

    public void setId_Karyawan1(int Id_Karyawan1) {
        this.Id_Karyawan1 = Id_Karyawan1;
    }
    
    
}
