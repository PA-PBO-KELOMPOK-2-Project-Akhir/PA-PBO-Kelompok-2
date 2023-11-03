package Entitas;
import java.sql.SQLException;
import javax.swing.*;
import database.database;

/**
 *
 * @author Silva_Jen_Retno
 */
public class EntitasAdmin {
    int ID_User;
    String Password;
    String No_Telepon;

    public EntitasAdmin(int ID_User, String Password, String No_Telepon) {
        this.ID_User = ID_User;
        this.Password = Password;
        this.No_Telepon = No_Telepon;
    }

    public int getID_User() {
        return ID_User;
    }

    public void setID_User(int ID_User) {
        this.ID_User = ID_User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNo_Telepon() {
        return No_Telepon;
    }

    public void setNo_Telepon(String No_Telepon) {
        this.No_Telepon = No_Telepon;
    }
    
}


